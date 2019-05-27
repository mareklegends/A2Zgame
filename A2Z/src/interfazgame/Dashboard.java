package interfazgame;

import a2z.Jugadores;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Ventana del perfil del usario iniciado
 *
 * @author marcos
 * @version final
 */
public class Dashboard extends javax.swing.JFrame {

    private ArrayList<Jugadores> vJugadorInfo = null;
    private int iduser;
    private int vidas = 0;
    private int puntos = 0;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("A2Z Game");
        this.getContentPane().setBackground(Color.decode("#1f2029"));

        jLabelPuntos.setForeground(Color.decode("#fafafa"));
        jLabelnombreusuario.setForeground(Color.decode("#fafafa"));
        jProgressBarNivel.setBorderPainted(true);
        jProgressBarNivel.setBackground(Color.yellow);

        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.WHITE);

        jButtonvertop.setForeground(Color.BLACK);
        jButtonvertop.setBackground(Color.WHITE);

        jButton2.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);

        jButton3.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);

        vJugadorInfo = bd.conexiones.jugadorInfo(iduser);

        for (int i = 0; i < vJugadorInfo.size(); i++) {
            jLabelnombreusuario.setText(vJugadorInfo.get(i).getNombre().toUpperCase());
            jLabelVidas.setText("Vidas: " + String.valueOf(vJugadorInfo.get(i).getVidas()));
            vidas = vJugadorInfo.get(i).getVidas();
            puntos = vJugadorInfo.get(i).getPuntos();
            break;
        }

        if (puntos < 1000) {
            jProgressBarNivel.setMaximum(1000);
            jProgressBarNivel.setMinimum(0);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 0");
        } else if (puntos >= 1000) {
            jProgressBarNivel.setMaximum(2000);
            jProgressBarNivel.setMinimum(1000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 1");
        } else if (puntos >= 2000) {
            jProgressBarNivel.setMaximum(3000);
            jProgressBarNivel.setMinimum(2000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 2");
        } else if (puntos >= 3000) {
            jProgressBarNivel.setMaximum(4000);
            jProgressBarNivel.setMinimum(3000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 3");
        } else if (puntos >= 4000) {
            jProgressBarNivel.setMaximum(5000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 4");
        } else if (puntos >= 5000) {
            jProgressBarNivel.setMaximum(7000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 5");
        } else if (puntos >= 6000) {
            jProgressBarNivel.setMaximum(7000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 6");
        } else if (puntos >= 7000) {
            jProgressBarNivel.setMaximum(8000);
            jProgressBarNivel.setMinimum(7000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 7");
        } else if (puntos >= 8000) {
            jProgressBarNivel.setMaximum(9000);
            jProgressBarNivel.setMinimum(8000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 8");
        }

    }

    /**
     *
     * @param id_user
     */
    public Dashboard(int id_user) {
        initComponents();
        iduser = id_user;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("A2Z Game");
        this.getContentPane().setBackground(Color.decode("#1f2029"));

        jLabelPuntos.setForeground(Color.decode("#fafafa"));
        jLabelnombreusuario.setForeground(Color.decode("#fafafa"));
        jProgressBarNivel.setBorderPainted(true);
        jProgressBarNivel.setBackground(Color.yellow);

        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.WHITE);

        jButtonvertop.setForeground(Color.BLACK);
        jButtonvertop.setBackground(Color.WHITE);

        jButton2.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);

        jButton3.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);

        vJugadorInfo = bd.conexiones.jugadorInfo(id_user);

        for (int i = 0; i < vJugadorInfo.size(); i++) {
            jLabelnombreusuario.setText(vJugadorInfo.get(i).getNombre().toUpperCase());
            jLabelVidas.setText("Vidas: " + String.valueOf(vJugadorInfo.get(i).getVidas()));
            vidas = vJugadorInfo.get(i).getVidas();
            puntos = vJugadorInfo.get(i).getPuntos();
            break;
        }

        if (puntos < 1000) {
            jProgressBarNivel.setMaximum(1000);
            jProgressBarNivel.setMinimum(0);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 0");
        } else if (puntos >= 1000) {
            jProgressBarNivel.setMaximum(2000);
            jProgressBarNivel.setMinimum(1000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 1");
        } else if (puntos >= 2000) {
            jProgressBarNivel.setMaximum(3000);
            jProgressBarNivel.setMinimum(2000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 2");
        } else if (puntos >= 3000) {
            jProgressBarNivel.setMaximum(4000);
            jProgressBarNivel.setMinimum(3000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 3");
        } else if (puntos >= 4000) {
            jProgressBarNivel.setMaximum(5000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 4");
        } else if (puntos >= 5000) {
            jProgressBarNivel.setMaximum(7000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 5");
        } else if (puntos >= 6000) {
            jProgressBarNivel.setMaximum(7000);
            jProgressBarNivel.setMinimum(6000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 6");
        } else if (puntos >= 7000) {
            jProgressBarNivel.setMaximum(8000);
            jProgressBarNivel.setMinimum(7000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 7");
        } else if (puntos >= 8000) {
            jProgressBarNivel.setMaximum(9000);
            jProgressBarNivel.setMinimum(8000);
            jProgressBarNivel.setValue(puntos);
            jLabelPuntos.setText("Nivel: 8");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelnombreusuario = new javax.swing.JLabel();
        jProgressBarNivel = new javax.swing.JProgressBar();
        jLabelPuntos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelVidas = new javax.swing.JLabel();
        jButtonvertop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelnombreusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelnombreusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelnombreusuario.setText("NombreUsuario");

        jProgressBarNivel.setValue(26);

        jLabelPuntos.setText("Nivel: 0");

        jButton1.setText("J U G A R");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("¿Como jugar?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelVidas.setText("Vidas: 10");
        jLabelVidas.setForeground(Color.decode("#fafafa"));

        jButtonvertop.setText("Ver TOP");
        jButtonvertop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvertopActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a2z/icons8-usuario-100.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabelnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelVidas)
                                .addGap(37, 37, 37)
                                .addComponent(jLabelPuntos))
                            .addComponent(jProgressBarNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonvertop, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelnombreusuario)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntos)
                    .addComponent(jLabelVidas))
                .addGap(18, 18, 18)
                .addComponent(jProgressBarNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonvertop))
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (vidas == 0) {
            JOptionPane.showMessageDialog(null, "No tienes vidas para poder jugar");
        } else {
            System.out.println("Dashboard: " + iduser);
            Ruleta r = new Ruleta(iduser);
            r.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonvertopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvertopActionPerformed
        // TODO add your handling code here:
        Top t = new Top(iduser);
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonvertopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:       
        String comojugar = pdf.magia.pdfReglas();
        pdf.magia.abrirPDF(comojugar);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonvertop;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JLabel jLabelVidas;
    private javax.swing.JLabel jLabelnombreusuario;
    private javax.swing.JProgressBar jProgressBarNivel;
    // End of variables declaration//GEN-END:variables
}
