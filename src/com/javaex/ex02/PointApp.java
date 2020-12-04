package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		//메인
		
		Point p = new Point(2, 3);
		//System.out.println(p.toString());
		//hashCode() 비교코드
		Point p01 = new Point(2, 3);
		Point p02 = new Point(100, 100);
		
		Point p05 = p;
		
		//부모로 Object class 를 자동으로 두고 있다
		//Object class의 메소드 + Point Class의 메소드를 사용할 수 있다.
		//똑같이 겹치는 코드는 자식 틀인 Point 가 실행된다
		System.out.println("toString()===============");
		System.out.println(p.toString()); //<-- Point - toString
		
		//test - Point class의 toString이 없을 경우
		System.out.println(p.toString());
		
		//메소드 오버 라이딩
		Object op = new Point();
		System.out.println(op.toString());
		
		System.out.println(p);
		
		//getClass()
		System.out.println("getClass()========================");
		System.out.println(p.getClass());
		
		
		//hashCode()
		System.out.println("hashCode()========================");
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		//equals() 비교문 : 같은지 비교한다
		System.out.println("equals()========================");
		System.out.println(p.equals(p01));
		//주소값이 다르면 false로 처리된다
		
		//주소값을 직접 비교할 때 사용
		System.out.println(p==p01);
		System.out.println(p==p05);
		
		String str = "안녕";
		if(str == "안녕") {
			
		}
		
	}

}
