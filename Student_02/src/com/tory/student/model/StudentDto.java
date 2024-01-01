package com.tory.student.model;

public class StudentDto {
	public String num;
	public String name;
	public String dept;
	public String grade;
	public String tel;
	public String addr;
	
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 * @param num학번
	 * @param name이름
	 * @param dept학과
	 * @param grade학년
	 * @param tel전화
	 * @param addr주소
	 */
	public StudentDto(String num, String name, String dept, String grade, String tel, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.tel = tel;
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "StudentDto [num=" + num + ", name=" + name + ", dept=" + dept + ", grade=" + grade + ", tel=" + tel
				+ ", addr=" + addr + "]";
	}
	
	
	
	

}
