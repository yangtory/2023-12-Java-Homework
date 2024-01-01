package com.tory.student.service.impl;

import java.util.Scanner;

import com.tory.student.model.MenuIndex;
import com.tory.student.service.StartAppService;
import com.tory.student.service.StudentService;
import com.tory.student.utils.Line;

public class StartAppServiceImplV1 implements StartAppService {
	StudentService stService = new StudentServiceImplV1();

	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		for(int i = 0 ; i < MenuIndex.values().length ; i++) {
			System.out.printf("%d. %s \n", i+1, MenuIndex.values()[i] );
		}
		System.out.println("QUIT.종료");
		Line.sLine(50);
	}

	@Override
	public Integer selectMenu() {
		Scanner scan = new Scanner(System.in);
		int intNum = 0;
		while(true) {
		this.mainMenu();
		System.out.print("업무선택 >> ");
		String strNum = scan.nextLine();
		
		if(strNum.equals("QUIT")) {
			System.out.println("업무종료!");
			return null;
		}
		try {
			intNum = Integer.valueOf(strNum);			
		} catch (Exception e) {
			System.out.println("정수로 입력해주세요");
			continue;
		}
		if(intNum > MenuIndex.values().length || intNum < 1) {
			System.out.printf("1 ~ %d 까지 입력해주세요\n", MenuIndex.values().length);
			continue;
		}
		return intNum;
		}
	}

	@Override
	public void startApp() {
		while(true) {
			Integer selectMenu = this.selectMenu();
			if(selectMenu == null) break;
			else if(selectMenu == MenuIndex.학생정보_입력.getIndex()) {
				stService.inputStudnet();
			}
			else if(selectMenu == MenuIndex.학생정보_출력.getIndex()) {
				stService.printStudent();
			}
			else if(selectMenu == MenuIndex.학생정보_가져오기.getIndex()) {
				stService.loadStudnet();
			}
			else if(selectMenu == MenuIndex.학생정보_조회.getIndex()) {
				stService.searchStudent();
			}
			else if(selectMenu == MenuIndex.학생정보_저장.getIndex()) {
				stService.saveStudnet();
			}
		}
		
	}

}
