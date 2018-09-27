package cn.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class test4 {

	private final ConcurrentHashMap<Object, Future<String>> tastCache = new ConcurrentHashMap<>();
	
	public static void main(String[] args) {
		new test4().executionTask("abc");
	}
	
	private String executionTask(final String taskName) {
		while (true) {
			Future<String> future = tastCache.get(taskName);
			if(future == null) {
				Callable<String> task = new Callable<String>() {

					@Override
					public String call() throws Exception {
						// TODO Auto-generated method stub
						return taskName;
					}
				};
				FutureTask<String> futureTask = new FutureTask<>(task);
				future = tastCache.putIfAbsent(task, futureTask);
				if(future == null) {
					future = futureTask;
					futureTask.run();
				}
			}
			try {
				return future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
