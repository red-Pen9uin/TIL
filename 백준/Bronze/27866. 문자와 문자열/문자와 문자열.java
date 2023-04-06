import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int index = scanner.nextInt();

        System.out.printf("%c", word.charAt(index-1));

    }
}