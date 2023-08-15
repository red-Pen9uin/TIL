import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] seats = new int[100];
		int deny = 0;

		for(int i=0; i<N; i++) {
			int guest = scanner.nextInt();
			if (seats[guest-1] == 0) seats[guest-1]++;
			else deny++;
		}
		System.out.printf("%d", deny);
	}
}

