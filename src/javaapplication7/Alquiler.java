/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Alquiler {
    private Fecha fecha;
    private Habitaciones habitacion;
    private Personas responsable;
    private ArrayList<Personas> personas;
    private double precio;
    public Alquiler() {
        this.fecha = new Fecha();
        this.habitacion = new Habitaciones();
        this.personas = new ArrayList<Personas>();
        this.precio = habitacion.getPrecio();
        this.responsable=new Personas();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitaciones habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Personas getResponsable() {
        return responsable;
    }

    public void setResponsable(Personas responsable) {
        this.responsable = responsable;
    }
    
}
