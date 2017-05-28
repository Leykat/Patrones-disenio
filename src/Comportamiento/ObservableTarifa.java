/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author LEIDY K
 */
public abstract class ObservableTarifa {
    
    private ArrayList<ObserverSistemaTarifario > observadores = new ArrayList<ObserverSistemaTarifario >();
    // ---------------------------------
    public ObservableTarifa() {
    }
    // ---------------------------------
     public void agregarObservador(ObserverSistemaTarifario  obs) {
        observadores.add(obs);
    }
    // ---------------------------------
     public void eliminarObservador(ObserverSistemaTarifario  obs) {
        observadores.remove(obs);
    }
    // ---------------------------------
    public void notificarObservadores()
    {
        // Enviarles la notificación a cada observador a través de su propio método
         for (ObserverSistemaTarifario obj : observadores) {
             obj.observadoActualizado();
        }
    }
}