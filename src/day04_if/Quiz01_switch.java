package day04_if;

import java.util.Scanner;

public class Quiz01_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("날짜를 입력해주세요 : ");
			int date = input.nextInt();
			
			switch(date%7) {
			case 1 : {
				System.out.println("월");
				break;
			}
			case 2 : {
				System.out.println("화");
				break;
			}
			case 3 : {
				System.out.println("수");
				break;
			}
			case 4 : {
				System.out.println("목");
				break;
			}
			case 5 : {
				System.out.println("금");
				break;
			}
			case 6 : {
				System.out.println("토");
				break;
			}
			case 0 : {
				System.out.println("일");
				break;
			}
		}
	}	
	}	
}

