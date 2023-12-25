package com.tory.oop.exec;

public class StringB {

	public static void main(String[] args) {
		String strNum = "50,88,70,100,98";
		String[] strNums = strNum.split(",");
		int[] intNums = new int[strNums.length];
		int sum = 0;
		
		for (int i = 0; i < strNums.length; i++) {
			intNums[i] = Integer.valueOf(strNums[i]);
			sum += intNums[i];
		}
		System.out.println(sum);
	}

}
