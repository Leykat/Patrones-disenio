
package fabricaabstracta;

import javax.swing.JOptionPane;

public class fabricaBicicleta implements VehiculoTransporte{

    @Override
    public Vehiculo crearVehiculo() {
 Bicicleta bici =new Bicicleta();
 bici.setCodigo(bici.generarCodigoTicket());
  JOptionPane.showMessageDialog(null, "Ha ingresado una Bicicleta");
  return bici;
    }
}
