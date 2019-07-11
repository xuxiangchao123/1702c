package com.bawei.bean;

import java.util.Date;

public class Person {
	
	private String name;
	private int age;
	private String desc;
	private String date;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", desc=" + desc + ", date=" + date + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Person(String name, int age, String desc, String date) {
		super();
		this.name = name;
		this.age = age;
		this.desc = desc;
		this.date = date;
	}
	public Person() {
		super();
	}
	
	
	
	
	
	
}
