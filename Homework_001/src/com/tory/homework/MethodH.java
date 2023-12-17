package com.tory.homework;
/*
 * public static boolean isPrime(int num) {} method 를 선언
 * main() method 에서 2 ~ 101 범위의 수 중 random 수를 “5개” 생성하여
 * isPrime() method 에게 전달
 * isPrime() method 를 활용하여 출력
 */

public class MethodH {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // 소수가 아니다
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) + 1;
			if(isPrime(num)) {
				System.out.printf("%d 는 소수임 \n", num);
			} else {
				System.out.printf("%d 는 소수가 아님 \n", num);
			}
		}
	}

}
