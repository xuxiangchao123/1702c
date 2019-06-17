package com.xxc.test;

import java.util.HashSet;

import org.junit.Test;

import com.xxc.util.RandomUtil;

public class RandomTest {

	//获取范围内一个随机数
	@Test
	public void ntest1(){
		int num1 = RandomUtil.num1(1,10);
		System.out.println(num1);
	}
	//获取多个随机数
	@Test
	public void ntest2(){
		HashSet<Integer> num2 = RandomUtil.num2(5, 1, 6);
		for (Integer integer : num2) {
			System.out.println(integer);
		}
	}
	//获取一个单字符
	@Test
	public void ntest3(){
		char num3 = RandomUtil.num3();
		System.out.println(num3);
	}
	//获取一个字符串
	@Test
	public void ntest4(){
		String num3 = RandomUtil.num4(6);
		System.out.println(num3);
	}
	
}
