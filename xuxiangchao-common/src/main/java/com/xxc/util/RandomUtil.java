package com.xxc.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int num1(int start,int end){
		int num=(int) (Math.random()*(end-start)+start);
		return num;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static HashSet<Integer> num2(int num,Integer start,Integer end){
		HashSet<Integer> set=new HashSet<Integer>();
		
		while (set.size()<num) {
			Integer a=(int) (Math.random()*(end-start)+start);
			set.add(a);	
		}
		return set;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char num3(){
		
		String a="123456789abcdefghigklmnopqrstuvwxyz";
		char[] b = a.toCharArray();
		Random c=new Random();
		int int1 = c.nextInt(b.length);
		char d=b[int1];
		return d;
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String num4(int num) {
		// TODO Auto-generated method stub
		String a="123456789abcdefghigklmnopqrstuvwxyz";
		char[] b = a.toCharArray();
		Random c=new Random();
		String bbString="";
		String bString="";
		for (int i = 0; i < num; i++) {
			int int1 = c.nextInt(b.length);
			bbString+=b[int1];
		}
		
		return bbString;
	}
	
}
