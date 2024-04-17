/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.carlosaltan.conexion.Conexion;
import org.carlosaltan.modelo.ModeloCliente;
import org.carlosaltan.modelo.ModeloCompra;
import org.carlosaltan.modelo.ModeloProducto;


/**
 *
 * @author carlo
 */
public class ControladorCompra {
    
    /**
     * Metodo para insertar cliente
     * @param cliente objeto de tipo ModeloCompra
     */
    public void insertarProducto (ModeloCompra cliente){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertarCompra(?, ?, ?, ?, ?);");                           
                sentencia.setInt(1, cliente.getId_cliente()); 
                sentencia.setFloat(2, cliente.getPrecio());
                sentencia.setString(3, cliente.getFechaEntrega());
                sentencia.setString(4, cliente.getNit());
                sentencia.setInt(5, cliente.getIdProducto());
                
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
               

        } catch (HeadlessException | SQLException e) {
        }
    }
    
    /**
     * Metodo para llenar jcomboBox
     * @return  arratlist 
     */
       public ArrayList<ModeloProducto> getProducto(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloProducto> listaMarc = new ArrayList<ModeloProducto>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("select *from vista_Producto"); 
            while (rs.next()) {                
                ModeloProducto dep = new ModeloProducto(); 
                dep.setIdProducto(rs.getInt("ID"));
                dep.setProducto(rs.getString("Marca"));
                dep.setPrecio(rs.getFloat("Precio"));
                
                listaMarc.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaMarc; 
    }
      /**
       * Metodo para llenar jcombo box de cliente
       * @return arrylist 
       */
      public ArrayList<ModeloCliente> getCliente(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloCliente> listaCli = new ArrayList<ModeloCliente>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("select *from tbl_cliente"); 
            while (rs.next()) {                
                ModeloCliente dep = new ModeloCliente(); 
                dep.setId_cliente(rs.getInt("id_cliente"));
                dep.setNombre(rs.getString("nombre_cli"));
                dep.setApellido(rs.getString("apellido_cli"));
                
                listaCli.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaCli; 
    }
    
      
    
    
}
