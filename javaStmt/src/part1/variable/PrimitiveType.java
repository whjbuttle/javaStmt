package part1.variable;
/*
 �⺻�� Ÿ�� 8����
 1. ���� (1 ����Ʈ)
 	boolean - 1 byte
 2. ����Ʈ (1 ����Ʈ)
 	byte - 1 byte	//���������� ����, ���� �� ����
 3. ���� (2 ����Ʈ)		
 	char - 2 byte	//���ĺ�
 4. ���� (2, 4, 8 ����Ʈ)
 	short - 2 byte	//���� �� ����
 	int - 4 byte
 	long - 8 byte
 5. �Ǽ� (4, 8 ����Ʈ)
 	float - 4 byte
 	double - 8 byte 	
 */
public class PrimitiveType {
	public static void main(String[] args) {
		//���� 1 ����Ʈ, �ʱⰪ: false;
		boolean result = true;
		//������ 2 ����Ʈ(char), �ʱⰪ: = \u0000
		char c = 'C';				//���ĺ� �� ���ڸ� ��Ÿ���� ��ҹ��ڸ� �����Ѵ� �� ����: �̱����� ���
		//������
		byte varByte = 100;
		short varShort = 10000;
		int varInt = 10000000;
		long varLong = 100L;		//���ڰ� �ڿ��� ���ĺ� l �Ǵ� L�� ǥ��. �������� ���� �빮��ǥ�⸦ ��õ
		//�Ǽ���
		float varFloat = 100.00f;	//���ڰ� �ڿ� F �Ǵ� f �� ǥ����
		double varDouble = 100.00d;	//���ڰ� �ڿ� D �Ǵ� d �� ǥ����
		
		// 1����Ʈ = 8 ��Ʈ
		// 1��Ʈ : ���� 0�� 1�� �̷����

		// ������ �޸� �뷮�� ������ ���� ���� ������ boolean, int, double �� �ַ� ����
		
		// Q. 3.14�� �ֿܼ� ����Ͻÿ�
		
		double d = 3.14d;
		System.out.println("3.14�� ����� ��: " + d);
	}
}
