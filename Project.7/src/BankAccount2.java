/*
//3.
//���ο� ���� InvalidWithdraw
class InvalidWithdraw extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class BankAccount2 {
	private int balance = 0;
	private int lowAmount; //���� �ܱ�

	public BankAccount2(int min) {
		balance = min;
	}
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		lowAmount += money; //�Աݽ� �����Ա�+�Ա� �ݾ�
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + lowAmount);
	}
	//��� �޼ҵ�
	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0) //���� ��û �ݾ��� �����϶�
			throw new InvalidWithdraw("���� �ݾ��Դϴ�.");
		else if (lowAmount - money < balance) //���� �ݾ��� ���� �ܱ� ���Ϸ� �����û ��
			throw new InvalidWithdraw("�ʰ���� �䱸 ����.");
		else { //��ݽ� 
			lowAmount -= money; //�ܱ�- ��� �ݾ�
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + lowAmount);
			return balance;
		}
	}
}
*/
