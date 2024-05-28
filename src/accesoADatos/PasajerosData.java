/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maxi Gomez
 */
public class PasajerosData {
    private Connection con = null;
    
    public PasajerosData() {
        con = Conexion.getConexion();
    }
    
    public void crearPasajero(Pasajeros pasajero) {
        String sql = "INSERT INTO pasajeros(nombre, apellido, dni, correo, telefono) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setLong(5, pasajero.getTelefono());
            
            int filasAf = ps.executeUpdate();
            
            if (filasAf > 0) {
                JOptionPane.showMessageDialog(null,"Se creo exitosamente al pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }
    
   public void buscarPasajero(int id) {
       String sql = "SELECT * FROM pasajeros WHERE id_Pasajero = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pasajeros pasaj = new Pasajeros();
                pasaj.setIdPasajero(id);
                pasaj.setNombre(rs.getString("nombre"));
                pasaj.setApellido(rs.getString("apellido"));
                pasaj.setDni(rs.getInt("dni"));
                pasaj.setCorreo(rs.getString("correo"));
                pasaj.setTelefono(rs.getInt("telefono"));
                
                System.out.println(pasaj);
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe un pasajero con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
   } 
   
   public void modificarPasajero(Pasajeros psj) {
       String sql = "UPDATE pasajeros SET nombre= ?, apellido= ?, dni= ?, correo= ?, telefono= ? "
               + "WHERE id_Pasajero = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, psj.getNombre());
            ps.setString(2, psj.getApellido());
            ps.setInt(3, psj.getDni());
            ps.setString(4, psj.getCorreo());
            ps.setLong(5, psj.getTelefono());
            ps.setInt(6, psj.getIdPasajero());
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
