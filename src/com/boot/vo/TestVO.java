package com.boot.vo;

public class TestVO {
	private String name;
	private int age;
	public TestVO() {
		this("기본이름");
	}
	
	public TestVO(String name) {
		this(name,10);
	}
	public TestVO (String name, int age){
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "TestVO [name=" + name + ", age=" + age + "]";
	}
	
}
