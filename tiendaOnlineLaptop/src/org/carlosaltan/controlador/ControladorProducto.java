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
import org.carlosaltan.modelo.ModeloMarca;
import org.carlosaltan.modelo.ModeloProducto;

/**
 *
 * @author Carlos Altán 
 */
public class ControladorProducto {
    
    /**
     * Metodo para insertar producto 
     * @param producto objeto ModeloProducto 
     */
    public void insertarProducto (ModeloProducto producto){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertarProducto(?, ?, ?, ?, ?);");                           
                sentencia.setString(1, producto.getProducto()); 
                sentencia.setFloat(2, producto.getPrecio());
                sentencia.setInt(3, producto.getIdMarca());
                sentencia.setString(4, producto.getModelo());
                sentencia.setBoolean(5, producto.getEstadoProdu());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
               

        } catch (HeadlessException | SQLException e) {
        }
        
    }
    /**
     * Metodo para actualizarProducto 
     * @param producto Objeto ModeloProducto 
     */
      public void actualizarProducto (ModeloProducto producto){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarProduc(?, ?, ?, ?, ?);");     
                sentencia.setInt(1, producto.getIdProducto());
                sentencia.setString(2, producto.getProducto()); 
                sentencia.setFloat(3, producto.getPrecio());
                sentencia.setInt(4, producto.getIdMarca());
                sentencia.setString(5, producto.getModelo());
                
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Actualizado :)");
               

        } catch (HeadlessException | SQLException e) {
        }
      }
      /**
       * Metodo para eliminar producto 
       * @param producto objeto de tipo ModeloProducto 
       */
      public void eliminarProduc (ModeloProducto producto){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarProduc(?, ?);");     
                sentencia.setInt(1, producto.getIdProducto());
                sentencia.setBoolean(2, producto.getEstadoProdu()); 
               
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Eliminado :)");
               

        } catch (HeadlessException | SQLException e) {
        }
      }
      
      /**
       * Metod para llenar el jcombo box de marca
       * @return arrays list de marca 
       */
       public ArrayList<ModeloMarca> getMarca(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloMarca> listaMarc = new ArrayList<ModeloMarca>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("select *from tbl_marca"); 
            while (rs.next()) {                
                ModeloMarca dep = new ModeloMarca(); 
                dep.setId_marca(rs.getInt("id_marca"));
                dep.setMarca(rs.getString("marca"));
                listaMarc.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaMarc; 
    }
      
    }
    
    
    
    
    
    

