package uve.Model.Service;

import java.util.Date;

public class Taller extends Reparacion{
    private String sede;
    private int numeroCeldasDisp;

    public Taller(String descripcion, double costo, String fechaReparacion, String pieza, String nombreTaller, int numeroCeldasDisp) throws Exception {
        super(descripcion, costo, fechaReparacion, pieza);
        try {
            if (nombreTaller == null || nombreTaller.isEmpty()) {
                throw new IllegalArgumentException("El nombre del taller no puede ser nulo o vacío");
            }
            if (numeroCeldasDisp < 0) {
                throw new IllegalArgumentException("El número de celdas disponibles no puede ser negativo");
            }

        this.sede = nombreTaller;
        this.numeroCeldasDisp = numeroCeldasDisp;

        } catch (Exception e) {
            throw new Exception("Error al crear el taller: " + e.getMessage(), e);
        }
        
        
    }

    public String getSede() {
        return sede;
    }

    public int getNumeroCeldasDisp() {
        return numeroCeldasDisp;
    }

    public void setNumeroCeldasDisp(int numeroCeldasDisp) {
        if (numeroCeldasDisp < 0) {
            throw new IllegalArgumentException("El número de celdas disponibles no puede ser negativo");
        }
        this.numeroCeldasDisp = numeroCeldasDisp;
    }    
    
}
