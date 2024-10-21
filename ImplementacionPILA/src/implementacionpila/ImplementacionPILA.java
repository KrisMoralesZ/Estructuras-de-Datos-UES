package implementacionpila;

/**
 *
 * @author Margarita Soto
 */
public class ImplementacionPILA {

   
    public static void main(String[] args) {
        PILA miPila = new PILA(20);
        miPila.Insertar("Juan");
        miPila.Insertar("Maria");
        miPila.Insertar("Pedro");
        // Insertar otro a la pila
        miPila.Insertar("Ana");
        System.out.println("El tamaño de la pila es " + miPila.tamaño());

        // Eliminar el ultimo valor
        miPila.Eliminar();
        System.out.println("El tamaño de la pila es despues de borrar es " + miPila.tamaño());

        // Verificar si esta vacia
        if (miPila.VerificarVacia() == true) {
            System.out.println("La Pila esta vacia");
        } else {
            System.out.println("La Pila no esta vacia, tiene " + miPila.tamaño() + " elementos");
        }

        // Mostrar Elemento cima
        System.out.println("El elemento de la cima es " + miPila.MostrarCima());
    }

}
