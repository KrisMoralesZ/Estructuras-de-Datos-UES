package proyectolistaenlazadasimple;

public class ListaCircularEnlazada {

    Nodo primero;
    Nodo ultimo;
    int tamaño;

    // Constructor
    public ListaCircularEnlazada() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    // Método para saber el tamaño de la lista
    public int tamaño() {
        return tamaño;
    }

    // Método para insertar elementos al inicio de la lista
    public void insertarInicio(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = primero; // El último apunta al primero
        } else {
            nuevo.siguiente = primero;
            primero = nuevo;
            ultimo.siguiente = primero; // Actualiza el enlace del último nodo
        }
        tamaño++;
    }

    // Método para insertar elementos al final de la lista
    public void insertarUltimo(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = primero; // El último apunta al primero
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = primero; // Actualiza el enlace del último nodo
        }
        tamaño++;
    }

    // Método para obtener los valores de la lista
    public String obtenerLista() {
        if (esVacia()) {
            return "Lista vacía";
        }
        StringBuilder datos = new StringBuilder();
        Nodo recorrer = primero;
        do {
            datos.append(recorrer.info).append("\n");
            recorrer = recorrer.siguiente;
        } while (recorrer != primero); // Recorre hasta volver al inicio
        return datos.toString();
    }

    // Manejo de direcciones para ver cómo se enlazan los nodos
    public String obtenerDirecciones() {
        if (esVacia()) {
            return "Lista vacía";
        }
        StringBuilder dato = new StringBuilder();
        Nodo recorrer = primero;
        int contador = 1;
        do {
            dato.append("\n Nodo ").append(contador)
                    .append(": Mi dirección es: ").append(recorrer)
                    .append(" Mi info es: ").append(recorrer.info)
                    .append(" La dirección del Siguiente Nodo es: ").append(recorrer.siguiente)
                    .append("\n ");
            recorrer = recorrer.siguiente;
            contador++;
        } while (recorrer != primero); // Recorre hasta volver al inicio
        return dato.toString();
    }

    // Método para eliminar el último nodo de la lista
    public void eliminarFinal() {
        if (esVacia()) return;
        if (primero == ultimo) {
            // Si hay un solo nodo
            primero = null;
            ultimo = null;
        } else {
            Nodo penultimo = primero;
            while (penultimo.siguiente != ultimo) {
                penultimo = penultimo.siguiente;
            }
            penultimo.siguiente = primero; // Actualiza el enlace del último nodo
            ultimo = penultimo;
        }
        tamaño--;
    }

    // Método para eliminar el primer nodo de la lista
    public void eliminarInicio() {
        if (esVacia()) return;
        if (primero == ultimo) {
            // Si hay un solo nodo
            primero = null;
            ultimo = null;
        } else {
            primero = primero.siguiente;
            ultimo.siguiente = primero; // Actualiza el enlace del último nodo
        }
        tamaño--;
    }

    // Método para saber si la lista está vacía
    public boolean esVacia() {
        return tamaño == 0;
    }
}
