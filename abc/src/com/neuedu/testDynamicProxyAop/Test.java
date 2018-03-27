package com.neuedu.testDynamicProxyAop;

import com.neuedu.testStaticProxyAop.IUserDao;
import com.neuedu.testStaticProxyAop.IUserDaoImpl;

public class Test {

	public static void main(String[] args) {
		//����Ŀ�����
		IUserDao target = new IUserDaoImpl();
		System.out.println("Ŀ�����" + target.getClass());
		//�������
		IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
		System.out.println("�������" + proxy.getClass());
		proxy.save();
	}

}
