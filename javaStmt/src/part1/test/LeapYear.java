package part1.test;

import java.util.Scanner;

/*
 Date: 20150616
 Author: ����Ƽ��ũ
 Story: �Է¹޴� �⵵�� ���� �������� �ƴ����� �Ǻ��ϴ� �ǵ����α׷�
 */
public class LeapYear {
	public static void main(String[] args) {
		/*
		 ������ 4�� ���� ���� 0�̶�� ������ �� �ִ�
		 �׷��� �ش翬���� 100���� ������ �������� ����̴�
		 ����̶� �ص� �ٽ� 400���� ������ ���� ������ �����̴�.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scanner.nextInt();
		String msg = "";
		if(year%400==0){	//���͸��� ������� ũ�� �ִ� �������� ���� �������� ����
			msg = "����";
		} else if(year%100==0){
			msg = "���";
		} else if(year%4==0){
			msg = "����";
		} else{
			msg = "���";
		}
		System.out.println(msg);
	}
}
