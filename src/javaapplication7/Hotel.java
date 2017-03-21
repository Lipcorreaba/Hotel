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
public class Hotel {
    private Pisos[] pisos;
    private Alquiler[] alquiler;

    public Hotel() {
        this.pisos = new Pisos[3];
        this.alquiler = new Alquiler[305];
    }
    public void Alquilar_hab(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dia, mes y año");
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
        Fecha fecha=new Fecha(dia,mes,anio);
        System.out.println("Seleccione una habitacion (numero de habitacion)");
        for(int i=0;i<3;i++){
            for(int j=0;j<15;j++){
                if(alquiler[j].getHabitacion()==null){
                System.out.println(pisos[i].getHabitaciones()[j].getNumero() + " ... " + pisos[i].getHabitaciones()[j].getPrecio() + " Cap: " + pisos[i].getHabitaciones()[j].getCapacidad_maxima());
                }
            } 
        }
        int hab=leer.nextInt();
        alquiler[hab].setFecha(fecha);
        System.out.println("Para cuantas personas: ");
        int n=leer.nextInt();
        for(int h=0;h<3;h++){
            if(n<=pisos[h].getHabitaciones()[hab].getCapacidad_maxima()){
                System.out.println("Persona responsable de la habitacion: ");
                System.out.print("Nombre: ");
                String nombre=leer.nextLine();
                System.out.print("Apellido: ");
                String apellido=leer.nextLine();
                System.out.print("Cedula: ");
                int cc=leer.nextInt();
                System.out.print("Telefono: ");
                int tel=leer.nextInt();
                Personas p=new Personas(nombre, apellido, cc, tel);
                alquiler[hab].setResponsable(p);
                ArrayList<Personas> pe= new ArrayList<Personas>();
                for(int g=0;g<(hab-1);g++){      
                    System.out.print("Nombre: ");
                    nombre=leer.nextLine();
                    System.out.print("Apellido: ");
                    apellido=leer.nextLine();
                    System.out.print("Cedula: ");
                    cc=leer.nextInt();
                    System.out.print("Telefono: ");
                    tel=leer.nextInt();
                    p=new Personas(nombre, apellido, cc, tel);
                    pe.add(p);
                }
                alquiler[hab].setPersonas(pe);
            }
        }      
    }
    public void Listarpersonas(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero de habitacion");
        int num=leer.nextInt();
        System.out.println("Responsable: "+ alquiler[num].getResponsable());
    }
}
