package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones aritmeticas como sumar restar etc
 *
 * @author Gio
 * @version: 1.0
 *
 */
public class Aritmetica {
    /**
     * Primer opeando
     */
    int operandoA;
    /**
     * Segundo operando
     */
    int opeandoB;

    /**
     * Consturctor vacio de la clase
     */
    public Aritmetica(int opeandoA,int opeandoB){
        /**
         * Se inicializan los atributos operando apra   que el programa funcione
         *
         */
        this.operandoA=opeandoA;
        this.opeandoB=opeandoB;

    }

    /**
     *  Este metodo  permite sumar dos  valores enteros
     * @return int resultado de la suma
     */
    public int sumar(){

        return operandoA+opeandoB;

    }
}
