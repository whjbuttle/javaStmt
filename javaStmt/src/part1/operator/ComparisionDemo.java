package part1.operator;

public class ComparisionDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		/*
		 if(){
		 
		 }
		 
		 if �� Ű���� 
		 () �񱳽��� ��ġ�ϴ� ����� 
		 {} ���ǹ� �ٵ��� �θ���
		 */
		
		if(val01 == val02){	//val01�� val02�� ���� ���ٸ�
			System.out.println("val01�� val02�� ���� ����.");
		}
		if(val01 != val02){	//val01�� val02�� ���� �ٸ��ٸ�
			System.out.println("val01�� val02�� ���� �ٸ���.");
		}
		if(val01 > val02){	//val01�� val02���� ũ�ٸ�
			System.out.println("val01�� val02���� ũ��.");
		}
		if(val01 < val02){	//val01�� val02���� �۴ٸ�
			System.out.println("val01�� val02���� �۴�.");
		}
	}
}
