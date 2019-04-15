/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author alexxxxx
 */
public class Auto extends Vehiculo {
    public int cantidadPuertas;
    
    public Auto(String marca, String modelo, BigDecimal precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }
    
        
    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("##,###.###");
        return  "Marca=" + this.marca + " // Modelo=" + this.modelo +" // Puertas="+ this.cantidadPuertas+ " // Precio= $" + 
                (formateador.format (this.precio)) +"\n";
    }
    
}
