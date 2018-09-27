package cn.test;

public class TestDog {

	
	
	
	
	public static void main(String[] args) {
		String s = "xxxxxxxxxxxxxx#123#456#zzzzz";
		int n = s.indexOf("#");
		int k = s.indexOf("#", n + 1);
		String s2 = s.substring(n+2,k);
		System.out.println(s2);
	}
}

 class Animal{
	public void sing() {
		System.out.println("Animal is singing!");
	}
	
	public void eat() {
		System.out.println("Animal is eating!");
	}
	
	public void get() {
		System.out.println("Animal is get!");
	}
}

 class Cat extends Animal{
	public void sing() {
		System.out.println("Cat is singing!");
	}
	
	public void eat() {
		System.out.println("Cat is eating!");
	}
	
	public void put() {
		System.out.println("Cat is put!");
	}
}
