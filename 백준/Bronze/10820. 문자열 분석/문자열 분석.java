import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String string = scanner.nextLine();
            if(string.length() == 0) break;
            int[] counts = new int[4];

            for(int i=0; i<string.length(); i++) {
                if('a' <= string.charAt(i) && string.charAt(i) <= 'z')
                    counts[0]++;
                else if('A' <= string.charAt(i) && string.charAt(i) <= 'Z')
                    counts[1]++;
                else if('0' <= string.charAt(i) && string.charAt(i) <= '9')
                    counts[2]++;
                else if(' ' == string.charAt(i))
                    counts[3]++;
            }
            System.out.printf("%d %d %d %d %n", counts[0], counts[1], counts[2], counts[3]);
        }
        scanner.close();
    }

}