import java.util.Scanner;

public class Main {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubblesort(int[] arr, int size) {
        for(int i=size-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        final int SIZE = 10;

        for(int i=0; i<loop; i++) {
            int[] array = new int[SIZE];
            for(int j=0; j<SIZE; j++) {
                array[j] = scanner.nextInt();
            }

            bubblesort(array, SIZE);
            System.out.printf("%d%n", array[SIZE - 3]);
        }

    }

}