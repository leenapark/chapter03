package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		// String 메소드
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		
		System.out.println("==concat===============");

		//concat
		System.out.println(a.concat(b));
		System.out.println(a);	//위 출력에서 공백이 사라졌지만 실제 a 변하지 않음
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println("==trim===============");
		//trim()
		a = a.trim();
		System.out.println(a);
		System.out.println("__" + a + "__");	//공백 확인용
		
		a = a.replace("ab","12,");	//"1번값","2번값" 1번값을 2번값으로 바꿔라
		System.out.println(a);
		
		System.out.println("==split===============");
		
		String[] sArr = a.split(",");
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println("==substring===============");

		String str = "Hello java";
		String result01 = str.substring(2);	//갯수만큼 빠짐
		System.out.println(result01);
		System.out.println(str);
		
		String result02 = str.substring(3, 5);
		System.out.println(result02);
		
		char c = str.charAt(1);
		System.out.println(c);
		
		String c2 = str.substring(1,2);
		System.out.println(c2);
		
	}

}
