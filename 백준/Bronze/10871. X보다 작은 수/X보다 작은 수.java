import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = scanner.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if( answer[i] < x ){
				System.out.print(answer[i] + " ");
			}
		}
	}
	
}