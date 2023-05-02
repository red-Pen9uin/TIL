import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        double before = 0;
        double fibonacci = 0;
        double next = 1;

        for(int i=1; i<=cnt; i++) {
            before = fibonacci;
            fibonacci = next;
            next = before + fibonacci;
        }

        System.out.printf("%.0f", fibonacci);
    }
}