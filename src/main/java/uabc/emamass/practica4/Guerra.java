/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uabc.emamass.practica4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon.*;
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class Guerra extends javax.swing.JFrame {
    
    Jugador j1;
    Jugador j2;
    int checkGuerra;
    int ronda;
    int MAX;
    Jugador centroJ1;
    Jugador centroJ2;
    /**
     * Creates new form Guerra
     */
    public Guerra() {
        initComponents();
        j1 = new Jugador();
        j2 = new Jugador();
        checkGuerra = 0;
        ronda = 0;
        MAX = 20; 
        centroJ1 = new Jugador();
        centroJ2 = new Jugador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ContadorRonda = new javax.swing.JLabel();
        TextoCentro = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        LanzarJ1 = new javax.swing.JButton();
        LanzarJ2 = new javax.swing.JButton();
        MensajeFin = new javax.swing.JLabel();
        CartaSecJ1 = new javax.swing.JButton();
        CartaPrincipalJ1 = new javax.swing.JButton();
        CartaSecJ2 = new javax.swing.JButton();
        CartaPrincipalJ2 = new javax.swing.JButton();
        CartaCentroJ1 = new javax.swing.JButton();
        CartaCentroJ2 = new javax.swing.JButton();
        SimboloGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setText("Jugador 1:");

        jLabel2.setText("Jugador 2:");

        jLabel3.setText("GUERRA");

        jLabel4.setText("Ronda:");

        ContadorRonda.setText("0");

        TextoCentro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoCentro.setText("¡¡ GUERRA !!  ");

        Inicio.setText("Empezar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        LanzarJ1.setText("Lanzar Tarjeta");
        LanzarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanzarJ1ActionPerformed(evt);
            }
        });

        LanzarJ2.setText("Lanzar Tarjeta");
        LanzarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanzarJ2ActionPerformed(evt);
            }
        });

        MensajeFin.setText("MENSAJE DE VICTORIA");

        CartaSecJ1.setToolTipText("");
        CartaSecJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaSecJ1ActionPerformed(evt);
            }
        });

        CartaSecJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaSecJ2ActionPerformed(evt);
            }
        });

        CartaPrincipalJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaPrincipalJ2ActionPerformed(evt);
            }
        });

        CartaCentroJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaCentroJ1ActionPerformed(evt);
            }
        });

        CartaCentroJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaCentroJ2ActionPerformed(evt);
            }
        });

        SimboloGanador.setText(">");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ContadorRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(8, 8, 8))))
                    .addComponent(Inicio))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CartaCentroJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SimboloGanador)
                        .addGap(18, 18, 18)
                        .addComponent(CartaCentroJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(CartaPrincipalJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CartaSecJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LanzarJ1))
                    .addComponent(TextoCentro)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(CartaSecJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CartaPrincipalJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LanzarJ2))
                    .addComponent(MensajeFin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ContadorRonda)))
                    .addComponent(LanzarJ2)
                    .addComponent(CartaSecJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(CartaPrincipalJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(TextoCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Inicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CartaCentroJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(CartaCentroJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SimboloGanador)
                                .addGap(53, 53, 53)))
                        .addGap(8, 8, 8)
                        .addComponent(MensajeFin)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CartaSecJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CartaPrincipalJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LanzarJ1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // Inicio de Juego/Algoritmo para generar la baraja y repartirlo a los jugadores
        int i = 2;
        String color = "";
        j1 = new Jugador();
        j2 = new Jugador();
        ArrayList<Carta> baraja = new ArrayList<>();
        for(int x = 1; x <= 4; x++){
            switch(x){
                case 1 -> color = "Pica";
                case 2 -> color = "Trebol";
                case 3 -> color = "Corazon";
                case 4 -> color = "Diamante";
            }
            for(i = 2; i <= 14; i++){
                baraja.add(new Carta(i,color));
            }
        }
        Collections.shuffle(baraja);
        for(i = 1; i <= 26; i++){
            j1.insertaInicio(baraja.remove(0));
            j2.insertaInicio(baraja.remove(0));
        }
        Inicio.setEnabled(false);
        LanzarJ1.setEnabled(true);
        LanzarJ2.setEnabled(true);
        CartaPrincipalJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayingCards/Cards/J1.png")));
        CartaPrincipalJ1.setVisible(true);
        CartaPrincipalJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayingCards/Cards/J2.png")));
        CartaPrincipalJ2.setVisible(true);
        ronda = 0;
        //Carta Principal J1 y J2 metodo para poner foto de baraja. 
    }//GEN-LAST:event_InicioActionPerformed

    private void LanzarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzarJ2ActionPerformed
        // TODO add your handling code here:
        if(j1.isEmpty() != false && j2.isEmpty() != false){
                MensajeFin.setEnabled(true);
                LanzarJ1.setEnabled(false);
                LanzarJ2.setEnabled(false);
                Inicio.setEnabled(true);
                if(j1.isEmpty() == true){
                    MensajeFin.setText("El ganador es el jugador 2!");
                } else{
                    MensajeFin.setText("El ganador es el jugador 1!");
                }
            } else if(ronda > MAX){
                MensajeFin.setEnabled(true);
                LanzarJ1.setEnabled(false);
                LanzarJ2.setEnabled(false);
                Inicio.setEnabled(true);
                MensajeFin.setText("Empate, maxima cantidad de rondas");
            } else{
                ronda++;
                
            }
    }//GEN-LAST:event_LanzarJ2ActionPerformed

    private void CartaSecJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaSecJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaSecJ1ActionPerformed

    private void CartaSecJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaSecJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaSecJ2ActionPerformed

    private void CartaPrincipalJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaPrincipalJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaPrincipalJ2ActionPerformed

    private void CartaCentroJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaCentroJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaCentroJ1ActionPerformed

    private void CartaCentroJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaCentroJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaCentroJ2ActionPerformed

    private void LanzarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzarJ1ActionPerformed
        // TODO add your handling code here:
             /* if(j1.isEmpty() != false && j2.isEmpty() != false){
                MensajeFin.setEnabled(true);
                LanzarJ1.setEnabled(false);
                LanzarJ2.setEnabled(false);
                Inicio.setEnabled(true);
                if(j1.isEmpty() == true){
                    MensajeFin.setText("El ganador es el jugador 2!");
                } else{
                    MensajeFin.setText("El ganador es el jugador 1!");
                }
            } else if(ronda > MAX){
                MensajeFin.setEnabled(true);
                LanzarJ1.setEnabled(false);
                LanzarJ2.setEnabled(false);
                Inicio.setEnabled(true);
                MensajeFin.setText("Empate, maxima cantidad de rondas");
            } else{
                ronda++;
                //Mandar Carta del J1 al CartaCentroJ1, desplegar carta, revisar si tiene carta igual el oponente para GUERRA!
                //Caso 1 Mandar Carta a Centro, esperar al siguiente Jugador
                
                //Caso 2 Mandar Carta a Centro, revisar y comparar cartas, ganador se lleva a su Secundario
                
                //Caso 3 Mandar Carta a Centro, revisar y comparar cartas, GUERRA, llenar condicion para guerra y forzar jugadores lanzar 4 cartas. (
            } */
             /*
            CartaCentroJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayingCards/Cards/2Corazonprueba.png")));
            CartaCentroJ1.setVisible(true);
            CartaCentroJ1.setEnabled(true);
            */ //Ejemplo para fotos, necesita el enable para tener color
    }//GEN-LAST:event_LanzarJ1ActionPerformed

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
            java.util.logging.Logger.getLogger(Guerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guerra().setVisible(true);
                LanzarJ1.setEnabled(false);
                LanzarJ2.setEnabled(false);
                TextoCentro.setVisible(false);
                MensajeFin.setVisible(false);
                CartaCentroJ1.setEnabled(false);
                CartaCentroJ1.setVisible(false);
                CartaSecJ1.setEnabled(false);
                CartaSecJ1.setVisible(false);
                CartaPrincipalJ1.setEnabled(false);
                CartaPrincipalJ1.setVisible(false);
                CartaCentroJ2.setEnabled(false);
                CartaCentroJ2.setVisible(false);
                CartaSecJ2.setEnabled(false);
                CartaSecJ2.setVisible(false);
                CartaPrincipalJ2.setEnabled(false);
                CartaPrincipalJ2.setVisible(false);
                SimboloGanador.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton CartaCentroJ1;
    private static javax.swing.JButton CartaCentroJ2;
    private static javax.swing.JButton CartaPrincipalJ1;
    private static javax.swing.JButton CartaPrincipalJ2;
    private static javax.swing.JButton CartaSecJ1;
    private static javax.swing.JButton CartaSecJ2;
    private javax.swing.JLabel ContadorRonda;
    private static javax.swing.JButton Inicio;
    private static javax.swing.JButton LanzarJ1;
    private static javax.swing.JButton LanzarJ2;
    private static javax.swing.JLabel MensajeFin;
    private static javax.swing.JLabel SimboloGanador;
    private static javax.swing.JLabel TextoCentro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
