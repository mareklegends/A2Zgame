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
public class Preguntas {
    private int codpregunta;
    private String p1;
    private String p2;
    private String p3;
    private int pbuena;
    private String cat;

    public Preguntas(int codpregunta, String p1, String p2, String p3, int pbuena, String cat) {
        this.codpregunta = codpregunta;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.pbuena = pbuena;
        this.cat = cat;
    }

    public int getCodpregunta() {
        return codpregunta;
    }

    public void setCodpregunta(int codpregunta) {
        this.codpregunta = codpregunta;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public int getPbuena() {
        return pbuena;
    }

    public void setPbuena(int pbuena) {
        this.pbuena = pbuena;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
    
}
