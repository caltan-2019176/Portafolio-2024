/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;
import org.carlosaltan.modelo.ModeloUsuario;
import java.sql.PreparedStatement;
import org.carlosaltan.conexion.Conexion;
import java.sql.ResultSet;
/**
 *
 * @author Carlos Altán
 */
public class ControlUsuario {
    
    /**
     * Metodo para inciar sesion del CLiente
     * @param usuario objeto tipo modeloUsuario
     * @return valor false 
     */
      public boolean iniciarSesionCliente(ModeloUsuario usuario){
               try {
                ModeloUsuario usuarioDB = new ModeloUsuario();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionCliente(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getContrasena());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContrasena(resultado.getNString(2));
                    if (usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContrasena()).equals(usuario.getContrasena())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
    /**
     * Metodo para iniciar sesion como adminnistrador
     * @param usuario objeto usuario tipo modeloUsuario
     * @return  valor false 
     */
    public boolean iniciarSesionAdmin(ModeloUsuario usuario){
               try {
                ModeloUsuario usuarioDB = new ModeloUsuario();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionAdmin(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getContrasena());
               
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContrasena(resultado.getNString(2));
                    if (usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContrasena()).equals(usuario.getContrasena())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
}
