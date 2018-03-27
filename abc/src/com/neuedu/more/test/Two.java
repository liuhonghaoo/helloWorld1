package com.neuedu.more.test;

public class Two extends One{

	public Two(String a) {
		super(a);
		System.out.println("这是子类的构造方法，子类在这被实例化");
	}

	@Override
	public void play() {
		// TODO 自动生成的方法存根
		System.out.println("我实现了父类的方法");
	}
	
	/*public static void main(String[] args){
		One one = new Two("a");
	}*/

}
