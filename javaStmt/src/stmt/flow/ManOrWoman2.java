package stmt.flow;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		//switch������ �����
		System.out.println("3���� ������ �Է��ϼ���. �Էµ� ���ڵ� �� ���� ū ���� ��ȯ�մϴ�.");
		Scanner scanner = new Scanner(System.in);
		int[] intArr = new int[3];
		int max = 0;
		
		for(int i=0; i < intArr.length; i++){
			intArr[i] = scanner.nextInt();
			if(intArr[i]>max){
				max = intArr[i];
			}
			
		}
		System.out.println("�Էµ� ���ڵ� �� ���� ū ���� " + max + " �Դϴ�.");
	}
}
