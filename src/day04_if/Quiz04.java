package day04_if;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		�л��� ����, ����, ���� ������ ���� �Է¹ް� ����� ���� ���� 
		��� ������ �°� ����� ����Ͻÿ�.
		
		- 90�� �̻� A
		- 80�� �̻� B
		- 70�� �̻� C
		- 60�� �̻� D
		- �������� F
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ ���ʴ�� �Է� �ϼ��� : ");
		int kor, math, eng, sum;
		double avg;
		
		kor = input.nextInt();
		math = input.nextInt();
		eng = input.nextInt();
		
		sum = kor + math + eng;
		avg = sum/3;
		
		if(avg>=90) {
			System.out.println("���"+avg+"�� A ��� �Դϴ�");
		}
		else if(avg<90 && avg>=80) {
			System.out.println("���"+avg+"�� B ��� �Դϴ�");
		}
		else if(avg<80 && avg>=70) {
			System.out.println("���"+avg+"�� C ��� �Դϴ�");
		}
		else if(avg<70 && avg>=60) {
			System.out.println("���"+avg+"�� D ��� �Դϴ�");
		}
		else {
			System.out.println("���"+avg+"�� F ��� �Դϴ�");
		}
	}
}
