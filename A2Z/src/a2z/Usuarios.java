/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2z;

import java.util.Date;

/**
 *
 * @author marek
 */
public class Usuarios {
    private int coduser;
    private String nombre;
    private Date fecha;

    /**
     *
     * @param coduser
     * @param nombre
     * @param fecha
     */
    public Usuarios(int coduser, String nombre, Date fecha) {
        this.coduser = coduser;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public int getCoduser() {
        return coduser;
    }

    /**
     *
     * @param coduser
     */
    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
