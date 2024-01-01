package com.tory.student.service;

import com.tory.student.model.StudentDto;

/*
 * 학생 정보 입력
 * 학생 정보 조회 
 * 학생 정보 가져오기
 * 학생 정보 출력 
 * 학생 정보 저장 
 */
public interface StdService {
	
	public void inputStd();
	public void searchStd();
	public void loadStd();
	public void printStd();
	public void saveStd();

}
