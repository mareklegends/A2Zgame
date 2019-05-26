
package a2z;

/**
 * Clase para guardar la informacion de las preguntas
 * @author marek
 * @version final
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
     * Constructor para añadir preguntas
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
     * Devuelve el codigo de la pregunta
     * @return int con el codigo de la pregunta
     */
    public int getCodpregunta() {
        return codpregunta;
    }

    /**
     * Cambiar el codigo de la pregunta
     * @param codpregunta
     */
    public void setCodpregunta(int codpregunta) {
        this.codpregunta = codpregunta;
    }

    /**
     * Devuelve la pregunta
     * @return string con la pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Cambiar la pregunta
     * @param pregunta
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Devuelve la respuesta 1 de la pregunta
     * @return string con la respuesta 1
     */
    public String getP1() {
        return p1;
    }

    /**
     * Cambiar la respuesta 1
     * @param p1
     */
    public void setP1(String p1) {
        this.p1 = p1;
    }

    /**
     * Devuelve la respuesta 2 de la pregunta
     * @return string con la respuesta 2
     */
    public String getP2() {
        return p2;
    }

    /**
     * Cambiar la respuesta 2
     * @param p2
     */
    public void setP2(String p2) {
        this.p2 = p2;
    }

    /**
     * Devuelve la respuesta 3 de la pregunta
     * @return string con la respuesta 3
     */
    public String getP3() {
        return p3;
    }

    /**
     * Cambiar la respuesta 3
     * @param p3
     */
    public void setP3(String p3) {
        this.p3 = p3;
    }

    /**
     * Devuelve el numero de la respuesta correcta de la pregunta
     * @return int con el numero de la respuesta correcta
     */
    public int getPbuena() {
        return pbuena;
    }

    /**
     * Cambiar cual es la respuesta buena de la pregunta
     * @param pbuena
     */
    public void setPbuena(int pbuena) {
        this.pbuena = pbuena;
    }

    /**
     * Devuelve la categoria
     * @return string de cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * Cambiar la categorias de una pregunta
     * @param cat
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

 
    
    
}
