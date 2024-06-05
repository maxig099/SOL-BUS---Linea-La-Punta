/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol.bus.linea.la.punta.main;

import accesoADatos.*;
import entidades.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

/**
 *
 * @author Maxi Gomez
 */
public class SOLBUSLineaLaPunta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBAS PASAJERO
    Pasajeros psjr = new Pasajeros( "Agustin", "Perez", "4564564", "holala@esteb.com", "2664554636",true);
    PasajerosData x = new PasajerosData();
    //x.guardarPasajero(psjr);
    //x.buscarPasajeroDNI("40326787");
    //x.modificarPasajero(psjr);
    //x.eliminarPasajeros(5);
    /*for (Pasajeros pasaj : x.listarPasajeros()) {
         System.out.println(pasaj);
     }*/
    
        //PRUEBAS RUTA
//    Rutas ruta = new Rutas(3, "San Luis", "Merlo", LocalTime.of(3, 10), true);
    //RutasData x = new RutasData();
    //x.guardarRuta(ruta);
    //x.buscarRuta(2);
    //x.eliminarRuta(2);
    //x.modificarRuta(ruta);
    /*for(Rutas rutas : x.listarRutas()) {
        System.out.println(rutas);
    }*/
    
        //PRUEBAS HORARIOS
//    Horarios hor = new Horarios(3, ruta, LocalTime.of(18,0), true);
//    HorariosData x = new HorariosData();
    //x.guardarHorario(hor);
    //x.buscarHorario(3);
    //x.modificarHorario(hor);
    //x.eliminarHorario(3);
    /*for (Horarios hora : x.listarHorarios()) {
       System.out.println(hora);   
    }*/
    
    
        //PRUEBAS COLECTIVO
    //Colectivos cole = new Colectivos(2, "ATA-521", "Scania", "K 130", 50, true);
    //ColectivosData x = new ColectivosData();
    //x.guardarColectivo(cole);
    //x.modificarColectivo(cole);
    //x.buscarColectivo(1);
    //x.eliminarColectivo(2);
    /*for(Colectivos col : x.listarColectivos()) {
        System.out.println(col);
    }*/
    
    
        //PRUEBAS VENTAS 
    //Pasaje psj = new Pasaje(psjr, ruta, cole, LocalDate.of(2024, 6, 4), LocalTime.of(17, 0), 4, 4000.00, true);
    //PasajeData x = new PasajeData();
    //x.guardarPasaje(psj);
    //x.buscarPasajes(2);
    //x.modificarVenta(psj);
    //x.eliminarVenta(3);
    /*for(Pasaje pas : x.listarVentas()) {
        System.out.println(pas);
    }*/
    
    
    
    
    }
}
    

