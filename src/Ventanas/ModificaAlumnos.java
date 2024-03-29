/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Admon.Alumnos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Andres
 */
public class ModificaAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form ModificaAlumnos
     */
    public ModificaAlumnos() {
        initComponents();
        
        TXTESCUELAPROCEDE.setEnabled(false);
        TXTIDPERSONA.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTESCUELAPROCEDE = new javax.swing.JTextField();
        TXTIDPERSONA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTNUMCONTROL = new javax.swing.JTextField();
        BTNBUSCAR = new javax.swing.JButton();
        BTNBACK = new javax.swing.JButton();
        BTNMODIFICAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TXTESCUELAPROCEDE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTESCUELAPROCEDEKeyTyped(evt);
            }
        });

        TXTIDPERSONA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTIDPERSONAKeyTyped(evt);
            }
        });

        jLabel2.setText("NUM-CONTROL:");

        jLabel3.setText("ESCUELA PROCEDENTE:");

        jLabel4.setText("ID PERSONA:");

        TXTNUMCONTROL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNUMCONTROLKeyTyped(evt);
            }
        });

        BTNBUSCAR.setText("Buscar");
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });

        BTNBACK.setText("REGRESAR ");
        BTNBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBACKActionPerformed(evt);
            }
        });

        BTNMODIFICAR.setText("MODIFICAR");
        BTNMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODIFICARActionPerformed(evt);
            }
        });

        jLabel5.setText("MODIFICA ALUMNOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNMODIFICAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNBACK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNUMCONTROL)
                                    .addComponent(TXTESCUELAPROCEDE)
                                    .addComponent(TXTIDPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(BTNBUSCAR)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNBUSCAR)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTNUMCONTROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXTESCUELAPROCEDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TXTIDPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNBACK)
                    .addComponent(BTNMODIFICAR))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectou2bd?"+"user=root&password=jaime");

            PreparedStatement ps;
            int id = Integer.parseInt(TXTNUMCONTROL.getText());
            String busca = "select * from alumnos WHERE numcontrol=" + id;
            ps = (PreparedStatement) connect.prepareStatement(busca);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            TXTESCUELAPROCEDE.setText(rs.getString("escuelaprocede"));
            TXTIDPERSONA.setText(rs.getString("idpersona"));
            ps.close();
            rs.close();
           
        TXTESCUELAPROCEDE.setEnabled(true);
        TXTIDPERSONA.setEnabled(true);

        } catch (ClassNotFoundException |SQLException ex) {
            JOptionPane.showMessageDialog(null, "El No. de Control que introduciste no existe");
          

        } 
    }//GEN-LAST:event_BTNBUSCARActionPerformed

    private void BTNBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBACKActionPerformed
        Alumnos obj= new Alumnos();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BTNBACKActionPerformed

    private void BTNMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODIFICARActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectou2bd?"+"user=root&password=jaime");
            String actualiza= "Update alumnos set"
            + " numcontrol = "+ TXTNUMCONTROL.getText()
            + ", escuelaprocede = '"+ TXTESCUELAPROCEDE.getText()
            + "', idpersona = "+ TXTIDPERSONA.getText()
            + " where numcontrol = "+ TXTNUMCONTROL.getText();
            System.out.println(actualiza);
            PreparedStatement ps1;
            ps1= (PreparedStatement) connect.prepareStatement(actualiza);
            ps1.execute();
            ps1.close();
            connect.close();
            JOptionPane.showMessageDialog(null, "se realizaron los cambios");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("error");
        }
    }//GEN-LAST:event_BTNMODIFICARActionPerformed

    private void TXTNUMCONTROLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNUMCONTROLKeyTyped
char c= evt.getKeyChar();
if (c<'0'|| c>'9')evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNUMCONTROLKeyTyped

    private void TXTIDPERSONAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIDPERSONAKeyTyped
char c= evt.getKeyChar();
if (c<'0'|| c>'9')evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDPERSONAKeyTyped

    private void TXTESCUELAPROCEDEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTESCUELAPROCEDEKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTESCUELAPROCEDEKeyTyped

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
            java.util.logging.Logger.getLogger(ModificaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBACK;
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton BTNMODIFICAR;
    private javax.swing.JTextField TXTESCUELAPROCEDE;
    private javax.swing.JTextField TXTIDPERSONA;
    private javax.swing.JTextField TXTNUMCONTROL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
