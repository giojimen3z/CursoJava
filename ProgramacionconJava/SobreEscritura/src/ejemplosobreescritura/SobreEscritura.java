/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosobreescritura;


/**
 *
 * @author GIo
 */
public class SobreEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Empleado empleado = new Empleado("Adri",1000);
        
        System.out.println(empleado.obtenerDetalles());
        
        Gerente gerente  =  new Gerente("Gio", 5000000, "Desarrollo de software");
        
        System.out.println(gerente.obtenerDetalles());
               
        
        
        
        
    }
    
}
