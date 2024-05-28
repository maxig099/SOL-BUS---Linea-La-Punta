/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Maxi Gomez
 */
public class Colectivos {
    private int idColectivo;
    private String matricula;
    private String marca;
    private String modelo;
    private int capacidad;

    public Colectivos(int idColectivo, String matricula, String marca, String modelo, int capacidad) {
        this.idColectivo = idColectivo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public Colectivos(String matricula, String marca, String modelo, int capacidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public Colectivos() {
    }
    
    

    public int getIdColectivo() {
        return idColectivo;
    }

    public void setIdColectivo(int idColectivo) {
        this.idColectivo = idColectivo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Colectivos{" + "idColectivo=" + idColectivo + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
    
}
