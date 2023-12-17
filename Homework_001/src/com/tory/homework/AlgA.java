package com.tory.homework;
/*
 * 단일 for()문을 사용하여 
 * 1~100까지의 숫장 중 3의 배수만 덧셈하여 출력 
 */

public class AlgA {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			if((i+1) % 3 == 0) {
				sum += (i+1);
			}
		}
		System.out.printf("1 ~ 100 까지 3의 배수의 합 : %d", sum);
	}
	

}
