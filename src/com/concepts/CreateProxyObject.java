package com.concepts;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CreateProxyObject {

	public static void main(String[] args) {

		// return an instance of a proxy class for the specified interfaces
		// that dispatches method invocations to the specified invocation
		// handler
		MyInterface myintf = (MyInterface) Proxy.newProxyInstance(
				MyInterface.class.getClassLoader(),
				new Class[] { MyInterface.class }, new MyProxy(
						new MyInterfaceImpl()));

		// Invoke the method
		myintf.method();

	}

	private static interface MyInterface {
		void method();
	}

	private static class MyInterfaceImpl implements MyInterface {
		public void method() {
			System.out.println("Plain method is invoked");
		}
	}

	private static class MyProxy implements InvocationHandler {

		Object obj;

		public MyProxy(Object o) {
			obj = o;
		}

		public Object invoke(Object proxy, Method m, Object[] args)	throws Throwable {
			Object result = null;
			try {
				System.out.println("Proxy Class is called before method invocation");
				result = m.invoke(obj, args);
			} catch (InvocationTargetException e) {
				System.out.println("Invocation Target Exception: " + e);
			} catch (Exception e) {
				System.out.println("Invocation Target Exception: " + e);
			}
			finally {
				System.out.println("Proxy Class is called after method invocation");
			}
			
			
			return result;
		}

		
	}

}
