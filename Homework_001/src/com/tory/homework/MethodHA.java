package com.tory.homework;
/*
 * public static int isPrime(int num) {} method 를 선언 
 * num 가 prime 이면 0, 아니면 index 값을 return
 * main() method 에서 2 ~ 101 범위의 수 중 random 수를 “5개” 생성하여 
 * isPrime() method 에게 전달 하여 출력 
 */

public class MethodHA {

	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("소수 판별하기");
		for (int index = 0; index < 5; index++) {
			int num = (int) (Math.random() * 100) + 2;
			int i = isPrime(num);
			if (i > 0) {
				System.out.printf("%d MOD %d = %d, %d는 소수가 아님 \n"
						,num, i, num % i, num);
			} else {
				System.out.printf("%d 는 소수임\n", num);
			}
		}
	}

}
