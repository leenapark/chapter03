package com.javaex.ex04;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("안녕하세요");
		System.out.println(str);	//println 주소값을 파라미터로 사용하면 toString() 실행한다
		//System.out.println(str.toString);
		
		String str01 = "안녕!!"; //표현식2
		System.out.println(str01);
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01 == s02);
		System.out.println(s01.hashCode() == s02.hashCode()); //hashCode()값이 같다
		
		if(s01 == s02) {
			//주소값이 같은 경우
		}
		
		if(s01.equals(s02)) {
			//문자열이 같은 경우
		}
		
	}

}
