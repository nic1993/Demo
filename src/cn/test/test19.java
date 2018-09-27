package cn.test;

import java.util.BitSet;

public class test19 {

	public static void main(String[] args) {
		BitSet bitSet = new BitSet();
		
		int i = 1;
		int j = 2;
		
		bitSet.set(i);
		System.out.println(bitSet.get(j));
		bitSet.set(j);
	}
	
	static final class HashEntry<K,V>{
		final int key;
		
		public HashEntry(int key) {
			// TODO Auto-generated constructor stub
			this.key = key; 
		}

		public int getKey() {
			return key;
		}
		
	}
}
