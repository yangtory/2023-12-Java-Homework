package com.tory.homework;
/*
 * 국어, 영어, 수학 점수를 보관할 변수와 총점, 평균을 계산할 변수를
 * float 형으로 선언하고, 점수를 소수점이하 까지 출력한다
 * 3과목의 점수는 임의의 값 
 */

public class VarF {

	public static void main(String[] args) {
		float kor = (float) (Math.random() * 50) + 51;
		float eng = (float) (Math.random() * 50) + 51;
		float math = (float) (Math.random() * 50) + 51;
		
		float sum = kor + eng + math ;
		float avg = sum / 3 ; 
		
		System.out.println("=".repeat(30));
		System.out.printf("국어 : %.1f \n", kor);
		System.out.printf("영어 : %.1f \n", eng);
		System.out.printf("수학 : %.1f \n", math);
		System.out.println("-".repeat(30));
		System.out.printf("총점 : %.1f \n", sum);
		System.out.printf("평균 : %f \n", avg);
		System.out.println("=".repeat(30));
	}
}
