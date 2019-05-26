
package a2z;

/**
 * Clase para decir que usarios y que preguntas tienen acertadas
 * @author marcos
 * @version final
 */
public class Juego {
    private Usuarios u;
    private Preguntas p;

    /**
     * Constructor con un objeto de usarios y otro de preguntas
     * @param u
     * @param p
     */
    public Juego(Usuarios u, Preguntas p) {
        this.u = new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
        this.p = new Preguntas(p.getCodpregunta(), p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());
    }

    /**
     * Devuelve un objeto de usuarios de la clase juego
     * @return devuelve un objeto de usario
     */
    public Usuarios getU() {
        return new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
    }

    /**
     * Añade un objeto de usarios a la clase juego
     * @param u
     */
    public void setU(Usuarios u) {
        this.u = new Usuarios(u.getCoduser(), u.getNombre(), u.getFecha());
    }

    /**
     * Devuelve un objeto de preguntas de la clase juego
     * @return devuelve un objeto de preguntas
     */
    public Preguntas getP() {
        return new Preguntas(p.getCodpregunta(),  p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());
    }

    /**
     * Añade un objeto de preguntas a la clase juego
     * @param p
     */
    public void setP(Preguntas p) {
        this.p = new Preguntas(p.getCodpregunta(),  p.getPregunta(), p.getP1(), p.getP2(), p.getP3(), p.getPbuena(), p.getCat());;
    }
    
    
    
}
