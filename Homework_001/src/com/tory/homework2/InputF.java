package com.tory.homework2;

import java.util.Scanner;

/*
 * Scanner 를 사용하여 정수를 입력받고
 * 입력받은 정수가 짝수인지 아닌지 판별하여 Console 에 출력
 * 정수를 입력받는중 QUIT를 입력하면 종료,그렇지 않으면 계속 반복
 * 입력받은 값이 정수가 아니면 메시지를 보여주고 다시 입력받기
 * 입력받은 정수는 2부터 10까지 범위의 정수 이어야함 
 * 그렇지 않으면 메시지를 보여주고 다시 입력받기
 */

public class InputF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("정수 (QUIT: 종료) >> ");
			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				System.out.println("끝!!");
				break;
			}
			int intStr = 0;
			try {
				intStr = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 입력하세요.");
				continue;
			}
			if (intStr < 2 || intStr > 10) {
				System.out.println("1 부터 10 까지 입력하세요.");
				continue;
			}
			if(intStr % 2 == 0) {
				System.out.println("짝수입니다");
				continue;
			}
			if(intStr % 2 == 1) {
				System.out.println("홀수입니다");
				continue;
			}
		}
	}
}
