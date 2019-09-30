/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquesdecodigo;

/**
 *
 * @author GIo
 */
public class Persona {
    private final int idPersona;
    private static int contadorersonas;
    
//Bloque de inicializacon estatico
    static {
        // inicamos el  contador de personas con0
        contadorersonas = 10;
        
        // en estos codigos estaticos no s epueden usar variables estaticas  
        System.out.println("Ejecuta bloque etatico");
    }
    
    //Bloqie de codigo para incalizar elementos de la clase
    //El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorersonas;
        
    }
    
    Persona(){
        
        System.err.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
}
