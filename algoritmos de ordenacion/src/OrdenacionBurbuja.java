import java.util.Arrays;

public class OrdenacionBurbuja {
    public static void main(String[] args) {
        int[] array = {8, 4, 6, 2 };

        System.out.println("Array original: \n" + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Array ordenado: \n" + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
