package implementacionpila;

public class PILA {
    Object[] ArregloPila;
    int cima = -1;
    int capacidadMaxima = 0;
    int tamaño = 0;

    //Constructor
   public PILA(int capMaxima) {
        ArregloPila = new Object[capMaxima];
        capacidadMaxima = capMaxima;
    }

    //Metodo para insertar elementos a la pila
    public void Insertar(Object valor) {
        cima++;        
        ArregloPila[cima] = valor;
        tamaño++;
    }

    //Obtener el tamaño de la pila
    public int tamaño() {
        return tamaño;
    }

    //Desarrollar Metodo para retirar elementos a la pila
    public void Eliminar() {
       Object valor = ArregloPila[cima];
       ArregloPila[cima] = null;
       cima--;
       tamaño--;
    }

    //Desarrollar Metodo para saber pila esta vacia (Debe regresar true o false)
    public boolean VerificarVacia() {
       return cima == -1;
    }

   //Mostrar el elemento que esta en cima(no retirar al elemento)
   public Object MostrarCima() {
       return ArregloPila[cima];
   }
}
