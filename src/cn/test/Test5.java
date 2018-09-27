package cn.test;

import java.util.concurrent.CountDownLatch;

public class Test5 {

	
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(1);
		
		Runnable runnable = new Runnable() {
			int tally = 0;
			String lock = "";
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (lock) {
					for(int i = 1;i <= 50;i++)
						tally += 1;
					
					System.out.println(Thread.currentThread().getName() + " value: " + tally);
				}
				
			}
		};
		
		Thread thread1 = new Thread(runnable,"thread1");
		Thread thread2 = new Thread(runnable,"thread2");
		
		thread1.start();
		thread2.start();
	}
	
	
}


