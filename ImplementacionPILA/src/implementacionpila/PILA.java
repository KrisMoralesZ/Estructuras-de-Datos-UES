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

    //Método para insertar elementos a la pila 
    public void Insertar(Object valor) {
        cima++;        
        ArregloPila[cima] = valor;
        tamaño++;
    }
    //Obtener el tamaño de la pila
    public int tamaño() {
        return tamaño;
    }
    //Desarrollar Método para retirar elementos a la pila
    

    //Desarrollar Método para saber pila esta vacia (Debe regresar true o false) 
    
   
    

   //Mostrar el elemento que esta en cima(no retirar al elemento)
   

   
    
}
