/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author GIo
 */
public class Escritor extends Empleado{
    
    //Utilizamos una enumeracion para las opciones de tipo d eescritura
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre,double sueldo,TipoEscritura tipoEscritura){
        
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
        
    }
    
    //sobre escribimos el metodo padre
    
    @Override
    public String obtenerDetalles(){
       
        return super.obtenerDetalles()+ ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    public String getTipoDeEscrituraEnTexto(){
        
        return tipoEscritura.getDescripcion();
    }
    
}
