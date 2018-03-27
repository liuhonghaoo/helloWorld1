package com.neuedu.testDynamicProxyAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬���������Ŀ��������ɴ������
 * @author Administrator
 *
 */

public class ProxyFactory {

	//����һ��Ŀ�����
	private Object target;
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	//���ض�Ŀ�����(target)�����Ķ���
	public Object getProxyInstance(){
		Object proxy = Proxy.newProxyInstance(
				target.getClass().getClassLoader(),//Ŀ�����ʹ�õ��������
				target.getClass().getInterfaces(), //Ŀ�����ʵ�ֵ����нӿ�
				new InvocationHandler() {		   //ִ�д�����󷽷�ʱ�򴥷�
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO �Զ����ɵķ������
						//��ȡ��ǰִ�з����ķ�����
						String methodName = method.getName();
						//���������ķ���ֵ
						Object result = null;
						if("find".equals(methodName)){
							//ֱ�ӵ���Ŀ�귽��
							result = method.invoke(target, args);
						}else{
							System.out.println("��������");
							//ִ��Ŀ����󷽷�
							result = method.invoke(target, args);
							System.out.println("�ύ����");
						}
						return result;
					}
				});
		return proxy;
	}
}
