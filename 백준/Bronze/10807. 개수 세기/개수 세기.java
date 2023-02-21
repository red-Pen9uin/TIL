import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int num[] = new int[cnt];
        for(int i=0; i<cnt; i++) {
            num[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int answer = 0;

        for(int i=0; i<num.length; i++) {
            if(num[i] == x) answer++;
        }
        System.out.println(answer);
    }
}