/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxing;

/**
 *
 * @author GIo
 */
public class AutoboxingUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AutoBoxing, COnvierte d etipos primitivos a tipos object
        
        Integer enteroObjt = 10;
        Float  flotanteObj = 15.2F;
        Double doubleObjt = 4.1;
        
        System.out.println("Autoboxing");
        System.out.println("Objeto Entero: "+enteroObjt.intValue());
        System.out.println("Objeto Flotante: "+ flotanteObj.floatValue());
        System.out.println("Objeto Double: "+doubleObjt.doubleValue());
        
        //AutoUnboxin (Se convierten objetos  a tipos primitivos)
        
        int entero = enteroObjt;
        float flotante = flotanteObj;
        double  doble = doubleObjt;
        
        System.out.println("AutoUNboxing");
        System.out.println(" Entero: "+entero);
        System.out.println(" Flotante: "+ flotante);
        System.out.println(" Double: "+doble);        
        
        
        
        
        
    }   
    
}
