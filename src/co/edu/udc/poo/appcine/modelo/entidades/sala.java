/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class sala {
//METODO CONTRUCTOR POR DEFECTO

    public sala() {

    }
//PROPIEDADES
    public String nombreSala;
    public int numeroSala;
    public int numeroButacas;

//METODOR CONTRUCTOR CON PARAMETROS
    public sala(String nombreSala, int numeroSala, int numeroButacas) {
        this.nombreSala = nombreSala;
        this.numeroButacas = numeroButacas;
        this.numeroSala = numeroSala;
    }
//GETTERS

    public String getSala() {
        return nombreSala;
    }

    public int getNumeroButacas() {
        return numeroButacas;
    }

    public int getNumerosala() {
        return numeroSala;
    }
//SETTERS

    public void setSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public void setNumeroButacas(int numeroButacas) {
        this.numeroButacas = numeroButacas;
    }

    public void setNumerosala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
}
