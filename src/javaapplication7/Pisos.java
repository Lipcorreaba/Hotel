/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class Pisos {
    private int numero;
    private Habitaciones[] habitaciones;

    public Pisos() {
        this.numero = 0;
        this.habitaciones=new Habitaciones[5];
        for(int i=0;i<5;i++){
            this.habitaciones[i].setNumero((numero*100)+i);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Habitaciones[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitaciones[] habitaciones) {
        this.habitaciones = habitaciones;
    }
    
}
