package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ʸ� �Է��ϼ���.");
		int time = scanner.nextInt();
		//int time = 5000;	// ��
		int second = 0, minute = 0, hour = 0;
		
		second = time%60;	// 500�ʸ� 60���� ���� �������� ��
		minute = (time/60)%60; 
		hour = (time/60)/60;
		
		System.out.println(hour + " �ð� " + minute + " �� " + second + "��");
	}
}
