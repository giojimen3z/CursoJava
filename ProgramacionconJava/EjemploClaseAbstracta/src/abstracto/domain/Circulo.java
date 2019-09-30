/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author GIo
 */
public class Circulo extends FiguraGeometrica {
    
    
    public Circulo(String tipoFIgura){
        
        super(tipoFIgura);
    }
    
    public void  dibujar(){
        
        //comprtamiento de la subclase
        
        System.out.println("Aqui deberia dibjar un: "+ this.getClass().getSimpleName());
    }
}
