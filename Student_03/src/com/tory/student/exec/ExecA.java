package com.tory.student.exec;

import com.tory.student.impl.StudentServiceImplV1;
import com.tory.student.service.StudentService;

public class ExecA {
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		stService.loadStd();
		stService.searchStd();
	}

}
