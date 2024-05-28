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

    public Horarios(int idHorarios, Rutas idRuta, Time horaLLegada, Time horaSalida) {
        this.idHorarios = idHorarios;
        this.Ruta = idRuta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
    }

    public Horarios(Rutas idRuta, Time horaLLegada, Time horaSalida) {
        this.Ruta = idRuta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
    }

    public Horarios() {
    }

    public int getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(int idHorarios) {
        this.idHorarios = idHorarios;
    }

    public Rutas getIdRuta() {
        return Ruta;
    }

    public void setIdRuta(Rutas idRuta) {
        this.Ruta = idRuta;
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

    @Override
    public String toString() {
        return "Horarios{" + "idHorarios=" + idHorarios + ", Ruta=" + Ruta + ", horaLLegada=" + horaLLegada + ", horaSalida=" + horaSalida + '}';
    }
    
    
}

