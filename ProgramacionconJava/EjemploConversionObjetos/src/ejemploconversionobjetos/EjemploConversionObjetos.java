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
public class EjemploConversionObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos un tipo d ela mas alta jerarquia
        
        Empleado empleado;
        
        //Asignamos una referencia de un objeto  de menor jerarquia
        //Esto es upcasting , no hay nescesidad de  una nitacion especial
        
        empleado = new Escritor("Gio", 14000000, TipoEscritura.CLASICO);
        
        // sin embargo si queremos acceder al detalle de la clase Escritor
        //No e sposible, ya que esas caracteristicas no estan en comun
        //Entre todas las clases de la jerarquia de clases
        //emp.getTipoDeEscrituraEnTexto();
        
        //Imprimimos los detalles en un metodo geerico
        imprimirDetalles(empleado);
        //2. podemos  hacer lo mismo on la clase gerente
        //esto e supcasting, pollo que no requiere sintaxis especial
        
        empleado = new Gerente("Adri", 200000, "Administracion");
        
        //Pero si queremos  acceder directo por la variable empleado
        //al detalle del objeto Gerente no e sposible, se ppierde el acceso
        //empleado.getDepartamento();
         imprimirDetalles(empleado);
        
    }
   //Metodo generico para imprimir los detalles de la jerarquia Empleados 

    private static void imprimirDetalles (Empleado empleado){
      
        
        
        String resultado = null;
        
        //Imprimir detalles es general apra todos ya que es por polimorfismo
        //NO se nescesita ninguna conversion
        
        System.out.println("\n Detalles:" + empleado.obtenerDetalles());
        
        //pero para los detalles de clada clase debemos hacer un downasting
        
        if (empleado instanceof Escritor){
            
            //COnvertimos el objeto al  tipo inferior deseado
            //convierte objeto - Downcasting
            
            Escritor escritor =(Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la clase Escritor 
            
            resultado = escritor.getTipoDeEscrituraEnTexto();
            //otra forma es hacer la conversion en la misma linea de codigo ,
            //esto es muy comun encontrarlo en java 
            //para evitar la creaion de varables inescesarias
            resultado =((Escritor) empleado).tipoEscritura.getDescripcion();
            
            System.out.println("resultad tipo escritura" + resultado);
                    
        }else if (empleado instanceof Gerente){
            
            //Hacemos el Downcasting en la misma linea de codigo
            //nos ahorramos una variable
            
            resultado = ((Gerente)empleado).getDepartamento();
            
            System.out.println("resultado departamento: "+ resultado);
        }
    }
    
    
}
