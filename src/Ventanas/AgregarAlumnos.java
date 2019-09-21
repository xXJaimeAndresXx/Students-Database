/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Admon.Alumnos;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Andres
 */
public class AgregarAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAlumnos
     */
    public AgregarAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNBACK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTNUMCONTROL = new javax.swing.JTextField();
        TXTESCUELAPROCEDE = new javax.swing.JTextField();
        TXTIDPERSONA = new javax.swing.JTextField();
        BTNAGREGAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("AGREGAR ALUMNOS");

        jLabel2.setText("NUM-CONTROL:");

        BTNBACK.setText("REGRESAR ");
        BTNBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBACKActionPerformed(evt);
            }
        });

        jLabel3.setText("ESCUELA PROCEDENTE:");

        jLabel4.setText("ID PERSONA:");

        TXTNUMCONTROL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNUMCONTROLKeyTyped(evt);
            }
        });

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

        BTNAGREGAR.setText("AGREGAR");
        BTNAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNUMCONTROL)
                                    .addComponent(TXTESCUELAPROCEDE)
                                    .addComponent(TXTIDPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(BTNAGREGAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel6)))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNBACK)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(79, 79, 79)
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
                    .addComponent(TXTIDPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(BTNAGREGAR)
                .addGap(33, 33, 33)
                .addComponent(BTNBACK))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBACKActionPerformed
        Alumnos obj= new Alumnos();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BTNBACKActionPerformed

    private void BTNAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAGREGARActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectou2bd?"+"user=root&password=jaime");
            
            String agrega="insert alumnos values (default, "+ TXTNUMCONTROL.getText()+", '"+ TXTESCUELAPROCEDE.getText()+"', "+TXTIDPERSONA.getText()+" )";
            PreparedStatement ps2;
            ps2= (PreparedStatement) connect.prepareStatement(agrega);
            ps2.execute();
            JOptionPane.showMessageDialog(null, "Agregado Correctamente");
        }
        catch(ClassNotFoundException |SQLException ex){
JOptionPane.showMessageDialog(null,"La ID intruducida no existe o el Numero de Control ya existe, consulte \n en la ventana de Alumnos y Personas");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNAGREGARActionPerformed

    private void TXTNUMCONTROLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNUMCONTROLKeyTyped
char c= evt.getKeyChar();
if (c<'0'|| c>'9')evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_TXTNUMCONTROLKeyTyped

    private void TXTIDPERSONAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIDPERSONAKeyTyped
char c= evt.getKeyChar();
if (c<'0'|| c>'9')evt.consume();         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AgregarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAGREGAR;
    private javax.swing.JButton BTNBACK;
    private javax.swing.JTextField TXTESCUELAPROCEDE;
    private javax.swing.JTextField TXTIDPERSONA;
    private javax.swing.JTextField TXTNUMCONTROL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
