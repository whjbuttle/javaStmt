package part1.array;
/*
 Date: 20150615
 Author: 
 Story: 5�� �����ϴ� ������ ��Ʈ���� ��, 2�߹迭 Ȱ�� ����
 */
public class MultiDimArray {
	public static void main(String[] args) {
		int [][] fiveMatrix = new int[5][5];
		int k = 0;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j <5; j++){
				k += 5;	//k���� 5�� �����ϴ� ��
				fiveMatrix[i][j] = k;
				System.out.print(fiveMatrix[i][j]+"\t");	//tabŰ ó��
			}
			System.out.println("\n");						//���ΰ���
		}
	}
}
