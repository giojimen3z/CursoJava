/**
 * Derechos reservados por mi
 */
package ejemplojavadoc;

import com.gm.javadoc.*;

/**
 * calde para probar el concerpto de javadocs
 * @author JimenezJai
 * @version: 1.0
 */
public class EjemploJavaDoc {
    /**
     *  Metodo que ejecuta la prueba de la clase aritmetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        int resultado =  new Aritmetica(4,5).sumar();

        System.out.println("resultado = " + resultado);

    }
}
