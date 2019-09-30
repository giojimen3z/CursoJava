/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author GIo
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Adri",10000);
        imprimirDetalles(emp);
        
        Gerente gerente = new Gerente("Gio", 100000, "Desarrollo");
        imprimirDetalles(gerente);
        
    }

    //observamos  que el tipo que recibe el metodo     es de tipo padre (Empleado)
    //sin embargo  al momento de ejecutar  el metodo, se ejecuta el del hij (gerente)
    //eso es el polimorfismo, multiples formas pero en tiempo d eejecucuiion
    
    
    public static void imprimirDetalles(Empleado emp){
        
        System.out.println(emp.obtenerDetalles());
    }
    
}
