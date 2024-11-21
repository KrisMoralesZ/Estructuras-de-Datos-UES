package proyectolistadoblementeenlazadasimples;

public class ProyectoListaDoblementeEnlazadaSimples {

    public static void main(String[] args) {
        ListaDoblementeEnlazadaSimple miLista = new ListaDoblementeEnlazadaSimple();
        miLista.insertarFinal("Nicole");
        miLista.insertarFinal("Sebas");
        miLista.insertarFinal("Pedro");
        System.out.println("Tamaño de la lista: " + miLista.Tamaño);
        System.out.println("Lista: \n" + miLista.MostrarLista());
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());

        miLista.InsertarInicio("Kristopher");
        System.out.println("Lista despues de Añadir nodo al Inicio");
        System.out.println("Tamaño de la lista: " + miLista.Tamaño);
        System.out.println("Lista: \n" + miLista.MostrarLista());

        miLista.EliminarInicio();
        System.out.println("Lista despues de Eliminar nodo al Inicio");
        System.out.println("Tamaño de la lista: " + miLista.Tamaño);
        System.out.println("Lista: \n" + miLista.MostrarLista());

        miLista.ComprobarVacia();
        System.out.println("La lista esta vacia: " + miLista.ComprobarVacia());

    }

}
