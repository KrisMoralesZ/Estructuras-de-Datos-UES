
package proyectolistaenlazadasimple;

public class ProyectoListaEnlazadaSimple {


    public static void main(String[] args) {
        ListaEnlazadaSimple miLista = new ListaEnlazadaSimple();
                       
        miLista.insertarInicio("Maria");
        miLista.insertarInicio("Juan");
        miLista.insertarInicio("Margarita");
        miLista.insertarUltimo("Kristopher");
         
        System.out.println("Tamaño de la lista: " + miLista.tamaño());
        System.out.println("Elementos en la Lista: " +"\n" + miLista.obtenerlista());
        
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());

        if (miLista.esVacia()) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("la lista no esta vacia, tiene " + miLista.tamaño() + " elementos");
        }
    }
    
}
