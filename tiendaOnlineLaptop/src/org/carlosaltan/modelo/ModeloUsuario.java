/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *
 * @author Carlos Altán
 */
public class ModeloUsuario {
    
    private int id_usuario; 
    private String usuario; 
    private String contrasena;
    private int id_cliente; 
    private boolean estado_act ; 
    private boolean rol; 
/**
 * Constructo de ModeloUsuario
 * @param id_usuario id usuario int
 * @param usuario usuraio string 
 * @param contrasena contrasena string
 * @param id_cliente id cliente int 
 * @param estado_act estado boolean 
 * @param rol rol boolean
 */
    public ModeloUsuario(int id_usuario, String usuario, String contrasena, int id_cliente, boolean estado_act, boolean rol) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.id_cliente = id_cliente;
        this.estado_act = estado_act;
        this.rol = rol;
    }

    public ModeloUsuario() {
    }
/**
 * Metodo get id usuario
 * @return  int id usuario
 */
    public int getId_usuario() {
        return id_usuario;
    }
/**
 * Metodo set id usuario 
 * @param id_usuario int id usuario
 */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
/**
 * Metodo get usuario
 * @return string usuario
 */
    public String getUsuario() {
        return usuario;
    }
/**
 * metodo set usuario
 * @param usuario string usuario
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
/**
 * metodo get contrasena 
 * @return string contrasena
 */
    public String getContrasena() {
        return contrasena;
    }
/**
 * metodo set contrasena
 * @param contrasena  string contrasena
 */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
/**
 * metodo get id cliente
 * @return id cliente int
 */
    public int getId_cliente() {
        return id_cliente;
    }
/**
 * metodo set id cliente
 * @param id_cliente  int id cliente
 */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
/**
 * metodo is estado 
 * @return estaado boolean
 */
    public boolean isEstado_act() {
        return estado_act;
    }
/**
 * metodo ser estado 
 * @param estado_act estado boolean
 */
    public void setEstado_act(boolean estado_act) {
        this.estado_act = estado_act;
    }
/***
 * metodo get rol 
 * @return ro boolean
 */
    public boolean isRol() {
        return rol;
    }
/**
 * metodo set rol 
 * @param rol rol boolean
 */
    public void setRol(boolean rol) {
        this.rol = rol;
    }
    
    
    
    
    
}
