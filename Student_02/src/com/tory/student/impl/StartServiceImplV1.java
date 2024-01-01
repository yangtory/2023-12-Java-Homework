package com.tory.student.impl;

import java.util.Scanner;

import com.tory.student.model.MenuIndex;
import com.tory.student.service.StartService;
import com.tory.student.service.StdService;
import com.tory.student.utils.Line;

public class StartServiceImplV1 implements StartService {
	StdService stdService = null;
	Scanner scan = null;

	public StartServiceImplV1() {
		stdService = new StdServiceImplV1();
		scan = new Scanner(System.in);
	}

	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("장덕고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택하세요");
		Line.sLine(50);
		for (int i = 0; i < MenuIndex.values().length; i++) {
			System.out.printf("%d. %s\n", i + 1, MenuIndex.values()[i]);
		}
		System.out.println("QUIT.종료");
		Line.sLine(50);
	}

	@Override
	public Integer selectMenu() {
		this.mainMenu();
		while (true) {
			System.out.print("업무선택 >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				return null;
			}
			int intStr = 0;
			try {
				intStr = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 입력해 주세요");
				continue;
			}
			if (intStr < 1 || intStr > MenuIndex.values().length) {
				System.out.printf("1 ~ %d 까지 입력하세요\n", MenuIndex.values().length);
				continue;
			}
			return intStr;
		}

	}

	@Override
	public void startApp() {
		while (true) {
			Integer inputStr = this.selectMenu();
			if (inputStr == null) {
				System.out.println("업무 끝!!");
				break;
			} else if (inputStr == MenuIndex.학생정보_입력.getIndex()) {
				stdService.inputStd();
			} else if (inputStr == MenuIndex.학생정보_출력.getIndex()) {
				stdService.printStd();
			} else if(inputStr == MenuIndex.학생정보_가져오기.getIndex()) {
				stdService.loadStd();
			} else if(inputStr == MenuIndex.학생정보_저장.getIndex()) {
				stdService.saveStd();
			} else if(inputStr == MenuIndex.학생정보_조회.getIndex()) {
				stdService.searchStd();
			}
		}
	}
}
