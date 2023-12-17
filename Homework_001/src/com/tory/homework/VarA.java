package com.tory.homework;
/*
 *  정수형 변수 num1, num2 를 선언하고 각각 30, 40을 대입
 *  정수형 4칙 연산과 나머지 연산 출력
 *  
 *  실수형 변수 num3, num4 를 선언하고 각각 30.2, 40.3 을 대입
 *  실수형 4칙연산과 나머지 연산 출력 
 */
public class VarA {
	
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		System.out.printf("%d + %d = %d\n", num1 ,num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1 ,num2, num1-num2);
		System.out.printf("%d x %d = %d\n", num1 ,num2, num1*num2);
		System.out.printf("%d ÷ %d = %d\n", num1 ,num2, num1/num2);
		System.out.printf("%d MOD %d = %d\n", num1 ,num2, num1%num2);
		
		float num3 = 30.2f;
		float num4 = 40.3f;
		
		System.out.printf("%5.2f + %5.2f = %5.2f\n", num3, num4, num3+num4);
		System.out.printf("%5.2f - %5.2f = %5.2f\n", num3, num4, num3-num4);
		System.out.printf("%5.2f x %5.2f = %5.2f\n", num3, num4, num3*num4);
		System.out.printf("%5.2f ÷ %5.2f = %5.2f\n", num3, num4, num3/num4);
		System.out.printf("%5.2f MOD %5.2f = %5.2f", num3, num4, num3%num4);
	}

}
