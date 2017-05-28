/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitante;

import java.util.ArrayList;

/**
 *
 * @author LEIDY K
 */
public class ListaRegistroTicket implements IVehiculo {

    int codigo;
    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public ListaRegistroTicket(int codigo) {
        this.setCodigo(codigo);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void agregarVehiculo(Vehiculo veh) {
        this.vehiculos.add(veh);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);

        this.vehiculos.forEach((veh) -> {
            veh.accept(visitor);
        });
    }
}
