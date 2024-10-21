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
        System.out.println("El tamaño de la pila es " + miPila.tamaño());
        
    }

}
