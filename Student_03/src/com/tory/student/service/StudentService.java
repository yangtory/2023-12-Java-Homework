package com.tory.student.service;

import com.tory.student.model.StudentDto;

public interface StudentService {
	
	public void searchStd();
	public void loadStd();
	public StudentDto selectStd(String name);
	public void printStd(StudentDto dto);

}
