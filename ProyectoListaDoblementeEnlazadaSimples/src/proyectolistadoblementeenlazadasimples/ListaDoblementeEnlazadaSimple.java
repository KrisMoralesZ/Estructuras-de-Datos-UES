package proyectolistadoblementeenlazadasimples;

public class ListaDoblementeEnlazadaSimple {

    Nodo Primero;
    int Tamaño;
    //Constructor
    ListaDoblementeEnlazadaSimple() {
        Primero = null;
        Tamaño = 0;
    }
   //Método para saber el tamaño de la lista
    public int TamañoActual() {
        return Tamaño;
    }
    
    //Método para insertar elementos al final de la lista.
    public void insertarFinal(Object valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo recorrer = Primero;
        if (Tamaño==0) {
            Primero = nuevo;
        } else {
            while (recorrer.Siguiente != null) {
                recorrer = recorrer.Siguiente;
            }
            recorrer.Siguiente = nuevo;
            nuevo.Anterior = recorrer;
        }
        Tamaño++;
    }

    // Desarrollar Método para insertar elementos al inicio de la lista.
    public void InsertarInicio(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (Tamaño==0) {
            Primero = nuevo;
        } else {
            nuevo.Siguiente = Primero;
            Primero.Anterior = nuevo;
            Primero = nuevo;
        }
        Tamaño++;
    }

    //Método para obtener los valores de la lista.
    public String MostrarLista() {
        String Datos = "";
        Nodo Recorrer = Primero;
        do {
            Datos += Recorrer.Info + "\n";
            Recorrer = Recorrer.Siguiente;
        } while (Recorrer != null);
        return Datos;

    }
 //Método para obtener direcciones
    public String obtenerDirecciones() {
        String datos = "";
        Nodo recorrer = Primero;
        int contador = 0;
        while (recorrer != null) {
            datos += "Nodo " + contador
                    + " Mi direccion es: " + recorrer
                    + " Mi info es: " + recorrer.Info
                    + " Mi Nodo Anterior es: " + recorrer.Anterior + "\n"
                    + " Mi Nodo sig es: " + recorrer.Siguiente + "\n";

            recorrer = recorrer.Siguiente;
            contador++;
        }
        return datos;
    }

//Método para eliminar al final de una lista
    public void EliminarFinal() {
        Nodo penultimo = Primero;
        Nodo recorrer = Primero;
        if (recorrer != null) { //significa que si hay nodos
            if (recorrer.Siguiente == null) { //significa que hay un solo nodo
                Primero = null; // la lista se queda vacia
            } else {
                while (recorrer.Siguiente != null) {
                    penultimo = recorrer;
                    recorrer = recorrer.Siguiente;
                }
                penultimo.Siguiente = null;
            }
            Tamaño--;
        }

    }
    
    // Desarrollar Método para eliminar elemento inicial de la lista.
    public void EliminarInicio() {
        if (Primero == null) {
           return;
        }
        if (Primero.Siguiente == null) {
            Primero = null;
        } else {
            Primero = Primero.Siguiente;
            Primero.Anterior = null;
        }
        Tamaño--;
    }

    // Desarrollar Método para saber si una lista está vacía (Deberá regresar true o false)
    public boolean ComprobarVacia() {
        if(Tamaño == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
