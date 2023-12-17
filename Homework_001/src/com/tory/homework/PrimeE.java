package com.tory.homework;
/*
 * 정수형 변수 num 을 랜덤수로 생성
 * 2 ~ 101 까지 범위의 임의의 정수 5개를 생성
 * 생성된 5의 정수가 소수인지 아닌지 판별하여 출력 
 */

public class PrimeE {

	public static void main(String[] args) {
		int num1 = 0;
		int j = 0;
		boolean noPrime = false;

		System.out.println("=".repeat(40));
		System.out.println("소수 판별하기");
		System.out.println("-".repeat(40));

		for (int i = 0; i < 5; i++) {
			num1 = (int) (Math.random() * 100) + 2;
			for(j = 2 ; j < num1 ; j++) {
				if(num1 % j == 0) {
					noPrime = true;
					break;
				}
			}
			if (noPrime) {
				System.out.printf("%d MOD %d = %d , %d 는 소수가 아님 \n", num1, j, num1 % j, num1);
			} else {
				System.out.printf("%d 는 소수임 \n", num1);
			}
		}
		System.out.println("=".repeat(40));
	}

}
