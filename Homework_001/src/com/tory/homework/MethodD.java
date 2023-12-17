package com.tory.homework;
/*
 * public static int add() method 를 선언하고
 * 정수 30과 40을 덧셈하여 return
 * main() method 에서 add() method 호출하여
 * return 값을 sum 변수에 할당한 후 sum 변수 값을 출력 
 */

public class MethodD {
	
	public static int add() {
		int num1 = 30;
		int num2 = 40;
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		int sum = 0; 
		sum = add();
		System.out.println(sum);
	}
}
