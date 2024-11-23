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
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        miArbol.InsertarNodo(8);
        miArbol.InsertarNodo(7);
        miArbol.InsertarNodo(14);
        miArbol.InsertarNodo(14);
        miArbol.InsertarNodo(22);
        miArbol.InsertarNodo(3);


        System.out.println("Esta en el arbol el 8? " + miArbol.BuscarNodo(8));
    }
    
}
