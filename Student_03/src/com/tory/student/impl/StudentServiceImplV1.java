package com.tory.student.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tory.student.model.StdIndex;
import com.tory.student.model.StudentDto;
import com.tory.student.service.StudentService;
import com.tory.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {

	private Scanner scan = null;
	private String dataFile = null;
	private List<StudentDto> stdList = null;

	public StudentServiceImplV1() {
		scan = new Scanner(System.in);
		dataFile = "src/student.csv";
		stdList = new ArrayList<StudentDto>();
	}

	@Override
	public void searchStd() {
		scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		String name = scan.nextLine();

		this.selectStd(name);
		if (selectStd(name) == null) {
			System.out.println("정보가 없습니다");
		} else {
			this.printStd(this.selectStd(name));
		}

	}

	@Override
	public void loadStd() {
		InputStream is = null;
		Scanner scanFile = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanFile = new Scanner(is);
		while (scanFile.hasNext()) {
			String line = scanFile.nextLine();
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
		scanFile.close();
	}

	@Override
	public StudentDto selectStd(String name) {
		for (StudentDto dto : stdList) {
			if (dto.name.equals(name)) {
				return dto;
			}
		}
		return null;

	}

	@Override
	public void printStd(StudentDto dto) {
		Line.dLine(50);
		System.out.println("학번\t이름\t학과\t학년\t전화\t주소");
		Line.dLine(50);

		System.out.printf("%s\t", dto.num);
		System.out.printf("%s\t", dto.name);
		System.out.printf("%s\t", dto.dept);
		System.out.printf("%s\t", dto.grade);
		System.out.printf("%s\t", dto.tel);
		System.out.printf("%s\n", dto.addr);

		Line.sLine(50);
	}

}
