/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
  
 


