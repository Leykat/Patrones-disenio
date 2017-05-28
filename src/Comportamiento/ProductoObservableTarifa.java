
package observador;

public class ProductoObservableTarifa extends ObservableTarifa {
    private int tarifaNueva = 0;
   
    // ---------------------------------
    public ProductoObservableTarifa () {
    }
    // ---------------------------------
    public int getTarifaNueva() {
        return this.tarifaNueva;
    }
   // cuando se agregue un nuevo observador, los existentes serán notificados
    public void setTarifa(int tarifa) {
       
        this.tarifaNueva = tarifa*((int) (Math.random() * 10) + 1);
        
         notificarObservadores();
    }
}

    

    
        
    
