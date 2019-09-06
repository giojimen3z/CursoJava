public class PruebaAritmetica {
    public static void main(String[] args) {

        // variables locales
        int operandoA=6;
        int operandoB=2;

        // Se crea  el objeto   con los aprametros
        Aritmetica operaciones = new Aritmetica(operandoA,operandoB);
        // se imprimen los  valores de  los operando
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        // imprimir resultado d ela suma

        System.out.println("\n Resultado de la suma: "+ operaciones.sumar());

        //imprimir resultado resta
        System.out.println("\n Resultado de la resta: "+ operaciones.restar());

        //imprimir resultado multiplicacion
        System.out.println("\n Resultado de la multiplicacion: "+ operaciones.multiplicar());

        //imprimir resultado division
        System.out.println("\n Resultado de la dicision: "+ operaciones.dividir());


    }
}
