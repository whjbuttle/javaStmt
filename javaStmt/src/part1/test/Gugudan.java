package part1.test;

public class Gugudan {
	public static void main(String[] args) {
		for(int j=1; j<10; j++){
			for(int i=2; i<6; i++){
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		for(int j=1; j<10; j++){
			for(int i=6; i<10; i++){
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.print("\n");
		}
	}
}
