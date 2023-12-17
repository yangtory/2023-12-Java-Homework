package com.tory.homework;
/*
 * 단일 for()문을 사용하여
 * 1~100 까지 숫자 중 7의 배수만 출력 
 */

public class LoopI {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			if((i+1) % 7 == 0) {
				System.out.printf("%d ", i+1);
			}
		}
	}

}
