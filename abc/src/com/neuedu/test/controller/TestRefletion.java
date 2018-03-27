package com.neuedu.test.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.neuedu.test.bean.User;

public class TestRefletion {

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		/*try {
			Class c = Class.forName("com.neuedu.test.bean.User");
			Method[] m = c.getMethods();
			Method[] mm = c.getDeclaredMethods();
			
			for(int i = 0;i<m.length;i++){
				System.out.println(m[i].toString());
			}
			
			System.out.println("====================================");
			
			for(int j =0;j<mm.length;j++){
				System.out.println(mm[j].toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
		User u = new User();
		String className = "com.neuedu.test.bean.User";
			Class<?> c = null;
			try {
				c = Class.forName(className);
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
				c.getMethod("setUserName", String.class).invoke(u, "老三");
				System.out.println(u.getUserName());

				Map<String , String> map = new HashMap<String , String>();
				map.put(null, null);
				map.put("result", "看着我");
				System.out.println(map);
				System.out.println(map.entrySet().iterator().hasNext());
//				System.out.println(map.getOrDefault( "result",  "看着我"));
				System.out.println(map.isEmpty());
	}

}
