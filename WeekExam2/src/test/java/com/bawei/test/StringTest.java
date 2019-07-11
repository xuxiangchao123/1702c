package com.bawei.test;

import org.junit.Test;

import com.bawei.util.StringUtil;

public class StringTest {
	@Test
	public void getNameTest(){
		String name = StringUtil.getName(3);
		
		System.out.println(name);
		
	}
	
}
