
package visitante;

import javax.swing.JOptionPane;

public class Informacion implements IVisitor {

    public Informacion() {
    }

    @Override
    public void  visit(ListaRegistroTicket ticket) {
       
        JOptionPane.showMessageDialog(null, "Ticket número [" + ticket.getCodigo() + "]");
    }

    @Override
    public void visit(Vehiculo veh) {
       JOptionPane.showMessageDialog(null, "Vehiculo [" + veh.getTipoVehiculo() + "] --> " + veh.getRef() + " RefIngreso");
    }
}
