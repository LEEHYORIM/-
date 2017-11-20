

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
			System.out.printf("%d �����Ͽ� �����ܰ� %d �Դϴ�. %n", money, balance);
		}else if(balance < money)
			System.out.println("�ܰ� �����Ͽ� ������ �� �����ϴ�.");
	}
	
	public void deposit(int money){
		if(money > 0) {
			balance += money;
			System.out.printf("�ܰ� �����Ͽ� ������ �� �����ϴ�." , money, balance);
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
//���ο� ���� InvalidWithdraw
class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}

public class BankAccount {
	private int balance = 0; 
	private int lowAmount; //���� �ܱ�
	
	public BankAccount(int money) {
		lowAmount = money;
	}
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		balance += money ; 
		System.out.println("���� �Ա�ó��: �Աݱݾ� = "+money+",�ܱ�="+lowAmount);
	}
	//��� �޼ҵ�
	public void withdraw(int money) throws InvalidWithdraw {
		if(money < 0) { //���� ��û �ݾ��� �����϶�
			throw new InvalidWithdraw("��û �ݾ��� �����Դϴ�.");
		}
		else if((balance - money) < lowAmount) { //���� �ݾ��� ���� �ܱ� ���Ϸ� �����û ��
			throw new InvalidWithdraw("���� �ܱ� ������ ��û�Դϴ�.");//�޼ҵ� �߻�
		}
		else { //�ƴϸ�
			balance -= money;
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ� =" + lowAmount);
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
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)
			throw new InvalidWithdraw("���� �ݾ��Դϴ�.");
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("���� �ܱ��� �Ѿ�� ����Դϴ�.");
		else {
			repository -= money;
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;
		}
	}
}

*/


