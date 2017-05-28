/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.math.BigDecimal;

/**
 *
 * @author LEIDY K
 */
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
    
