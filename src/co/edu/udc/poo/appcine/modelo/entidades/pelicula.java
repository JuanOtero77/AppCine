/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class pelicula {
//METODO CONTRUCTOR POR DEFECTO

    public pelicula() {

    }

//PROPIEDADES
    public String tituloOriginal;
    public String tituloDistribucion;
    public String paisOrigen;
    public String genero;
    public String idiomaOriginal;
    public String subEspañol;
    public int añoProduccion;
    public String identificador;
    public String fechaEstreno;
    public String calificacion;
    public String resumen;
    public String duracion;

//METODOR CONTRUCTOR CON PARAMETROS
    public pelicula(String tituloOriginal, String tituloDistribucion, String paisOrigen, String genero,
            String idiomaOriginal, String subEspañol, int añoProduccion, String identificador,
            String fechaEstreno, String calificacion, String resumen, String duracion) {
        this.tituloOriginal = tituloOriginal;
        this.tituloDistribucion = tituloDistribucion;
        this.subEspañol = subEspañol;
        this.resumen = resumen;
        this.paisOrigen = paisOrigen;
        this.idiomaOriginal = idiomaOriginal;
        this.identificador = identificador;
        this.genero = genero;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.añoProduccion = añoProduccion;
    }

//GETTERS
    public String gettituloOriginal() {
        return tituloOriginal;
    }

    public String gettituloDistribucion() {
        return tituloDistribucion;
    }

    public String getsubEspañol() {
        return subEspañol;
    }

    public String getresumen() {
        return resumen;
    }

    public String getidiomaOriginal() {
        return idiomaOriginal;
    }

    public String getpaisOrigen() {
        return paisOrigen;
    }

    public String getidentificador() {
        return identificador;
    }

    public String getgenero() {
        return genero;
    }

    public String getfechaEstreno() {
        return fechaEstreno;
    }

    public String getduracion() {
        return duracion;
    }

    public String getcalificacion() {
        return calificacion;
    }

    public int getañoProduccion() {
        return añoProduccion;
    }

//SETTERS
    public void settituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public void settituloDistribucion(String tituloDistribucion) {
        this.tituloDistribucion = tituloDistribucion;
    }

    public void setsubEspañol(String subEspañol) {
        this.subEspañol = subEspañol;
    }

    public void setresumen(String resumen) {
        this.resumen = resumen;
    }

    public void setidiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public void setpaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setidentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public void setfechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setduracion(String duracion) {
        this.duracion = duracion;
    }

    public void setcalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public void setañoProduccion(int añoProduccion) {
        this.añoProduccion = añoProduccion;
    }
}
