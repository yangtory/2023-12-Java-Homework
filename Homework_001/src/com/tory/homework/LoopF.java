package com.tory.homework;
/*
 * for() 반복문을 사용하여 1 ~ 100 까지의 숫자를
 * 10개씩 나누어 콘솔에 가로방향으로 출력 
 */

public class LoopF {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i ++) {
			System.out.printf("%d ", i+1);
			if( (i+1) % 10 == 0) {
				System.out.println();
			}
		}
	}

}
