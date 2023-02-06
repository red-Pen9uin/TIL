import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] num = new int[cnt];
        for(int i=0; i<cnt; i++) {
            num[i] = scanner.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for(int i=0; i<cnt; i++) {
            if(num[i] > max) max = num[i];
            else if (num[i] < min) min = num[i];
        }
        System.out.println(min + " " + max);
    }
}