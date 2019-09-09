import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {

        Empleado  empleado1 = new Empleado("Gio",500000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Test Bosa");
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);

        cliente1.setNombre("Andres");
        cliente1.setEdad(25);
        cliente1.setGenero('M');
        cliente1.setDireccion("asegundo test bosa");
        System.out.println("cliente1 = " + cliente1);

    }

}
