package com.javaex.ex04;

public class StringApp2 {

	public static void main(String[] args) {
		// String 메소드
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//concat
		System.out.println(a.concat(b));
		System.out.println(a);	//a 변하지 않음
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim()
		a = a.trim();
		System.out.println(a);
		System.out.println("__" + a + "__");	//공백 확인용
		
		a = a.replace("ab","12,");
		System.out.println(a);
		
		System.out.println("=================");
		
		String[] sArr = a.split(",");
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
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
