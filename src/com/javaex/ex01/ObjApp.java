package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		//오브젝트 알아보기
		Object obj = new Object();
		
		
		//object 가 기본으로 가지고 있는 코드
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		
		
		//getClass() --> 클래스 정보
		System.out.println("======================");
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		
		//hassCode() --> 메모리 주소값(실제로는 아님)
		System.out.println("========================");
		System.out.println("obj.hashCode()");
		System.out.println(obj.hashCode());
		
		//실제 주소 값은 아니지만 식별할 수 있는 고유값이 나온다
		System.out.println("===========================");
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//toString --> 객체의 값 정보
		System.out.println("=========================");
		System.out.println("obj.toString()");
		System.out.println(obj.toString());
		
		//equals() --> 객체(인스턴스)가 같은지 비교
		System.out.println("=========================");
		System.out.println("obj.equals()");
		System.out.println(obj.equals(obj)); //--> obj == obj -> True
		System.out.println(obj.equals(obj01)); //--> obj == obj01 -> False
	}

}
