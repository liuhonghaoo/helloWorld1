package com.neuedu.testStaticProxyAop;

public class IUserDaoImpl implements IUserDao {

	@Override
	public void save() {
		System.out.println("���淽��");
	}

	@Override
	public void find() {
		System.out.println("��ѯ����");
	}

}
