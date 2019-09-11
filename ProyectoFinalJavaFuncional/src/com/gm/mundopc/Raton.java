package com.gm.mundopc;

public class Raton  extends DispositivosEntrada{

    private int idRaton;
    private static int contadorRatones;

    //constructor Sobrecargado con las variables  de la  clase que hereda


    public Raton (String tipoEntrada, String marca){

        super(tipoEntrada,marca);

        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' + ", "+ super.toString();
    }
}
