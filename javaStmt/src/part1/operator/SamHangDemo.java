package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		//int x = 1, y = 0, z = 0;
		//boolean bool = true;
		//z = (bool) ? x : y ;		//true�� ��� x����, false�� ��� y���� ��ȯ�Ѵ�
		
		//System.out.println("���׿����� ��� ��� : " + z);
		// bool�� true�� ��� : x ���� 1�� ���
		// bool�� false�� ��� : y ���� 0�� ���
		
		/*
		 Q. ������ Ÿ�� flag�� 10 �Դϴ�.
		 	������ Ÿ�� flag2�� 20 �Դϴ�.
		 	�־��� ���� 
		 	() ? "flag�� flag2 ���� Ů�ϴ�." : "flag �� flag2 ���� �۽��ϴ�." �� ��
		 	�ܼ�â�� ���� ���� ��µǵ��� �������ּ���.
		 */
		
		int flag = 10, flag2 = 20;
		boolean result = flag > flag2;
		String result2 = (result) ? "flag�� flag2 ���� Ů�ϴ�." : "flag�� flag2 ���� �۽��ϴ�.";
		/*
		 ��°�(���ϰ�)�� �������̸� ������� �ش��ϴ� ���� Ÿ���� int�� �ְ�
		 ��°�(���ϰ�)�� ���ͷ��̸� ������� �ش��ϴ� ���� Ÿ���� String�̶�� �ش�.
		 */
		
		System.out.println("���׿����� ��� ��� : " + result2);
	}
}
