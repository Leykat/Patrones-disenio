/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales;

/**
 *
 * @author LEIDY K
 */
public abstract  class BahiaVehiculo {
    private String id;
    private String  tipoVehiculo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
   

   

      public abstract BahiaVehiculo duplicar(); 
    
      
    
    
}
