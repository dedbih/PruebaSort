import java.util.Random;

public class InsertionSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        Random random = new Random();

        // Tamaño de muestra
        int size = 1000000;

        // Generar arreglo de números enteros
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }

        // Medir el tiempo en milisegundos que le tomó el algoritmo ordenar el arreglo
        long startTime = System.currentTimeMillis();
        insertionSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array");
        printArray(arr);

        System.out.println("Time taken by Insertion Sort in milliseconds: " + (endTime - startTime));
    }
}