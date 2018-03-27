package com.neuedu.more.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args){
		/*Wine a = new Jnc();
		a.fun1();*/
		/*String aa = "boo:and:foo";
		String[] bb = aa.split(":", 1);
		System.out.println(bb);
		System.out.println(bb.toString());
		aa.split(":", 2);
		System.out.println(aa);*/
		
		/*String str1 = "hello";
		String str2 = "he" + new String("llo");
		String a = "llo";
		String str3 = "he" + a;
		String str4 = new String("hello");
		System.out.println(str3==str4);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));*/
		
			/*String c="c";
			String a="ab"+c;
			String b="abc";
			System.out.println(a==b); */
		
		/*System.out.println(3*1 == 3);
		System.out.println("浮点数不能完全精确的表达出来");
		System.out.println("os.arch");
		System.out.println(System.getProperty("os.arch"));*/
		
		/*byte a = 12;
		byte b = 12;
		byte c = (byte) (a+b);
		System.out.println(c);*/
		
		List<String> list = new ArrayList<String>();
		list.add("8");
		list.add("2");
		list.add("2");
		list.add("9");
		list.add("7");
		list.add("6");
		
		/*Collections.sort(list);*/
		System.out.println(list.toString());
		for(int i = list.size()-1;i>=0;i--){
			String c = (String) list.get(i);
			if(c.equals("2")){
				list.remove(i);
			}
		}
		System.out.println(list.toString());
	}
}
