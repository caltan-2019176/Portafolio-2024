/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosaltan.vistas;

import java.util.ArrayList;
import java.util.Date;
import org.carlosaltan.controlador.ControladorCompra;
import org.carlosaltan.modelo.ModeloCliente;
import org.carlosaltan.modelo.ModeloCompra;
import org.carlosaltan.modelo.ModeloMarca;
import org.carlosaltan.modelo.ModeloProducto;


/**
 *
 * @author Carlos Altán
 */
public class VistaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCompra
     */
    public VistaCompra() {
        initComponents();
        llenarProduc(); 
        llenarCli();
    }
    
     public void llenarProduc(){
         ControladorCompra prod = new ControladorCompra(); 
        ArrayList<ModeloProducto> listaMarc = prod.getProducto(); 
        jComboBox1.removeAllItems();
        for (int i = 0; i < listaMarc.size(); i++){
            jComboBox1.addItem(new ModeloProducto(listaMarc.get(i).getIdProducto(), listaMarc.get(i).getProducto(), listaMarc.get(i).getPrecio()));
        }  
    }
     
      public void llenarCli(){
         ControladorCompra prod = new ControladorCompra(); 
        ArrayList<ModeloCliente> listaCli = prod.getCliente(); 
        jComboBox2.removeAllItems();
        for (int i = 0; i < listaCli.size(); i++){
            jComboBox2.addItem(new ModeloCliente(listaCli.get(i).getId_cliente(), listaCli.get(i).getNombre(), listaCli.get(i).getApellido()));
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-d"); // NOI18N

        jLabel1.setText("NIT");

        jLabel2.setText("Fecha ");

        jLabel3.setText("Producto");

        jLabel4.setText("Cliente");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap(560, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 395, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModeloCompra cliente = new ModeloCompra(); 
        
        try {
            Date date = jDateChooser1.getDate(); 
            long d = date.getTime(); 
            java.sql.Date fecha = new java.sql.Date(d); 
            
            
            float precio = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getPrecio();
            cliente.setId_cliente(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getId_cliente());
            cliente.setPrecio(precio);
            cliente.setFechaEntrega(fecha.toString());
            cliente.setNit(jTextField1.getText());
            cliente.setIdProducto(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getIdProducto());
            ControladorCompra controlador = new ControladorCompra(); 
            controlador.insertarProducto(cliente);
        } catch (Exception e) {
        } finally {
            
            jTextField1.setText("");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
            this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<ModeloProducto> jComboBox1;
    private javax.swing.JComboBox<ModeloCliente> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
