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
public class Personas {
    private String nombre;
    private String apellido;
    private int id;
    private int tel;

    public Personas() {
        this.nombre = new String();
        this.apellido = new String();
        this.id = 0;
        this.tel = 0;
    }

    public Personas(String nombre, String apellido, int id, int tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tel = tel;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
}
