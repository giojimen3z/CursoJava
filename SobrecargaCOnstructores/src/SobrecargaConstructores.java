public class SobrecargaConstructores {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Adriana", 22);
        System.out.println("persona1 = " + persona1);
        
        
        Empleado empleado1 = new Empleado("Pedro",33,500000);
        System.out.println("empleado1 = " + empleado1);
        
    }

}
