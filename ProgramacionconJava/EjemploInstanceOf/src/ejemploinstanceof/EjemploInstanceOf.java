/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploinstanceof;

/**
 *
 * @author GIo
 */
public class EjemploInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FiguraGeometrica figura;
        figura = new Elipse();
        //Determina el tipo que corresponde a  la jerar quia
        determinarTipo(figura);
        
        System.out.println("\n Todos sus Tipos");
        determinaTodosLosTIpos(figura);
        
    }
    
    public static void determinaTodosLosTIpos(FiguraGeometrica figura){
        
        
        if (figura instanceof Elipse){
            
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if (figura instanceof Circulo){
            
            //Procesa algo particular de la Circulo
            System.out.println("Es un Circulo");
        }
        if (figura instanceof FiguraGeometrica){
            
            //Procesa algo particular de la Figura
            System.out.println("Es una Figura Geometrica");
        }
        if (figura instanceof Object){
            
            //Procesa algo particular de la clase objeto
            System.out.println("Es  un Object");
        }else {
            
            System.out.println("No se encontro el tipo");
        }      
    }
    
    private static void determinarTipo(FiguraGeometrica figura){
        
        if (figura instanceof Elipse){
            
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }else if (figura instanceof Circulo){
            
            //Procesa algo particular de la Circulo
            System.out.println("Es un Circulo");
        }else if (figura instanceof FiguraGeometrica){
            
            //Procesa algo particular de la Figura
            System.out.println("Es una Figura Geometrica");
        }else if (figura instanceof Object){
            
            //Procesa algo particular de la clase objeto
            System.out.println("Es  un Object");
        }else {
            
            System.out.println("No se encontro el tipo");
        }         
    }
}
