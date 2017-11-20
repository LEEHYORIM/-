//7.
public class Ex07 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");//스레드 생성
		th1.setPriority(Thread.MAX_PRIORITY - 1); 
		th1.start(); //스레드 시작 메소드 호출
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반갑습니다!"); //스레드 생성
		th1.setPriority(Thread.NORM_PRIORITY-1); 
		th2.start(); //스레드 시작 메소드 호출
	}
}
