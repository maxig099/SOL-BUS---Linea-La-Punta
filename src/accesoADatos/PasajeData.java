package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PasajeData {
    private Connection con = null;
    private PasajerosData pasajeroData = null;
    private RutasData rutaData =  null;
    private ColectivosData coleData =  null;
    

    public PasajeData() {
        con = Conexion.getConexion();
        
    }

    public void guardarPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasajes(id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, Date.valueOf(pasaje.getFechaViaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHoraViaje()));
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.setBoolean(8, true);
            
            ps.executeUpdate();
            ResultSet idPasaje = ps.getGeneratedKeys();

            if (idPasaje.next()) {
                pasaje.setIdPasaje(idPasaje.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creó el pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Asiento Ocupado");               
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ventas" + ex);
            }
        }
    }

    public Pasaje buscarVenta(int id) {
        String sql = "SELECT * FROM pasajes WHERE id_pasajes = ?";
        Pasaje pasaje = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasaje = new Pasaje();
                
                pasaje.setIdPasaje(rs.getInt("id_pasajes"));
                Pasajeros psjr = pasajeroData.buscarPasajero(rs.getInt("id_pasajero"));
                pasaje.setPasajero(psjr);
                Colectivos cole = coleData.buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(cole);
                Rutas ruta = rutaData.buscarRuta(rs.getInt("id_ruta"));
                pasaje.setRuta(ruta);
                pasaje.setFechaViaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una pasaje con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return pasaje;
    }

//    public void modificarVenta(Pasaje pasaje) {
//        String sql = "UPDATE pasajes SET id_pasajero = ?, id_colectivo = ?, id_ruta = ?, fecha_viaje = ?, hora_viaje = ?, asiento = ?, precio = ? WHERE id_pasajes = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
//            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
//            ps.setInt(3, pasaje.getRuta().getIdRuta());
//            ps.setDate(4, pasaje.getFechaViaje().);
//            ps.setTime(5, pasaje.getHoraViaje());
//            ps.setInt(6, pasaje.getAsiento());
//            ps.setDouble(7, pasaje.getPrecio());
//            ps.setInt(8, pasaje.getIdPasaje());
//            int filasAfectadas = ps.executeUpdate();
//
//            if (filasAfectadas > 0) {
//                JOptionPane.showMessageDialog(null, "Se modificó exitosamente la pasaje");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró la pasaje a modificar");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
//        }
//    }

    public void eliminarVenta(int id) {
        String sql = "UPDATE pasajes SET estado = 0 WHERE id_pasajes = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la venta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la venta a eliminar");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes" + ex);
        }
    }

    public List<Pasaje> listarVentas() {
        ArrayList<Pasaje> listaVentas = new ArrayList<>();
        String sql = "SELECT * FROM pasajes WHERE estado  = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasajeroData = new PasajerosData();
                coleData = new ColectivosData();
                rutaData = new RutasData();
                
                pasaje.setIdPasaje(rs.getInt("id_pasajes"));
                pasaje.setPasajero(pasajeroData.buscarPasajero(rs.getInt("id_pasajero")));
                pasaje.setColectivo(coleData.buscarColectivo(rs.getInt("id_colectivo")));
                pasaje.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("Hora_Viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasaje.setEstado(rs.getBoolean("estado"));
                
                listaVentas.add(pasaje);
                
                
            }
            JOptionPane.showMessageDialog(null, "Pasajes listados");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex);
        }
        return listaVentas          ;
    }
}

