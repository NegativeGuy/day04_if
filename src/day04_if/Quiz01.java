package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		��� ������ 3.8�̻��̸� '�����մϴ�! ���б� ���� ����� �Դϴ�'�� ���
		��� ������ 3.8�̸��̸� '�ƽ����� ���б� ���� ����ڰ� �ƴմϴ�'�� ���
		
		hint : int���� double ���
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ��� : ");
		double score = input.nextDouble();
		
		if(score>=3.8) {
			System.out.println("�����մϴ�! ���б� ���� ����� �Դϴ�");
		}
		else if(score<3.8) {
			System.out.println("�ƽ����� ���б� ���� ����ڰ� �ƴմϴ�");
		}
	}
}
