import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		char grade = '\0';
		
		if(input >= 90 && input <= 100) {
			grade = 'A';
		} else if(input >= 80) {
			grade = 'B';
		} else if(input >= 70) {
			grade = 'C';
		} else if (input >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
	
}