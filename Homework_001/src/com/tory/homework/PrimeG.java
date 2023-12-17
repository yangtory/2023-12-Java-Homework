package com.tory.homework;
/*
 * 2 ~ 100 까지의 정수 중 소수들만 출력하기 
 */

public class PrimeG {
	
	public static void main(String[] args) {
		boolean noPrime = true;
		int i = 0;
		for(i = 2 ; i < 100 ; i++) {
			for(int j = 2 ; j < 99 ; j++) {
				if(i % j == 0) {
					noPrime = false;
					break;
				} else {
					noPrime = true;
					break;
				}
			}
			if(noPrime) {
				System.out.printf("%d 는 소수임 \n", i);
			}
		}
	}

}
