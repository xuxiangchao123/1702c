package com.bawei.test;

import java.util.Date;
import java.util.HashSet;

import org.junit.Test;

import com.bawei.util.RandomUtil;

public class RandomTest {
	@Test
	public void getRandomNumTest(){
		
		long randomNum = RandomUtil.getRandomNum(20190430, 20190614);
		System.out.println(randomNum);
	}
	
	
	@Test
	public void getRandomSetTest(){
		
		HashSet<Long> randomSet = RandomUtil.getRandomSet(30, 100, 8);
		for (Long long1 : randomSet) {
			System.out.println(long1);
		}

	}
	
	@Test
	public void getCharTest(){
		char char1 = RandomUtil.getChar();
		
		System.out.println(char1);
	}
	
	@Test
	public void getStrTest(){
		String str = RandomUtil.getStr(6);
		
		System.out.println(str);
	}
	
	@Test
	public void getDateTest(){
		String randomDate = RandomUtil.getRandomDate("20150621", "20180730");
		System.out.println(randomDate);
	}
	
	
}
