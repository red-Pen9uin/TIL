import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 0;

        for(;;) {
            first = scanner.nextInt();
            second = scanner.nextInt();

            if (first==0 && second==0) {
                break;
            }
            String answer = first>second ? "Yes" : "No";
            System.out.println(answer);
        }
        return;
    }
}