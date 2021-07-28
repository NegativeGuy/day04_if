package day04_if;

import java.util.Scanner;

public class Quiz02_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home = null, comp = null;
		
		while(true) {
			System.out.println("1.우리집 등록\n2.회사 등록\n3.등록 보기\n4.종료");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : 
				System.out.println("집주소 입력 : ");
				home = sc.next();
				System.out.println();
				break;
			
			case 2 : 
				System.out.println("회사주소 입력 : ");
				comp = sc.next();
				System.out.println();
				break;
			
			case 3 : 
				System.out.println("집주소 	: "+home);
				System.out.println("회사주소	: "+comp);
				System.out.println();
				break;
			}
		if(sel==4) {
			break;
		}
		}
		
	}
}
