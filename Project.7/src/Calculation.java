//1.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0, y=0,z=0; //���� x,y,z
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ΰ� �Է�:");
		x = input.nextInt(); //x�� �Է¹ޱ�.
		y = input.nextInt(); //y�� �Է¹ޱ�.
		z = x*y; //z�� ��= x*y
		System.out.printf("%d * %d = %d %n",x,y,z);
		
		try{ //���ܰ� �߻��� �� �ִ� �����.
			x = input.nextInt();
			y = input.nextInt();		
			System.out.printf("%d * %d = %d %n",x,y,z);
		}catch(InputMismatchException e){ //�߻� ������ ���� Ŭ������ �������� ����
			//����ó�� ���
			System.out.println("���ܹ߻�:" + e);
		}finally{ //�׻� ����Ǵ� ����
			System.out.printf("try����");
		}
	}
}

/*
int x = 0, y=0,z=0;
			Scanner input = new Scanner(System.in);
			System.out.println("���� �ΰ� �Է�:");
			x = input.nextInt();
			y = input.nextInt();
			z = x*y;
			System.out.printf("%d * %d = %d %n",x,y,z);
			*/
