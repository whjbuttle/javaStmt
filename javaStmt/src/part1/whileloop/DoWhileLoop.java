package part1.whileloop;
/*
 do ~ while���� while���� ���� ��ġ�ϳ� ó���� ���� ������ �����ϰ� ���� ������ ���Ѵٴ� �������� �ִ�
 
 (����)
 do{
 	����;
 }while(����);
 
 */
public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		do{
			System.out.print(count + "\t");
			count++;
		}while(count<11);
		System.out.println();
	}
}
