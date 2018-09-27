package test.cn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler{
	private Object target;
	
	public Proxy(Object target) {
		super();
		this.target = target;
	}
	@Override
	public Object invoke(Object subject, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println(1111);
		method.invoke(target, args);
		System.out.println(2222);
		return null;
	}
	

}
