package com.tory.homework;
/*
 * 정수형 변수 num 을 선언하고 임의의 정수를 대입
 * for()문을 사용하여 2 ~ num-1 까지 반복하면서
 * 나머지 연산수행 후 나머지가 한번이라도 0 이 나타나면 소수가 아님 출력 
 */

public class PrimeB {
	
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 10) + 1;
		
		System.out.println("=".repeat(30));
		System.out.printf("%d 는 Prime Number 인가?\n", num);
		System.out.println("-".repeat(30));
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				System.out.printf("%d MOD %d = %d 는 소수가 아님\n", num, i , num%i);
			}
		}
		System.out.println("=".repeat(30));
	}

}
