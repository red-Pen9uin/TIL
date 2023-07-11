import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] input_arr = input.toCharArray();
		final int LENGTH = input.length() - 1;
		int check = (int) input.length() / 2;
		boolean is_palindrome = true;
		
		for(int i=0; i<check; i++) {
			if(input_arr[i] != input_arr[LENGTH - i]) {
				is_palindrome = false;
				break;
			}
		}
		
		if (is_palindrome) System.out.println(1);
		else System.out.println(0);
	}
}