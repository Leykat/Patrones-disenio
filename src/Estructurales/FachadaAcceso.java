/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class FachadaAcceso {

    private ControlAcceso acceso = new ControlAcceso();

    private TiqueteraParqueadero Tiquetera = new TiqueteraParqueadero();
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String evaluarTarjeta() {

        String tarjeta_correcta = acceso.leerTarjeta(this.codigo);
        int tarjeta_valida = acceso.comprobarCodigoBarraTarjeta(tarjeta_correcta);

        if (tarjeta_valida == 1) {

           return acceso.ingresar();
        } else {
            return acceso.alFallar();
        }

    }

    public String aprobarTicket() {
        boolean tarjeta_valida = ((int) Tiquetera.comprobarTarjetaExistente()) >= 10000;

        if (tarjeta_valida) {

        return   Tiquetera.imprimirFechaTicket();

        } else {

           return Tiquetera.bloquearTarjeta();
        }

    }

}
