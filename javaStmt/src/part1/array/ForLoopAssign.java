package part1.array;
//1���� 10������ ��
public class ForLoopAssign {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		int sum = 0;
		for(int i = 0; i < intArr.length; i++){
			
			//0��� ���� �־�� ���� Ȱ���� ���� ���� ���� �� �ֳ�?
			intArr[i] = i+1; // ���������� �ּ�ȭ
			sum += intArr[i];
		}
		System.out.println("1���� 10������ �� : " + sum);
	}
}
