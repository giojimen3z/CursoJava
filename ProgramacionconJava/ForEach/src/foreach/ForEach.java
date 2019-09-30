/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author GIo
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un arreglo de personas
        
        Persona[] personas = {new Persona("Gio"),new Persona("Adri")};
        
        // Iteramos cada elmento del arreglo de personas
        
        for (Persona p : personas) {
            
            // accedemos  a cada objeto  del areglo
            String nombre  = p.getNombre();
            System.out.println("Nombre persona: " + nombre);
            
        }
        
        System.out.println(" ");
        
        // Creamos un arreglo de enteros
        
        
        int [] edades = {15,20,26,24,23,20,48};
        
        // Iteramos el arreglo en el for Each
          
        for (int edad : edades){
            
            System.out.println("Edad:  "+ edad);
            
        }
        
        
    }
    
}
