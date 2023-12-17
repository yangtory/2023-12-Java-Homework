package com.tory.homework;
/*
 *  정수형 변수 num1 을 선언하고 3587964 를 할당
 *  num1 변수에 담긴 값 중에서 10만 단위의 개수가 몇 개인지 찾아내는 코드 작성
 *  10만 단위 개수는 5
 */

public class AlgE {
	
	public static void main(String[] args) {
		int num1 = 3587964;
		
		System.out.println((num1 % 1000000) / 100000);
	}

}
