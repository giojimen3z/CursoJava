public class SobrecargaMetodos {

    public static void main(String[] args) {

        System.out.println("resultado 1: " + Operaciones.sumar(5,5));
        System.out.println("resultado 2: " + Operaciones.sumar(3.6,4.1));
        System.out.println("resultado 3: " + Operaciones.sumar(8,7.2));
        System.out.println("resultado 4: " + Operaciones.sumar(1.5,40));

        // cualmetodo llamara
        System.out.println("resultado 5: " + Operaciones.sumar(3,40L));

    }
}
