package part1.test;

import java.util.Scanner;

public class Notice {
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
		
		if(avg == 100){
			msg = "���ʽ� ����";
			//System.out.println("���ʽ� ����");
		}else if(avg >= 70){
			msg = "�հ�";
			//System.out.println("�հ�");
		}else{
			msg = "���հ�";
			//System.out.println("���հ�");
		}
		System.out.println(msg);
	}
}
