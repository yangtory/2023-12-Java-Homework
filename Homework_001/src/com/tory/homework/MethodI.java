package com.tory.homework;
/*
 *  public static int isPrime(int num) {} method 를 선언
 *	main() method 에서 2 ~ 101 범위의 수 중 random 수를 “5개” 생성하여 
 *	isPrime() method 에게 전달
 *	isPrime() 은 num 가 소수이면 num 를 return, 아니면 0 을 return
 *	isPrime() method가 return 값(소수들) 을 모두 합산하여 출력
 */

import com.tory.homework.utils.Line;

public class MethodI {

	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int index = 0;
		int sum = 0;
		Line.dLine(30);
		System.out.println("소수의 합 구하기");
		Line.sLine(30);
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			index = isPrime(num);
			sum += index;
			if(index > 0) {
				System.out.printf("%d 는 소수임 \n", num);
			} else {
				System.out.printf("%d 는 소수가 아님 \n", num);
			}
		}
		Line.sLine(30);
		System.out.printf("소수의 합 : %d\n", sum);
		Line.dLine(30);
	}

}
