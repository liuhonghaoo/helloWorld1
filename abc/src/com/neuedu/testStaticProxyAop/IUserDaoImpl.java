package com.neuedu.testStaticProxyAop;

public class IUserDaoImpl implements IUserDao {

	@Override
	public void save() {
		System.out.println("保存方法");
	}

	@Override
	public void find() {
		System.out.println("查询方法");
	}

}
