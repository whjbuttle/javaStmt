package part1.operator;

public class TwoHangDemo2 {
	public static void main(String[] args) {
		int result = 0;		//����Ʈ ���� 0�� ������ ���� ����� �Ҵ�
		result = 10;		//0�� ��� �ִ� result ���� 10���� ��ȯ��Ų��
		int x = 11, y = 5;
		
		result = x + y;		
		System.out.println("x + y = " + result);
		
		result = x - y;
		System.out.println("x - y = " + result);
		
		result = x * y;
		System.out.println("x * y = " + result);
		
		result = x / y;
		System.out.println("x / y = " + result);
		
		result = x % y;
		System.out.println("x % y = " + result);
	}
}
