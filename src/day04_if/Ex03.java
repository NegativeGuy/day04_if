package day04_if;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		if(조건)
		else if(조건)
		else if(조건)
		.
		.
		.
		else
		*/
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		
		if(num>100) {
			System.out.println(num + " : 100보다 크다");
		}
		else if(num>50) {
			System.out.println(num + " : 50보다 크다");			
		}
		else {
			System.out.println(num + " : 50보다 작은 값들");						
		}
		System.out.println("다음 문장들 실행");						
	}
}
