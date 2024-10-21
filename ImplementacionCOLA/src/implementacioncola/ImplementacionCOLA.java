
package implementacioncola;

public class ImplementacionCOLA {

    public static void main(String[] args) {
        COLA ObjCola = new COLA(20);
        ObjCola.Encolar("Juan");
        ObjCola.Encolar("Maria");
        ObjCola.Encolar("Pedro");
        System.out.println("La cola esta vacia?  " + ObjCola.vacia());
    }
    
}
