import java.util.Scanner;

public class Main {
	static int max_num(int[] array) {
		int max = 0;
		for(int i=0; i< array.length; i++) {
			if(array[i] > max) max = array[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt();
		int money[] = new int[user];
		int max = 0;
		
		for (int i = 0; i < user; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if (a == b && b == c) {
				money[i] = 10000 + a * 1000;
			} else if (a == b || a == c) {
				money[i] = 1000 + a * 100;
			} else if (b == c) {
				money[i] = 1000 + b * 100;
			} else {
				if (a > b && a > c) {
					money[i] = a * 100;
				} else if (b > a && b > c) {
					money[i] = b * 100;
				} else {
					money[i] = c * 100;
				}
			}
		}
//		if(money[0] > money[1] && money[0] > money[2]) {
//			max = money[0];
//		} else if(money[1] > money[0] && money[1] > money[2]) {
//			max = money[1];
//		} else {
//			max = money[2];
//		}
		// System.out.println(max);
		System.out.println(max_num(money));
	}
}