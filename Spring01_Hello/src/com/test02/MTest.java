package com.test02;

public class MTest {

	public static void main(String[] args) {
		MessageBean mb = new MessageBeanEn();
		mb.sayHello("Spring");

		mb = new MessageBeanKo();
		mb.sayHello("스프링");
	}
}
