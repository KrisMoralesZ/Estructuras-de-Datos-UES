import java.util.Arrays;

public class OrdenacionSeleccion {
    public final void ordenarSeleccion() {
        int[] array = Main.generateRandomArray(1000);

        System.out.println("Array original: \n" + Arrays.toString(array));

        long startTime = System.nanoTime();
        sortArray(array);
        long endTime = System.nanoTime();

        System.out.println("Array ordenado: \n" + Arrays.toString(array));
        System.out.println("Tiempo de Ejecucion: " + (endTime - startTime) / 1000000 + " ms");
    }

    public static void sortArray(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int min = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > min) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = min;
        }
    }
}
