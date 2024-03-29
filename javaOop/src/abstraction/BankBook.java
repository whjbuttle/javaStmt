package abstraction;
/*
 Date: 20150624
 Author: itbank
 Story: 인터페이스 타입으로 생성된 통장 클래스
 */
public class BankBook implements Account{

	private String accountNo;	// 계좌 번호를 임의로 바꿀 수 없으므로 setter 를 지움
	private String ownerName;	// 계좌에 등록된 이름을 임의로 바꿀수 없으므로 setter를 지움
	private String password;	// setter를 둔다
	private int restMoney;		// 
	public static final String BANK_NAME = "아이티뱅크";

	public BankBook(String accountNo, String ownerName, String password, int restMoney) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	@Override
	public void deposit(int money) {
		// 유효성 체크 : 입금액이 0 이나 0보다 작은 금액을 파라미터로 던질 경우 에러가 발생하는 것을 막기 위한 방어코딩
		if (money <= 0) {
			System.out.println("입금액은 0보다 커야합니다.");
		} else {
			this.restMoney += money;
		}
	}

	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("출금액은 0보다 커야합니다.");
		} else if (getRestMoney() <= money) {
			System.out.println("출금액이 잔액보다 큽니다.");
		} else {
			this.restMoney -= money;
		}
		
	}
	/* 
	 자바에서는 자주 사용되는 클래스와 인터페이스를 이미 생성 또는 구현한 뒤 개발자들이 이를 가져다가 쓰게 하고 있습니다.
	 예를 들면, 스캐너, 시스템 같은 것입니다.
	 이처럼 미리 만들어진 클래스와 인터페이스를 API라고 합니다. 그 중 최상위 객체를 Object 라고 하며
	 이 Object 의 클래스는 자바에서 객체로 선언된 것이라면 무조건 상속을 받습니다. 
	 그래서 Object의 메소드들은 자바 객체라면 어느 것이든 사용할 수 있습니다.
	 이걸 사용하는 방법은 클래스 내부에서 빈 공간에 CTRL + SPACE
	 */
	 
	@Override
	public String toString(){
		return "입출금 계좌\n"
				+ "계좌번호 : " + getAccountNo() + "\n"
				+ "계좌명 : " + getOwnerName() + "\n"
				+ "비밀번호 : ******** \n" 
				+ "잔액 : " + getRestMoney() + "\n";
	}
}
