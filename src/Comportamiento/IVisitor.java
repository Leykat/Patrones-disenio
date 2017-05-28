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
public interface IVisitor {
     public void visit( ListaRegistroTicket ticket );
    public void visit( Vehiculo veh );
}
