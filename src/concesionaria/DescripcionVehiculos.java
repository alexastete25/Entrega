/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



  

public class DescripcionVehiculos {
        
   private List<Vehiculo> vehiculos;
   
   public DescripcionVehiculos(){
        this.vehiculos = new ArrayList<>();
    }
   
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void agregarVehiculo (Vehiculo unVehiculo)
    {
        this.vehiculos.add(unVehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public String mayorPrecio (){
        return vehiculos.get(0).marca+" "+vehiculos.get(0).modelo;
    }
    public String menorPrecio (){
        return vehiculos.get(vehiculos.size()-1).marca +" "+ vehiculos.get(vehiculos.size()-1).modelo;
    }
    public void ordenamiento (){
        Collections.sort (vehiculos, Collections.reverseOrder());
        
    }
    public void mostrarVehiculosOrdenados (List<Vehiculo> vehiculos){

        for (Vehiculo p: vehiculos){
            System.out.println( ""+p.marca+" "+p.modelo+"\n");
        }
    
    }
      public String buscarVehiculoConCaracter (List<Vehiculo> vehiculos)
    { 
        String vehiculoEncontrado = null;
        for (Vehiculo p: vehiculos){
            if (p.marca.indexOf('Y')>= 0){
                vehiculoEncontrado= p.marca + " "+p.modelo+" "+p.precio;  
            }

    }
        return vehiculoEncontrado ;
    }
    @Override
    public String toString()
    {
        return ""+vehiculos ;
    }
    


  
}
    

