import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum[] = new int[N];

        for(int i = 0; i < N; i ++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            if (x == y && y == z && x == z) {
                sum[i] = 10000 + (x * 1000);
            }
            else if (x == y || x == z) {
                sum[i] = 1000 + (x * 100);
            }
            else if (y==z) {
                sum[i] = 1000 + (y * 100);
            }
            else if (x>y && x>z){
                sum[i] = x*100;
            }
            else if (y>x && y>z){
                sum[i] = y*100;
            }
            else if (z>y && z>x){
                sum[i] = z*100;
            }
        }
        int max = 0;
        for(int j = 0 ; j < sum.length ; j++) {
            if(sum[j] > max) {
                max = sum[j];
            }
        }
        System.out.printf("%d", max);
    }
}