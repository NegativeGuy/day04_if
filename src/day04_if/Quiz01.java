package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		평균 학점이 3.8이상이면 '축하합니다! 장학금 지급 대상자 입니다'를 출력
		평균 학점이 3.8미만이면 '아쉽지만 장학금 지급 대상자가 아닙니다'를 출력
		
		hint : int말고 double 사용
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("학점을 입력해 주세요 : ");
		double score = input.nextDouble();
		
		if(score>=3.8) {
			System.out.println("축하합니다! 장학급 지급 대상자 입니다");
		}
		else if(score<3.8) {
			System.out.println("아쉽지만 장학금 지급 대상자가 아닙니다");
		}
	}
}
