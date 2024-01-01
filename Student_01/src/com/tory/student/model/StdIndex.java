package com.tory.student.model;

public enum StdIndex {
	
	학번(0),
	이름(1),
	학과(2),
	학년(3),
	전화(4),
	주소(5);

	private int index;
	StdIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

}
