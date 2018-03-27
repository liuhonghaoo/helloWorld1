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
		
		//linkedHashMap输入的顺序和输出的顺序是一致的，而HashMap是会把输入的数据进行排序
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
		
		//Hashtable中不允许插入null的键和值;
		//Hashtable是同步的，而HashMap不是同步的，所以多线程访问的时候，Hashtable不需要自己为它的方法实现同步；而HashMap则需要提供外同步
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
	//	table.put(null, null);
		System.out.println(table);
	}
}
