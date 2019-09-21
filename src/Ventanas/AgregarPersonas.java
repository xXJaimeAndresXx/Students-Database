/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Admon.Personas;
import com.mysql.jdbc.MysqlDataTruncation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Andres
 */
public class AgregarPersonas extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPersonas
     */
    public AgregarPersonas() {
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

        TXTNUMEXT = new javax.swing.JTextField();
        BTNAGREGAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNBACK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTNOMBRE = new javax.swing.JTextField();
        TXTAPELLIDOS = new javax.swing.JTextField();
        TXTCALLE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTPOBLACION = new javax.swing.JTextField();
        TXTPAIS = new javax.swing.JTextField();
        TXTFECHANAC = new javax.swing.JTextField();
        TXTCURP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TXTNUMEXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNUMEXTKeyTyped(evt);
            }
        });

        BTNAGREGAR.setText("AGREGAR");
        BTNAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGARActionPerformed(evt);
            }
        });

        jLabel6.setText("AGREGAR PERSONAS");

        jLabel2.setText("NOMBRE:");

        BTNBACK.setText("REGRESAR ");
        BTNBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBACKActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDOS:");

        jLabel4.setText("CALLE");

        jLabel5.setText("NUM.EXT");

        TXTNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNOMBREKeyTyped(evt);
            }
        });

        TXTAPELLIDOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTAPELLIDOSKeyTyped(evt);
            }
        });

        TXTCALLE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCALLEKeyTyped(evt);
            }
        });

        jLabel7.setText("POBLACION:");

        jLabel8.setText("PAIS:");

        jLabel9.setText("FECHA.NAC");

        jLabel10.setText("CURP");

        TXTPOBLACION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPOBLACIONKeyTyped(evt);
            }
        });

        TXTPAIS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPAISKeyTyped(evt);
            }
        });

        TXTFECHANAC.setText("AAAA-MM-DD");
        TXTFECHANAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTFECHANACKeyTyped(evt);
            }
        });

        jLabel1.setText("(año-mes-dia)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTNBACK))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNOMBRE)
                                    .addComponent(TXTAPELLIDOS)
                                    .addComponent(TXTCALLE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNUMEXT)
                                    .addComponent(TXTPOBLACION)
                                    .addComponent(TXTPAIS)
                                    .addComponent(TXTFECHANAC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TXTCURP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(BTNAGREGAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel6)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTAPELLIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTCALLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTNUMEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTPOBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TXTPAIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TXTFECHANAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TXTCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BTNAGREGAR)
                .addGap(61, 61, 61)
                .addComponent(BTNBACK))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAGREGARActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectou2bd?"+"user=root&password=jaime");
            try{
            String agrega="insert into personas values (default, '"+ TXTNOMBRE.getText()+"', '"+ TXTAPELLIDOS.getText()+"', '"+TXTCALLE.getText()+"', "+TXTNUMEXT.getText()+", '"+TXTPOBLACION.getText()+"', '"+TXTPAIS.getText()+"', '"+TXTFECHANAC.getText()+"', '"+TXTCURP.getText()+"' )";
            PreparedStatement ps2;
            ps2= (PreparedStatement) connect.prepareStatement(agrega);
            ps2.execute();
            JOptionPane.showMessageDialog(null, "Agregado Correctamente");
            }catch(MysqlDataTruncation er){
                JOptionPane.showMessageDialog(null,"Introduzca bien la fecha");  
                
            }
            
        }
        catch(ClassNotFoundException |SQLException ex){
JOptionPane.showMessageDialog(null,"La CURP ingresada anteriormente ya existe, pruebe con una nueva");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNAGREGARActionPerformed

    private void BTNBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBACKActionPerformed
        Personas obj= new Personas();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BTNBACKActionPerformed

    private void TXTNOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNOMBREKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNOMBREKeyTyped

    private void TXTAPELLIDOSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTAPELLIDOSKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAPELLIDOSKeyTyped

    private void TXTCALLEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCALLEKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCALLEKeyTyped

    private void TXTPOBLACIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPOBLACIONKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPOBLACIONKeyTyped

    private void TXTPAISKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPAISKeyTyped
char c= evt.getKeyChar();
if ((c<'a'|| c>'z')&& (c<' '||c>' ')&& (c<'A'||c>'Z'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPAISKeyTyped

    private void TXTFECHANACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTFECHANACKeyTyped
char c= evt.getKeyChar();
 if((c<'0' || c>'9') && (c<'-' || c>'/')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFECHANACKeyTyped

    private void TXTNUMEXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNUMEXTKeyTyped
char c= evt.getKeyChar();
if (c<'0'|| c>'9')evt.consume();           // TODO add your handling code here:
    }//GEN-LAST:event_TXTNUMEXTKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAGREGAR;
    private javax.swing.JButton BTNBACK;
    private javax.swing.JTextField TXTAPELLIDOS;
    private javax.swing.JTextField TXTCALLE;
    private javax.swing.JTextField TXTCURP;
    private javax.swing.JTextField TXTFECHANAC;
    private javax.swing.JTextField TXTNOMBRE;
    private javax.swing.JTextField TXTNUMEXT;
    private javax.swing.JTextField TXTPAIS;
    private javax.swing.JTextField TXTPOBLACION;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}