import java.util.Arrays;
import java.util.Random;

public class Bubble {
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 1000000};
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // divide by 1000000 to get milliseconds
            System.out.println("Bubble Sort with " + size + " elements took " + duration + " milliseconds");
        }
    }
}