import java.util.Scanner;	// Scanner 클래스

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner 객체 생성
		int a = in.nextInt();		// int 형 입력 및 리턴
		int b = in.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
