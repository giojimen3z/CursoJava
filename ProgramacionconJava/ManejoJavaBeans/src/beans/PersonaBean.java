/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author GIo
 */

//1. imlementamos  la interface Serializable
//del paquete java.io
public class PersonaBean implements  Serializable{
    
    //2. cada propiedad es de tipo private
    private String nombre;
    private int edad;
    
    //3. Siempre debe tener un cosntructor  vacio sin argumentos
    
    public PersonaBean(){
        
    }
    
    //CONSTRUCTOR DEL JAVAbEAN, (NO ES REQUERIDO)
    
    public PersonaBean(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
   // por cada propiedad se agregan los metodos getter ysetter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
