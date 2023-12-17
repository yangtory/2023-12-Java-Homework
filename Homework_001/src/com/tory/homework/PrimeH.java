package com.tory.homework;
/*
 * 2~100 까지 정수 중 소수들의 합을 계산하여 출력 
 */

public class PrimeH {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 100; i++) {
			int j = 0;
			int num = i + 1;
			for (j = 2; j < num; j++) {
				if (num % j == 0) {
					break;
				}
			}
			if(j >= num) {
				sum += num;
			}
		}
		System.out.println("2 ~ 100 까지 수 중 소수들의 합 : " + sum);
	}
}
