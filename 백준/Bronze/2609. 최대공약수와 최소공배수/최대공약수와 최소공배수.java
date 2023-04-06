import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int cnt = (num1 > num2) ? num2 : num1;

        int GCD = 0, LCM = 0;

        for(int i=1; i<=cnt; i++) {
            int remain1 = num1 % i;
            int remain2 = num2 % i;
            if (remain2==0 && remain1==0) GCD = i;
        }

        cnt = num1 * num2;
        for(int i=1; i<=cnt; i++) {
            int remain1 = i % num1;
            int remain2 = i % num2;
            if (remain2==0 && remain1==0) {
                LCM = i;
                break;
            }
        }

        System.out.printf("%d%n%d", GCD, LCM);


    }
}