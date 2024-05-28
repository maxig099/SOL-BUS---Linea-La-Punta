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
    private int idRuta;
    private String origen;
    private String destino;
    private Time duracionEst;
    private boolean estado;

    public Rutas(int idRuta, String origen, String destino, Time duracionEst, boolean estado) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
        this.estado = estado;
    }

    public Rutas(String origen, String destino, Time duracionEst, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
        this.estado = estado;
    }

    public Rutas() {
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rutas{" + "idRuta=" + idRuta + ", origen=" + origen + ", destino=" + destino + ", duracionEst=" + duracionEst + ", estado=" + estado + '}';
    }

   
    
}

