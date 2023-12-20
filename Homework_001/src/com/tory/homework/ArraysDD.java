package com.tory.homework;

import com.tory.homework.utils.Line;

/*
 *  10명 학생의 국어, 영어, 수학 점수를 저장할 배
 *  scoreKors, scoreEng, scoreMath 를 선언
 *  51 부터 100까지 범위의 임의의 점수를
 *  생성하여 배열 각 요소에 할당
 *  예제와 같은 성적표 출력
 */
public class ArraysDD {

	public static void main(String[] args) {
		int std = 10;
		int[] scoreKors = new int[std];
		int[] scoreEng = new int[std];
		int[] scoreMath = new int[std];
		int sum = 0;
		float avg = 0;

		Line.dLine(50);
		System.out.println("샛별반 성적표");
		Line.sLine(50);
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		
		for (int i = 0; i < std; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
			scoreEng[i] = (int) (Math.random() * 50) + 51;
			scoreMath[i] = (int) (Math.random() * 50) + 51;
			sum = scoreKors[i]+scoreEng[i]+scoreMath[i];
			avg = (float)sum / 3;
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",
					scoreKors[i], scoreEng[i], scoreMath[i], sum, avg);
		}
		Line.dLine(50);
	}

}
