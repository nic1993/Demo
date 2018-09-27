package cn.test;

public class test16 {

	public static void main(String[] args) throws InterruptedException {
		Thread threadA = new Thread(new Run(),"A");
		Thread threadB = new Thread(new Run(),"B");
		
		threadA.start();
		Thread.sleep(1000);
		threadB.start();
	}
	
	static class Run implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(test16.class) {
				try {
					System.out.println("enter: " + Thread.currentThread().getName());
					Thread.sleep(2000);
					System.out.println("exit: " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
