import java.util.Scanner;

public class Main {
    static int count(int[] array, int x) {
        int cnt = 0;
        for(int i=0; i< array.length; i++) {
            if(array[i] == x) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x[] = new int[3];
        int y[] = new int[3];

        for(int i=0; i<x.length; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int answer_x=0, answer_y=0;

        for(int i=0; i<x.length; i++) {
            if(count(x, x[i]) == 1) answer_x = x[i];
            if(count(y, y[i]) == 1) answer_y = y[i];
        }

        System.out.printf("%d %d", answer_x, answer_y);
    }
}