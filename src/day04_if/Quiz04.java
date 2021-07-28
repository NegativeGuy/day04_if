package day04_if;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		학생의 국어, 수학, 영어 점수를 각각 입력받고 평균을 구한 다음 
		평균 점수에 맞게 등급을 출력하시오.
		
		- 90점 이상 A
		- 80점 이상 B
		- 70점 이상 C
		- 60점 이상 D
		- 나머지는 F
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("국어, 수학, 영어 점수를 차례대로 입력 하세요 : ");
		int kor, math, eng, sum;
		double avg;
		
		kor = input.nextInt();
		math = input.nextInt();
		eng = input.nextInt();
		
		sum = kor + math + eng;
		avg = sum/3;
		
		if(avg>=90) {
			System.out.println("평균"+avg+"로 A 등급 입니다");
		}
		else if(avg<90 && avg>=80) {
			System.out.println("평균"+avg+"로 B 등급 입니다");
		}
		else if(avg<80 && avg>=70) {
			System.out.println("평균"+avg+"로 C 등급 입니다");
		}
		else if(avg<70 && avg>=60) {
			System.out.println("평균"+avg+"로 D 등급 입니다");
		}
		else {
			System.out.println("평균"+avg+"로 F 등급 입니다");
		}
	}
}
