package com.tory.homework2;

import java.util.Scanner;

/*
 * Math.random() method 를 사용하여 1 부터 10까지 임의의 수를 하나 생성
 * Scanner 를 사용하여 키보드로 부터 정수 1부터 10까지 값을 입력받기
 * random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 
 * “참잘했어요 : 000”
 * 맞지 않으면 random 값보다 입력한 값이크면 “값이 너무 커요”
 * 아니면 “값이 너무 작아요” 메시지를 보여주고 다시 입력받기 
 */

public class KeyboardB {

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 10);

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			int intStr = Integer.valueOf(str);
			
			if(intStr == rndNum) {
				System.out.println("참 잘했어요 ! " + rndNum);
				break;
			}
			if(intStr > rndNum) {
				System.out.println("값이 너무 커요");
				continue;
			}else {
				System.out.println("값이 너무 작아요");
				continue;
			}
		}
	}

}
