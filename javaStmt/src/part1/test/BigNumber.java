package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A�� ���� �Է��ϼ���");
		int a = scanner.nextInt();
		System.out.println("B�� ���� �Է��ϼ���");
		int b = scanner.nextInt();
		System.out.println("C�� ���� �Է��ϼ���");
		int c = scanner.nextInt();
		
		if(a > b && a > c){
			System.out.println("���� ū ���� A ���� " + a + " �Դϴ�.");
		}else if(b > a && b > c){
			System.out.println("���� ū ���� B ���� " + b + " �Դϴ�.");
		}else{
			System.out.println("���� ū ���� C ���� " + c + " �Դϴ�.");
		}
	}
}
