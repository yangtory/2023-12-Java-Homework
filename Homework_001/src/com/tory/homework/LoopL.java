package com.tory.homework;
/*
 * 단일 for()문 사용하여
 * 1~100 까지 숫자 중 짝수만 덧셈하여 출력 
 */

public class LoopL {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			if((i+1) % 2 == 0) {
				sum += (i+1);
			}
		}
		System.out.printf("1~100 까지 짝수의 합 : %d ", sum);
	}

}
