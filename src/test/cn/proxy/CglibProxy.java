package test.cn.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before: " + method.getName());
		
		methodProxy.invokeSuper(obj, objects);
		
		System.out.println("After: " + method.getName());
		
		return null;
	}

}
