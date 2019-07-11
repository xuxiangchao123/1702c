package com.bawei.util;

import java.util.Random;

public class StringUtil {
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	public static boolean hasLength(String src){
		return src != null && src.length() > 0;
	}
	
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
		//trim()方法把字符串中的空格去除
		return src != null && src.trim().length() > 0;
	}
	
	public static String getLastName(int n){
		String[] lastName = {"按","增","加","顺","序","返","回","元","素",
				"因","为","需","要","维","护","插","入","但","迭","代","访",
				"问","会","有","好","性","能","华","采","用","链","表","内"};
		
		Random random = new Random();
		String str = "";
		int abs = -1;
		for(int i=0;i<n;i++){
			abs = Math.abs(random.nextInt(lastName.length));
			str=str+ lastName[abs];
		}
		
		return str;
	}
	
	
	public static String getName(int n){
		String[] string = {"赵","钱","孙","李","周","吴","郑","王","冯",
				"陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许","何",
				"吕","施","张","孔","曹","严","华"};
		
		Random random = new Random();
		int abs = Math.abs(random.nextInt(string.length));
		String string2 = string[abs];
		String lastName = StringUtil.getLastName(n);
		return string2 + lastName;
		
	}
	
	
	
	
}
