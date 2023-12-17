package com.tory.homework;
/*
 * 단일 for() 문을 사용하여 
 * 1 ~ 임의의 숫자까지 덧셈을 계산하여 출력 
 */

public class LoopK {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100);
		int sum = 0;
		
		for(int i = 0; i < num ; i++) {
			sum += (i+1);
		}
		System.out.printf("1 ~ %d 까지 덧셈 결과 : %d ", num, sum);
	}

}
