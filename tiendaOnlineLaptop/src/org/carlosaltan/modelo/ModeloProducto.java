/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *
 * @author Carlos Altán
 */
public class ModeloProducto {
    
    private int idProducto; 
    private String producto; 
    private float  precio; 
    private int idMarca; 
    private String modelo; 
    private boolean estadoProdu; 

    public ModeloProducto() {
    }
/**
 * Constructo de ModeloProducto 
 * @param idProducto int 
 * @param producto string 
 * @param precio float 
 * @param idMarca int 
 * @param modelo string 
 * @param estadoProdu  boolean 
 */
    public ModeloProducto(int idProducto, String producto, float precio, int idMarca, String modelo, boolean estadoProdu) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.precio = precio;
        this.idMarca = idMarca;
        this.modelo = modelo;
        this.estadoProdu = estadoProdu;
    }

    public ModeloProducto(int idProducto, String producto, float precio) {
      this.idProducto = idProducto; 
      this.producto = producto; 
      this.precio  = precio;
    }

    /**
     * Metodo get id producto 
     * @return id producto 
     */
    public int getIdProducto() {
        return idProducto;
    }
/**
 * Metodo set id producto 
 * @param idProducto id producto 
 */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
/**
 * Metodo get producto 
 * @return string producto 
 */
    public String getProducto() {
        return producto;
    }
/**
 * metodo set producto 
 * @param producto  string producto 
 */
    public void setProducto(String producto) {
        this.producto = producto;
    }
/**
 * metodo get precio 
 * @return float precio 
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
 * metodo get id marca 
 * @return int id marca 
 */
    public int getIdMarca() {
        return idMarca;
    }
/**
 * metodo set id marca 
 * @param idMarca int id marca
 */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
/**
 * metodo get modelo
 * @return string modelo
 */
    public String getModelo() {
        return modelo;
    }
/**
 * metodo set modelo 
 * @param modelo modelo String 
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
/**
 * metodo get estado 
 * @return estado boolean 
 */
    public boolean getEstadoProdu() {
        return estadoProdu;
    }
/**
 * metodo set estado 
 * @param estadoProdu estado boolean  
 */
    public void setEstadoProdu(boolean estadoProdu) {
        this.estadoProdu = estadoProdu;
    }
/**
 * metodo to String para llenar el jcombo box de producto 
 * @return producto + precio 
 */
    @Override
    public String toString() {
        return producto + "_" + precio  ;
    }
    
    

    


}
