package com.bawei.bean;

import java.util.LinkedList;

import com.bawei.util.RandomUtil;
import com.bawei.util.StringUtil;

public class PersonMain {
	
	public static void main(String[] args) {
		LinkedList<Person> linkedList = new LinkedList<Person>();
		
		
		for(int i=0;i<30;i++){
			Person person = new Person();
			int length = (int)(Math.random()*(2))+1;
			person.setName(StringUtil.getName(length));
			person.setAge((int)RandomUtil.getRandomNum(5, 80));
			person.setDesc(StringUtil.getLastName(20));
			person.setDate(RandomUtil.getRandomDate("20000101", "20190101"));
			
			linkedList.add(person);
		}
		
		for (Person person1 : linkedList) {
			System.out.println(person1.toString());
		}
		
	}
	
}
