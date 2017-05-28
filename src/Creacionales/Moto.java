/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaabstracta;

import javax.swing.JOptionPane;

public class Moto implements Vehiculo{
    private int codigo;
   
 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }

    
 public int generarCodigoTicket()
 {
  int codigoMoto=(int) (Math.random()*(5000-12000)+12000);
  return codigoMoto;
 }

    
}
