package stmt.flow;

import java.util.Scanner;

public class ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (ex. 123456-4123456) : ");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);
		if (ch == '1' || ch == '3'){
			System.out.println("����");
		} else if (ch == '2' || ch == '4') {
			
		} else if (ch == '5' || ch == '6') {
			
		} else {
			
		}
	}
}
