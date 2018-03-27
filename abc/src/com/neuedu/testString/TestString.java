package com.neuedu.testString;

public class TestString {

	public static void main(String[] args){
		/*String s = "abcd";
		s = s.concat("ef");
		String s2 = s;
		System.out.println(s2);
		System.out.println(s);
		System.out.println(s2);*/
		/*Object a = "a";
		Object b = "b";
		if(a.equals(b)){
			System.out.println("a∫Õbœ‡µ»");
		}*/
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = "ab" + "c";
		String e = "ab" + "c";
		String f = new String("abc");
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(b==d);
		System.out.println(d==e);
		System.out.println(c==f);
	}
}
