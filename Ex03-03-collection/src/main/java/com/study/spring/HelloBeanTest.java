package com.study.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;

public class HelloBeanTest {
	public static void main(String[] args) {
		// xml 설정 파일의 위치를 선언
		/*
			classpath의 의미를 웹애플리케이션을 WAR로 배포했을 때 classes
			폴더 하위로 패키지와 클래스, XML 설정 파일들이 위치하게 되는데
			해당 디렉토리를 가리키는 예약어이다.
		*/
		String configLocation = "classpath:beans.xml";
		
		// 1.IoC 컨테이너 생성
		// xml 설정파일을 기반으로 스프링컨테이너를 생성
		ApplicationContext context =
				new GenericXmlApplicationContext(configLocation);
		
		// 2.Hello Bean 가져오기
		// 컨테이너 생성된 빈을 getBean()메서드를 통해 주입(Injection)받는다.
		Hello hello = (Hello)context.getBean("hello");
		
		// Map 반환
		Map<String, Integer> map = hello.getAges();
		
		// 방법 01 : entrySet
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			System.out.println("Map1 : " + entry.getKey() + " - " + entry.getValue());
		}
		
		// 방법 02 : KeySet
		for (String key : map.keySet()) 
		{
			Integer value = map.get(key);
			System.out.println("Map2 : " + key + " - " + value);
		}
		
		// 방법 03 : Iterator
		Iterator<String> iterator = map.keySet().iterator();
		
		while (iterator.hasNext())
		{
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("Map3 : " + key + " - " + value);
		}
	}
}