package DataPoolTime;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolTest {

	static ConnectionPool pool = new ConnectionPool(10);
	
	static CountDownLatch start = new CountDownLatch(1);
	
	static CountDownLatch end;
	
	public static void main(String[] args) throws InterruptedException {
		int threadCount = 10;
		end = new CountDownLatch(10);
		
		int count = 20;
		AtomicInteger got = new AtomicInteger();
		AtomicInteger notgot = new AtomicInteger();
		for(int i = 0;i < threadCount;i++) {
			Thread thread = new Thread(new ConnectionRunner(count, got, notgot),"ConnectionRunnerThread");
			thread.start();
		}
		start.countDown();
		end.await();
	}
	
	static class ConnectionRunner implements Runnable{

		int count;
		AtomicInteger Got;
		AtomicInteger notGot;

		public ConnectionRunner(int count, AtomicInteger got, AtomicInteger notGot) {
			super();
			this.count = count;
			Got = got;
			this.notGot = notGot;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				start.await();
			} catch (Exception e) {
				// TODO: handle exception
			}
			while (count > 0) {
				try {
					Connection connection = pool.fetchConnection(1000);
					if(connection != null) {
						try {
							connection .createStatement();
							connection.commit();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}finally {
							pool.releaseConnection(connection);
							Got.incrementAndGet();
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					count--;
				}
			}
			end.countDown();
		}	
	}
}
