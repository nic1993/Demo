package cn.test;

import java.util.concurrent.TimeUnit;

public class test8 {

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Waiting()).start();
		
		while (true) {
			Thread.sleep(200);
			synchronized (Waiting.class) {
				Thread.sleep(200);
				Waiting.class.notifyAll();
			}
		}
				
			
	}
	
	static class Waiting implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				synchronized (Waiting.class) {
					try {
						System.out.println(1111);
						Waiting.class.wait();
						System.out.println(2222);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}
