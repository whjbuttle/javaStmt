package part1.operator;

public class ComparisionDemo2 {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		//������ if���� �Ѱ��� �������� ���ľ� �� ����� if else������ ����Ѵ�.
		
		if(val01 == val02){	//val01�� val02�� ���� ���ٸ�
			System.out.println("val01�� val02�� ���� ����.");
		}else
		if(val01 != val02){	//val01�� val02�� ���� �ٸ��ٸ�
			System.out.println("val01�� val02�� ���� �ٸ���.");
		}else
		if(val01 > val02){	//val01�� val02���� ũ�ٸ�
			System.out.println("val01�� val02���� ũ��.");
		}else
		if(val01 < val02){	//val01�� val02���� �۴ٸ�
			System.out.println("val01�� val02���� �۴�.");
		}
	}
}
