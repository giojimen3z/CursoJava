package com.gm.ventas;

public class Orden {

    private  int idOrden;
    private Producto [] productos;
    private  static int contadorOrden;
    private  int contadorProductos;
    private static int max_Productos = 10;

    public Orden(){
        this.idOrden = ++contadorOrden;
        productos = new Producto[max_Productos];

    }

    public void  agregarProducto (Producto producto){

            //Si los productos  agregados no superan el maximo de productos
            //agregamos el nuevo productos al arreglo


        if(contadorProductos < max_Productos){

            //Agregamos un nuevo prodicto al arreglo e incrementamos el contador  del producto

            productos[contadorProductos++] = producto;


        }
        else {
            System.out.println("se ha superado el maximo d eproductos: " + max_Productos);
        }

    }

    public double calcularTotal(){

        double total=0;

        for (int i=0; i < contadorProductos;i++){

            total += productos[i].getPrecio();
        }

        return total;

    }
    public void mostrarOrden(){

        System.out.println("Orden #:" +idOrden);
        System.out.println("total de la orden: $"+calcularTotal());
        System.out.println("productos de la orden:");
        for (int i=0; i<contadorProductos;i++){

            System.out.println(productos[i]+"\n");

        }

    }

}
