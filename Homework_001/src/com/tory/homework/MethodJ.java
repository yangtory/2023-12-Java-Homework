package com.tory.homework;
/*
 * public static boolean isEven(int num) {} method 를 선언
 * main() method 에서 1 ~ 100 범위의 수 중 random 수를 “5개” 생성하여 
 * isEven() method 에게 전달
 * isEven() 은 num 가 짝수이면 true 를 return, 아니면 false 을 return
 * isEven() method가 return 값을 참조하여 num 가 짝수인지 아닌지 판별하여 출력 
 */

public class MethodJ {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 1;
			if(isEven(num)==true) {
				System.out.printf("%d 는 짝수입니다 \n",num);
			}else {
				System.out.printf("%d 는 홀수입니다 \n",num);
			}
		}
	}

}
