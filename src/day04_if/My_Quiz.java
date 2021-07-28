package day04_if;

import java.util.Scanner;

public class My_Quiz {
	public static void main(String[] args) {
		/*
		10살 이상 20살 미만이면 '10대 입니다'를
		20살 이상 30살 미만이면 '20대 입니다'를
		30살 이상이면 '30대 이상 입니다'를 출력하시오
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		
		int age = input.nextInt();
		
		if(age>=10 && age<20) {
			System.out.println("10대 입니다");
		}
		else if(age>=20 && age<30) {
			System.out.println("20대 입니다");
		}
		else {
			System.out.println("30대 입니다");
		}
	}
}
