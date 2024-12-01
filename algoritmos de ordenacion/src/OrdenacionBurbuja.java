import java.util.Arrays;

public class OrdenacionBurbuja {
    public final void ordenarBurbuja() {
        int[] array = Main.generateRandomArray(1000);

        System.out.println("Array original: \n" + Arrays.toString(array));

        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        System.out.println("Array ordenado: \n" + Arrays.toString(array));
        System.out.println("Tiempo de ejecuccion: " + ((endTime - startTime) / 1000000) + " ms");
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
