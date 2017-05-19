package spring.chapter3.test;

public class Person {
	private String name;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println("My name is "+this.name+" and I'm "+ String.valueOf(this.age) + "years old!");
	}
	
}
