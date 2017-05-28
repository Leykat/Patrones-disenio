
package fabricaabstracta;

import javax.swing.JOptionPane;

public class Auto implements Vehiculo{
    private int codigo;

 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }
 
  
 public int generarCodigoTicket()
 {
  int codigoAuto=(int) (Math.random()*5000);
  return codigoAuto;
 }
  
}

