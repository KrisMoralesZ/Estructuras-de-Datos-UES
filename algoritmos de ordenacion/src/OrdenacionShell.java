import java.util.Arrays;

public class OrdenacionShell {
    public final void ordenarShell() {
        int[] array = Main.generateRandomArray(10000);

        System.out.println("Array original: \n" + Arrays.toString(array));

        long startTime = System.nanoTime();
        shellSort(array);
        long endTime = System.nanoTime();

        System.out.println("Array ordenado: \n" + Arrays.toString(array));
        System.out.println("Tiempo de ejecucion: " + ((endTime - startTime) / 1000000) + " ms");

    }

    public static void shellSort(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i - gap;
                while (j >= 0 && array[j] > temp) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = temp;
            }
        }
    }
}
