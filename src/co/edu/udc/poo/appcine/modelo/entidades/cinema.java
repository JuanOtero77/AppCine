/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class cinema {
//METODO CONTRUCTOR POR DEFECTO

    public cinema() {

    }

//PROPIEDADES
    public String nombre;
    public String ciudad;
    public int numeroSalas;
    public String direccion;
    public String telefono;

//METODOR CONTRUCTOR CON PARAMETROS
    public cinema(String nombre, String ciudad, int numeroSalas, String direccion, String telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroSalas = numeroSalas;
        this.direccion = direccion;
        this.telefono = telefono;
    }

//GETTERS
    public String getnombre() {
        return nombre;
    }

    public String getciudad() {
        return ciudad;
    }

    public int getnumeroSalas() {
        return numeroSalas;
    }

    public String getdireccion() {
        return direccion;
    }

    public String gettelefono() {
        return telefono;
    }

//SETTERS
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setnumeroSalas(int numeroSalas) {
        this.numeroSalas = numeroSalas;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
}
