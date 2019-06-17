package com.xxc.bean;

public class Person {

	private String name;
	private int age;
	private String about  ;
	private String time;
	public Person(String name, int age, String about, String time) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.time = time;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about
				+ ", time=" + time + "]";
	}
		
	
}
