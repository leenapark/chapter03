package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		// 메인
		//equals() 성능 형성

		//test
		Point p = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 8);
		
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println(p.equals(p01));
		System.out.println(p.equals(p02));
	}

}