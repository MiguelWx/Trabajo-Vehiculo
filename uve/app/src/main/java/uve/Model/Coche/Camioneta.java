package uve.Model.Coche;

import uve.Model.Vehiculo;
import uve.Model.Service.Reparacion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Camioneta extends Vehiculo implements InterfazCoche {

     private static final Logger logger = LogManager.getLogger(Reparacion.class.getName());

    public Camioneta() {
        super();

        logger.info("Creando una nueva camioneta con valores por defecto");
    } 

    public Camioneta(String marca, String modelo, String placa) throws Exception {
        super(marca, modelo, placa);
       
        logger.info("Camioneta, creando una nueva camioneta con los siguientes valores: " +
                    "marca=" + marca + ", modelo=" + modelo +  ", placa=" + placa);

    }

    //Encender camioneta
    @Override
    public void encender() {
        System.out.println("La camioneta " + marca + " " + modelo + " ha sido encendida.");
    }

    //Apagar camioneta
    @Override
    public void apagar() {
        System.out.println("La camioneta " + marca + " " + modelo + " ha sido apagada.");
    }

}
