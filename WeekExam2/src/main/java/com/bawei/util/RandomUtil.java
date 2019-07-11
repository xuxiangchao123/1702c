package com.bawei.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	public static long getRandomNum(long start,long end){
		//0-1    0-(end-start)
		long result = (long)(Math.random()*(end-start))+start;
		if((result == start)||(result == end)){
			return RandomUtil.getRandomNum(start,end);
		}	
		return result;
	}
	
	public static HashSet<Long> getRandomSet(long start,long end,int n){
		HashSet<Long> hashSet = new HashSet<Long>();
		long result;
		while(hashSet.size()<n){
			result = (long)(Math.random()*(end-start))+start;
			hashSet.add(result);
		}		
		return hashSet;
	}
	
	public static char getChar(){
		String string = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLPOIUYTREWQ0123456789";
		
		char[] charArray = string.toCharArray();
		Random random = new Random();
		int abs = Math.abs(random.nextInt(charArray.length));
		return charArray[abs];
	}
	
	
	public static String getStr(int n){
		String string = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLPOIUYTREWQ0123456789";
		
		char[] charArray = string.toCharArray();
		Random random = new Random();
		String str = "";
		
		for(int i=0;i<n;i++){
			int abs = Math.abs(random.nextInt(charArray.length));
			str=str+ charArray[abs];
		}
		
		return str;
		
	}
	
	
	public static String getRandomDate(String startDate,String endDate){
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		try {
			Date start = format.parse(startDate);
			Date end = format.parse(endDate);
			
			if(start.getTime()>=end.getTime()){
				return null;
			}
			
			long randomNum = RandomUtil.getRandomNum(start.getTime(), end.getTime());
			Date date = new Date(randomNum);
			return format.format(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	
}
