
package Creacionales;

public class BahiaVehiculoDuplicate extends BahiaVehiculo{
  
    @Override
    public BahiaVehiculo duplicar() {
        BahiaVehiculoDuplicate objBahiaDuplicate = new BahiaVehiculoDuplicate();
        objBahiaDuplicate.setId(this.getId() );
         objBahiaDuplicate.setTipoVehiculo(this.getTipoVehiculo() );
 
         return objBahiaDuplicate;
    }
    
    
}
