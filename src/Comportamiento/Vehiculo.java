/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitante;

/**
 *
 * @author LEIDY K
 */
public class Vehiculo implements IVehiculo {

    private String tipoVehiculo = "";
    private String ref = "";

    public Vehiculo(String tipoVehiculo, String ref) {
        this.setTipoVehiculo(tipoVehiculo);
        this.setRef(ref);

    }

    public String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
