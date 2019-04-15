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
public class Moto extends Vehiculo {
    public int cilindrada; 
    
    public Moto(String marca, String modelo, BigDecimal precio, int cilindrada) 
    {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
        
    }
 @Override
    public String toString() {
        
        DecimalFormat formateador = new DecimalFormat("##,###.###");
        return "Marca=" + this.marca + " // Modelo=" + this.modelo +" // Cilindrada="+ this.cilindrada+ "c // Precio= $" + 
                formateador.format(this.precio)+"\n";
    }    
}
