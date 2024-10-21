
package implementacioncola;


public class COLA {
    Object[] ArregloCola;
    int FinCola = -1;
    int tamaño = 0;
    int capacidadMaxima = 0;

    //Constructor
    COLA(int capacidad) {
        ArregloCola = new Object[capacidad];
        capacidadMaxima = capacidad;
    }
   //Método para insertar elementos en la Cola
    public void Encolar(Object valor) {
        if (tamaño == capacidadMaxima) {
            System.out.println("PILA LLENA");
        } else {
            FinCola++; //cima=cima+1;
            ArregloCola[FinCola] = valor;
            tamaño++;
        }
    }
      //Método para saber si una Cola esta vacía.
      public boolean vacia(){
       return tamaño==0;
       } 
      
      //Desarrollar Método para retirar un elemento de la Cola
      
      //Desarrollar Método para obtener el tamaño de la Cola
      
     
}
