package cn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class test17 {

	public static void main(String[] args) throws InterruptedException {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i < 10;i++) map.put(i, i);
		
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(map.size());
	}
}
