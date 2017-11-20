//7.
import java.util.Date;
//클래스 PrintTime은 인터페이스 Runnable을 구현하는 클래스.
public class PrintTime implements Runnable {
	private int count; //정수  count(횟수)
	
	//생성자 구현
	public PrintTime(int count) {
		this.count = count;
	}
	public void run() {
		Date current = new Date(); 
		while (count != 0) { //count가 0이 아니면 출력
			System.out.println("순위: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try { //예외가 발생될 수 있는 문장들
				Thread.sleep(1000); //스레드를 잠시 멈추게 하는 sleep(시간)
				current = new Date();
			} catch (InterruptedException e) {
				//발생 가능한 예외 클래스의 참조변수 선언
			}
		}
	}
}