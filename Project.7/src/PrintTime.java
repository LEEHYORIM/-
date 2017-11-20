//7.
import java.util.Date;
//Ŭ���� PrintTime�� �������̽� Runnable�� �����ϴ� Ŭ����.
public class PrintTime implements Runnable {
	private int count; //����  count(Ƚ��)
	
	//������ ����
	public PrintTime(int count) {
		this.count = count;
	}
	public void run() {
		Date current = new Date(); 
		while (count != 0) { //count�� 0�� �ƴϸ� ���
			System.out.println("����: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try { //���ܰ� �߻��� �� �ִ� �����
				Thread.sleep(1000); //�����带 ��� ���߰� �ϴ� sleep(�ð�)
				current = new Date();
			} catch (InterruptedException e) {
				//�߻� ������ ���� Ŭ������ �������� ����
			}
		}
	}
}