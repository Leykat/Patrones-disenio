package Estructurales;

import java.util.ArrayList;

public class CompositeParqueadero extends Parqueadero {

    String nombre;
    String tipo;
    ArrayList<Parqueadero> bahias = new ArrayList<Parqueadero>();

    public CompositeParqueadero(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void añadir(Parqueadero p) {
        bahias.add(p);
    }

    @Override
    public void remover(Parqueadero o) {
        bahias.remove(o);
    }

    @Override
    public boolean ocupar() {
        int largo = bahias.size();
        for(int i=0; i<largo; i++){
            bahias.get(i).ocupar();
        }
        return true;
    }
    
}
