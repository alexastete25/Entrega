/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.math.BigDecimal;

/**
 *
 * @author alexxxxx
 */
public class Vehiculo implements Comparable<Vehiculo>{
    public String marca;
    public String modelo;
    public BigDecimal precio;
    
    /**
     *
     * @param marca
     * @param modelo
     * @param precio
     */
    public Vehiculo(String marca, String modelo, BigDecimal precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
  

    @Override
    public int compareTo(Vehiculo o) {
        int resultado = 0;


         if (this.precio.intValue()<o.precio.intValue()) 
         {  
            resultado = -1;    
         }  
         else 
         {
             resultado = 1;      
         } 
        return resultado;
    

    

}
}