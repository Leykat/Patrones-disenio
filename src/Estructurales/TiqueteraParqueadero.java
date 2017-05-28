
package facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class TiqueteraParqueadero {
         private Calendar unaFecha;
         
       public double comprobarTarjetaExistente(){
        double idAleatorio = (double) ((int)(Math.random()*(15000-10000))+10000);
               
       return idAleatorio;
}

        public String bloquearTarjeta(){
            String idTarjeta=null;
            idTarjeta="0000-Ilegal";
           return idTarjeta;
            
        }


        
        public String imprimirFechaTicket(){
             
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        String fecha="";

        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(10)+2017, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        fecha= sdf.format(unaFecha.getTime());
        return fecha;
         
    
                
        }

        
       


        
}
