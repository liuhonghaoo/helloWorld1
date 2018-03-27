package com.neuedu.testReflect;

public class ClassForNameAndClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
		String line = "com.neuedu.testReflect.Line";
		String point = "com.neuedu.testReflect.Point";
		System.out.println("下面是测试classloader的结果");
		testClassLoader(line, point);
		System.out.println("----------------------");
		System.out.println("下面是测试classforname的结果");
		testClassForName(line, point);
	}
	
	private static void testClassLoader(String line,String point) throws ClassNotFoundException{
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class<?> loaderLine = loader.loadClass(line);
		Class<?> loaderPoint = loader.loadClass(point);
		System.out.println(loaderLine.getName());
		System.out.println(loaderPoint.getName());
	}
	
	
	private static void testClassForName(String line,String point) throws ClassNotFoundException{
		Class<?> fornameLine = Class.forName(line);
		Class<?> fornamePoint = Class.forName(point);
		System.out.println(fornameLine.getName());
		System.out.println(fornamePoint.getName());
	}
	
}
