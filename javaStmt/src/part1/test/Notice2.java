package part1.test;

import java.util.Scanner;

public class Notice2 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, sum = 0;	//���������� �ʱ�ȭ �ʼ�
		double avg = 0.0d;							//�Ǽ��� ���� Ÿ������ �ʱ�ȭ
		String msg = "";							//��Ʈ�� Ÿ���� ���ͷ��߿��� null�� �ʱ�ȭ
		/* 
		 ��ĳ�ʷ� ������ �Է��ϸ� �հ迡 ���� �հݿ��θ� �����ϴ� ���α׷�
		 ���ǿ� ���� ������� ���� ������ �޶���
		 ��� 70 �̻��̸� �հ�
		 ��� 70 �̸��̸� ���հ�
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		kor = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		eng = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3d;
		
		int key = (int) avg/10;
		switch (key) {
		case 10: msg = "���ʽ�"; break;
		case 9: case 8: case 7: msg = "�հ�"; break;
		default: msg = "���հ�"; break;
		}
		System.out.println(msg);
	}
}
