import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = scanner.nextInt();
        int loop = scanner.nextInt();
        int[] basket = new int[SIZE];

        for(int i=0; i<loop; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int ball = scanner.nextInt();

            for(int j=start-1; j<end; j++) {
                basket[j] = ball;
            }
        }
        for(int i=0; i<SIZE; i++) {
            System.out.printf("%d ", basket[i]);
        }
    }

}