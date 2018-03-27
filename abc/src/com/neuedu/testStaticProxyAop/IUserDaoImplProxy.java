package com.neuedu.testStaticProxyAop;

public class IUserDaoImplProxy implements IUserDao {

	IUserDao target = new IUserDaoImpl();
	
	@Override
	public void save() {
		System.out.println("�����������������");
		target.save();
		System.out.println("����������ύ����");
	}

	@Override
	public void find() {
		target.find();
	}

}
