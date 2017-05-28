
package visitante;

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
