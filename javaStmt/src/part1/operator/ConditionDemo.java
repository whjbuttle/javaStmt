package part1.operator;

public class ConditionDemo {
	public static void main(String[] args) {
		int val1 = 1, val2 = 2;
		if((val1==1) && (val2!=2)){	//val1�� 1�̸鼭 val2�� 2�� ��� (������)
			System.out.println("val1�� 1�̸鼭 val2�� 2�� ����Դϴ�.");
		}else if((val1==1) || (val2!=2)){	//val1�� 1�̰ų� val2�� 2�� ��� (������)
			System.out.println("val1�� 1�̰ų� val2�� 2�� ����Դϴ�.");
		}
	}
}
