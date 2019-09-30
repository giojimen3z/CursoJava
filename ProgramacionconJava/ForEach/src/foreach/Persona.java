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
public class Persona {
    
    // Se crean las variables  privadas de la clase
    private final int idPersona;
    private String nombre;
    
    private static int contadorPersonas;
    // se crea el constructor sobre cargado 
    Persona (String nombre){
        // se inicializan las variables  de la clase para que s epuedan usar en  los metodos
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
               
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
