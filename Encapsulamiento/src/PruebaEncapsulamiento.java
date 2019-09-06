public class PruebaEncapsulamiento {

    public static void main(String[] args) {

        persona persona1 = new persona("Gio","Jimenez",false);

        System.out.println( persona1.getNombre());
        persona1.setNombre("jaime");
        System.out.println(persona1.getNombre());

        System.out.println(persona1);

    }

}
