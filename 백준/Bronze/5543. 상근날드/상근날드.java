import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		final int MAX_PRICE = 2000;
        int burger = MAX_PRICE;
        int drink = MAX_PRICE;

        for(int i=0; i<3; i++) {
            int tmp = scanner.nextInt();
            if (burger > tmp) {
                burger = tmp;
            }
        }
        for(int i=0; i<2; i++) {
            int tmp = scanner.nextInt();
            if (drink > tmp) {
                drink = tmp;
            }
        }
        System.out.println(burger+drink-50+"");
    }
}