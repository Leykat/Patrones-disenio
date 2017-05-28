/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitante;

import javax.swing.JOptionPane;

/**
 *
 * @author LEIDY K
 */
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
