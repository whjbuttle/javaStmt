package part1.operator;
/*
 Demo : ���üҽ��� ���ϴ� ���̻�
 *Demo.java : ���üҽ��� ������ Ŭ����
 */
public class TwoHangDemo {
	public static void main(String[] args) {
		int x = 20;
		int y = 7;
		int add, sub, gob, mok, nmg;
		
		/*
		 + : ������ȣ
		 - : ������ȣ
		 * : ������ȣ
		 / : �������� ���� ���ϴ� ��ȣ
		 % : �������� �������� ���ϴ� ��ȣ
		 */
		
		// ���� ������ gob, �������� ���� ���ϴ� ������ mok, ������ ������ nmg, ������ sub�� ����Ͻÿ�
		
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		
		System.out.println("x + y = " + add);
		System.out.println("x - y = " + sub);
		System.out.println("x * y = " + gob);
		System.out.println("x / y = " + mok);
		System.out.println("x % y = " + nmg);
	}
}
