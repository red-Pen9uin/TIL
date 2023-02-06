import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girls = 0, boys = 0;

        for(;;) {
            boys = scanner.nextInt();
            girls = scanner.nextInt();

            if (boys==0 && girls==0) {
                break;
            }
            
            System.out.println(boys + girls + "");
        }
        return;
    }
}