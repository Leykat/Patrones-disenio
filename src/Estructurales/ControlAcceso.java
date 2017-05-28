/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author LEIDY K
 */
public class ControlAcceso {

    private String codigoBarra = "parking2017";
    private  String msg1 = "Ingreso Aprobado";
    private  String msg2 = "Ingreso Denegado";

    public int comprobarCodigoBarraTarjeta(String codigo) {
        if (codigo.equals(codigoBarra)) {
            return 1;
        } else {
            return 0;
        }

    }

    public String ingresar() {
        return msg1;
    }

    public String alFallar() {
        return msg2;
    }

    String leerTarjeta(String tarjeta) {
        return tarjeta;

    }

}
