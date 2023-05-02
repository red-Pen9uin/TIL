import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participation[] = {
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        };
        String univerity[] = {
                "Soongsil",
                "Korea",
                "Hanyang"
        };

        String answer = is_participating(participation, univerity);
        System.out.printf("%s", answer);
    }

    private static String is_participating(int[] participation, String[] univerity) {
        // round는 배열 크기 - 1 만큼 진행됨
        for(int i = 1; i < univerity.length; i++) {
            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for(int j = 0; j < univerity.length - i; j++) {
//                 *  현재 원소가 다음 원소보다 클 경우 서로 원소의 위치를 교환한다.
                if(participation[j] > participation[j + 1]) {
                    swap(participation, j, j + 1);
                    swap(univerity, j, j + 1);
                }
            }
        }

        int sum = 0;
        for(int i=0; i<univerity.length; i++) {
            sum += participation[i];
        }

        if (sum >= 100) return "OK";
        else return univerity[0];
    }


    private static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}