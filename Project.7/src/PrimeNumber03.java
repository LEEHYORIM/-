//6.
import java.util.LinkedList;
//Ŭ���� PrimeNumber03�� �������̽� Runnable�� �����ϴ� Ŭ����. 
public class PrimeNumber03 implements Runnable {
	private int number; // number 
	private String name; //name
	LinkedList<Integer> prime = new LinkedList<>();
	
	// ������ ����
	public PrimeNumber03(int number, String name) {
		this.number = number;
		this.name = name; 
	}
	
	public void run() { //��� ����
		int j;
		System.out.println(this.name + ":"); //this.name(�Ҽ� ����� ������) ���.
		for(int i = 2; i <= this.number; i++) { //i�� 2���� this.number(25)���� ����.
			for(j = 2; j < i; j++) { //j�� i���� ���������� ����.
				if(i % j == 0) //i�� j�� ������ �� �������� 0�̸� ����.
					break;
			}
			if(j == i) //j�� i�� ������
				prime.add((Integer)j); //j �߰�.
		}
		System.out.println(prime.toString()); //LinkedList prime ���.
		prime.clear();
	}
}

