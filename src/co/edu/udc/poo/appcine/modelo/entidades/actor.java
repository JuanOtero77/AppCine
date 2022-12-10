/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class actor {

    //METODO CONTRUCTOR POR DEFECTO
    public actor() {

    }
//PROPIEDADES
    public String nombreActor;
    public String PersonajeActor;
    public int edadActor;
    public String nacionalidadActor;
    public String numPeliculaActor;

//METODOR CONTRUCTOR CON PARAMETROS
    public actor(String nombreActor, String PersonajeActor, int edadActor, String nacionalidadActor, String numPeliculaActor) {
        this.nombreActor = nombreActor;
        this.PersonajeActor = PersonajeActor;
        this.edadActor = edadActor;
        this.nacionalidadActor = nacionalidadActor;
        this.numPeliculaActor = numPeliculaActor;
    }
//GETTERS

    public String getnombreActor() {
        return nombreActor;
    }

    public String getPersonajeActor() {
        return PersonajeActor;
    }

    public int getedadActor() {
        return edadActor;
    }

    public String getnacionalidadActor() {
        return nacionalidadActor;
    }

    public String getnumPeliculaActor() {
        return numPeliculaActor;
    }
//SETTERS

    public void setnombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public void setPersonajeActor(String PersonajeActor) {
        this.PersonajeActor = PersonajeActor;
    }

    public void setedadActor(int edadActor) {
        this.edadActor = edadActor;
    }

    public void setnacionalidadActor(String nacionalidadActor) {
        this.nacionalidadActor = nacionalidadActor;
    }

    public void setnumPeliculaActor(String numPeliculaActor) {
        this.numPeliculaActor = numPeliculaActor;
    }
}
