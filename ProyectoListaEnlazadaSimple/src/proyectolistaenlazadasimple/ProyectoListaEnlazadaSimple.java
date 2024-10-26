
package proyectolistaenlazadasimple;

public class ProyectoListaEnlazadaSimple {


    public static void main(String[] args) {
        ListaEnlazadaSimple miLista = new ListaEnlazadaSimple();
                       
        miLista.insertarInicio("Maria");
        miLista.insertarInicio("Juan");
        miLista.insertarInicio("Margarita");
         
        System.out.println("Tamaño de la lista: " + miLista.tamaño());
        System.out.println("Elementos en la Lista: " +"\n" + miLista.obtenerlista());
        
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());
       
    }
    
}
