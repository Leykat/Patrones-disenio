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
public class RegistroTickets implements IVehiculo
{
    ArrayList<ListaRegistroTicket> tickets = new ArrayList<ListaRegistroTicket>();

   

    public RegistroTickets() {
    }

  
    public void agregarTicket( ListaRegistroTicket ticket )
    {
        this.tickets.add( ticket );
    }

   

    public ListaRegistroTicket getTicket( int numero )
    {
        return this.tickets.get( numero );
    }

    // ------------------------------

    @Override
    public void accept( IVisitor visitor )
    {
        for( ListaRegistroTicket ticket : this.tickets )
        {
            ticket.accept(visitor);
        }
    }
}
