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
public class Clase3 extends Clase1{
    
    public Clase3(){
        //COnstructor Protegido, al ser una subclase puede acceder
        //aunque este en otro paquete
        super(1,2);
        //Acceso package, y al estar fuera  del paquete esta restringido
        //super(1,2,3);
        //Acceso privado, restringido
        //super(1,2,3,4)
        
    }
    
    public void pruebaDeClase3(){
        
        //Acceso a clase 1 desde Clase 3
        //calse 3 extiende de la clase 
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo Publico "+ c1.atrPublico +" o heredado" + atrPublico);  
        System.out.println("Atributo Protegido (heredado):" +atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo Provate: acceso denegado");
        
        
        //COnstructor publico
        new Clase1();
        
        //Los demas constructores no se pueden probar asai, si no desde el constructor de esta clase
        //Ya que esta es una subclase en otro paquete
        System.out.println("");
        
        
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protegifo (heredado): "+ metodoProtegido());
        System.out.println("Metodo default: No se puede acceder a un paquete externo");
        System.out.println("Metodo Private: acceso denegado");
               
            
              
        
    }
    
}
