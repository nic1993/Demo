package cn.test;

public interface Inter {

	default void test() {
		System.out.println(1234);
	}
}
