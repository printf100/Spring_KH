package com.test01;

public class Man {

	public void classWork() {
		System.out.println("출석카드를 찍는다.");

		try {
			System.out.println("컴퓨터 켜서 게임한다.");
		} catch (Exception e) {
			System.out.println("쉬는 날이었다.");
		} finally {
			System.out.println("집에 간다.");
		}
	}
}