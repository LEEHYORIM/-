

/*
class InvalidWithdraw extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}
public class BankAccount {
	int balance = 0;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int money) throws InvalidWithdraw{
		if(money>0 && balance >= money){
			try{
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;
			System.out.printf("%d 인출하여 현재잔고 %d 입니다. %n", money, balance);
		}else if(balance < money)
			System.out.println("잔고가 부족하여 인출할 수 없습니다.");
	}
	
	public void deposit(int money){
		if(money > 0) {
			balance += money;
			System.out.printf("잔고가 부족하여 인출할 수 없습니다." , money, balance);
		}
	}
public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw {
		
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(500000);
	}
	}
}
*/


//2.
//새로운 예외 InvalidWithdraw
class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}

public class BankAccount {
	private int balance = 0; 
	private int lowAmount; //최저 잔금
	
	public BankAccount(int money) {
		lowAmount = money;
	}
	//입금 메소드
	public void deposit(int money) {
		balance += money ; 
		System.out.println("정상 입금처리: 입금금액 = "+money+",잔금="+lowAmount);
	}
	//출금 메소드
	public void withdraw(int money) throws InvalidWithdraw {
		if(money < 0) { //인출 요청 금액이 음수일때
			throw new InvalidWithdraw("요청 금액이 음수입니다.");
		}
		else if((balance - money) < lowAmount) { //인출 금액이 최저 잔금 이하로 인출요청 시
			throw new InvalidWithdraw("최저 잔금 이하의 요청입니다.");//메소드 발생
		}
		else { //아니면
			balance -= money;
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금 =" + lowAmount);
		}
		
	}
	
}



/*
class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}

public class BankAccount {
	private int minRepository;
	private int repository;

	public BankAccount() {
		minRepository = 0;
	}

	public BankAccount(int min) {
		minRepository = min;
	}

	public void deposit(int money) {
		repository += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)
			throw new InvalidWithdraw("음수 금액입니다.");
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("최저 잔금을 넘어서는 출금입니다.");
		else {
			repository -= money;
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + repository);
			return minRepository;
		}
	}
}

*/


