/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifiacadoresacceso;
import paquete1.*;
import paquete2.*;
/**
 *
 * @author GIo
 */
public class ModifiacadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba de accesos  a clase 1 desde otras clases
        //Acceso a clase 1 desde clase 2
        
        System.out.println("*** Acceso desde la clase 2 a la clase 1 (mismopaquete) ***");
        new Clase2().pruebaDesdeClase2();
        //acceso a la clase 1  desde la clase 2
        //clase 3 extiende a clase 1
        System.out.println("*** Acceso desde la clase 3 a la clase 1 (diferente paquete, pero es subclase) ***");
        new Clase3().pruebaDeClase3();
        //Acceso a clase 1 desde clase 4
        //Clase 4 NO es  subclase  de clase 1 y esta en otro paquete
        System.out.println("*** Acceso desde la clase 4 a la clase 1 (diferente paquete, NO es subclase) ***");
        new Clase4().pruebaDesdeClase4();        
        
    }
    
}
