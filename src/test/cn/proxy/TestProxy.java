package test.cn.proxy;

import java.lang.reflect.InvocationHandler;

import net.sf.cglib.proxy.Enhancer;

public class TestProxy implements Test{

	public static void main(String[] args) {
		
		
		CglibProxy cglibProxy = new CglibProxy();
		
//		InvocationHandler handler = new Proxy(testProxy);
//		
//		Test newTestProxy = (Test) java.lang.reflect.Proxy.newProxyInstance(testProxy.getClass().getClassLoader(), testProxy.getClass().getInterfaces(), 
//				handler);
//		
//		newTestProxy.outPut();
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(TestProxy.class);
		enhancer.setCallback(cglibProxy);
		
		TestProxy testProxy = (TestProxy) enhancer.create();
		
		testProxy.outPut();
	}
	
	public  void outPut() {
		System.out.println("1234");
	}
}
