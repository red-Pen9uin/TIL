import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int calls[] = new int[cnt];
        for(int i=0; i<cnt; i++) {
            calls[i] = scanner.nextInt();
        }
        int Youngsik_plan = 0;
        int Minsik_plan = 0;

        for(int call_time: calls) {
            Youngsik_plan++;
            Youngsik_plan += call_time/30;

            Minsik_plan++;
            Minsik_plan += call_time/60;            
        }
        Youngsik_plan *= 10;
        Minsik_plan *= 15;

        if(Youngsik_plan < Minsik_plan) {
            System.out.println("Y " + Youngsik_plan);
        } else if (Minsik_plan < Youngsik_plan){
            System.out.println("M " + Minsik_plan);
        } else {
            System.out.println("Y M " + Youngsik_plan);
        }
    }
}