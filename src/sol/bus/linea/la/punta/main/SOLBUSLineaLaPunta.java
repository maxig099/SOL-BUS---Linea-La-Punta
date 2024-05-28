/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol.bus.linea.la.punta.main;

import accesoADatos.*;
import entidades.*;

/**
 *
 * @author Maxi Gomez
 */
public class SOLBUSLineaLaPunta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pasajeros psj = new Pasajeros(1, "Lorenzo", "Muñoz", 40326787, "muñoz@lor.com", 266546636);
       PasajerosData x = new PasajerosData();
    // x.crearPasajero(psj);
    
    //x.buscarPasajero(2);
     // x.modificarPasajero(psj);
      
     for (Pasajeros pasaj : x.listarPasajeros()) {
         System.out.println(psj);
     }
     
    // x.eliminarPasajeros(2);
    }
}
    

