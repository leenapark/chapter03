package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n01 = new Integer(23);
		Integer n02 = new Integer(100);
		
		Integer sum = n01 + n02;	//sum 안에는 주소가 들어가 있음
		System.out.println(sum);
		
		Integer sum2 = new Integer(50) + new Integer(51);	//sum 안에는 주소가 들어가 있음
		System.out.println(sum2);
		
		
		int num = 123;	//비교 값을 바로 넣어줌
		
		Integer i01 = 23;	//박싱	//비교 메모리에 올라감 (= new 문법이랑 같은 형태로 볼 수 있음) 
		i01.parseInt("12313");	//박싱 메소드 포함
		
		int no = n02;	//언박싱	//Integer - int 호환
		System.out.println(no);
		
		//메소드 사용 (Integer 예제)
		int result = i01.parseInt("12345");
		System.out.println(result);		//숫자로 값이 변해있음
		
		//이상한점↓
		//"13579" --> 13579 숫자로 변경 하고 싶을 때
		//메모리에 올려야 .parseInt 사용 가능 - Integer 박싱 사용 (int 사용x)
		Integer no03 = new Integer("131313");	//.parseInt를 사용하려고 의미 없는 메모리를 올려줌
		int result01 = no03.parseInt("13579");
		
		//바로 .parseInt 사용하는 법
		int result02 = Integer.parseInt("13579");
		System.out.println(result02);
		
		//정수를 문자열
		//12345 --> "12345"
		String result03 = String.valueOf(12345);
		System.out.println(result03);
		//다른 표현
		String result04 = ""+12345;
		System.out.println(result04);
		
		
	}

}
