/*
//3.
//새로운 예외 InvalidWithdraw
class InvalidWithdraw extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class BankAccount2 {
	private int balance = 0;
	private int lowAmount; //최저 잔금

	public BankAccount2(int min) {
		balance = min;
	}
	//입금 메소드
	public void deposit(int money) {
		lowAmount += money; //입금시 최저입금+입금 금액
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + lowAmount);
	}
	//출금 메소드
	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0) //인출 요청 금액이 음수일때
			throw new InvalidWithdraw("음수 금액입니다.");
		else if (lowAmount - money < balance) //인출 금액이 최저 잔금 이하로 인출요청 시
			throw new InvalidWithdraw("초과출금 요구 예외.");
		else { //출금시 
			lowAmount -= money; //잔금- 출금 금액
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + lowAmount);
			return balance;
		}
	}
}
*/
