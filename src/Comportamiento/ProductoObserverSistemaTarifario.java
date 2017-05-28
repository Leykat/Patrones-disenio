
package observador;

import java.math.BigDecimal;

public class ProductoObserverSistemaTarifario implements ObserverSistemaTarifario {
 private ProductoObservableTarifa objObservado;
    // ---------------------------------
     public ProductoObserverSistemaTarifario( ProductoObservableTarifa objObservado ) {
         this.objObservado = objObservado;
       objObservado.agregarObservador(this);
    }
    // ---------------------------------
    @Override
     public int observadoActualizado() {
      
     return  this.objObservado.getTarifaNueva();
    }

    
}
    
