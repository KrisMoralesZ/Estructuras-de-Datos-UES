package proyectolistaenlazadasimple;

public class ListaEnlazadaSimple {

    Nodo primero;
    Nodo ultimo;
    int tamaño;
    
    //Constructor
    public ListaEnlazadaSimple() {
        primero = null;
        ultimo = null;
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

    // Método para insertar elementos al final de la lista.
    public void insertarUltimo(Object valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamaño++;
    }

    //Método para obtener los valores de la lista.
    public String obtenerlista() {
        String datos = "";
        Nodo recorrer = primero;
        Nodo recorrer2 = ultimo;
        while (recorrer != null ) {
            datos = datos + recorrer.info + "\n";
            recorrer = recorrer.siguiente;
        }
        while (recorrer2 != null) {
            datos = datos + recorrer2.info + "\n";
            recorrer2 = recorrer2.siguiente;
        }
        return datos;
    }

    //Manejo de direcciones para ver como se enlazan los nodos
    public String obtenerDirecciones() {
        String dato = "";
        Nodo recorrer = primero;
        Nodo recorrer2 = ultimo;
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
        while (recorrer2 != null) {
            dato += " \n Nodo " + contador
                    + ": Mi direccion es: " + recorrer2
                    + " Mi info es: " + recorrer2.info
                    + "\n \n";
            recorrer2 = recorrer2.siguiente;
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

    //  Método para eliminar elemento inicial de la lista.
    public void EliminarUltimo() {
        Nodo penultimo = ultimo;
        Nodo recorrer = ultimo;
        if (recorrer != null) {
            if (recorrer.siguiente == null) {
                primero = null;
            }
        } else {
            primero = null;
        }
    }

    //  Método para saber si una lista está vacía
    public boolean esVacia() {
        if (tamaño == 0) {
            return true;
        } else {
            return false;
        }
    }
}