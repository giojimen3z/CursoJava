package ejemplovarargs;

public class Vargargs {

    public static void main(String[] args) {

        // imprimimos varios numeros

        imprimirNumeros(15,20,14,13,1,12,11);
        System.out.println(" ");

        imprimirNumeroForEach(15,20,14,13,1,12,11);
        System.out.println(" ");

        variosParametor("Gio",true,15,20,14,13,1,12,11);

    }

    public static void imprimirNumeros(int... numeros){

        int elemento;
        // se recorre cada elemento
        for (int i=0;i<numeros.length;i++){
            elemento = numeros[i];
            System.out.println("Elemento "+i+ ": "+ elemento);

        }

    }


    public static void imprimirNumeroForEach(int... numeros){

            // usamos for each en lugar de for normal

        for (int numero:numeros){

            System.out.println("El numero es: "+ numero);

        }

    }

    public static void variosParametor(String nombre, boolean valido, int ... numeros){

        System.out.println("nombre = " + nombre);
        System.out.println("valido = " + valido);
        // se usa el foreach
        for ( int numero: numeros ) {
            System.out.println("El numero es: "+ numero);
        }

    }

}
