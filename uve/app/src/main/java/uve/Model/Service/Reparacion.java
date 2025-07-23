package uve.Model.Service;

import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reparacion {

    protected String descripcion;
    protected double costo;
    protected String pieza;
    //fecha de reparacion
    protected String fechaReparacion; 
 
    private static final Logger logger = LogManager.getLogger(Reparacion.class.getName());
    

    public Reparacion(String descripcion, double costo, String fechaReparacion, String pieza) throws Exception {
        try {

             logger.info("Reparación creada: " + "descripcion=" + descripcion + ", costos=" + costo + ", fechaImplemntacion=" + fechaReparacion + ", repuesto=" + pieza);

            if (descripcion == null || pieza == null) {
                throw new IllegalArgumentException("Descripción o pieza no pueden ser nulos");
            }

            if (descripcion.isEmpty() || pieza.isEmpty()) {
                throw new IllegalArgumentException("Descripción o pieza no pueden estar vacíos");
            }

            this.descripcion = descripcion;
            this.costo = costo;
            this.fechaReparacion = fechaReparacion;
            this.pieza = pieza;

           

        } catch (Exception e) {

           logger.error("Error al crear la reparación: " + e.getMessage(), e);

            throw new Exception("Error al crear la reparación: " + e.getMessage(), e);

        }
    }

    public Reparacion() {
        this.descripcion = "";
        this.costo = 0;
        this.pieza = "";
        this.fechaReparacion = ""; // Asignar la fecha actual por defecto
    }

    public String getDescripcion() {
        return descripcion;
    }
    public double getCosto() {
        return costo;
    }
    public String getFechaReparacion() {
        return fechaReparacion;
    }
    public String getPieza() {
        return pieza; 
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", fechaReparacion=" + fechaReparacion +
                ", pieza='" + pieza + '\'' +
                '}';
    }


}
