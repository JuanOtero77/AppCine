/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class funcion {
    //METODO CONTRUCTOR POR DEFECTO

    public funcion() {

    }

//PROPIEDADES
    public String diaExhibicion;
    public String horaExhibicion;
    public String pelicula;
    public String salaExhibicion;
//METODOR CONTRUCTOR CON PARAMETROS
    public funcion(String diaExhibicion, String horaExhibicion, String pelicula, String salaExhibicion) {
        this.diaExhibicion = diaExhibicion;
        this.horaExhibicion = horaExhibicion;
        this.pelicula = pelicula;
        this.salaExhibicion = salaExhibicion;
    }

//GETTERS
    public String getdiaExhibicion() {
        return diaExhibicion;
    }

    public String gethoraExhibicion() {
        return horaExhibicion;
    }

    public String getpelicula() {
        return pelicula;
    }
    
    public String getsalaExhibicion(){
        return salaExhibicion;
    }

//SETTERS
    public void setdiaExhibicion(String diaExhibicion) {
        this.diaExhibicion = diaExhibicion;
    }

    public void sethoraExhibicion(String horaExhibicion) {
        this.horaExhibicion = horaExhibicion;
    }

    public void setpelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
    public void setsalaExhibicion(String salaExhibicion){
        this.salaExhibicion = salaExhibicion;
    }
}
