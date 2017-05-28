
package fabricaabstracta;

import javax.swing.JOptionPane;

public class fabricaAutos implements VehiculoTransporte{

    @Override
    public Vehiculo crearVehiculo() {
  Auto auto=new Auto();
  auto.setCodigo(auto.generarCodigoTicket());
  JOptionPane.showMessageDialog(null, "Ha ingresado un  Auto  ");
  return auto;
 
}
    }
  
 


