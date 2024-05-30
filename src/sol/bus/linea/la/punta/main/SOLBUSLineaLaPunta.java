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
    Pasajeros psjr = new Pasajeros(1, "Lorenzo", "Muñoz", 40326787, "muñoz@lor.com", 266546636);
     //PasajerosData x = new PasajerosData();
    // x.crearPasajero(psj);
    //x.buscarPasajero(1);
    // x.modificarPasajero(psj);
    // x.eliminarPasajeros(2);
    /* for (Pasajeros pasaj : x.listarPasajeros()) {
         System.out.println(psj);
     }*/
    
        //PRUEBAS RUTA
    Rutas ruta = new Rutas(1, "Naschel", "Merlo", Time.valueOf("01:30:00"), true);
    //RutasData x = new RutasData();
    //x.crearRuta(ruta);
    //x.buscarRuta(1);
    //x.eliminarRuta(1);
    //x.modificarRuta(ruta);
    /*for(Rutas rutas : x.listarRutas()) {
        System.out.println(rutas);
    }*/
    
        //PRUEBAS HORARIOS
    //Horarios hor = new Horarios(1, ruta, Time.valueOf("17:00:00"), Time.valueOf("15:30:00"), true);
    //HorariosData x = new HorariosData();
    //x.crearHorario(hor);
    //x.buscarHorario(1);
    //x.modificarHorario(hor);
    //x.eliminarHorario(2);
    /*for (Horarios hora : x.listarHorarios()) {
       System.out.println(hora);   
    }*/
    
    
        //PRUEBAS COLECTIVO
    Colectivos cole = new Colectivos(2, "ABA-121", "Mercedenz Benz", "O 830", 45, true);
    //ColectivosData x = new ColectivosData();
    //x.crearColectivo(cole);
    //x.modificarColectivo(cole);
    //x.eliminarColectivo(2);
    /*for(Colectivos col : x.listarColectivos()) {
        System.out.println(col);
    }*/
    
    
        //PRUEBAS VENTAS 
    Pasaje psj = new Pasaje(1, psjr, ruta, cole, Date.valueOf("2024-06-05"), Time.valueOf("17:00:00"), 3, 400.00, true);
    PasajeData x = new PasajeData();
    //x.crearVenta(psj);
    x.buscarVenta(2);
    //x.modificarVenta(psj);
    //x.eliminarVenta(2);
    /*for(Pasaje pas : x.listarVentas()) {
        System.out.println(pas);
    }*/
    
    
    
    
    
    
    
    
    
    
    }
}
    

