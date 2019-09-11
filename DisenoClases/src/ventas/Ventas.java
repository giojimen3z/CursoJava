package ventas;

import com.gm.ventas.*;
public class Ventas {

    public static void main(String[] args) {

        // Se crean los objetos de tipo producto
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalon",100);

        //Crea objeto de tipo orden

        Orden orden1 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        //imprimir la orden

        orden1.mostrarOrden();

    }
}
