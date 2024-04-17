/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.carlosaltan.conexion.Conexion;
import org.carlosaltan.modelo.ModeloCliente;
import org.carlosaltan.modelo.ModeloUsuario; 

/**
 *
 * @author Carlos Altán
 */
public class ControladorCliente {
    
    
    /**
     * Metodo para ingresar cliente 
     * @param cliente objeto ModeloCliente
     * @param usuario objeto ModeloUsuario
     */
     public void insertarCliente (ModeloCliente cliente, ModeloUsuario usuario){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertarUser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");                           
                sentencia.setString(1, usuario.getUsuario()); 
                sentencia.setString(2, usuario.getContrasena());
                sentencia.setBoolean(3, usuario.isEstado_act());
                sentencia.setBoolean(4, usuario.isRol());
                sentencia.setString(5, cliente.getNombre());
                sentencia.setString(6, cliente.getApellido() );
                sentencia.setString(7, cliente.getTelefono());
                sentencia.setString(8, cliente.getEmail());
                sentencia.setString(9, cliente.getDireccion());
                sentencia.setBoolean(10, cliente.getEstado_act());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
               

        } catch (HeadlessException | SQLException e) {
        }
    }
    /**
     * Metodo para actualizar cliente
     * @param cliente  objeto modeloCliente
     */
     public void actualizarClie (ModeloCliente cliente ){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCli(?, ?, ?, ?, ?, ?, ?);");                           
                sentencia.setInt(1, cliente.getId_cliente()); 
                sentencia.setString(2, cliente.getNombre() );
                sentencia.setString(3, cliente.getApellido());
                sentencia.setString(4, cliente.getTelefono());
                sentencia.setString(5, cliente.getEmail()  );
                sentencia.setString(6, cliente.getDireccion());
                sentencia.setBoolean(7, true);
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ACTUALIZADO :)");
               

        } catch (HeadlessException | SQLException e) {
        }
    }
     /**
      * Metodo para eliminar Cliente
      * @param cliente objeto tipo ModeloCliente
      */
     
     public void eliminarCli (ModeloCliente cliente){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCli(?, ?);");     
                sentencia.setInt(1, cliente.getId_cliente());
                sentencia.setBoolean(2, cliente.getEstado_act()); 
               
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Eliminado :)");
               

        } catch (HeadlessException | SQLException e) {
        }
      }
     
     /**
      * Metodo para actualizar usuario
      * @param usuario objeto de tipo ModeloUsuario
      */
     public void actualizarUse (ModeloUsuario usuario){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarUsua(?, ?, ?);");     
                sentencia.setInt(1, usuario.getId_usuario());
                sentencia.setString(  2, usuario.getUsuario()); 
                sentencia.setString(  3, usuario.getContrasena()    ); 
               
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Actualizado :)");
               

        } catch (HeadlessException | SQLException e) {
        }
      }
     
    
    
    
}
