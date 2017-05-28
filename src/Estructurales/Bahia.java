package Estructurales;

public class Bahia extends Parqueadero {
    
    private String tipo;
    private int numero;
    private boolean ocupado = false;

    public Bahia(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
    @Override
    public void añadir(Parqueadero p) {
        throw new UnsupportedOperationException("No aplica en una bahia"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Parqueadero o) {
        throw new UnsupportedOperationException("No aplica en una bahia"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ocupar() {
        if (this.ocupado == false){
            this.ocupado = true;
        }else{
            this.ocupado = false;
        }
        return ocupado;
    }
    
    
}
