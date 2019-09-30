/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseabstracta;
import abstracto.domain.*;
/**
 *
 * @author GIo
 */
public class EjemploClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion de objetos
        
        FiguraGeometrica rectangulo  = new Rectangulo("Rectangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        FiguraGeometrica triangulo  = new Triangulo ("triangulo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println(circulo);
        circulo.dibujar();
        
        System.out.println(triangulo);
        triangulo.dibujar();
       
       
                
    }
    
}
