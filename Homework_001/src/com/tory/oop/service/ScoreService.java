package com.tory.oop.service;
/*
 * 학번, 국어점수, 영어점수, 수학점수 변수 선
 */

public class ScoreService {
	
	public int stdNum = 0;
	public int kor = 0;
	public int eng = 0;
	public int math = 0;
	
	public int sum = 0;
	public float avg = 0f;
	
	public int getTotal() {
		sum = kor;
		sum += eng;
		sum += math;
		return sum;
	}
	
	public float getAvg() {
		getTotal();
		avg = (float)sum / 3;
		return avg;
	}

}
