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
       VehiculoTransporte autos = new fabricaAutos();
      VehiculoTransporte bicis = new fabricaBicicleta();
      VehiculoTransporte motos = new fabricaMoto();
      
        String cad = "", salida;
        cad += "Ingrese la opción correspondiente para obtener el codigoTicket del servicio\n";
        cad += "1. Codigo para espacio de parqueo Autos\n";
        cad += "2. Codigo  para espacio de parqueo Motos\n";
        cad += "3. Codigo  para espacio de parqueo  Bicicletas\n\n";
        try {
            do {
                try {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog(cad));
                    switch (opcion) {
                        case 1:
                            //fabricaVehiculo.crearFabricaDeVehiculo(autos);
                            Vehiculo auto = autos.crearVehiculo();
                           
                            JOptionPane.showMessageDialog(null, auto.generarCodigoTicket()); 
                            break;
                        case 2:
                           // fabricaVehiculo.crearFabricaDeVehiculo(motos);
                            Vehiculo moto = motos.crearVehiculo();
                             
                            JOptionPane.showMessageDialog(null, moto.generarCodigoTicket());
                            break;
                        case 3:
                            //fabricaVehiculo.crearFabricaDeVehiculo(bicis);
                            Vehiculo bici = bicis.crearVehiculo();
                            
                            JOptionPane.showMessageDialog(null, bici.generarCodigoTicket());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No es un valor de consultavalido");
                            break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No es un parametro de consulta valido");
                }
                salida = JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");

            } while (salida.toUpperCase().equals("S"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Busqueda terminada");
        }
                    case "2":
                        
                    case "3":
                        
                    case "4":
                        String id = String.valueOf((int) (Math.random() * (100 - 1) + 1));
                        GestorBahias objGB = new GestorBahias();
                        BahiaVehiculo objIdBahia = objGB.getidBahiaVehiculo("1");
                        BahiaVehiculo objTipoBahia = objGB.getTipoBahiaVehiculo("Bahia Auto");

                        //BAHIA
                        JOptionPane.showMessageDialog(null,"ID " + objIdBahia.getId());
                       JOptionPane.showMessageDialog(null,"TIPO BAHIA VEHICULO " + objTipoBahia.getTipoVehiculo());

                        //BAHIA_Duplicado
                        BahiaVehiculo objIdBahiaDup = objGB.getIdDuplicate("1");
                        BahiaVehiculo objTipoBahiaDup = objGB.getTipoDuplicate("Bahia Auto");
                       JOptionPane.showMessageDialog(null,"ID DUPLICADO " + objIdBahiaDup.getId());
                       JOptionPane.showMessageDialog(null,"TIPO BAHIA VEHICULO DUPLICADO " + objTipoBahiaDup.getTipoVehiculo());

                        // Modificamos bahia original
                        objIdBahia.setId(id);
                        objIdBahia.setTipoVehiculo("Bahia Moto");

                        JOptionPane.showMessageDialog(null,"ID " + objIdBahia.getId());
                        JOptionPane.showMessageDialog(null,"TIPO BAHIA VEHICULO " + objTipoBahia.getTipoVehiculo());

                        //Modificar Duplicado
                        objIdBahiaDup.setId(id);
                        objTipoBahiaDup.setTipoVehiculo("Bahia Moto");
                        JOptionPane.showMessageDialog(null,"ID DUPLICADO " + objIdBahiaDup.getId());
                        JOptionPane.showMessageDialog(null,"TIPO BAHIA VEHICULO DUPLICADO " + objTipoBahiaDup.getTipoVehiculo());
                    case "5":
                      final int max = 100;
                      final int min = 1;
                     String fecha = GenerarFecha();
                     String codigo1 = String.valueOf((int) (Math.random() * max - min) + min);
                     String codigo2 = String.valueOf((int) (Math.random() * max - min) + min);
                     String codigo3 = String.valueOf((int) (Math.random() * max - min) + min);
                    SingletonHistorial LibroRegistroAuto = SingletonHistorial.getHistorial(codigo1, fecha, " libro1Autos");
                    SingletonHistorial LibroRegistroMoto = SingletonHistorial.getHistorial(codigo2, fecha, " libro1Motos");
                    SingletonHistorial LibroRegistroBicicleta = SingletonHistorial.getHistorial(codigo3, fecha, " libro1Biciletas");
                    SingletonHistorial LibroRegistro = SingletonHistorial.getHistorial(codigo3, fecha, " libro1Biciletas");
                    JOptionPane.showMessageDialog(null,"Codigo LibroRegistro_Hostorial[" + LibroRegistroAuto.getCodigo() + "] Fecha " + LibroRegistroAuto.getFecha() + " " + LibroRegistroAuto.getDescripcionPar());
                    JOptionPane.showMessageDialog(null,"Codigo LibroRegistro_Hostorial[" + LibroRegistroMoto.getCodigo() + "] Fecha " + LibroRegistroAuto.getFecha() + " " + LibroRegistroMoto.getDescripcionPar());
                    JOptionPane.showMessageDialog(null,"Codigo LibroRegistro_Hostorial[" + LibroRegistroBicicleta.getCodigo() + "] Fecha " + LibroRegistroAuto.getFecha() + " " + LibroRegistroBicicleta.getDescripcionPar());

        //queriendo hacer una nueva instance 
                   JOptionPane.showMessageDialog(null,"Codigo LibroRegistro_Hostorial[" + LibroRegistroBicicleta.getCodigo() + "] Fecha " + LibroRegistroBicicleta.getFecha() + " " + LibroRegistroBicicleta.getDescripcionPar());

        //queriendo hacer un instance por fuera de los exixtentes
                  JOptionPane.showMessageDialog(null,"Codigo LibroRegistro_Hostorial[" + LibroRegistro.getCodigo() + "] Fecha " + LibroRegistro.getFecha() + " " + LibroRegistro.getDescripcionPar());

    }

                        
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
                           
                  FachadaAcceso acceso = new FachadaAcceso();
                  String codigo = JOptionPane.showInputDialog("Lectura de Codigo Tarjeta:");
                  acceso.setCodigo(codigo);
                  JOptionPane.showMessageDialog(null, "Acceso: "+acceso.evaluarTarjeta()); 
                  JOptionPane.showMessageDialog(null, "Generando ticket en la fecha: "+acceso.aprobarTicket());
                        
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
                  ProductoObservableTarifa objObservado = new ProductoObservableTarifa();
                 // Instanciar los observadores, pasándoles como parámetro el que será Observado
                 ProductoObserverSistemaTarifario productoObserver = new ProductoObserverSistemaTarifario(objObservado);

                  objObservado.setTarifa(((int) (Math.random() * (150 - 10)) + 10));
                 JOptionPane.showMessageDialog(null, "La tarifa  ha cambiado a[" + productoObserver.observadoActualizado() + "] pesos por minuto");
                     case "9":
                         
                     case "10":
          
         
                 RegistroTickets registro = new RegistroTickets ();
                 String fecha = GenerarFecha();
        // se crea grupo de tickets y se le pasa el vehiculo
                 ListaRegistroTicket ticket1 = new ListaRegistroTicket( 1 );
                 ticket1.agregarVehiculo(new Vehiculo("Auto",fecha));
                 ticket1.agregarVehiculo(new Vehiculo("Moto",fecha));
                 ticket1.agregarVehiculo(new Vehiculo("Bicicleta",fecha));

        // se crea otro grupo de tickets y se le pasa el vehiculo
                ListaRegistroTicket ticket2 = new ListaRegistroTicket( 2 );
                ticket2.agregarVehiculo(new Vehiculo("Bicicleta",fecha));
                ticket2.agregarVehiculo(new Vehiculo("Moto",fecha));
          

        // se agrega al objeto estructura
        registro.agregarTicket(ticket1);
        
        registro.agregarTicket(ticket2);
     
        registro.accept(new Informacion());
                     case "11":
                         
                 }
        }
    
    public static String GenerarFecha() {
        Calendar unaFecha;
        Random aleatorio;
        aleatorio = new Random();
        String fecha = "";

        unaFecha = Calendar.getInstance();
        unaFecha.set(aleatorio.nextInt(10) + 2014, aleatorio.nextInt(12) + 1, aleatorio.nextInt(30) + 1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        fecha = sdf.format(unaFecha.getTime());
        return fecha;
    }
    
}
