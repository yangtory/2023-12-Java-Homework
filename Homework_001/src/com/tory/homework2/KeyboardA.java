package com.tory.homework2;

import java.util.Scanner;

import com.tory.homework.utils.Line;

/*
 *  Scanner 를 사용하여 10 이상의 정수를 입력받기
 *  1 부터 입력받은 정수까지의 범위의 수중 짝수만 찾아서 console 에 출력
 */

public class KeyboardA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(40);
		System.out.print("정수 >> ");
		String str = scan.nextLine();
		int intStr = Integer.valueOf(str);
		
		if(intStr < 10) {
			System.out.println("10 이상의 정수를 입력하세요");
		}
		
		Line.sLine(40);
		System.out.printf("1 ~ %d 까지 범위에서 짝수는?\n", intStr);
		Line.dLine(40);
		
		for(int i = 0 ; i < intStr ; i++) {
			if((i+1) % 2 == 0) {
				System.out.printf("%d ",(i+1));
			}
		}
		
	}

}
