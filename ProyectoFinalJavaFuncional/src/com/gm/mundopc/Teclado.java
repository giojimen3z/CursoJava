package com.gm.mundopc;

public class Teclado extends DispositivosEntrada {

    private int idTeclado;
    private static  int contadorTeclados;

    //constructor Sobrecargado con las variables  de la  clase que hereda

    public Teclado(String tipoEntrada,String marca ){

        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +'}'+ ", "+ super.toString();
    }
}
