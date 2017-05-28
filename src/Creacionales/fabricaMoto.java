
package fabricaabstracta;

import javax.swing.JOptionPane;

public class fabricaMoto implements VehiculoTransporte{

    @Override
    public Vehiculo crearVehiculo() {
        Moto moto =new Moto();
  moto.setCodigo(moto.generarCodigoTicket());
  
  return moto;
    }
    
}
