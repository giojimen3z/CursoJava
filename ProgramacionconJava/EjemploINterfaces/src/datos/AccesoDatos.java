/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author GIo
 */
public interface AccesoDatos {
    
    public static  int MAX_REGISTROS  = 10;
    public abstract void insertar();
    public abstract void listar();
    
}
