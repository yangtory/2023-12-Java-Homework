package com.tory.homework;
/*
 * 단일 for()문을 사용하여
 * 1~30 까지 숫자 중 짝수만 출력
 */

public class LoopH {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 30 ; i++) {
			if((i+1) % 2 == 0) {
				System.out.printf("%d ", (i+1));
			}
		}
	}

}
