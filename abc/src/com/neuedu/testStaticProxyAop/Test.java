package com.neuedu.testStaticProxyAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.neuedu.test.bean.User;

public class Test {

	public static void main(String[] args){
		/*IUserDao proxy = new IUserDaoImplProxy();
		proxy.save();*/
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("F:/fuhuaqi/abc/WebContent/WEB-INF/config/spring/applicationContext.xml");
		/*User user1 = (User) context.getBean("User1");
		User user2 = (User) context.getBean("User2");
		System.out.println("�����˵������ֱ��ǣ�"+user1.getUserName()+"��"+user2.getUserName());
		System.out.println("�����˵�����ֱ��ǣ�"+user1.getUserAge()+"��"+user2.getUserAge());
		System.out.println("�����˵����շֱ��ǣ�"+user1.getBirthday()+"��"+user2.getBirthday());
		System.out.println("�����˵ĵ�ַ�ֱ��ǣ�"+user1.getAddress()+"��"+user2.getAddress());*/
		User user = (User) context.getBean("User1");
		System.out.println("User�������ǣ�"+user.getUserName());
		System.out.println("User�������ǣ�"+user.getUserAge());
		System.out.println("User�������ǣ�"+user.getBirthday());
		System.out.println("User�ĵ�ַ�ǣ�"+user.getAddress());
	}
}
