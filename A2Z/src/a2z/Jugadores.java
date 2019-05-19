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
    private int vidas;

    public Jugadores(int puntos, int vidas, int coduser, String nombre, Date fecha) {
        super(coduser, nombre, fecha);
        this.puntos = puntos;
        this.vidas = vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    
    
    

  
    
}
