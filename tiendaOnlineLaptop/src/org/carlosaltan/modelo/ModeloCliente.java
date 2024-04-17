/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *
 * @author Carlos Altán
 */
public class ModeloCliente {
    
    private int id_cliente; 
    private String nombre; 
    private String apellido;
    private String telefono; 
    private String email;
    private String direccion;
    private boolean estado_act; 
/**
 * constructor lleno de ModeloCliente
 * @param id_cliente int
 * @param nombre string 
 * @param apellido string
 * @param telefono string
 * @param email string
 * @param direccion string
 * @param estado_act boolean
 */
    public ModeloCliente(int id_cliente, String nombre, String apellido, String telefono, String email, String direccion, boolean estado_act) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.estado_act = estado_act;
    }

    public ModeloCliente() {
    }

    public ModeloCliente(int id_cliente, String nombre, String apellido) {
        this.id_cliente = id_cliente;
        this.nombre = nombre; 
        this.apellido = apellido; 
    }
    /**
     * Metodo get id 
     * @return int id
     */

    public int getId_cliente() {
        return id_cliente;
    }
/**
 * Metodo set id 
 * @param id_cliente int id cliente 
 */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
/**
 * metodo get nombre
 * @return string nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * metodo set nombre
 * @param nombre string nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * metodo get apellido 
 * @return string apellido 
 */
    public String getApellido() {
        return apellido;
    }
/**
 * metodo set apellido 
 * @param apellido string apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * metodo get telefono 
 * @return strign telefono
 */
    public String getTelefono() {
        return telefono;
    }
/**
 * metodo set telefono 
 * @param telefono string telefono
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/**
 * metodo get email
 * @return string email 
 */
    public String getEmail() {
        return email;
    }
/**
 * metodo set email
 * @param email string email 
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * metodo get direccion
 * @return string direccion
 */
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo set direccion
 * @param direccion string direccion
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
/**
 * metodo get estado 
 * @return boolean estado 
 */
    public boolean getEstado_act() {
        return estado_act;
    }
/**
 * metodo set estado 
 * @param estado_act boolean estado 
 */
    public void setEstado_act(boolean estado_act) {
        this.estado_act = estado_act;
    }
/**
 * to strgin para llenar jcombo box
 * @return nombre * apellido 
 */
    @Override
    public String toString() {
        return  nombre + "_" + apellido ;
    }
    
    
    
    
    
    
    
}
