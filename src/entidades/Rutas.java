/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Time;

/**
 *
 * @author Maxi Gomez
 */
public class Rutas {
    private int idRutas;
    private String origen;
    private String destino;
    private Time duracionEst;

    public Rutas(int idRutas, String origen, String destino, Time duracionEst) {
        this.idRutas = idRutas;
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
    }

    public Rutas(String origen, String destino, Time duracionEst) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
    }

    public Rutas() {
    }

    public int getIdRutas() {
        return idRutas;
    }

    public void setIdRutas(int idRutas) {
        this.idRutas = idRutas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Time getDuracionEst() {
        return duracionEst;
    }

    public void setDuracionEst(Time duracionEst) {
        this.duracionEst = duracionEst;
    }

    @Override
    public String toString() {
        return "Rutas{" + "idRutas=" + idRutas + ", origen=" + origen + ", destino=" + destino + ", duracionEst=" + duracionEst + '}';
    }
    
    
    
}

