package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		//��ĳ�� ȣ��
		System.out.println("����� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		if(dan>1){
			for (int i = 1; i < 10; i++){
				System.out.println( dan + " * " + i + " = " + dan * i);
			}
			
		}else{
			System.out.println("1 �̻��� �������� �Է��ϼ���");
		}
	}
}
