package com.tory.homework;

import com.tory.homework.utils.Line;

/*
 * 10명 학생의 국어점수를 저장할 배열 scoreKors 를 선언
 * 51부터 100까지 범위의 임의의 점수 10개 생성하여 배열 각 요소에 할당
 * 배열에 저장된 전체 요소의 총점과 평균을 계산하여 출력 
 * 평균은 실수로 표현 하되 소수점 2째자리까지
 */

public class ArraysB {

	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		int sum = 0;
		float avg = 0.0f;
		for (int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
			sum += scoreKors[i];
			avg = (float)sum / scoreKors.length;
		}
		Line.dLine(30);
		System.out.printf("국어 점수 총점 : %d, 평균 : %.2f\n", sum,avg);
		Line.dLine(30);
	}
}
