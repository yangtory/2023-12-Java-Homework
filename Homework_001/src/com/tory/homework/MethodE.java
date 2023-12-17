package com.tory.homework;
/*
 * public static int buy() method 선언
 * 동생에게 2000원을 주고, 편의점에서 컵라면을 사오도록 시킨다
 * 컵라면 가격이 1500원이다
 * 컵라면을 구입한 후 거스름돈을 return 한다
 * 
 * main 에서는 buy() method 에게 2000원을 전달하면서, 호출하고
 * 거스름돈 결과를 change 변수에 할당 한다
 * 
 * buy 에게 전달한 값과 거스름 돈을 출력 
 */

public class MethodE {
	public static int buy(int money) {
		int cup = 1500;
		int change = money - cup;
		return change;
	}
	
	public static void main(String[] args) {
		int change = 0;
		change = buy(2000);
		
		System.out.println("거스름돈 : "+ change);
	}

}
