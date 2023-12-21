package com.tory.homework2;

import java.util.Scanner;

import com.tory.homework.utils.Line;

/*
 * 3개의 요소를 갖는 정수형 배열 nums 선언
 * Scanner 를 사용하여 정수를 3번 입력받고 nums 배열의 요소에 순서대로 할당
 * nums 배열에 저장된 값을 console 에 출력
 */

public class InputE {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			nums[i] = Integer.valueOf(str);
		}
		
		Line.dLine(20);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
