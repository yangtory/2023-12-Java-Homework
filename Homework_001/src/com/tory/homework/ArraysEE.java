package com.tory.homework;
/*
 * 10명 학생의 국어, 영어, 수학 점수를 저장할 배열
 * scoreKors, scoreEng, scoreMath 를 선언
 * 51 부터 100까지 범위의 임의의 점수를
 * 생성하여 배열 각 요소에 할당하여 성적표 출력
 */

import com.tory.homework.utils.Line;

public class ArraysEE {
	public static void main(String[] args) {
		int std = 10;
		int[] kors = new int[std];
		int[] engs = new int[std];
		int[] maths = new int[std];

		int sum = 0;
		float avg = 0f;
		for (int i = 0; i < std; i++) {
			kors[i] = (int) (Math.random() * 50) + 51;
			engs[i] = (int) (Math.random() * 50) + 51;
			maths[i] = (int) (Math.random() * 50) + 51;
		}

		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		for (int i = 0; i < std; i++) {
			korTotal += kors[i];
			engTotal += engs[i];
			mathTotal += maths[i];
		}

		Line.dLine(50);
		System.out.println("샛별반 성적표");
		Line.sLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for (int i = 0; i < std; i++) {
			sum = kors[i] + engs[i] + maths[i];
			avg = (float) sum / 3;
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%.2f\n",
					i+1, kors[i], engs[i], maths[i], sum, avg);
		}
		Line.sLine(50);
		System.out.printf("총점\t%3d\t%3d\t%3d\n",
				korTotal, engTotal, mathTotal);
		Line.dLine(50);

	}

}
