package day04_if;

import java.util.Scanner;

public class Quiz02_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home = null, comp = null;
		
		while(true) {
			System.out.println("1.�츮�� ���\n2.ȸ�� ���\n3.��� ����\n4.����");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : 
				System.out.println("���ּ� �Է� : ");
				home = sc.next();
				System.out.println();
				break;
			
			case 2 : 
				System.out.println("ȸ���ּ� �Է� : ");
				comp = sc.next();
				System.out.println();
				break;
			
			case 3 : 
				System.out.println("���ּ� 	: "+home);
				System.out.println("ȸ���ּ�	: "+comp);
				System.out.println();
				break;
			}
		if(sel==4) {
			break;
		}
		}
		
	}
}
