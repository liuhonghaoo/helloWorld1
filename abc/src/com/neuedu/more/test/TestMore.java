package com.neuedu.more.test;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class TestMore {

	public static void main(String[] args) throws UnsupportedEncodingException{
		/*byte[] ab = {'a','b'};
		String b = new String(ab,"gbk");
		System.out.println(b);
		
		int aa = 3;
		System.out.println(intToByte(aa));
		System.out.println(ByteToint(ab));*/
		/*int a[] = {0,3,4,89,8,23,44,7,11,10};
		int max = a[0];
		int min = a[9];
		for(int i = 0; i < a.length;i++){
			if(max < a[i]){
				max = a[i];
			}
			if(min > a[i]){
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);*/
		
		/*System.out.println(3*0.1f);
		System.out.println(0.3f);
		System.out.println(3*0.1f == 0.3f);
		
		System.out.println(System.getProperty("os.arch"));
		
		String one = new String("1");
		String two = new String("1");
		System.out.println(one == two);
		System.out.println(one.equals(two));*/
		
		One one = new Two("a");
		one.play();
		
	}
	public static byte intToByte(int a){
		return (byte)a;
	}
	
	public static int ByteToint(byte[] a){
		return     
                    
                (a[1] & 0xFF) << 16 |    
                (a[0] & 0xFF) << 24;
	}
	
	private static ByteBuffer buffer = ByteBuffer.allocate(8);
	public static long byteTolong(byte[] a){
		buffer.put(a, 0, a.length);
		buffer.flip();//ÇÐ»»³É¾ÍÐ÷×´Ì¬
		return buffer.getLong();
	}
}
