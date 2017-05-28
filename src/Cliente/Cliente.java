package Cliente;

import javax.swing.JOptionPane;
import Comportamiento.*;
import Creacionales.*;
import Estructurales.*;


public class Cliente {


    public static void main(String[] args) {
        String opcionTipo = JOptionPane.showInputDialog(null,"Ingrese que tipo de patron quiere probar \n 1.creacionales\n 2.estructurales\n 3.comportamiento");
        
        switch(opcionTipo){
            case "1":
                String opcionPatron1 = JOptionPane.showInputDialog(null,"Ingrese que patron quiere probar\n 1.Abstract Factory\n 2.Method Factory\n 3.Builder\n 4.Prototype\n 5.Singleton");
                switch(opcionPatron1){
                    
                    case "1":
                        
                    case "2":
                        
                    case "3":
                        
                    case "4":
                        String id = String.valueOf((int) (Math.random() * (100 - 1) + 1));
                        GestorBahias objGB = new GestorBahias();
                        BahiaVehiculo objIdBahia = objGB.getidBahiaVehiculo("1");
                        BahiaVehiculo objTipoBahia = objGB.getTipoBahiaVehiculo("Bahia Auto");

                        //BAHIA
                        System.out.println("ID " + objIdBahia.getId());
                        System.out.println("TIPO BAHIA VEHICULO " + objTipoBahia.getTipoVehiculo());

                        //BAHIA_Duplicado
                        BahiaVehiculo objIdBahiaDup = objGB.getIdDuplicate("1");
                        BahiaVehiculo objTipoBahiaDup = objGB.getTipoDuplicate("Bahia Auto");
                        System.out.println("ID DUPLICADO " + objIdBahiaDup.getId());
                        System.out.println("TIPO BAHIA VEHICULO DUPLICADO " + objTipoBahiaDup.getTipoVehiculo());

                        // Modificamos bahia original
                        objIdBahia.setId(id);
                        objIdBahia.setTipoVehiculo("Bahia Moto");

                        System.out.println("ID " + objIdBahia.getId());
                        System.out.println("TIPO BAHIA VEHICULO " + objTipoBahia.getTipoVehiculo());

                        //Modificar Duplicado
                        objIdBahiaDup.setId(id);
                        objTipoBahiaDup.setTipoVehiculo("Bahia Moto");
                        System.out.println("ID DUPLICADO " + objIdBahiaDup.getId());
                        System.out.println("TIPO BAHIA VEHICULO DUPLICADO " + objTipoBahiaDup.getTipoVehiculo());
                    case "5":
                        
                }
            case "2":
                String opcionPatron2 = JOptionPane.showInputDialog(null,"Ingrese que patron quiere probar\n 1.Adapter\n 2.Bridge\n 3.Composite\n 4.Decorator\n 5.Flywheight\n 6.Proxy\n 7.Facade");
                switch(opcionPatron2){
                    case "1":
                        
                    case "2":
                        
                    case "3":
                        Parqueadero b1 = new Bahia("bicicletas", 1);
                        Parqueadero b2 = new Bahia("bicicletas", 2);
                        Parqueadero b3 = new Bahia("bicicletas", 3);

                        Parqueadero PBicicletas = new CompositeParqueadero("piso de bicicletas", "bicicletas");
                        PBicicletas.añadir(b1);
                        PBicicletas.añadir(b2);
                        PBicicletas.añadir(b3);

                        Parqueadero m1 = new Bahia("motos", 1);
                        Parqueadero m2 = new Bahia("motos", 2);
                        Parqueadero m3 = new Bahia("motos", 3);

                        Parqueadero PMotos = new CompositeParqueadero("piso de motos", "motos");
                        PMotos.añadir(m1);
                        PMotos.añadir(m2);
                        PMotos.añadir(m3);

                        System.out.println(PBicicletas.ocupar());
                        System.out.println(PMotos.ocupar());
                    case "4":
                        
                    case "5":
                        
                    case "6":
                        
                    case "7":
                        
                }
            case "3":
                String opcionPatron3 = JOptionPane.showInputDialog(null, "Ingrese que patron quiere probar\n 1.Template\n 2.Strategy\n 3.Chain of responsability\n 4.Command\n 5.Iterator\n 6.Mediator\n 7.Memento\n 8.Observer\n 9.State\n 10.Visitor\n 11.Interprete");
                 switch(opcionPatron3){
                     case "1":
                     
                     case "2":
                         
                     case "3":
                         Valet v1 = new Valet("24", "automovil", null);
                         Valet v2 = new Valet("13", "motocicleta", v1);
                         Valet v3 = new Valet("69", "bicicleta", v2);

                         String vehiculo = JOptionPane.showInputDialog("ingrese el tipo de vehiculo a estacionar");
                         v3.acomodar("automovil");

                         System.out.println(v3.getResultado());
                         System.out.println(v2.getResultado());
                         System.out.println(v1.getResultado());
                     case "4":
                         
                     case "5":
                         
                     case "6":
                         
                     case "7":
                         
                     case "8":
                         
                     case "9":
                         
                     case "10":
                         
                     case "11":
                         
                 }
        }
    }
    
}
