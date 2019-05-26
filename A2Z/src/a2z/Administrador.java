package a2z;

import java.util.Date;

/**
 * Clase para los usuarios que son administrador de A2Z
 * @author marek
 * version final
 */
public final class Administrador extends Usuarios{
    private int rango;

    /**
     * Constructor para agregar administradores
     * @param rango
     * @param coduser
     * @param nombre
     * @param fecha
     */
    public Administrador(int rango, int coduser, String nombre, Date fecha) {
        super(coduser, nombre, fecha);
        this.rango = rango;
    }

    /**
     * Devuelve el rango del administrador
     * @return devuelve una variable int con el rango del administrador
     */
    public int getRango() {
        return rango;
    }

    /**
     * Funcion para poder cambiar el rango a un administrador
     * @param rango
     */
    public void setRango(int rango) {
        this.rango = rango;
    }
    
    
    
}
