package com.tory.homework;
/*
 * 국어, 영어, 수학 점수를 보관할 변수와 총점, 평균을 계산할 변수 선언
 * 3과목의 점수와 총점, 평균 을 출력, 점수는 임의의 값으로 
 */

public class VarC {

	public static void main(String[] args) {
		int kor = (int) (Math.random() * 50) + 51;
		int eng = (int) (Math.random() * 50) + 51;
		int math = (int) (Math.random() * 50) + 51;
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		System.out.println("=".repeat(30));
		System.out.printf("국어 : %d \n", kor);
		System.out.printf("영어 : %d \n", eng);
		System.out.printf("수학 : %d \n", math);
		System.out.println("-".repeat(30));
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %d \n", avg);
		System.out.println("=".repeat(30));
	}

}
