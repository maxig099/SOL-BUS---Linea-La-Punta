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
public class Horarios {
    private int idHorarios;
    private Rutas Ruta;
    private Time horaLLegada;
    private Time horaSalida;
    private boolean estado;

    public Horarios(int idHorarios, Rutas Ruta, Time horaLLegada, Time horaSalida, boolean estado) {
        this.idHorarios = idHorarios;
        this.Ruta = Ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horarios(Rutas Ruta, Time horaLLegada, Time horaSalida, boolean estado) {
        this.Ruta = Ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horarios() {
    }

    public int getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(int idHorarios) {
        this.idHorarios = idHorarios;
    }

    public Rutas getRuta() {
        return Ruta;
    }

    public void setRuta(Rutas Ruta) {
        this.Ruta = Ruta;
    }

    public Time getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(Time horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Horarios{" + "idHorarios=" + idHorarios + ", Ruta=" + Ruta.getOrigen()+ " - " + Ruta.getDestino() + ", horaLLegada=" + horaLLegada + ", horaSalida=" + horaSalida + ", estado=" + estado + '}';
    }

    
    
    
}

