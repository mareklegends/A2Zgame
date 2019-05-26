package pdf;

import a2z.Jugadores;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 * Clase para generar los pdf de la aplicacion
 *
 * @author marcos
 * @version final
 */
public class magia {

    /**
     * DEvuel un string con el nombre del pdf de las reglas
     *
     * @return string
     */
    public static String pdfReglas() {
        String nombrepdf = "comojugar";
        return nombrepdf;
    }

    /**
     * Crea el pdf con el top de jugadores actualmente
     *
     * @return string
     */
    public static String crearPDFtopjugadores() {

        ArrayList<Jugadores> vJugadores = bd.conexiones.topJugadores();

        String nombrepdf = "topjugadoresA2Z";
        File f = new File(nombrepdf + ".pdf");
        FileOutputStream archivo = null;
        Document doc = null;
        int contador = 0;

        if (f.exists()) {
            f.delete();
        }

        try {
            archivo = new FileOutputStream(f);
            doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph("Top Jugadores A2Z"));
            doc.add(new Paragraph("_______________________________"));
            doc.add(new Paragraph("Posición / Nombre / Puntos"));
            doc.add(new Paragraph("------- ------ ------"));
            for (int i = 0; i < vJugadores.size(); i++) {
                String datos = "";
                datos = "" + i + " - " + vJugadores.get(i).getNombre() + " " + vJugadores.get(i).getPuntos() + "";
                doc.add(new Paragraph(datos));
                doc.add(new Paragraph("------- ------ ------"));
            }
            doc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(magia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(magia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nombrepdf;
    }

    /**
     * Ejecuta los pdf
     *
     * @param nombrepdf
     */
    public static void abrirPDF(String nombrepdf) {
        try {
            File f = new File(nombrepdf + ".pdf");
            Desktop.getDesktop().open(f);
        } catch (Exception e) {
            System.out.println("Error al abrir el pdf");
        }
    }

}
