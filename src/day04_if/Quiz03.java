package day04_if;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
	/*
	������ �Է� �޾� ������ ��Ÿ���� ���α׷��� ����ÿ�.
	- 3~5��	 : ��
	- 6~8��	 : ����
	- 9~11	 : ����
	- 12~2	 : �ܿ�
	
	��� ����
		���ڸ� �Է����ּ��� : 3 
		���� ������ '��' �Դϴ�
	*/
	Scanner input = new Scanner(System.in);
	System.out.println("���� ���ڸ� �Է� ���ּ��� : ");
	
	int season = input.nextInt();
	
	if(season>=3 && season<=5) {
		System.out.println(season+"���� \'��\' �Դϴ�");
	}
	else if(season>=6 && season<=8) {
		System.out.println(season+"���� \'����\' �Դϴ�");
	}
	else if(season>=9 && season<=11) {
		System.out.println(season+"���� \'����\' �Դϴ�");
	}
	else{
		System.out.println(season+"���� \'�ܿ�\' �Դϴ�");
	}
	
	}
}
