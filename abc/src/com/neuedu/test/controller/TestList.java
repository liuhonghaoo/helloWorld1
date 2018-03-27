package com.neuedu.test.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class TestList {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		String s = "hello";
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			list.add(s);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		ArrayList<String> list2 = new ArrayList<String>();
		long start2 = System.currentTimeMillis();
		//��ʹ��ArrayListʱ����Ҫ�������г�ʼ��������Ҫʹ��add()ʱ��Ҫ�����ӵ������ϴ��ʱ��ʹ��ensureCapacity��������Ԥ�����ú�ArrayList�Ĵ�С�������Ļ��ͻ�����߳�ʼ��Ч��
		list2.ensureCapacity(10000);
		for(int i=0;i<100000;i++){
			list2.add(s);
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		
		int k = list.indexOf("hell");
		System.out.println(k);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("ƻ��");
		list3.add("�㽶");
		list3.add("����");
		Iterator<String> it = list3.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("====================");
		ListIterator<String> li = list3.listIterator(0);
		while(li.hasNext()){
			System.out.println(li.next());
		}

		System.out.println("====================");
		String[] a = new String[list3.size()];
		list3.toArray(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("++++++++++++++++++++");
		list3.trimToSize();
		
		
		List<String> list4 = new ArrayList<String>();
		list4.add("4");
		list4.add("5");
		list4.add("6");
		ListIterator<String> lt4 = list4.listIterator();
		String first = lt4.next();
		lt4.remove();
		lt4.add("9");
		System.out.println("����list4�е�Ԫ��");
		lt4 = list4.listIterator();
		System.out.println(lt4.hasPrevious());
		while(lt4.hasPrevious()){
			System.out.println(lt4.next());
		}
	}

}
