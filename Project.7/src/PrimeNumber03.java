//6.
import java.util.LinkedList;
//클래스 PrimeNumber03은 인터페이스 Runnable을 구현하는 클래스. 
public class PrimeNumber03 implements Runnable {
	private int number; // number 
	private String name; //name
	LinkedList<Integer> prime = new LinkedList<>();
	
	// 생성자 구현
	public PrimeNumber03(int number, String name) {
		this.number = number;
		this.name = name; 
	}
	
	public void run() { //기능 구현
		int j;
		System.out.println(this.name + ":"); //this.name(소수 만드는 스레드) 출력.
		for(int i = 2; i <= this.number; i++) { //i는 2부터 this.number(25)까지 증가.
			for(j = 2; j < i; j++) { //j는 i보다 작을때까지 증가.
				if(i % j == 0) //i와 j를 나눴을 때 나머지가 0이면 멈춤.
					break;
			}
			if(j == i) //j와 i가 같으면
				prime.add((Integer)j); //j 추가.
		}
		System.out.println(prime.toString()); //LinkedList prime 출력.
		prime.clear();
	}
}

