package part1.operator;

public class ComparisionDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		/*
		 if(){
		 
		 }
		 
		 if 비교 키워드 
		 () 비교식이 위치하는 컨디션 
		 {} 조건문 바디라고 부른다
		 */
		
		if(val01 == val02){	//val01과 val02의 값이 같다면
			System.out.println("val01과 val02의 값이 같다.");
		}
		if(val01 != val02){	//val01과 val02의 값이 다르다면
			System.out.println("val01과 val02의 값이 다르다.");
		}
		if(val01 > val02){	//val01이 val02보다 크다면
			System.out.println("val01이 val02보다 크다.");
		}
		if(val01 < val02){	//val01이 val02보다 작다면
			System.out.println("val01이 val02보다 작다.");
		}
	}
}
