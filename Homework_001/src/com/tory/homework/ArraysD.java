package com.tory.homework;
/*
 * 10개의 요소를 갖는 정수형 배열 nums를선언
 * 51부터 100까지 범위의 임의의 정수 10개 생성하여 배열 각 요소에 할당
 * nums 배열 요소에 보관된 수 중 짝수만 찾아서 console 에 출력하고 짝수값을 합산하여 출력
 * 배열 요소에 값 할당,짝수 찾아 출력,합산 하는 부분은 코드를 분리하여 작성
 */

public class ArraysD {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int i = 0;
		int sum = 0;

		for (i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;		
			if(nums[i] % 2 == 0) {
				sum += nums[i];
				System.out.printf("%d 번 요소의 값 : %d\n",i, nums[i]);
			}
		}
		System.out.println("짝수들의 합 : "+ sum);
	}
}
