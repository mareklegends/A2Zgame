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
public final class Administrador extends Usuarios{
    private int rango;

    public Administrador(int rango, int coduser, String nombre, Date fecha) {
        super(coduser, nombre, fecha);
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
    
    
    
}
