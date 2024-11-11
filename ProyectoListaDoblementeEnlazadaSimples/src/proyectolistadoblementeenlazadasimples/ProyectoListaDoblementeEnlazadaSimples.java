package proyectolistadoblementeenlazadasimples;

public class ProyectoListaDoblementeEnlazadaSimples {

    public static void main(String[] args) {
        ListaDoblementeEnlazadaSimple miLista = new ListaDoblementeEnlazadaSimple();
        miLista.insertarFinal("Nicole");
        miLista.insertarFinal("Sebas");
        miLista.insertarFinal("Pedro");
        System.out.println("Lista: \n" + miLista.MostrarLista());
        System.out.println("Tamaño de la lista: " + miLista.Tamaño);
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());
    }

}
