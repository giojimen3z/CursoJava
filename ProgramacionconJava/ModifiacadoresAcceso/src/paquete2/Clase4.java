/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Clase1;

/**
 *
 * @author GIo
 */
public class Clase4 {
    
    public Clase4(){
        //COnstructor Protegido restringido al no se runa subclase
        //super(1,2);
        //Acceso package, y al estar fuera  del paquete esta restringido
        //super(1,2,3);
        //Acceso privado, restringido
        //super(1,2,3,4)        
    }
    
    
    public void pruebaDesdeClase4(){
        //Acceso a la clase 1 desde la clase 4
        //Clase 4 NO es subclase y esta en otro paquete
Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo Publico "+ c1.atrPublico);  
        System.out.println("Atributo Protegido :  al no ser una subclase, no se puede acceder desde un paquete externo");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo Provate: acceso denegado");
        
        
        //COnstructor publico
        new Clase1();
        
        //Los demas constructores no se pueden probar asai, si no desde el constructor de esta clase
        //Ya que esta es una subclase en otro paquete
        System.out.println("");
        
        
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protegido:  al no ser una subclase, no se puede acceder desde un paquete externo ");
        System.out.println("Metodo default: No se puede acceder a un paquete externo");
        System.out.println("Metodo Private: acceso denegado");
               
                    
        
        
    }
}
