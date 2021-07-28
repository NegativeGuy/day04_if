package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		년도를 입력받고 윤년인지 아닌지를 판별하시오.
		(윤년 : 4의 배수이지만 100의 배수는 아님. 하지만 400의 배수는 윤년)
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("연도를 입력 하세요 : ");
		
		int year = input.nextInt();
		
		if(year%4 == 0) {
			if(year%400 != 0 && year%100 == 0) {
				System.out.println(year+"년은 평년 입니다");
			}
			else {
				System.out.println(year+"년은 윤년 입니다");
			}
		}
		else {
			System.out.println(year+"년은 평년 입니다");
		}
	}
}
