package com.study.spring;

public class Hello {
	
	private String name;  
	private String nickname;
	private Printer printer;
	
	// 기본 생성자
	public Hello() {};
	
	// 생성자
	public Hello(String name, String nickname, Printer printer)
	{
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public String sayHello() {
		return "Hello " + name + " : " + nickname;
	}

	public void print()
	{
		printer.print(sayHello());
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public Printer getPrinter()
	{
		return printer;
	}
	
}
