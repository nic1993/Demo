package DataPoolTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class DefalutThreadPool<Job extends Runnable> implements ThreadPool<Job> {
   //线程池最大限制数
	private static final int MAX_WORKER_NUMBERS = 10;
	//线程池默认的数量
	private static final int DEFAULT_WORKER_NUMBERS = 5;
	//线程池最小的数量
	private static final int MIN_WORKER_NUMBERS = 1;
    //这是一个工作列表，将会向里面插入工作
	private final LinkedList<Job> jobs = new LinkedList<>();
	//这是一个工作者列表
	private final List<Worker> workers = Collections.synchronizedList(new ArrayList<>());
	
	private int workerNum = DEFAULT_WORKER_NUMBERS;
	
	private AtomicLong threadNum = new AtomicLong();
	
	
	public DefalutThreadPool() {
		super();
		initializeWorkers(DEFAULT_WORKER_NUMBERS);
	}

	@Override
	public void execute(Job job) {
		// TODO Auto-generated method stub
		if(job != null) {
			synchronized (jobs) {
				jobs.add(job);
				jobs.notify();
			}
		}
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		for(Worker worker : workers) {
			worker.shutdown();
		}
	}

	@Override
	public void addWorkers(int num) {
		// TODO Auto-generated method stub
		synchronized (jobs) {
			if(num + this.workerNum > MAX_WORKER_NUMBERS) {
				num = MAX_WORKER_NUMBERS - this.workerNum;
			}
			initializeWorkers(num);
			this.workerNum += num;
		}
	}

	@Override
	public void removeWorker(int num) {
		// TODO Auto-generated method stub
		synchronized (jobs) {
			if(num > this.workerNum) {
			   throw new IllegalArgumentException("beyond workNum");	
			}
			//按照给定的数量停止Worker
			int count = 0;
			while (count < num) {
				Worker worker = workers.get(count);
				if(workers.remove(worker)) {
					worker.shutdown();
					count++;
				}
			}
			this.workerNum -= count;
		}
	}

	@Override
	public int getJobSize() {
		// TODO Auto-generated method stub
		return jobs.size();
	}

	
	private void initializeWorkers(int num) {
		for(int i = 0;i < num;i++) {
			Worker worker = new Worker();
			workers.add(worker);
			Thread thread = new Thread(worker, "Worker-" + threadNum.incrementAndGet());
			thread.start();
		}
	}
	
	
	class Worker implements Runnable{
	    private volatile boolean running = true;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (running) {
				Job job = null;
				synchronized (jobs) {
					while (jobs.isEmpty()) {
						try {
							jobs.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							Thread.currentThread().interrupt();
							return;
						}
					}
					job = jobs.removeFirst();
				}
				if(job != null) {
					job.run();
				}
			}
			
		}
		public void shutdown() {
			running = false;
		}
	}
}


