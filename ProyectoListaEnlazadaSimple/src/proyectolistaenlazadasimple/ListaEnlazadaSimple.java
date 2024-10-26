package proyectolistaenlazadasimple;

public class ListaEnlazadaSimple {

    Nodo primero;
    int tamaño;
    
    //Constructor
    public ListaEnlazadaSimple() {
        primero = null;
        tamaño = 0;
    }
    //Método para saber el tamaño de lista 
    public int tamaño() {
        return tamaño;
    }
    //Método para Insertar elementos al inicio de la lista 
    public void insertarInicio(Object valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = primero;
        primero = nuevo;
        tamaño++;
    }
    //Método para obtener los valores de la lista.
    public String obtenerlista() {
        String datos = "";
        Nodo recorrer = primero;
        while (recorrer != null) {
            datos = datos + recorrer.info + "\n";
            recorrer = recorrer.siguiente;
        }
        return datos;
    }
    //Manejo de direcciones para ver como se enlazan los nodos
    public String obtenerDirecciones() {
        String dato = "";
        Nodo recorrer = primero;
        int contador = 1;
        while (recorrer != null) {
            dato += " \n Nodo " + contador
                    + ": Mi direccion es: " + recorrer
                    + " Mi info es: " + recorrer.info
                    + " La dirección del Siguiente Nodo es: " + recorrer.siguiente
                    + " \n ";
            recorrer = recorrer.siguiente;
            contador++;
        }
        return dato;
    }
    //Método para eliminar al final de una lista
    public void EliminarFinal() {
        Nodo penultimo = primero;
        Nodo recorrer = primero;
        if (recorrer != null) { //significa que si hay nodos
            if (recorrer.siguiente == null) { //significa que hay un solo nodo
                primero = null; // la lista se queda vacia
            } else {
                while (recorrer.siguiente != null) {
                    penultimo = recorrer;
                    recorrer = recorrer.siguiente;
                }
                penultimo.siguiente = null;
            }
            tamaño--;
        }

    }
}