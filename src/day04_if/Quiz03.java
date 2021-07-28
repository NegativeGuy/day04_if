package day04_if;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
	/*
	정수를 입력 받아 계절을 나타내는 프로그램을 만드시오.
	- 3~5월	 : 봄
	- 6~8월	 : 여름
	- 9~11	 : 가을
	- 12~2	 : 겨울
	
	출력 예시
		숫자를 입력해주세요 : 3 
		현재 계절은 '봄' 입니다
	*/
	Scanner input = new Scanner(System.in);
	System.out.println("월을 숫자만 입력 해주세요 : ");
	
	int season = input.nextInt();
	
	if(season>=3 && season<=5) {
		System.out.println(season+"월은 \'봄\' 입니다");
	}
	else if(season>=6 && season<=8) {
		System.out.println(season+"월은 \'여름\' 입니다");
	}
	else if(season>=9 && season<=11) {
		System.out.println(season+"월은 \'가을\' 입니다");
	}
	else{
		System.out.println(season+"월은 \'겨울\' 입니다");
	}
	
	}
}
