import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int answer = 0;

        for(int i=0; i<cnt; i++) {
            int num = scanner.nextInt();
            if(num == 1) continue;
            boolean flag = true;
            for(int now=2; now*now <= num; now++) {
                if(num%now == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        System.out.printf("%d", answer);

    }
}