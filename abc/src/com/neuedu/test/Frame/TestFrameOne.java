package com.neuedu.test.Frame;

import java.awt.Frame;
import java.math.BigDecimal;

public class TestFrameOne {

	public static void main(String[] args){
		/*Frame frame = new Frame();
		frame.setTitle("ø¥’‚¿Ô£¨I am here!");
		frame.setBounds(100, 100, 100, 100);
		frame.setSize(100, 100);
		frame.setVisible(true);*/
		
		/*BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");
		System.out.println(num1.add(num2));
		System.out.println(num2.subtract(num1));
		System.out.println(num1.multiply(num2));
		System.out.println(num2.divide(num1));
		
		String str = "hello";
		byte[] b = str.getBytes();
		System.out.println(b);
		String ss = new String(b);
		System.out.println(ss);*/
		
	//	byte a = 127;
	//	byte b = 127;
	//	b=(byte) (a+b);
		byte a = 126;
		byte b = 126;
		b = (byte) (a + b);
		System.out.println(b);
		a+=b;
		System.out.println(a);
	}
}
