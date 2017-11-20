//1.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0, y=0,z=0; //정수 x,y,z
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두개 입력:");
		x = input.nextInt(); //x값 입력받기.
		y = input.nextInt(); //y값 입력받기.
		z = x*y; //z의 값= x*y
		System.out.printf("%d * %d = %d %n",x,y,z);
		
		try{ //예외가 발생할 수 있는 문장들.
			x = input.nextInt();
			y = input.nextInt();		
			System.out.printf("%d * %d = %d %n",x,y,z);
		}catch(InputMismatchException e){ //발생 가능한 예외 클래스의 참조변수 선언
			//예외처리 모듈
			System.out.println("예외발생:" + e);
		}finally{ //항상 실행되는 문장
			System.out.printf("try실행");
		}
	}
}

/*
int x = 0, y=0,z=0;
			Scanner input = new Scanner(System.in);
			System.out.println("정수 두개 입력:");
			x = input.nextInt();
			y = input.nextInt();
			z = x*y;
			System.out.printf("%d * %d = %d %n",x,y,z);
			*/
