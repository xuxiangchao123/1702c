package com.xxc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import Person.Person;


public class TestUtil {

	public static long rand(long start,long end){
		long a=(long) (Math.random()*(end-start)+start);
		if(a==start || a==end){
			rand(start, end);
		}
		return a;
	}
	
	public static HashSet<Integer> sum(Integer start,Integer end,Integer num){
		HashSet<Integer> set=new HashSet<Integer>();
		while (set.size()<num) {
			Integer n=(int) (Math.random()*(end-start)+start);
			set.add(n);
		}
		return set;
	}
	public static char charNum(){
		String string="QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm0123456789";
		
		char[] charArray = string.toCharArray();
		Random random=new Random();
		int abs = Math.abs(random.nextInt(charArray.length));
		return charArray[abs];
	}
	public static String stringNum(int num){
		String string="QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm0123456789";
		String aString="";
		Random random=new Random();
		char[] charArray = string.toCharArray();
		for (int i = 0; i <num; i++) {
			int j = random.nextInt(charArray.length);
			aString+=charArray[j];
		}
		return aString;
	}
	public static boolean boolean11(String num){
		
		return num !=null && num.trim().length()>0;
	}
	public static boolean boolean12(String acm){
		char[] charArray = acm.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(' '!=charArray[i]){
				return true;
			}
		}
		return false;
	}
	public static String bai(int num){
		String ab="";
		String[] string = {"赵","钱","孙","李","周","吴","郑","王","冯",
				"陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许","何",
				"吕","施","张","孔","曹","严","华","郭","徐"};
		Random random=new Random();
		for (int i = 0; i < num; i++) {
			int abs = Math.abs(random.nextInt(string.length));
			ab+=string[abs];
		}
		return ab;
	}
	public static String ming(int start,int end){
		String ab="";
		String[] lastName = {"按","增","加","顺","序","返","回","东","亚",
				"李","琦"};
		Random random=new Random();
		int a=(int) (Math.random()*(end-start)+start);
		for (int i = 0; i < a; i++) {
			int j = random.nextInt(lastName.length);
			ab+=lastName[j];
		}
		return ab;
	}
	public static Date dtime() throws Exception{
		SimpleDateFormat cDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int day=(int) (Math.random()*(30-1)+1);
		int year=(int) (Math.random()*(2019-2000)+2000);
		int month=(int) (Math.random()*(12-1)+1);
		int hours=(int) (Math.random()*(24-1)+1);
		int fen=(int) (Math.random()*(60-1)+1);
		int miao=(int) (Math.random()*(60-1)+1);
		String datetime=year+"-"+month+"-"+day+" "+hours+":"+fen+":"+miao;
		Date date = cDateFormat.parse(datetime);
		return date;
		
	}
	public static HashSet<Person> sett(int num) throws Exception{
		HashSet<Person> set=new HashSet<Person>();
		for (int i = 0; i < num; i++) {
			int c=(int) (Math.random()*(50-30)+30);
			@SuppressWarnings("deprecation")
			Person p1=new Person(bai(1)+ming(1,3),c,bai(8), dtime().toLocaleString());
			set.add(p1);
		}
		return set;
		
	}
	
}
