/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author GIo
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado ("Juan",10000);
        Empleado emp2 = new Empleado ("Juan",10000);
        
        
        copararObjetos(emp1,emp2);
    }
    
    private static void copararObjetos(Empleado emp1, Empleado emp2){
        //Lllamada del metodo  to string 
        //por deafult se manda a llamar el metodo to string dentro del println
        
        System.out.println("contenido objeto: "+ emp1);
        
        //Revision por  referencia
        
        if (emp1 == emp2){
            System.out.println("Los objetos tienen la misma direccion de memoria");
        }else {
            
            System.out.println("los objetos tienen distinta  direcciond e memoria");
        }
        
        //revision por metodo Equals
        
        if (emp1.equals(emp2)){
            System.out.println("Los objetos tienne el mismo contenido, son iguales");
        } else{
            
            System.out.println("Los Objetos NO tienen el mismo contenido, NO  son igaes");
        }
        
        //Revisamos  el metodo hashcode
        
        if (emp1.hashCode() == emp2.hashCode()){
            
            System.out.println("Los objetos tienen el mismo hash");
            
        }else {
            
            System.out.println("Los objetos No tienen el mismo cdigo hash");
        }
        
        
    }
}
