package com.tory.student.exec;

import com.tory.student.impl.StartServiceImplV1;
import com.tory.student.service.StartService;

public class ExecA {

	public static void main(String[] args) {
		StartService stService = new StartServiceImplV1();
//		StdService stdService = new StdServiceImplV1();
		stService.startApp();
		
	}
}
