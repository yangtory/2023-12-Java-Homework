package com.tory.student.service.impl;

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
import com.tory.student.service.StudentService;
import com.tory.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {
	List<StudentDto> stdList = null;
	String dataFile = null;
	Scanner scan = null;

	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentDto>();
		dataFile = "src/students.csv";
	}

	@Override
	public void inputStudnet() {
		scan = new Scanner(System.in);
		String[] inputStr = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				System.out.printf("%s 입력 (QUIT : 종료) >> ", item);
				String str = scan.nextLine();
				if (str.equals("QUIT")) {
					System.out.println("업무종료!");
					break;
				}
				inputStr[item.getIndex()] = str;
				break;
			} // end while
		} // end for
		StudentDto dto = new StudentDto();
		dto.num = inputStr[StdIndex.학번.getIndex()];
		dto.name = inputStr[StdIndex.이름.getIndex()];
		dto.dept = inputStr[StdIndex.학과.getIndex()];
		dto.grade = inputStr[StdIndex.학년.getIndex()];
		dto.tel = inputStr[StdIndex.전화.getIndex()];
		dto.addr = inputStr[StdIndex.주소.getIndex()];
		stdList.add(dto);
	}

	@Override
	public void searchStudent() {
//		this.loadStudnet();
		scan = new Scanner(System.in);
		System.out.print("학생 이름을 입력해주세요 >> ");
		String name = scan.nextLine();

		for (StudentDto dto : stdList) {
			if (name.equals(dto.name)) {
				System.out.println(dto);
			}
		}
	}

	@Override
	public void loadStudnet() {
		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		stdList = new ArrayList<StudentDto>();

		while (fileScan.hasNext()) {
			String str = fileScan.nextLine();
			String[] student = str.split(",");

			StudentDto dto = new StudentDto();
			dto.num = student[StdIndex.학번.getIndex()];
			dto.name = student[StdIndex.이름.getIndex()];
			dto.dept = student[StdIndex.학과.getIndex()];
			dto.grade = student[StdIndex.학년.getIndex()];
			dto.tel = student[StdIndex.전화.getIndex()];
			dto.addr = student[StdIndex.주소.getIndex()];
			stdList.add(dto);

		} // end while
		fileScan.close();
	}

	@Override
	public void printStudent() {
		Line.dLine(50);
		System.out.println("한울고교 학생정보");
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
		Line.dLine(50);

	}

	@Override
	public void saveStudnet() {
		OutputStream fos = null;
		PrintWriter fileOut = null;
		
		try {
			fos = new FileOutputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileOut = new PrintWriter(fos);
		
		for(StudentDto dto : stdList) {
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
