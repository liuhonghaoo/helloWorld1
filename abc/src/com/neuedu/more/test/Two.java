package com.neuedu.more.test;

public class Two extends One{

	public Two(String a) {
		super(a);
		System.out.println("��������Ĺ��췽�����������ⱻʵ����");
	}

	@Override
	public void play() {
		// TODO �Զ����ɵķ������
		System.out.println("��ʵ���˸���ķ���");
	}
	
	/*public static void main(String[] args){
		One one = new Two("a");
	}*/

}
