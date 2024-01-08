package com.Raj.Start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	public static void main(String[] args) {
		//Creating the Spring Container
	/*	DefaultListableBeanFactory factory= new  DefaultListableBeanFactory();
		//loading the Spring ConfigurationFile
		XmlBeanDefinitionReader xbdr=new XmlBeanDefinitionReader(factory);
		xbdr.loadBeanDefinitions("spring.xml");
		//Requesting the Spring Beans  from the Spring Container
		Welcome wb=(Welcome)factory.getBean("wb");
		Demo db=(Demo)factory.getBean("db");
		Test ts=(Test)factory.getBean("ts");
		//printing the spring beans 
		System.out.println(wb);
		System.out.println(db);
		System.out.println(ts);*/
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		
		
	}

}
