package part1.variable;
/*
 ����(variable)
 - ������ Ÿ�Կ� ��õ� ������ �����͸� ���� �� �ִ� �޸��̴�
 - ������ ������ Ÿ���� ���ؼ� ������ �� �ִ�
 - ������ ����� ������ �����͸� �����ϱ� ���ؼ��̴�
 - ������ �̸��� �ش� �޸𸮸� �ڵ��� �� �ִ� ������ �����̴�
 - �������� ������ Ÿ�Կ� �´� ���� �����͸� �־�� �Ѵ�
 
 �� ���ǻ���
 ������ Ÿ���� ����� ������ ���� �̸��� ������ �� �ٽ� ������ �� ����
 ��, ������ Ÿ�԰� ���� ������ �ʴ� ������ ��Ȱ���� �����ϴ�
 
 �Ҵ�(Assignment)
 - �Ҵ��̶� ������ ���� ����ִ� ����
 */
public class Variable {
	public static void main(String[] args) {
		int num = 200;
		System.out.println("num ����� ��: " +num);
		//run as ���� ����Ű: CTRL + F11
		
		// Q. ���� abc �� ���ڰ� 2000 ���
		int abc = 2000;
		System.out.println("abc�� ����� ��: " + abc);
	
		// 2200�� ����Ͻÿ�.
		int a = 2200;
		System.out.println("a�� ����� ��: " + a);
		
		//�ڹٿ��� ������ �����ؼ� ����ϴ� ������ ��Ȱ���� �����̴�
		int result;
		//result = num + abc;
		//System.out.println("num �� abc�� ��: " + result);
		// ������ : ���� �Һи������� ���� ���� �и��� ������� ����ϱ� ���� �ڵ�
		
		System.out.print("num �� abc�� ��: ");
		System.out.println(num + abc);
		
		abc = 40000;	//overwrite
		System.out.println("abc�� ����� ��: " + abc);
	}
}
