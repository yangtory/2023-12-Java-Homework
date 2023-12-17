package com.tory.homework;
/*
 * 정수형 변수 num 을 선언하고 임의의 점수 대입 
 * for() 문을 사용하여 2 ~ num-1 까지 반복하면서 
 * 나머지 연산수행 후 나머지가 한번이라도 나타나면 소수가아님,
 * 그렇지 않으면 소수임 이라고 출력 
 */

public class PrimeC {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10) + 1;
		int i = 0;
		boolean noPrime = false;
		
		System.out.println("=".repeat(40));
		System.out.printf("%d 는 Prime Number 인가? \n", num);
		System.out.println("-".repeat(40));
		
		for(i = 2 ; i < num-1 ; i++) {
			if(num % i == 0) {
				noPrime = true;
				break;
			}
		}
		if(noPrime) {
			System.out.printf("%d MOD %d = %d, %d 는 소수가 아님 \n", num, i, num%i, num);
			System.out.println("=".repeat(40));
		}else {
			System.out.printf("%d 는 소수임\n", num);
			System.out.println("=".repeat(40));			
		}
	}

}
