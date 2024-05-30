/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

/**
 *
 * @author Maxi Gomez
 */
import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PasajeData {
    private Connection con;
    private PasajerosData pasajeroData = new PasajerosData();
    private RutasData rutaData = new RutasData();
    private ColectivosData coleData = new ColectivosData();
    

    public PasajeData() {
        con = Conexion.getConexion();
        
    }

    public void crearVenta(Pasaje venta) {
        String sql = "INSERT INTO pasajes(id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getPasajero().getIdPasajero());
            ps.setInt(2, venta.getColectivo().getIdColectivo());
            ps.setInt(3, venta.getRuta().getIdRuta());
            ps.setDate(4, venta.getFechaViaje());
            ps.setTime(5, venta.getHoraViaje());
            ps.setInt(6, venta.getAsiento());
            ps.setDouble(7, venta.getPrecio());
            ps.setBoolean(8, true);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se creó exitosamente la venta");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajeData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public Pasaje buscarVenta(int id) {
        String sql = "SELECT * FROM pasajes WHERE id_pasajes = ?";
        Pasaje venta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                venta = new Pasaje();
                venta.setIdPasaje(rs.getInt("id_pasajes"));
                Pasajeros psjr = pasajeroData.buscarPasajero(rs.getInt("id_pasajero"));
                venta.setPasajero(psjr);
                Colectivos cole = coleData.buscarColectivo(rs.getInt("id_colectivo"));
                venta.setColectivo(cole);
                Rutas ruta = rutaData.buscarRuta(rs.getInt("id_ruta"));
                venta.setRuta(ruta);
                venta.setFechaViaje(rs.getDate("fecha_viaje"));
                venta.setHoraViaje(rs.getTime("hora_viaje"));
                venta.setAsiento(rs.getInt("asiento"));
                venta.setPrecio(rs.getDouble("precio"));
                
                System.out.println(venta);
            } else {
                JOptionPane.showMessageDialog(null, "No existe una venta con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajeData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return venta;
    }

    public void modificarVenta(Pasaje venta) {
        String sql = "UPDATE pasajes SET id_pasajero = ?, id_colectivo = ?, id_ruta = ?, fecha_viaje = ?, hora_viaje = ?, asiento = ?, precio = ? WHERE id_pasajes = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getPasajero().getIdPasajero());
            ps.setInt(2, venta.getColectivo().getIdColectivo());
            ps.setInt(3, venta.getRuta().getIdRuta());
            ps.setDate(4, venta.getFechaViaje());
            ps.setTime(5, venta.getHoraViaje());
            ps.setInt(6, venta.getAsiento());
            ps.setDouble(7, venta.getPrecio());
            ps.setInt(8, venta.getIdPasaje());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se modificó exitosamente la venta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la venta a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajeData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public void eliminarVenta(int id) {
        String sql = "UPDATE pasajes SET estado = 0 WHERE id_pasajes = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente la venta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la venta a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajeData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }

    public List<Pasaje> listarVentas() {
        String sql = "SELECT * FROM pasajes";
        ArrayList<Pasaje> vent = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje venta = new Pasaje();
                venta.setIdPasaje(rs.getInt("id_pasajes"));
                Pasajeros psj = pasajeroData.buscarPasajero(rs.getInt("id_pasajero"));
                venta.setPasajero(psj);
                Colectivos cole = coleData.buscarColectivo(rs.getInt("id_colectivo"));
                venta.setColectivo(cole);
                Rutas ruta = rutaData.buscarRuta(rs.getInt("id_ruta"));
                venta.setRuta(ruta);
                venta.setFechaViaje(rs.getDate("Fecha_Viaje"));
                venta.setHoraViaje(rs.getTime("Hora_Viaje"));
                venta.setAsiento(rs.getInt("Asiento"));
                venta.setPrecio(rs.getDouble("Precio"));
                vent.add(venta);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PasajeData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return vent;
    }
}

