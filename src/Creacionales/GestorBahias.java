/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales;

import java.util.Hashtable;

/**
 *
 * @author LEIDY K
 */
public class GestorBahias {
    private Hashtable bahias = new Hashtable();
  
    
    public GestorBahias(){
       
     BahiaVehiculo bahiaVeh= new BahiaVehiculoDuplicate();
     
      bahiaVeh.setId("1");
      bahiaVeh.setTipoVehiculo("Bahia Auto");
      // Guardarlo
     this.addIdBahiaVehiculo(bahiaVeh.getId(),bahiaVeh);
     this.addTipoBahiaVehiculo(bahiaVeh.getTipoVehiculo(),bahiaVeh);
    }
     
    private void addIdBahiaVehiculo(String id, BahiaVehiculo bahia) {
       
         this.bahias.put(id, bahia);
    }
    
     private void addTipoBahiaVehiculo(String tipoVehiculo, BahiaVehiculo bahia) {
       
         this.bahias.put(tipoVehiculo, bahia);
    }
    
    
     
   
     public BahiaVehiculo getidBahiaVehiculo( String id )
    {
         BahiaVehiculo objPrototipo = (BahiaVehiculoDuplicate) bahias.get(id);
         
         return objPrototipo;
         
    }
    
     public BahiaVehiculo getIdDuplicate( String id )
    {
        // Localizar el objeto deseado
          BahiaVehiculo  objPrototipo = (BahiaVehiculoDuplicate) bahias.get(id);
        // Devolver un clon
         return (BahiaVehiculo) objPrototipo.duplicar();
    }

     
      public BahiaVehiculo getTipoBahiaVehiculo( String tipoVehiculo )
    {
         BahiaVehiculo objPrototipo = (BahiaVehiculoDuplicate) bahias.get(tipoVehiculo);
         
         return objPrototipo;
         
    }
    
     public BahiaVehiculo getTipoDuplicate( String tipoVehiculo )
    {
        // Localizar el objeto deseado
          BahiaVehiculo  objPrototipo = (BahiaVehiculoDuplicate) bahias.get(tipoVehiculo);
        // Devolver un clon
         return (BahiaVehiculo) objPrototipo.duplicar();
    }
   

}