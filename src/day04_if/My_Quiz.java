package day04_if;

import java.util.Scanner;

public class My_Quiz {
	public static void main(String[] args) {
		/*
		10�� �̻� 20�� �̸��̸� '10�� �Դϴ�'��
		20�� �̻� 30�� �̸��̸� '20�� �Դϴ�'��
		30�� �̻��̸� '30�� �̻� �Դϴ�'�� ����Ͻÿ�
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		
		int age = input.nextInt();
		
		if(age>=10 && age<20) {
			System.out.println("10�� �Դϴ�");
		}
		else if(age>=20 && age<30) {
			System.out.println("20�� �Դϴ�");
		}
		else {
			System.out.println("30�� �Դϴ�");
		}
	}
}
