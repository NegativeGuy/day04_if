package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		�⵵�� �Է¹ް� �������� �ƴ����� �Ǻ��Ͻÿ�.
		(���� : 4�� ��������� 100�� ����� �ƴ�. ������ 400�� ����� ����)
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է� �ϼ��� : ");
		
		int year = input.nextInt();
		
		if(year%4 == 0) {
			if(year%400 != 0 && year%100 == 0) {
				System.out.println(year+"���� ��� �Դϴ�");
			}
			else {
				System.out.println(year+"���� ���� �Դϴ�");
			}
		}
		else {
			System.out.println(year+"���� ��� �Դϴ�");
		}
	}
}
