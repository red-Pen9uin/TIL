import java.util.Scanner;

public class Main {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for(int j=low; j<=high-1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
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

            quicksort(array, 0, SIZE-1);
            System.out.printf("%d%n", array[SIZE - 3]);
        }

    }

}