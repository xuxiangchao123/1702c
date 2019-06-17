package Person;

import java.util.Date;

public class Person {

	private String name;
	private int age;
	private String jie;
	private String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJie() {
		return jie;
	}
	public void setJie(String jie) {
		this.jie = jie;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jie=" + jie
				+ ", time=" + time + "]";
	}
	public Person(String name, int age, String jie, String time) {
		super();
		this.name = name;
		this.age = age;
		this.jie = jie;
		this.time = time;
	}
	public Person() {
		super();
	}
	
	
}
