/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Maxi Gomez
 */
public class Ventas {
    private int idPasaje;
    private Pasajeros Pasajero;
    private Rutas Ruta;
    private Colectivos colectivo;
    private Date fechaViaje;
    private Time horaViaje;
    private int asiento;
    private double precio;

    public Ventas(int idPasaje, Pasajeros Pasajero, Rutas Ruta, Colectivos colectivo, Date fechaViaje, Time horaViaje, int asiento, double precio) {
        this.idPasaje = idPasaje;
        this.Pasajero = Pasajero;
        this.Ruta = Ruta;
        this.colectivo = colectivo;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Ventas(Pasajeros Pasajero, Rutas Ruta, Colectivos colectivo, Date fechaViaje, Time horaViaje, int asiento, double precio) {
        this.Pasajero = Pasajero;
        this.Ruta = Ruta;
        this.colectivo = colectivo;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Ventas() {
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Pasajeros getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajeros Pasajero) {
        this.Pasajero = Pasajero;
    }

    public Rutas getRuta() {
        return Ruta;
    }

    public void setRuta(Rutas Ruta) {
        this.Ruta = Ruta;
    }

    public Colectivos getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivos colectivo) {
        this.colectivo = colectivo;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Time getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(Time horaViaje) {
        this.horaViaje = horaViaje;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idPasaje=" + idPasaje + ", Pasajero=" + Pasajero + ", Ruta=" + Ruta + ", colectivo=" + colectivo + ", fechaViaje=" + fechaViaje + ", horaViaje=" + horaViaje + ", asiento=" + asiento + ", precio=" + precio + '}';
    }
    
    
    
}
