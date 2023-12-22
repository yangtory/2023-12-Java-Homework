package com.tory.oop.exec;

import com.tory.homework.utils.Line;
import com.tory.oop.service.ScoreService;

/*
 * ScoreService 클래스를 사용하여 scores 배열을 10개 “선언“
 * score 배열의 각 요소를 생성자를 사용하여 초기화 하기
 * 단, for() 반복문을 사용하여 초기화 하기
 * 각 배열 요소의 scoreKor, scoreEng, scoreMath 에
 * 51 ~ 100까지 범위의 임의의 정수 3개를 생성하여 할당
 * 배열에 저장된 값 출력하기 
 */

public class ScoreC {

	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}

		for (int i = 0; i < scores.length; i++) {
			scores[i].kor = (int) (Math.random() * 50) + 51;
			scores[i].eng = (int) (Math.random() * 50) + 51;
			scores[i].math = (int) (Math.random() * 50) + 51;
		}
		Line.dLine(40);
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(40);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d\t", scores[i].kor);
			System.out.printf("%d\t", scores[i].eng);
			System.out.printf("%d\t", scores[i].math);
			System.out.printf("%d\t", scores[i].getTotal());
			System.out.printf("%.2f\n", scores[i].getAvg());
		}
		Line.dLine(40);
	}

}
