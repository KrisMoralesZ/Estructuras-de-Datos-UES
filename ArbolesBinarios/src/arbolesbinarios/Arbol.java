/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author mkjmkl
 */
public class Arbol {
   
    Nodo raiz;
    //Constructor
    Arbol() {
        raiz = null;
    }

    public void setRaiz(Nodo nuevo) {
        this.raiz = nuevo;
    }

   // Método para insertar un elemento en el árbol.
    public void InsertarNodo(int valor) {
        if (BuscarNodo(valor) == true) {
            System.out.println("El " + valor + "  ya existe en el arbol");
        } else {
            Nodo nuevo = new Nodo(valor);
            if (raiz == null) {
                raiz = nuevo;
            } else {
                Nodo recorrer = raiz;
                Nodo padre;
                boolean BuscarLugar = true;
                while (BuscarLugar == true) {
                    padre = recorrer;
                    if (valor < recorrer.Info) {
                        recorrer = recorrer.HijoIzquierdo;
                        if (recorrer == null) {
                            padre.HijoIzquierdo = nuevo;
                            BuscarLugar = false;
                        }
                    } else {
                        recorrer = recorrer.HijoDerecho;
                        if (recorrer == null) {
                            padre.HijoDerecho = nuevo;
                            BuscarLugar = false;
                        }
                    }
                }
            }
        }
    }

     // Método para buscar elementos en un árbol.
     public boolean BuscarNodo(int datoAbuscar) {
        Nodo recorrer = raiz;
        boolean encontrado = false;
        if (recorrer != null) {
            // Verifica si el dato a buscar esta en la raíz
            if (datoAbuscar == recorrer.Info) {
                encontrado = true;
            } else {
                while (recorrer.Info != datoAbuscar) {
                    if (datoAbuscar < recorrer.Info) {
                        recorrer = recorrer.HijoIzquierdo;
                    } else {
                        recorrer = recorrer.HijoDerecho;
                    }
                    if (recorrer == null) {
                        encontrado = false;
                        break;
                    }
                    if (recorrer.Info == datoAbuscar) {
                        encontrado = true;
                    }
                }
            }
        }
        return encontrado;

    }

     // Desarrollar recorrido Inorden.
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.HijoIzquierdo);
            System.out.println(nodo.Info);
            inOrden(nodo.HijoDerecho);
        }
    }
     
     // Desarrollar recorrido Preorden.
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.Info);
            preOrden(nodo.HijoIzquierdo);
            preOrden(nodo.HijoDerecho);
        }
    }
     
     // Desarrollar recorrido Postorden.
    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.HijoIzquierdo);
            postOrden(nodo.HijoDerecho);
            System.out.println(nodo.Info);
        }
    }

    // Método público para recorrer Inorden
    public void MostrarInorden() {
        System.out.println("Recorrido Inorden:");
        inOrden(raiz);
        System.out.println();
    }

    // Método público para recorrer Preorden
    public void MostrarPreorden() {
        System.out.println("Recorrido Preorden:");
        preOrden(raiz);
        System.out.println();
    }

    // Método público para recorrer Postorden
    public void MostrarPostorden() {
        System.out.println("Recorrido Postorden:");
        postOrden(raiz);
        System.out.println();
    }
}
