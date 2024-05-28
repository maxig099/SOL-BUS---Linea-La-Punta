/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO pasajeros(nombre, apellido, dni, correo, telefono, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setLong(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            
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
                pasaj.setEstado(rs.getBoolean("estado"));
                
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
               + " WHERE id_Pasajero = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, psj.getNombre());
            ps.setString(2, psj.getApellido());
            ps.setInt(3, psj.getDni());
            ps.setString(4, psj.getCorreo());
            ps.setLong(5, psj.getTelefono());
            ps.setInt(6, psj.getIdPasajero());
            int filasAf = ps.executeUpdate();
            if(filasAf > 0) {
                JOptionPane.showMessageDialog(null, "Se modifico el pasajero exitosamente");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al modificar" );
            }
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
   }
   
   public void eliminarPasajeros(int id) {
       String sql = "UPDATE pasajeros SET estado= 0"
               + " WHERE id_Pasajero = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            int filasAf = ps.executeUpdate();
            if (filasAf > 0 ) {
                JOptionPane.showMessageDialog(null, "Pasajero eliminado correctamente");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el pasajero a eliminar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
       
   }
   
   public List<Pasajeros> listarPasajeros() {
       String sql = "SELECT * FROM pasajeros WHERE estado = 1";
       ArrayList<Pasajeros> psj = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while(rs.next()) {
                 Pasajeros pasaj = new Pasajeros();
                 pasaj.setNombre(rs.getString("nombre"));
                 pasaj.setApellido(rs.getString("apellido"));
                 pasaj.setDni(rs.getInt("dni"));
                 pasaj.setCorreo(rs.getString("correo"));
                 pasaj.setTelefono(rs.getLong("telefono"));
                 
                 psj.add(pasaj);
                 
             }
             ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajerosData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psj;
   }
}
