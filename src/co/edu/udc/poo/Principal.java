/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udc.poo;

import co.edu.udc.poo.appcine.modelo.entidades.actor;
import co.edu.udc.poo.appcine.modelo.entidades.cinema;
import co.edu.udc.poo.appcine.modelo.entidades.comentario;
import co.edu.udc.poo.appcine.modelo.entidades.director;
import co.edu.udc.poo.appcine.modelo.entidades.funcion;
import co.edu.udc.poo.appcine.modelo.entidades.pelicula;
import co.edu.udc.poo.appcine.modelo.entidades.promocion;
import co.edu.udc.poo.appcine.modelo.entidades.sala;

/**
 *
 * @author juand
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // INFORMACION DE LA PELICULA 
    
    //PELICULA
        pelicula pelicula1 = new pelicula();
        pelicula1.settituloDistribucion("BLACK ADAM");
        pelicula1.settituloOriginal("BLACK ADAM");
        pelicula1.setgenero("Acción. Fantástico | Superhéroes. DC Comics");
        pelicula1.setidiomaOriginal("ingles");
        pelicula1.setsubEspañol("si");
        pelicula1.setpaisOrigen("Estados Unidos");
        pelicula1.setañoProduccion(2019);
        pelicula1.setduracion("2 horas y 5 minutos");
        pelicula1.setcalificacion("+12 años");
        pelicula1.setfechaEstreno("20/octubre/2022");
        pelicula1.setresumen("Casi 5.000 años después de haber sido dotado de los poderes omnipotentes "
                + "\nde los antiguos dioses "+"-y encarcelado con la misma rapidez-, Black Adam (Johnson) "
                + "\nes liberado de su tumba terrenal, "+"listo para desatar su forma única de justicia en el mundo moderno.");
        pelicula1.setidentificador("425367585641312");
        
        System.out.println("INFORMACION DE LA PELICULA: \n"+"\nPElICULA\n "+"\nTitulo de distribucion: "+pelicula1.gettituloDistribucion()+
                "\nTitulo original: "+pelicula1.gettituloOriginal()+"\nGenero: "+pelicula1.getgenero()
                +"\nIdioma original: "+pelicula1.getidiomaOriginal()+"\nsubtitulos en español: "+pelicula1.getsubEspañol()
                +"\nPais de origen: "+pelicula1.getpaisOrigen()+"\nAño de produccion: "+pelicula1.getañoProduccion()
                +"\nDuracion: "+pelicula1.getduracion()+"\nCalificacion: "+pelicula1.getcalificacion()
                +"\nFecha de estreno: "+pelicula1.getfechaEstreno()+"\nResumen: "+pelicula1.getresumen());
        
    // LISTA DE LOS DIRECTORES Y EL REPARTO DE LA PELICULA
    
    //DIRECTORES
        director director1 = new director();
        director1.setnombreDirec("Antonio Rudiger");
        director1.setnacionalidadDirec("Venenezolano");
        director1.setedadDirec(59);
        director1.setnumPeliculaDirec("9 peliculas");
        
        System.out.println("\nLISTA DE DIRECTORES Y EL REPARTO DE LA PELICULA: \n"+"\nDIRECTORES\n"+"\nNombre: "
                +director1.getnombreDirec()+"\nNacionalidad: "+director1.getnacionalidadDirec()
                +"\nEdad: "+director1.getedadDirec()+"años"+"\nCantidad de peliculas: "+director1.getnumPeliculaDirec());
        
    //ACTORES
        //actor 1
        actor actor1 = new actor();
        actor1.setnombreActor("Dwayne Johnson");
        actor1.setnacionalidadActor("Estadounidense");
        actor1.setPersonajeActor("Black Adam");
        actor1.setedadActor(52);
        actor1.setnumPeliculaActor("19 peliculas");
        
        // actor 2
        actor actor2 = new actor();
        actor2.setnombreActor("Pierce Brosnan");
        actor2.setnacionalidadActor("Estadounidense");
        actor2.setPersonajeActor("Dr.fate");
        actor2.setedadActor(60);
        actor2.setnumPeliculaActor("30 peliculas");
        
        System.out.println("\nREPARTO DE LA PELICULA\n"+"\n1. Nombre: "+actor1.getnombreActor()
                           +"\nNacionalidad: "+actor1.getnacionalidadActor()+"\nPersonaje: "
                           +actor1.getPersonajeActor()+"\nEdad: "+actor1.getedadActor()+"años"
                           +"\nCantidad de peliculas: "+actor1.getnumPeliculaActor());
        
        System.out.println("\n2. Nombre: "+actor2.getnombreActor()
                           +"\nNacionalidad: "+actor2.getnacionalidadActor()+"\nPersonaje: "
                           +actor2.getPersonajeActor()+"\nEdad: "+actor2.getedadActor()+"años"
                           +"\nCantidad de peliculas: "+actor2.getnumPeliculaActor());
        
    //CINEMA
    
    //INFORMACION DEL CINEMA
    cinema cinema1 = new cinema();
    cinema1.setnombre("Cine de la plaza de armas");
    cinema1.setciudad("santiago");
    cinema1.setdireccion("calle 42B - #29A - 82");
    cinema1.setnumeroSalas(5);
    cinema1.settelefono("+57 3043215979");
    
        System.out.println("\nINFORMACION DEL CINEMA: \n"+"\nCINEMA\n"+"\nNombre: "+cinema1.getnombre()
                           +"\nCiudad: "+cinema1.getciudad()+"\nDireccion: "+cinema1.getdireccion()
                            +"Numero de salas: "+cinema1.getnumeroSalas()+"\nTelefono: "+cinema1.gettelefono());
    
    //FUNCION
    
    //INFORMACION SOBRE LAS FUNCIONES DEL CINEMA
    funcion funcion1 = new funcion();
    funcion1.setdiaExhibicion("viernes 20 de octubre del 2022");
    funcion1.sethoraExhibicion("7:30 PM");
    funcion1.setpelicula("BLACK ADAM");
    funcion1.setsalaExhibicion("sala 1");
    
        System.out.println("\nINFORMACION SOBRE LAS FUNCIONES DEL CINEMA: \n"+"\nFUNCIONES\n"+"\nDia de la semana:"
                            +funcion1.getdiaExhibicion()+"\nHora de comienzo: "+funcion1.gethoraExhibicion()
                            +"\nSala: "+funcion1.getsalaExhibicion()+"\nPelicula: "+funcion1.getpelicula());
    
    //SALAS
    
    //INFORMACION SOBRE LAS SALAS
    sala sala1 = new sala();
    sala1.setSala("sala vibrasound");
    sala1.setNumerosala(1);
    sala1.setNumeroButacas(45);
    
        System.out.println("\nINFORMACION SOBRE LAS SALAS: \n"+"\nSALAS\n"+"\nNombre de la sala: "+sala1.getSala()
                            +"\nNumero de la sala: "+"sala "+sala1.getNumerosala()+"\nNumero de butacas: "
                            +sala1.getNumeroButacas());
    
    //PROMOCIONES
    
    // INFORMACION REFERENTE A LAS PROMOCIONES DEL CINEMA
    promocion promo1 = new promocion();
    promo1.setdescripcion("Los viernes desde las 7:00 PM en la sala vibrasound, en el cine de la plaza de armas"
            + "para cualquier funcion, \nun 50% de descuento para los estudiantes de la universidad de cartagena.");
    promo1.setporcentajeDescuento("50% de descuento");
    
        System.out.println("\nINFORMACION SOBRE LAS PROMOCIONES:\n"+"\nPROMOCIONES\n"+"\nDescripcion: "
                            +promo1.getdescripcion()+"\nDescuento que se aplica: "+promo1.getporcentajeDescuento());
    
    //COMENTARIOS
    
    //INFORMACION SOBRE LOS COMENTARIOS
    comentario comen1 = new comentario();
    comen1.setnombreUsuario("Marcus Rashford");
    comen1.setedad(19);
    comen1.setfecha("10/19/2022");
    comen1.setcalificacion("Muy buena");
    comen1.setcomentario("Fue una pelicula lleno de acción, con algo de buen humor mezclado en fragmentos. "
                        + "\nPierce Brosnan como el Dr. Fate lo sacó del estadio, estuvo increíble.");
    comen1.setnumeroComentario(1);
    
        System.out.println("\nINFORMACION SOBRE LOS COMENTARIOS: \n"+"\nCOMENTARIOS\n"+"\n1. "+"Nombre: "
                           +comen1.getnombreUsuario()+"\nEdad: "+comen1.getedad()+"\nFecha: "+comen1.getfecha()
                            +"\nCalificaion de la pelicula: "+comen1.getcalificacion()+"\nComentario: "+
                            comen1.getcomentario());
    }
}
