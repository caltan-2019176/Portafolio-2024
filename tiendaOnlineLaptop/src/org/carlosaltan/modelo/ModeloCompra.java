/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *
 * @author Carlos Altán
 */
public class ModeloCompra {
    
    private int id_compra; 
    private  int id_cliente; 
    private float precio; 
    private String fechaEntrega; 
    private String nit; 
    private int idProducto; 

    public ModeloCompra() {
    }
    /**
     * Contructor lleno de ModeloCommpra
     * @param idProducto int
     * @param id_compra int 
     * @param id_cliente int 
     * @param precio float
     * @param fechaEntrega string 
     * @param nit string 
     */

    public ModeloCompra(int idProducto, int id_compra, int id_cliente, float precio, String fechaEntrega, String nit) {
        this.id_compra = id_compra;
        this.id_cliente = id_cliente;
        this.precio = precio;
        this.fechaEntrega = fechaEntrega;
        this.nit = nit;
        this.idProducto = idProducto; 
    }
    /**
     * Metodo get id 
     * @return  int id 
     */
    public int getIdProducto() {
        return idProducto;
    }
    /**
     * metodo set id 
     * @param idProducto int id  
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
/**
 * metodo get id compra 
 * @return int id
 */
    
        
    public int getId_compra() {
        return id_compra;
    }
    /**
     * metodo gat id 
     * @param id_compra metodo set id 
     */

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }
/**
 * metodo get id 
 * @return int id
 */
    public int getId_cliente() {
        return id_cliente;
    }
/**
 * metodo set id cliente
 * @param id_cliente  in id cliente
 */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
/**
 * metodo get precio
 * @return  float precio
 */
    public float getPrecio() {
        return precio;
    }
/**
 * metodo set precio
 * @param precio float precio
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * metodo get fecha
 * @return  string fecha
 */
    public String getFechaEntrega() {
        return fechaEntrega;
    }
/**
 * metodo set fecha 
 * @param fechaEntrega string fecha  
 */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
/**
 * metodo get nit 
 * @return string nit 
 */
    public String getNit() {
        return nit;
    }
/**
 * metodo set nit 
 * @param nit string nit 
 */
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
    
}
