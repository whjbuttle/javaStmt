package part1.array;
/*
 Date : 20150615
 Author : 
 Story : �迭 �Ҵ�� ����� ���ÿ� �Ҵ��ϴ� ���
 */
public class ArrayAssignDemo {
	public static void main(String[] args) {
		int[] intArr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		int sum = 0, sum2 = 0;
		
		//for������ ������ 100���� 1000���� ���� ����ϼ���
		
		for(int i = 0; i < intArr.length; i++){
			sum += intArr[i];
		}
		System.out.println("100���� 1000������ ��: " + sum);
		
		/*
		 Ȯ��� for�� ����
		 �迭�� ����� �� limit ���� ���� �ʿ����
		 ������ ��ü����� �Ѵٸ� ����Ʈ�� ���� ����
		 */
		
		for(int i : intArr){
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
