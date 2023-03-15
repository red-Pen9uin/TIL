import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int target = Integer.parseInt(input);
		int sum = 0;
		int now = 0;
		
		for(int i=1; i<target; i++) {
			now = sum = i;
			int temp = i;
			
			while(temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			
			if(sum == target) break;
		}
		if(sum == target) System.out.println(now);
		else System.out.println(0);
	}
}