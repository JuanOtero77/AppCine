/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.appcine.modelo.entidades;

/**
 *
 * @author juand
 */
public class promocion {
        //METODO CONTRUCTOR POR DEFECTO

    public promocion() {

    }

//PROPIEDADES
    public String porcentajeDescuento;
    public String descripcion;
    
//METODOR CONTRUCTOR CON PARAMETROS
    public promocion(String porcentajeDescuento, String descripcion) {
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento ;
    }

//GETTERS
    public String getdescripcion() {
        return descripcion;
    }

    public String getporcentajeDescuento() {
        return porcentajeDescuento;
    }

//SETTERS
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setporcentajeDescuento(String porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
