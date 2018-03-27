package com.neuedu.perspn.testSpringIOC;

public class Student implements StudentItf {

	private String name;
	private String age;
	
	public Student(){}
	
	public Student(String name,String age){
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void show() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getAge(){
		return age;
	}

}
