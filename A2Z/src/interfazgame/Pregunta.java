package interfazgame;

import interfazgame.PFallo;
import interfazgame.PAcertada;
import a2z.Preguntas;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 * Ventana que muestra la pregunta
 *
 * @author marcos
 * @version final
 */
public class Pregunta extends javax.swing.JFrame {

    private ArrayList<Preguntas> vPregunta = null;
    private int npreguntabuena = 0;
    private int iduser = 0;
    private int codpregunta = 0;

    /**
     * Creates new form Pregunta
     */
    public Pregunta() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("A2Z Game");
        this.getContentPane().setBackground(Color.decode("#1f2029"));
        jTextArea1.setBackground(Color.decode("#1f2029"));
        jTextArea1.setForeground(Color.decode("#fafafa"));

        jButtonRespuesta1.setForeground(Color.BLACK);
        jButtonRespuesta1.setBackground(Color.WHITE);

        jButtonRespuesta2.setForeground(Color.BLACK);
        jButtonRespuesta2.setBackground(Color.WHITE);

        jButtonRespuesta3.setForeground(Color.BLACK);
        jButtonRespuesta3.setBackground(Color.WHITE);
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jTextArea1.setText("¿Por qué razón “separado” se escribe todo junto y “todo junto” se escribe separado?");
    }

    /**
     *
     * @param id_user
     * @param ncategoria
     */
    public Pregunta(int id_user, String ncategoria) {
        initComponents();
        iduser = id_user;
        this.setResizable(false);
        vPregunta = bd.conexiones.jugarPregunta(id_user, ncategoria);

        for (int i = 0; i < vPregunta.size(); i++) {
            codpregunta = vPregunta.get(i).getCodpregunta();
            jTextArea1.setText(vPregunta.get(i).getPregunta());
            jButtonRespuesta1.setText(vPregunta.get(i).getP1());
            jButtonRespuesta2.setText(vPregunta.get(i).getP2());
            jButtonRespuesta3.setText(vPregunta.get(i).getP3());
            npreguntabuena = vPregunta.get(i).getPbuena();
            break;
        }

        this.setLocationRelativeTo(null);
        this.setTitle("A2Z Game");
        this.getContentPane().setBackground(Color.decode("#1f2029"));
        jTextArea1.setBackground(Color.decode("#1f2029"));
        jTextArea1.setForeground(Color.decode("#fafafa"));

        jButtonRespuesta1.setForeground(Color.BLACK);
        jButtonRespuesta1.setBackground(Color.WHITE);

        jButtonRespuesta2.setForeground(Color.BLACK);
        jButtonRespuesta2.setBackground(Color.WHITE);

        jButtonRespuesta3.setForeground(Color.BLACK);
        jButtonRespuesta3.setBackground(Color.WHITE);
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonRespuesta1 = new javax.swing.JButton();
        jButtonRespuesta2 = new javax.swing.JButton();
        jButtonRespuesta3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButtonRespuesta1.setText("Respuesta 1");
        jButtonRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespuesta1ActionPerformed(evt);
            }
        });

        jButtonRespuesta2.setText("Respuesta 2");
        jButtonRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespuesta2ActionPerformed(evt);
            }
        });

        jButtonRespuesta3.setText("Respuesta 3");
        jButtonRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespuesta3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jButtonRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // tiempo();


    }//GEN-LAST:event_formWindowActivated

    private void jButtonRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespuesta1ActionPerformed
        // TODO add your handling code here:
        if (npreguntabuena == 1) {
            PAcertada pa = new PAcertada(iduser, codpregunta);
            pa.setVisible(true);
            this.dispose();

        } else {
            PFallo pf = new PFallo(iduser);
            pf.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButtonRespuesta1ActionPerformed

    private void jButtonRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespuesta2ActionPerformed
        // TODO add your handling code here:
        if (npreguntabuena == 2) {
            PAcertada pa = new PAcertada(iduser, codpregunta);
            pa.setVisible(true);
            this.dispose();
        } else {
            PFallo pf = new PFallo(iduser);
            pf.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButtonRespuesta2ActionPerformed

    private void jButtonRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespuesta3ActionPerformed
        // TODO add your handling code here:
        if (npreguntabuena == 3) {
            PAcertada pa = new PAcertada(iduser, codpregunta);
            pa.setVisible(true);
            this.dispose();
        } else {
            PFallo pf = new PFallo(iduser);
            pf.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButtonRespuesta3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRespuesta1;
    private javax.swing.JButton jButtonRespuesta2;
    private javax.swing.JButton jButtonRespuesta3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
