import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int alpha[] = new int[26];

        for(int i=0; i<word.length(); i++) {
            int now = word.charAt(i) - 'a';
            alpha[now]++;
        }

        for(int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}