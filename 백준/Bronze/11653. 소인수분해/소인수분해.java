import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int now=2;
        int remain;

        while (true) {
            remain = num % now;
            if(remain == 0) {
                num /= now;
                System.out.printf("%d\n", now);
            } else {
                now++;
            }
            if(num==1) break;
        }
    }
}