/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alexxxxx
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto unPeugeot206;
        Auto unPeugeot208;
        Moto unaMotoYamaha;
        Moto unaMotoHonda;
        DescripcionVehiculos unaDescripcionDeLosVehiculos;
        unaDescripcionDeLosVehiculos = new DescripcionVehiculos();
        unPeugeot206 = new Auto("Peugeot", "206", new BigDecimal("200000.00"), 4);
        unaMotoYamaha = new Moto ("Yamaha","YBR", new BigDecimal ("80500.50"), 125);
        unaMotoHonda = new Moto ("Honda","Titan",new BigDecimal ("60000.00"), 160);
        unPeugeot208 = new Auto("Peugeot", "208", new BigDecimal ("250000.00") , 5);
        List<Vehiculo> vehiculos;
        
        vehiculos = Arrays.asList(unPeugeot206, unaMotoHonda, unPeugeot208, unaMotoYamaha);
       
        unaDescripcionDeLosVehiculos.setVehiculos(vehiculos);
        System.out.println(
                unaDescripcionDeLosVehiculos.toString()+"\n"
        );
        
        unaDescripcionDeLosVehiculos.ordenamiento();
        
        System.out.println(
                "=========================================================================\n"+
                    "Vehiculo mas caro: "+ unaDescripcionDeLosVehiculos.mayorPrecio()+"\n"+
                            
                    "Vehiculo mas barato: "+ unaDescripcionDeLosVehiculos.menorPrecio()+"\n"+ 
                      
                    "El vehiculo con caracter 'Y' es: "+ unaDescripcionDeLosVehiculos.buscarVehiculoConCaracter(vehiculos)+"\n"+
                "=========================================================================\n"+     
                            
                   "Vehiculos ordenados por precio de mayor a menor: \n" 
                
                
                
        );
        unaDescripcionDeLosVehiculos.mostrarVehiculosOrdenados(vehiculos);

    }

}