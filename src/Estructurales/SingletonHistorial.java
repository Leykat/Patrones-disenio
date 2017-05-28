package singleton_parqueadero;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class SingletonHistorial {

    private SingletonHistorial() {
    }
    ;
    
    private String descripcionPar = "";
    private String codigo = "";
    private String fecha = "";

    private static SingletonHistorial LibroRegistroAutos = null;
    private static SingletonHistorial LibroRegistroMotos = null;
    private static SingletonHistorial LibroRegistroBicicletas = null;
    private static SingletonHistorial LibroRegistro = null;

    private SingletonHistorial(String codigo, String fecha, String descripcionPar) {
        this.codigo = codigo;
        this.descripcionPar = descripcionPar;
        this.fecha = fecha;

    }

    public String getDescripcionPar() {
        return descripcionPar;
    }

    public void setDescripcionPar(String descripcionPar) {
        this.descripcionPar = descripcionPar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public synchronized static SingletonHistorial getHistorial(String codigo, String fecha, String descripcionPar) {
        LibroRegistro = null;

        try {
            if (LibroRegistroAutos == null) {
                synchronized (SingletonHistorial.class) {
                    LibroRegistroAutos = new SingletonHistorial(codigo, fecha, descripcionPar);

                    LibroRegistro = LibroRegistroAutos;
                }

            } else if (LibroRegistroMotos == null) {
                synchronized (SingletonHistorial.class) {
                    LibroRegistroMotos = new SingletonHistorial(codigo, fecha, descripcionPar);
                    LibroRegistro = LibroRegistroMotos;
                }
            } else if (LibroRegistroBicicletas == null) {
                synchronized (SingletonHistorial.class) {

                    LibroRegistroBicicletas = new SingletonHistorial(codigo, fecha, descripcionPar);
                    LibroRegistro = LibroRegistroBicicletas;
                }

            } else {
                LibroRegistro = new SingletonHistorial("0", "null", "libro de registro no valido");
            }

        } catch (NullPointerException e) {
            System.out.println("No se encuentra el LibroRegistro");

        }
        return LibroRegistro;
    }

}
