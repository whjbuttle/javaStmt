package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 ��ĳ�� Ŭ������ ��ü�� scanner�� �����Ͽ���.
		 */
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//System.out.println("���ڸ� �Է��� �ּ���");
		//int a = scanner.nextInt();
		//System.out.println(a);
		
		// for������ �Էµ� ����ŭ�� ���� ���ϴ� ������� �����ϼ���
		System.out.println("���ڸ� �Է��� �ּ���");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++)
		{
			sum += i;
		}
		System.out.println("1 ���� " + num + " ������ ���� = " + sum);
		//��°��� for���� �� �� ������ ���;��ϹǷ� �ٱ���
	}
}