/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;

/**
 *
 * @author alumno
 */
public class magia {

    // https://www.youtube.com/watch?v=DezkSACVG_w
    //el video de yt para el tutorial
    
        public static String pdfReglas() {
        String nombrepdf = "comojugar";
        return nombrepdf;
    }
    
    
    
    public static String crearPDFtopjugadores() {
        String nombrepdf = "topjugadoresA2Z";
        File f = new File(nombrepdf + ".pdf");
        FileOutputStream archivo = null;
        
        if (f.exists()) {
            f.delete();
        }
        
        try {
            archivo = new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(magia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nombrepdf;
    }

    public static void abrirPDF(String nombrepdf) {
        try {
            File f = new File(nombrepdf + ".pdf");
            Desktop.getDesktop().open(f);
        } catch (Exception e) {
            System.out.println("error al abrir el pdf");
        }
    }
}
