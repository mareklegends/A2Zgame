
package a2z;

/**
 * Clase para guardar la informacion de las preguntas
 * @author marek
 * @version 26
 */
public class Preguntas {
    private int codpregunta;
    private String pregunta;
    private String p1;
    private String p2;
    private String p3;
    private int pbuena;
    private String cat;

    /**
     *
     * @param codpregunta
     * @param pregunta
     * @param p1
     * @param p2
     * @param p3
     * @param pbuena
     * @param cat
     */
    public Preguntas(int codpregunta, String pregunta, String p1, String p2, String p3, int pbuena, String cat) {
        this.codpregunta = codpregunta;
        this.pregunta = pregunta;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.pbuena = pbuena;
        this.cat = cat;
    }

    /**
     *
     * @return
     */
    public int getCodpregunta() {
        return codpregunta;
    }

    /**
     *
     * @param codpregunta
     */
    public void setCodpregunta(int codpregunta) {
        this.codpregunta = codpregunta;
    }

    /**
     *
     * @return
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     *
     * @param pregunta
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     *
     * @return
     */
    public String getP1() {
        return p1;
    }

    /**
     *
     * @param p1
     */
    public void setP1(String p1) {
        this.p1 = p1;
    }

    /**
     *
     * @return
     */
    public String getP2() {
        return p2;
    }

    /**
     *
     * @param p2
     */
    public void setP2(String p2) {
        this.p2 = p2;
    }

    /**
     *
     * @return
     */
    public String getP3() {
        return p3;
    }

    /**
     *
     * @param p3
     */
    public void setP3(String p3) {
        this.p3 = p3;
    }

    /**
     *
     * @return
     */
    public int getPbuena() {
        return pbuena;
    }

    /**
     *
     * @param pbuena
     */
    public void setPbuena(int pbuena) {
        this.pbuena = pbuena;
    }

    /**
     *
     * @return
     */
    public String getCat() {
        return cat;
    }

    /**
     *
     * @param cat
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

 
    
    
}
