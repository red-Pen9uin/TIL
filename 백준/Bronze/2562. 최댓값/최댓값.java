import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int SIZE = 9;
		int[] nums = new int[SIZE];
		int max = 0;
		int index = 0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = scanner.nextInt();
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
	
}