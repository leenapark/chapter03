package com.javaex.ex04;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("안녕하세요");
		System.out.println(str);	//println의 기능 - 주소값을 파라미터로 사용하면 toString() 실행한다
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
		
		if(s01.equals("hi")) { //오류가 발생한다 (NullPointerException)
			//문자열이 같은 경우
		}
		
		if("hi".equals(s01)) { //오류가 발생하지 않는다 (NullPointerException)
			//문자열이 같은 경우
		}
		
		
		//다른 애들이랑 다른 것 메로리의 값을 바로 넣을 때
		//값이 같아서 같은 toString을 쓰고 있음
		System.out.println("==특이케이스=================================================");
		String s03 = "hello";
		String s04 = "hello"; //같은 내용을 찾아 먼저 생성된 것에 같은 주소값을 갖는다
		
		System.out.println(s03);
		System.out.println(s04);
		
		System.out.println(s03 == s04);	//-->True 같은 주소를 가지고 있음
		
		
	}

}
