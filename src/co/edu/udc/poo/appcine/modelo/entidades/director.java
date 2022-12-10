/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class director {

    //METODO CONTRUCTOR POR DEFECTO
    public director() {

    }
//PROPIEDADES
    public String nombreDirec;
    public String PersonajeDirec;
    public int edadDirec;
    public String nacionalidadDirec;
    public String numPeliculaDirec;

//METODOR CONTRUCTOR CON PARAMETROS
    public director(String nombreDirec, String PersonajeDirec, int edadDirec, String nacionalidadDirec, String numPeliculaDirec) {
        this.nombreDirec = nombreDirec;
        this.PersonajeDirec = PersonajeDirec;
        this.edadDirec = edadDirec;
        this.nacionalidadDirec = nacionalidadDirec;
        this.numPeliculaDirec = numPeliculaDirec;
    }
//GETTERS

    public String getnombreDirec() {
        return nombreDirec;
    }

    public String getPersonajeDirec() {
        return PersonajeDirec;
    }

    public int getedadDirec() {
        return edadDirec;
    }

    public String getnacionalidadDirec() {
        return nacionalidadDirec;
    }

    public String getnumPeliculaDirec() {
        return numPeliculaDirec;
    }
//SETTERS

    public void setnombreDirec(String nombreDirec) {
        this.nombreDirec = nombreDirec;
    }

    public void setPersonajeDirec(String PersonajeDirec) {
        this.PersonajeDirec = PersonajeDirec;
    }

    public void setedadDirec(int edadDirec) {
        this.edadDirec = edadDirec;
    }

    public void setnacionalidadDirec(String nacionalidadDirec) {
        this.nacionalidadDirec = nacionalidadDirec;
    }

    public void setnumPeliculaDirec(String numPeliculaDirec) {
        this.numPeliculaDirec = numPeliculaDirec;
    }
}
