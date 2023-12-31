/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layouts;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author DAM2Alu5
 */
public class JFrameCarLayoutMejorado extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCarLayout
     */
    
    CardLayout cardManager;
    
    
    public JFrameCarLayoutMejorado() {
        initComponents();
        cardManager = new CardLayout();
        jPanelPadre.setLayout(cardManager);
        jPanelPadre.add(jPanelClientes,"Clientes");
        jPanelPadre.add(jPanelVehículos,"Vehículos");
        jPanelPadre.add(jPanelTrabajadores,"Trabajadores");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPadre = new javax.swing.JPanel();
        jPanelClientes = new javax.swing.JPanel();
        JLabelTituloCliente = new javax.swing.JLabel();
        jPanelTrabajadores = new javax.swing.JPanel();
        JLabelTituloTrabajadores = new javax.swing.JLabel();
        jPanelVehículos = new javax.swing.JPanel();
        JLabelTituloCliente1 = new javax.swing.JLabel();
        jPanelBarraBotones = new javax.swing.JPanel();
        jButtonPrimero = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonTrabajadores = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonÚltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPadre.setBackground(new java.awt.Color(102, 255, 204));
        jPanelPadre.setLayout(new java.awt.CardLayout());

        jPanelClientes.setBackground(new java.awt.Color(255, 255, 102));

        JLabelTituloCliente.setBackground(new java.awt.Color(0, 255, 204));
        JLabelTituloCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLabelTituloCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTituloCliente.setText("Clientes");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JLabelTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelClientes, "card2");

        jPanelTrabajadores.setBackground(new java.awt.Color(255, 255, 255));

        JLabelTituloTrabajadores.setBackground(new java.awt.Color(0, 255, 204));
        JLabelTituloTrabajadores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLabelTituloTrabajadores.setForeground(new java.awt.Color(0, 204, 0));
        JLabelTituloTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTituloTrabajadores.setText("Trabajadores");

        javax.swing.GroupLayout jPanelTrabajadoresLayout = new javax.swing.GroupLayout(jPanelTrabajadores);
        jPanelTrabajadores.setLayout(jPanelTrabajadoresLayout);
        jPanelTrabajadoresLayout.setHorizontalGroup(
            jPanelTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JLabelTituloTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanelTrabajadoresLayout.setVerticalGroup(
            jPanelTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelTituloTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelTrabajadores, "card2");

        jPanelVehículos.setBackground(new java.awt.Color(51, 255, 153));

        JLabelTituloCliente1.setBackground(new java.awt.Color(0, 255, 204));
        JLabelTituloCliente1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLabelTituloCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTituloCliente1.setText("Vehículos");

        javax.swing.GroupLayout jPanelVehículosLayout = new javax.swing.GroupLayout(jPanelVehículos);
        jPanelVehículos.setLayout(jPanelVehículosLayout);
        jPanelVehículosLayout.setHorizontalGroup(
            jPanelVehículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehículosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JLabelTituloCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanelVehículosLayout.setVerticalGroup(
            jPanelVehículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehículosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JLabelTituloCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelVehículos, "card2");

        jPanelBarraBotones.setBackground(new java.awt.Color(255, 51, 51));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanelBarraBotones.setLayout(flowLayout1);

        jButtonPrimero.setText("<<");
        jButtonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeroActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonPrimero);

        jButtonAnterior.setText("< ");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonAnterior);

        jButton1.setText("Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButton1);

        jButton2.setText("Coches");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButton2);

        jButtonTrabajadores.setText("Trabajadores");
        jButtonTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrabajadoresActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonTrabajadores);

        jButtonSiguiente.setText("> ");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonSiguiente);

        jButtonÚltimo.setText(">>");
        jButtonÚltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonÚltimoActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonÚltimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBarraBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       cardManager.show(jPanelPadre, "Clientes");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         cardManager.show(jPanelPadre, "Vehículos");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        // TODO add your handling code here:
        cardManager.first(jPanelPadre);
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        cardManager.previous(jPanelPadre);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        cardManager.next(jPanelPadre);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonÚltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonÚltimoActionPerformed
        // TODO add your handling code here:
        cardManager.last(jPanelPadre);
    }//GEN-LAST:event_jButtonÚltimoActionPerformed

    private void jButtonTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrabajadoresActionPerformed
        // TODO add your handling code here:
        
                cardManager.show(jPanelPadre, "Trabajadores");
    }//GEN-LAST:event_jButtonTrabajadoresActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCarLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCarLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCarLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCarLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCarLayoutMejorado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTituloCliente;
    private javax.swing.JLabel JLabelTituloCliente1;
    private javax.swing.JLabel JLabelTituloTrabajadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonTrabajadores;
    private javax.swing.JButton jButtonÚltimo;
    private javax.swing.JPanel jPanelBarraBotones;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelPadre;
    private javax.swing.JPanel jPanelTrabajadores;
    private javax.swing.JPanel jPanelVehículos;
    // End of variables declaration//GEN-END:variables
}
