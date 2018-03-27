package com.neuedu.more.test;

public abstract class One {

	private String a;
	
	public One(String a){
		System.out.println("父类就是在这被实例化");
	}
	
	public void play(){
		System.out.println("我是父类的方法");
	};
	
}
