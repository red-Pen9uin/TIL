import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] basket = new int[N+1];
		
		for (int i = 1; i <= N; i++)
			basket[i] = i;
		
		for (int i = 0; i < M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int temp = basket[a];
			basket[a] = basket[b];
			basket[b] = temp;
		}
		
		for (int i = 1; i <= N; i++)
			System.out.print(basket[i] + " ");
	}
}