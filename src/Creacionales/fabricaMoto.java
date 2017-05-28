/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
