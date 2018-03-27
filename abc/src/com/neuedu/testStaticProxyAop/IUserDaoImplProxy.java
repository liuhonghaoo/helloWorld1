package com.neuedu.testStaticProxyAop;

public class IUserDaoImplProxy implements IUserDao {

	IUserDao target = new IUserDaoImpl();
	
	@Override
	public void save() {
		System.out.println("代理操作：开启事物");
		target.save();
		System.out.println("代理操作：提交事物");
	}

	@Override
	public void find() {
		target.find();
	}

}
