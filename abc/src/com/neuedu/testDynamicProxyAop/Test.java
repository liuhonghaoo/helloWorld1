package com.neuedu.testDynamicProxyAop;

import com.neuedu.testStaticProxyAop.IUserDao;
import com.neuedu.testStaticProxyAop.IUserDaoImpl;

public class Test {

	public static void main(String[] args) {
		//创建目标对象
		IUserDao target = new IUserDaoImpl();
		System.out.println("目标对象：" + target.getClass());
		//代理对象
		IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
		System.out.println("代理对象：" + proxy.getClass());
		proxy.save();
	}

}
