package part1.variable;
/*
 Casting(����ȯ)
 UpCasting(������ �ڵ���ȯ)
 - ������ Ÿ���� ũ�Ⱑ ���� �ʿ��� ū ������ ������ �̵� ��
 DownCasting(����� ������ȯ)
 - ������ Ÿ���� ũ�Ⱑ ū �ʿ��� ���� ������ ������ �̵� ��
 - ������ �ս�(data loss)�� �߻��� �� �ִ�.
 */
public class Casting {
	public static void main(String[] args) {
		int varInt = 100;
		double varDouble = 123.456d;
		
		//varDouble = varInt;			//upcasting
		System.out.println("����Ÿ�� ������ ���: " + varDouble);
		
		varInt = (int) varDouble;	//downcasting
		System.out.println("�ٿ�ĳ���� �� �����: " + varInt);
		/*
		 ��Ŭ������ fix available ����� "��Ŭ���� ���� (eclipse proposal)" �̶�� �ϸ�
		 �� ��Ŭ���� ������ ���� ������ ���� �����ϴ� 
		 */
	}
}
