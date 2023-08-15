import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();
        int input = 0;
        int result = 0;
        for(int i = 0; i< N.length(); i++) {
            char ch = N.charAt(i);
            int temp = 1;

            for(int j=(N.length()-1)- i; j>0; j--) {
                temp = B * temp;
            }

            if ('A' <= ch && ch <= 'Z') {
                input = (ch - 'A' + 10) * temp;
            } else if('0' <= ch && ch <= '9') {
                input = (ch - '0') * temp;
            }
            result += input;
        }
        System.out.println(result);
    }
}