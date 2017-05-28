/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
