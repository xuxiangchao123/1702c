package week2;

import java.util.HashSet;

import org.junit.Test;

import Person.Person;

import com.xxc.util.TestUtil;

public class Utest {

	
	@Test
	public void funTest1(){
		long start=20160505;
		long end=20180909;
		long rand = TestUtil.rand(start, end);
		System.out.println(rand);
	}
	@Test
	public void funTest2(){
		
		HashSet<Integer> sum = TestUtil.sum(1,10,5);
		for (Integer integer : sum) {
			System.out.println(integer);
		}
	}
	@Test
	public void funTest3(){
		
		char charNum = TestUtil.charNum();
		System.out.println(charNum);
	}
	@Test
	public void funTest4(){
		String num = TestUtil.stringNum(5);
		System.out.println(num);
	}
	@Test
	public void funTest5(){
		String a="";
		//a.trim() 去除空格 空字符串 专用 切记
		boolean boolean11 = TestUtil.boolean12(a);
		System.out.println(boolean11);
	}
	@Test
	public void funTest6(){
		String mingString=TestUtil.ming(1,3);
		String bai = TestUtil.bai(1);
		System.out.println(bai+mingString);
	}
	@Test
	public void funTest7() throws Exception{
		HashSet<Person> sett = TestUtil.sett(10000);
		for (Person person : sett) {
			if(person.getName().equals("徐东亚")){
				System.out.println(person);
			}
		}
	}
	
}
