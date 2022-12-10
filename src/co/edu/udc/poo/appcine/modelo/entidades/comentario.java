/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class comentario {
    //METODO CONTRUCTOR POR DEFECTO

    public comentario() {

    }

//PROPIEDADES
    public String nombreUsuario;
    public int edad;
    public String fecha;
    public String calificacion;
    public String comentario;
    public int numeroComentario;

//METODOR CONTRUCTOR CON PARAMETROS
    public comentario(String nombreUsuario, int edad, String fecha, String calificacion,
            String comentario, int numeroComentario) {
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.numeroComentario = numeroComentario;
    }

//GETTERS
    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public int getedad() {
        return edad;
    }

    public String getfecha() {
        return fecha;
    }

    public String getcalificacion() {
        return calificacion;
    }

    public String getcomentario() {
        return comentario;
    }

    public int getnumeroComentario() {
        return numeroComentario;
    }

//SETTERS
    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public void setcalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public void setcomentario(String comentario) {
        this.comentario = comentario;
    }

    public void setnumeroComentario(int numeroComentario) {
        this.numeroComentario = numeroComentario;
    }
}
