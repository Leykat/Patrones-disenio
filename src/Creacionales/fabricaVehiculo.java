
package fabricaabstracta;

public class fabricaVehiculo {
    
 public static void crearFabricaDeVehiculo(VehiculoTransporte factory){
 
  Vehiculo objetoVehiculo= factory.crearVehiculo();
  objetoVehiculo.generarCodigoTicket();
 }
}

