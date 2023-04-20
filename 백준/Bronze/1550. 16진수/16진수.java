import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String hexadecimal = scanner.next();
		int decimal = Integer.parseInt(hexadecimal, 16);
		System.out.println(decimal);
	}
}