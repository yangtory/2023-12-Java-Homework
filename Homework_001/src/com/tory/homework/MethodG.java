package com.tory.homework;
/*
 * public static boolean isPrime(int num) {} method 를 선언
 * main() method 에서 2 ~ 101 범위의 수 중 random 수를 하나 생성하여 
 * isPrime() method 에게 전달
 * isPrime() method 는 전달받은 값이 prime 이면 true, 아니면 false 를 return 
 * main() method 에서 결과를 확인하여 “소수임“,”소수가 아님” 이라고 출력
 */

public class MethodG {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // 소수가 아니다 
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 100) + 2;
		if(isPrime(rndNum)) {
			System.out.printf("%d 는 소수임 ", rndNum);
		}else {
			System.out.printf("%d 는 소수가 아님 ", rndNum);
		}
		
		
	}

}
