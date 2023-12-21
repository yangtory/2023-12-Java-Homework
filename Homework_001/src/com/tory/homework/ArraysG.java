package com.tory.homework;
/*
 * 10명 학생의 국어 점수를 저장할 배열
 * scoreKors를 선언
 * 51 부터 100까지 범위의 임의의 점수를
 * 생성하여 배열 각 요소에 할당
 * 학생의 국어 점수에 해당하는 평점을 출력 
 */

import com.tory.homework.utils.Line;

public class ArraysG {

	public static void main(String[] args) {
		int std = 10;
		int[] kors = new int[std];
		int intGrd = 0;
		
		Line.dLine(20);
		System.out.println("국어\t평점");
		Line.sLine(20);

		for (int i = 0; i < std; i++) {
			kors[i] = (int) (Math.random() * 50) + 51;
			intGrd = kors[i];
			String grade = "A+";
			
			if(kors[i] < 60) grade = "F";
			else if(kors[i] < 65) grade = "D";
			else if(kors[i] < 70) grade = "D+";
			else if(kors[i] < 75) grade = "C";
			else if(kors[i] < 80) grade = "C+";
			else if(kors[i] < 85) grade = "B";
			else if(kors[i] < 90) grade = "B+";
			else if(kors[i] < 95) grade = "A";
			
			System.out.printf("%d\t%s\n", intGrd, grade);
		}
		Line.dLine(20);
	}

}
