/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *
 * @author Carlos Altan
 */
public class ModeloMarca {
    
    
    
    private int id_marca; 
    private String marca; 

   
     public ModeloMarca() {
        
    }
/**
 * Constructor de marca
 * @param id_marca inr id marca 
 * @param marca string marca 
 */
    public ModeloMarca(int id_marca, String marca) {
      this.id_marca = id_marca; 
      this.marca = marca; 
    }

    /**
     * metodo get id marca
     * @return int id
     */

    public int getId_marca() {
        return id_marca;
    }
/**
 * metodo set id marca
 * @param id_marca int id
 */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
/**
 * metodo get marca
 * @return string marca
 */
    public String getMarca() {
        return marca;
    }
/**
 * metodo set marca 
 * @param marca String marca
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * metodo to String para llenar jcombo box de marca
 * @return id_marca + marca 
 */
    
    public String toString() {
        return id_marca +"_"+ marca;
    }
    
    
}
