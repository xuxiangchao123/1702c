package com.xxc.test;

import java.util.HashSet;

import org.junit.Test;

import com.xxc.bean.Person;
import com.xxc.util.StringUtil;

public class StringTest {

	//判断是否是空引号
	@Test
	public void num1(){
		boolean num1 = StringUtil.num1("");
		System.out.println(num1);
	}
	//判断是否是空引号 和 空格
	@Test
	public void num2(){
		boolean num1 = StringUtil.num2("  11 ");
		System.out.println(num1);
	}
	//获取多个文字
	@Test
	public void num3(){
		String string = StringUtil.randomChineseString(5);
		System.out.println(string);
	}
	//获取百家姓
	@Test
	public void num4(){
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
	//获取姓名
	@Test
	public void num5(){
		String string = StringUtil.generateChineseName();
		String string2 = StringUtil.randomChineseString(3);
		System.out.println(string+string2);
	}
	//获取10000个对象
	@Test
	public void num6(){
		HashSet<Person> hashSet = StringUtil.set11(10000);
		for (Person person : hashSet) {
			System.out.println(person);
		}
	}
	
	
	
}
