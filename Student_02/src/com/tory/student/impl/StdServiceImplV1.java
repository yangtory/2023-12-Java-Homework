package com.tory.student.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tory.student.model.StdIndex;
import com.tory.student.model.StudentDto;
import com.tory.student.service.StdService;
import com.tory.student.utils.Line;

public class StdServiceImplV1 implements StdService {
	Scanner scan = null;
	List<StudentDto> stdList = null;
	String dataFile = "src/student.csv";

	public StdServiceImplV1() {
		scan = new Scanner(System.in);
		stdList = new ArrayList<StudentDto>();

	}

	protected String newStdNum() {
		String stdNum = "S0001";

		if (!stdList.isEmpty()) {
			stdNum = stdList.get(stdList.size() - 1).num;
			String frefix = stdNum.substring(0, 1);
			stdNum = stdNum.substring(1);
			stdNum = String.format("%s%04d", frefix, Integer.valueOf(stdNum) + 1);
		}
		return stdNum;
	}

	public StudentDto selectStdNum(String num) {
		for (StudentDto dto : stdList) {
			if (dto.num.equals(num)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public void inputStd() {
		this.loadStd();
		String[] student = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				System.out.printf("%s(%s) 입력 >> ", item, newStdNum());
				String str = scan.nextLine();
				if (item.toString().equals("학번")) {
					if (this.selectStdNum(str) != null) {
						System.out.println("중복됐어요 다시 입력하세요");
						continue;
					}
				}
				student[item.getIndex()] = str;
				break;
			}
		}
		StudentDto dto = new StudentDto();
		dto.num = student[StdIndex.학번.getIndex()];
		dto.name = student[StdIndex.이름.getIndex()];
		dto.dept = student[StdIndex.학과.getIndex()];
		dto.grade = student[StdIndex.학년.getIndex()];
		dto.tel = student[StdIndex.전화.getIndex()];
		dto.addr = student[StdIndex.주소.getIndex()];
		stdList.add(dto);
	}

	@Override
	public void searchStd() {
		this.loadStd();
		scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		String str = scan.nextLine();

		for (StudentDto dto : stdList) {
			if (str.equals(dto.name)) {
				System.out.println(dto);
			}
		}
	}

	@Override
	public void loadStd() {
		InputStream is = null;
		Scanner fileScan = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		stdList = new ArrayList<StudentDto>();

		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] lines = line.split(",");

			StudentDto dto = new StudentDto();
			dto.num = lines[StdIndex.학번.getIndex()];
			dto.name = lines[StdIndex.이름.getIndex()];
			dto.dept = lines[StdIndex.학과.getIndex()];
			dto.grade = lines[StdIndex.학년.getIndex()];
			dto.tel = lines[StdIndex.전화.getIndex()];
			dto.addr = lines[StdIndex.주소.getIndex()];
			stdList.add(dto);
		}
		fileScan.close();
	}

	@Override
	public void printStd() {
		Line.dLine(50);
		System.out.println("장덕고교 학생정보");
		Line.dLine(50);
		System.out.println("학번\t이름\t학과\t학년\t전화\t주소");
		Line.sLine(50);

		for (StudentDto dto : stdList) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}

	}

	@Override
	public void saveStd() {
		OutputStream fos = null;
		PrintWriter fileOut = null;

		try {
			fos = new FileOutputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fileOut = new PrintWriter(fos);

		for (StudentDto dto : stdList) {
			fileOut.printf("%s\t", dto.num);
			fileOut.printf("%s\t", dto.name);
			fileOut.printf("%s\t", dto.dept);
			fileOut.printf("%s\t", dto.grade);
			fileOut.printf("%s\t", dto.tel);
			fileOut.printf("%s\n", dto.addr);
		}
		fileOut.close();
	}

}
