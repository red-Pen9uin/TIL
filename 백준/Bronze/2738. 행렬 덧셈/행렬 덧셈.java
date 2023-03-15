import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		
		int[][] arrA = new int[width][height];
		int[][] arrB = new int[width][height];
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				arrA[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				arrB[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
//				arrA[i][j] = arrA[i][j] + arrB[i][j];
				System.out.printf("%d ", arrA[i][j] + arrB[i][j]);
			}
			System.out.println();
		}
		
	}
}