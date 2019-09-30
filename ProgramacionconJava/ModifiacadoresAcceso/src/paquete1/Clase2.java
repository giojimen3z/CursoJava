/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;



/**
 *
 * @author GIo
 */
public class Clase2 {
    
    
    //Prueba de constructores
    
    public Clase2(){
        
        System.out.println(" ");
        //COnstructor publico
        new Clase1(1);
        //COnstructor Protegido
        new Clase1(1,2);
        //COnstructor default o package
        new Clase1(1,2,3);
        //Constructor Privado,  como este constructor  solo puede usarse por la clase no  se realiza el llamado
        
        System.out.println("Contructor Privado: Acceso denegado");
        
        
    }
    
    public void pruebaDesdeClase2(){
        //Se accede a la clase 1  desde la clase 2
        Clase1 c1 = new Clase1();
        
         System.out.println("Atributo Publico " + c1.atrPublico);
         System.out.println("Atributo Protegido " + c1.atrProtegido);
         System.out.println("Atributo default " + c1.atrPaquete);
         System.out.println("Atributo privado: Acceso denegado " );
        
         System.out.println("");
         
         System.out.println("Metodo Publico " + c1.metodoPublico());
         System.out.println("Metodo Protegidolico " + c1.metodoProtegido());
         System.out.println("Metodo default " + c1.metodoPaquete());
         System.out.println("Metodo Privado: Acceso denegado" );
    }
    
}
