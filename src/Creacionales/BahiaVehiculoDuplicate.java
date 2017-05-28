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
public class BahiaVehiculoDuplicate extends BahiaVehiculo{
  
    @Override
    public BahiaVehiculo duplicar() {
        BahiaVehiculoDuplicate objBahiaDuplicate = new BahiaVehiculoDuplicate();
        objBahiaDuplicate.setId(this.getId() );
         objBahiaDuplicate.setTipoVehiculo(this.getTipoVehiculo() );
 
         return objBahiaDuplicate;
    }
    
    
}
