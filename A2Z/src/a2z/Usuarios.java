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

    public Usuarios(int coduser, String nombre, Date fecha) {
        this.coduser = coduser;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getCoduser() {
        return coduser;
    }

    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
