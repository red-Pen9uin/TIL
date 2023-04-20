import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE = 3;
        int num[] = new int[SIZE];

        for(int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
        }

        for(int i=0; i<num.length; i++) {
            for(int j=0; j<i; j++) {
                if(num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i=0; i<num.length; i++) {
            System.out.printf("%d ", num[i]);
        }
    }
}