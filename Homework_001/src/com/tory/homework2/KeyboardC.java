package com.tory.homework2;

import java.util.Scanner;

/*
 * Math.random() method 를 사용하여 1 부터 10까지 임의의 수를 하나 생성
 * Scanner 를 사용하여 키보드로 부터 정수 1부터 10까지 값을 입력받기
 * random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 “참잘했어요 : 000”
 * 몇번만에 정답을 맞췄는지 검사하기 
 * 정답을 맞췄으면 “00 번째 정답맞춤“
 * 정답을계속못맞추면,“5번째정답못맞춤실패“ 실패하면, 정답을 보여주고 종료
 */

public class KeyboardC {

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 10);
		int count = 1;

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			int intStr = Integer.valueOf(str);
			

			if (intStr == rndNum) {
				System.out.println("참잘헸어요 : " + rndNum);
				System.out.printf("%d 번째 정답 맞춤 \n", count);
				break;
			}
			if (count == 5) {
				System.out.printf("%d 번째 정답 못 맞춤 실패! 정답 : %d", count, rndNum);
				break;
			}
			if (intStr < rndNum) {
				System.out.println("값이 너무 작아요 ");
				count++;
				continue;
			}
			if (intStr > rndNum) {
				System.out.println("값이 너무 커요 ");
				count++;
				continue;
			}
		}
	}
}
