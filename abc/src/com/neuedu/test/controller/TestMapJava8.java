package com.neuedu.test.controller;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMapJava8 {

	public static void main(String[] args){
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(int i = 0;i < 10;i++){
			map.put(i, "val_"+i);
		}
		Map<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(11, "11");
		map2.put(13, "13");
		map2.put(12, "12");
		
		
	//	map.merge(13, "13", (value,newvalue)->value.concat(newvalue));
	//	map.merge(15, "15", (value,newvalue)->value.concat(newvalue));
	//	map.forEach((key,value) -> System.out.println(key+":"+value));
	//	String vv = map.getOrDefault(12, "");
	//	System.out.println(vv);
		
		//linkedHashMap�����˳��������˳����һ�µģ���HashMap�ǻ����������ݽ�������
		LinkedHashMap<Integer, String> linkmap = new LinkedHashMap<Integer, String>();
		linkmap.put(22, "22");
		linkmap.put(44, "44");
		linkmap.put(33, "33");
		linkmap.put(null, null);
		
		
		for(Map.Entry<Integer, String> entry:map2.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		for(Map.Entry<Integer, String> entry:linkmap.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//Hashtable�в��������null�ļ���ֵ;
		//Hashtable��ͬ���ģ���HashMap����ͬ���ģ����Զ��̷߳��ʵ�ʱ��Hashtable����Ҫ�Լ�Ϊ���ķ���ʵ��ͬ������HashMap����Ҫ�ṩ��ͬ��
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
	//	table.put(null, null);
		System.out.println(table);
	}
}
