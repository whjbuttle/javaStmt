package part1.whileloop;

public class SumTen {
	public static void main(String[] args) {
		//while�� 10������ ��
		int num = 0;
		int hap = 0;
		while(num<11){
			hap += num;
			num++;
		}
		System.out.println("While�� : 1���� 10������ �� = " + hap);
		
		//do-while�� 10������ ��
		int count = 1;
		int sum = 0;
		do{
			sum += count;
			count++;
		}while(count<11);
		System.out.println("Do-While�� : 1���� 10������ �� = " + sum);
		
		//for�� 10������ ��
		int total = 0;
		for(int i=0; i<=10; i++){
			total += i;
		}
		System.out.println("For�� : 1���� 10������ �� = " + total);
	}
}
