
package fabricaabstracta;

import javax.swing.JOptionPane;

public class Bicicleta implements Vehiculo{
    private int codigo;
  
 public int generarCodigoTicket()
 {
  int codigoBicicleta=(int) (Math.random()*(12000-(15000+1))+(15000));
  return codigoBicicleta;
 }
 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }
 

    
}
