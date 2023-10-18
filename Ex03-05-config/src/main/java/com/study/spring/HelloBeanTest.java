package com.study.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class HelloBeanTest {
	public static void main(String[] args) {
//		String configLocation = "classpath:beans.xml";
//		// 1.IoC 컨테이너 생성  
//		GenericXmlApplicationContext context =
//				new GenericXmlApplicationContext(configLocation);
//		// 2.Hello Bean 가져오기
//		Hello hello = (Hello)context.getBean("hello");  hello.print();
//		// 3.PrinterB Bean 가져오기
//		Printer printer = context.getBean("printerB", Printer.class);
//		hello.setPrinter(printer);  
//		hello.print();
		
		// 4. 1개 이상의 설정 파일 경로를 값으로 전달 가능 : 가변 인자 형태임
		// 소스가 2개 이상이면 컴마로 구분하여 기술하면 된다.
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:beans.xml",
				"classpath:config/beans2.xml");
				
		// 4. B. Hello Bean 가져오기
		Hello hello = (Hello)context.getBean("hello");
		hello.print();
		
		
//		context.close();
	}
}