package пёуп2017;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Test15 {
	private static final String MESSAGE="taobao";
	public static void main(String[] args) throws InterruptedException {
//		Runner one = new Runner();
//		Thread countThread = new Thread(one, "CountThread");
//		countThread.start();
//		
//		TimeUnit.SECONDS.sleep(1);
//		
//		one.setOn(false);
		String a = "taobao";
		String c = "taobao";
		String b = "bao";
		System.out.println(a==c);

	}
	
	private static class Runner implements Runnable{

		private long i;
		private  boolean on = true;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (on && !Thread.currentThread().interrupted()) {
				i++;
			}
			System.out.println("Count i= " + i);
		}
		public boolean isOn() {
			return on;
		}
		public void setOn(boolean on) {
			this.on = on;
		}
		
		
	}
}
