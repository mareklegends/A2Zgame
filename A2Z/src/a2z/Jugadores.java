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
public final class Jugadores extends Usuarios{
    private int puntos;

    public Jugadores(int puntos, int coduser, String nombre, Date fecha) {
        super(coduser, nombre, fecha);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    

  
    
}
