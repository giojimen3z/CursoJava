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
public class Gerente extends Empleado{
    
    private String departemento;
    public Gerente (String nombre, double sueldo,String  departamento){
        
        super(nombre,sueldo);
        this.departemento = departamento;
    }
    //Sobre escribimos el metodo padre heredado
    
    @Override
    public String obtenerDetalles(){
        //observamos  que ara no repetir codigo podemos utilizar
        //el metodo  del padre y solo agregar a este metodo de la clase hija
        //esto es invocar un metodo sobreescrito
        
        return super.obtenerDetalles() + ", Departamento: " + departemento;
    }

    public String getDepartemento() {
        return departemento;
    }

    public void setDepartemento(String departemento) {
        this.departemento = departemento;
    }
    
}
