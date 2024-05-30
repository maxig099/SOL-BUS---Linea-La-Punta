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

public class RutasData {
    private Connection con = null;

    public RutasData() {
        con =  Conexion.getConexion();
    }

    public void crearRuta(Rutas ruta) {
        
        String sql = "INSERT INTO ruta(origen, destino, duracion_estimada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, ruta.getDuracionEst());
            ps.setBoolean(4, ruta.isEstado());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se creó exitosamente la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RutasData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public Rutas buscarRuta(int id) {
        String sql = "SELECT * FROM ruta WHERE id_ruta = ?";
        Rutas ruta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ruta = new Rutas();
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada"));
                
                System.out.println(ruta);
            } else {
                JOptionPane.showMessageDialog(null, "No existe una ruta con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RutasData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return ruta;
    }

    public void modificarRuta(Rutas ruta) {
        String sql = "UPDATE ruta SET origen= ?, destino= ?, duracion_estimada= ?  WHERE id_ruta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, ruta.getDuracionEst());
            ps.setInt(4, ruta.getIdRuta());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se modificó exitosamente la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RutasData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public void eliminarRuta(int id) {
        String sql = "UPDATE ruta SET estado= 0 WHERE id_ruta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RutasData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public List<Rutas> listarRutas() {
        String sql = "SELECT * FROM ruta";
        ArrayList<Rutas> rutas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RutasData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return rutas;
    }
}

