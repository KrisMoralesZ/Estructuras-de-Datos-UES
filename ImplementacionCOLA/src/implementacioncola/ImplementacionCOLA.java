
package implementacioncola;

public class ImplementacionCOLA {

    public static void main(String[] args) {
        COLA ObjCola = new COLA(20);
        ObjCola.Encolar("Juan");
        ObjCola.Encolar("Maria");
        ObjCola.Encolar("Pedro");
        // System.out.println("La cola esta vacia?  " + ObjCola.vacia());
        System.out.println("La cola tiene " + ObjCola.getTamaño() + " elementos");

        ObjCola.Eliminar();
        System.out.println("Ahora la cola tiene " + ObjCola.getTamaño() + " elementos");

    }
    
}
