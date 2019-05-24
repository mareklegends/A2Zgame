/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2z;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marek
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

        jLabel1 = new javax.swing.JLabel();
        jLabelnombreusuario = new javax.swing.JLabel();
        jProgressBarNivel = new javax.swing.JProgressBar();
        jLabelPuntos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelVidas = new javax.swing.JLabel();
        jButtonvertop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a2z/icons8-usuario-100.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonvertop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelVidas)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPuntos))
                            .addComponent(jProgressBarNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelnombreusuario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPuntos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVidas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBarNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14)
                .addComponent(jButtonvertop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(43, Short.MAX_VALUE))
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
        Top t = new Top();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonvertopActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JLabel jLabelVidas;
    private javax.swing.JLabel jLabelnombreusuario;
    private javax.swing.JProgressBar jProgressBarNivel;
    // End of variables declaration//GEN-END:variables
}
