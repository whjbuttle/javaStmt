package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 1;
		/*
		 int count = 0; ó�� ���� 0 ���� �ִ� ���� 0���� �ʱ�ȭ(initialize)�Ѵٰ� �Ѵ�.
		 int count = 1; ó�� ���� 1 �� �ִ� ���� count������ 1�� �ʱ�ȭ�Ѵٰ� �Ѵ�. 
		 */
		
		while(count < 11){	//count�� 11���� ���������� ����
			System.out.println("[1] 1���� 10������ ���� �ȿ� �ִ� �� ���� " + count + " �Դϴ�.");
			//count++;
			System.out.println(count);
			count++;
		}
		/*
		 �ʱⰪ�� ���ǽ�(�����)�� ��¹��� �������
		 [1] ����� + ����� + ��¹�
		 	 ���۰��� 0���� �����ϰ� ������� ����Ʈ���� ������ �̸����� �����Ѵ�
		 [2] ����� + ��¹� + �����
		 	 ���۰��� 1���� �����ϰ� ������� ����Ʈ���� ������ ���Ϸ� �����Ѵ�
		 */
	}
}
