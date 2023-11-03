import java.util.Date;

public class SelectionSort {

    /**
     * Funcion para ordenar un array por el metodo de seleccion
     */
    public static void main(String[] args) {

        int[] dataSizeArray = {10000, 100000, 1000000};

        for (int dataSize : dataSizeArray) {
            Integer[] data = createRandomIntegerArray(dataSize);
            System.out.println("Size of the array: " + dataSize);

            Date startDate = new Date();
            selectionSort(data);
            Date endDate = new Date();

            System.out.println("Time taken to sort: " + (endDate.getTime() - startDate.getTime()) + " milliseconds");
        }
    }

    public static void selectionSort(Integer[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Integer temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }

    public static Integer[] createRandomIntegerArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

}