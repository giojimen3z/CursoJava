public class main {

    public static void main(String[] args) {
        /*
        * 1.  el paso por valor solo se peude realizar con los tipos primitivos es decir  int, string etc
        * 2.  en caso de nos e runa variable priimitiva  todo sera enviado por  referencia
        * */
        // se crea el objeto
        Metodos persona = new Metodos();
        persona.cambiarNombre("Juan");
        imprimirNombre(persona);
        modificarpersona(persona);
        imprimirNombre(persona);
    }
    public static void imprimirNombre(Metodos p1){

        System.out.println("Valos recibido " + p1.obtenerNombre());

    }

    public static void modificarpersona(Metodos arg){

        arg.cambiarNombre("Carlos");

    }

}
