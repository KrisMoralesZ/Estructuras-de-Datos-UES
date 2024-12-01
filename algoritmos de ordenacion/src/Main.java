import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema de Ordenamiento");
        System.out.println("Cual sistema de Ordenamiento te gustaria usa:");
        System.out.println("1. Burbuja");
        System.out.println("2. Ordenamiento");
        System.out.println("3. Shell");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        OrdenacionBurbuja burbuja = new OrdenacionBurbuja();
        OrdenacionSeleccion seleccion = new OrdenacionSeleccion();
        OrdenacionShell shell = new OrdenacionShell();

        if (opcion == 1) {
            System.out.println("oprimiste 1");
            burbuja.ordenarBurbuja();
        }
        else if (opcion == 2) {
            System.out.println("oprimiste 2");
            seleccion.ordenarSeleccion();
        } else if (opcion == 3) {
            System.out.println("oprimiste 3");
            shell.ordenarShell();
        } else {
            System.out.println("Opcion no valida");
        }
    }

    public static int[] generateRandomArray(int n){
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}