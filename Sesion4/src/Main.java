public class Main {

// lo comentado hace referencia a la seccion this
    public static void main(String[] args) {
        // declaracion de objetos

        Persona persona1 = new Persona("Gio");
        Persona persona2 =  persona1;

        System.out.println("Objeto1  = " + persona1.obtenerNombre());

        System.out.println("Objeto 2 = " + persona2.obtenerNombre());
        //hacemos que  el objeto 1 ya no apunte al objeto

        persona1 = null;

        System.gc();

        if (persona1!=null) {
            System.out.println("Objeto1 = " + persona1.obtenerNombre());
        }
    }

}
class Persona{

    String nombre;

    Persona(String nombre){

        this.nombre = nombre;
       /* //imprimir objeto
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);// this contiene la referencia al objeto persona

        */


    }

    public String obtenerNombre(){

        return  this.nombre;
    }

}

class Imprimir{

    public  void imprimir (Persona p){
/*
        System.out.println("Impresion Argumento = " + p);// valor  objeto persona
        System.out.println("objeto actual (this) = " + this);// apunta  a un objeto de tipo imprimir

 */


    }

}