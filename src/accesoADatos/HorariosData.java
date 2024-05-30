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
public class HorariosData {
    
    private Connection con;
    private RutasData rutaData = new RutasData();
    

    public HorariosData() {
        con = Conexion.getConexion();
    }

    public void crearHorario(Horarios horario) {
        String sql = "INSERT INTO horarios(id_ruta, hora_salida, hora_llegada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, horario.getHoraSalida());
            ps.setTime(3, horario.getHoraLLegada());
            ps.setBoolean(4, horario.isEstado());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se creó exitosamente el horario");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HorariosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public Horarios buscarHorario(int id) {
        String sql = "SELECT * FROM horarios WHERE id_horario = ?";
        Horarios horario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                horario = new Horarios();
                horario.setIdHorarios(rs.getInt("id_horario"));
                Rutas ruta = rutaData.buscarRuta(rs.getInt("id_ruta"));
                horario.setRuta(ruta);
                horario.setHoraSalida(rs.getTime("hora_salida"));
                horario.setHoraLLegada(rs.getTime("hora_llegada"));
                
                System.out.println(horario);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un horario con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HorariosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return horario;
    }

    public void modificarHorario(Horarios horario) {
        String sql = "UPDATE horarios SET ID_Ruta = ?, Hora_Salida = ?, Hora_Llegada = ? WHERE ID_Horario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, horario.getHoraSalida());
            ps.setTime(3, horario.getHoraLLegada());
            ps.setInt(4, horario.getIdHorarios());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se modificó exitosamente el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HorariosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public void eliminarHorario(int id) {
        String sql = "UPDATE horarios SET estado= 0"
               + " WHERE id_horario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HorariosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public List<Horarios> listarHorarios() {
        String sql = "SELECT * FROM horarios";
        List<Horarios> horarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Horarios horario = new Horarios();
                horario.setIdHorarios(rs.getInt("id_horario"));
                Rutas ruta = rutaData.buscarRuta(rs.getInt("id_ruta"));
                horario.setRuta(ruta);
                horario.setHoraSalida(rs.getTime("hora_salida"));
                horario.setHoraLLegada(rs.getTime("hora_llegada"));
                horarios.add(horario);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HorariosData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return horarios;
    }
}


