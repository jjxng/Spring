package com.study.spring;

public class Student
{
	private String name;
	private String age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	
	public void getStudentInfo()
	{
		System.out.println("이름 : " + getName());
		System.out.println("이름 : " + getAge());
	}
}
