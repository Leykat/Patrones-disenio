package Comportamiento;


public class Valet {

    private String id;
    private String tipoVehiculo;
    private Valet sucesor;
    private String resultado;

    public String getResultado() {
        return resultado;
    }
    
    

    public Valet(String id, String tipoVehiculo, Valet sucesor) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.sucesor = sucesor;
    }
    
    public void acomodar (String tipoVehiculo){

        if(this.tipoVehiculo == tipoVehiculo){
            this.resultado = "se acomodo un " + this.tipoVehiculo;
        }else if(sucesor != null){
            this.sucesor.acomodar(tipoVehiculo);
            this.resultado = "no se acomodo un " + this.tipoVehiculo;
        }
        else{
            this.resultado = "no se puede acomodar";
        }
    }    
}
