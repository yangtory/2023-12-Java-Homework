package com.tory.homework;

/*
 * println 을 사용하여 구구단 5단 출력 
 */
public class HelloG {

	public static void main(String[] args) {
		int num1 = 5;

		System.out.println("5단 구구단");
		System.out.println("=".repeat(10));
		for (int i = 0; i < 9; i++) {
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}
		System.out.println("=".repeat(10));
	}

}
