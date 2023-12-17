package com.tory.homework;
/*
 * 단일 for() 문을 사용하여
 * 1~100 까지 숫자 중 3의 배수 합과 5의 배소 합을 구하고
 * 3의 배수의 합과 5의 배수 합의 4칙 연산을 출력 
 */

public class AlgB {
	
	public static void main(String[] args) {
		int sum3 = 0;
		int sum5 = 0;
		
		for(int i = 0 ; i < 100 ; i++ ) {
			if((i+1) % 3 == 0) {
				sum3 += (i+1);
			}
			if((i+1) % 5 == 0) {
				sum5 += (i+1);
			}
		}
		System.out.printf("3의 배수의 합 : %d \n", sum3);
		System.out.printf("5의 배수의 합 : %d \n", sum5);
		System.out.printf("%d + %d : %d \n", sum3, sum5, sum3+sum5);
		System.out.printf("%d - %d : %d \n", sum3, sum5, sum3-sum5);
		System.out.printf("%d x %d : %d \n", sum3, sum5, sum3*sum5);
		System.out.printf("%d ÷ %d : %d ", sum3, sum5, sum3/sum5);
	}

}
