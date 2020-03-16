package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");

		MessageBean bean = (MessageBean) factory.getBean("banana");
		bean.sayHello();
		
		bean = (MessageBean) factory.getBean("mango");
		bean.sayHello();
		
		bean = (MessageBean) factory.getBean("grape");
		bean.sayHello();
	}
}
