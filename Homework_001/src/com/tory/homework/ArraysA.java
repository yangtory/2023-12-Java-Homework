package com.tory.homework;

import com.tory.homework.utils.Line;

/*
 * 51 부터 100까지 범위의 임의의 정수 5개를 생성하고
 * 5개의 정수형 변수를 선언하여 각각 저장
 * 5개의 변수에 저장된 값을 합산하여 출력
 */
public class ArraysA {

	public static void main(String[] args) {
		
		int num1 = (int) (Math.random() * 50) + 51;
		int num2 = (int) (Math.random() * 50) + 51;
		int num3 = (int) (Math.random() * 50) + 51;
		int num4 = (int) (Math.random() * 50) + 51;
		int num5 = (int) (Math.random() * 50) + 51;
		int sum = num1+num2+num3+num4+num5;
		
		Line.dLine(30);
		System.out.println("1 번째 값 : "+num1);
		System.out.println("2 번째 값 : "+num2);
		System.out.println("3 번째 값 : "+num3);
		System.out.println("4 번째 값 : "+num4);
		System.out.println("5 번째 값 : "+num5);
		Line.sLine(30);
		System.out.println("합산결과 : " + sum);
		Line.dLine(30);
	}

}
