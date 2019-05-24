/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2z;

/**
 *
 * @author marek
 */
public class Juego {
    private Usuarios u;
    private Preguntas p;

    /**
     *
     * @param u
     * @param p
     */
    public Juego(Usuarios u, Preguntas p) {
        this.u = new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
        this.p = new Preguntas(p.getCodpregunta(), p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());
    }

    /**
     *
     * @return
     */
    public Usuarios getU() {
        return new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
    }

    /**
     *
     * @param u
     */
    public void setU(Usuarios u) {
        this.u = new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
    }

    /**
     *
     * @return
     */
    public Preguntas getP() {
        return new Preguntas(p.getCodpregunta(),  p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());
    }

    /**
     *
     * @param p
     */
    public void setP(Preguntas p) {
        this.p = new Preguntas(p.getCodpregunta(),  p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());;
    }
    
    
    
}
