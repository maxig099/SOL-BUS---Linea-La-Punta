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
        String sql = "UPDATE ventas SET ID_Pasajero = ?, ID_Colectivo = ?, ID_Ruta = ?, Fecha_Viaje = ?, Hora_Viaje = ?, Asiento = ?, Precio = ? WHERE ID_Pasaje = ?";
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
        String sql = "DELETE FROM ventas WHERE ID_Pasaje = ?";
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
        String sql = "SELECT * FROM ventas";
        ArrayList<Pasaje> vent = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje venta = new Pasaje();
                venta.setIdPasaje(rs.getInt("ID_Pasaje"));
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

