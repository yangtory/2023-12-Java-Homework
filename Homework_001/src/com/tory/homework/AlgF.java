package com.tory.homework;
/*
 * 정수형 변수 pay 를 선언하고 3587960 을 할당
 * 5만, 만, 5천, 천, 5백, 백, 5십, 십 원 단위별로
 * 화폐단위가 몇매씩 인지 출력 
 */

public class AlgF {
	
	public static void main(String[] args) {
		int pay = 3587960;
		
		int m5 = pay / 50000;
		int m = pay % 100000 % 50000 / 10000;
		int t5 = pay % 10000 / 5000;
		int t = pay % 10000 % 5000 / 1000;
		int h5 = pay % 1000 / 500;
		int h = pay % 1000 % 500 / 100;
		int c5 = pay % 100 / 50;
		int c = pay % 100 % 50 /10;
		
		System.out.println("=".repeat(20));
		System.out.println("5만원권 : " + m5);
		System.out.println("1만원권 : "+ m);
		System.out.println("5천원권 : "+t5);
		System.out.println("1천원권 : "+t);
		System.out.println("5백원 : "+h5);
		System.out.println("1백원 : "+h);
		System.out.println("5십원 : "+c5);
		System.out.println("1십원 : "+c);
		System.out.println("=".repeat(20));
	}

}
