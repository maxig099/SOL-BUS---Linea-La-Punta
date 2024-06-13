package accesoADatos;

import entidades.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
        String sql = "INSERT INTO pasajes(id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, nroButaca, precio) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, Date.valueOf(pasaje.getFechaViaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHoraViaje()));
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            
            ps.executeUpdate();
            ResultSet idPasaje = ps.getGeneratedKeys();

            if (idPasaje.next()) {
                pasaje.setIdPasaje(idPasaje.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta exitosa");
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
                pasaje.setAsiento(rs.getInt("nroButaca"));
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

    public void eliminarVenta(int id) {
        String sql = "DELETE FROM pasajes WHERE id_pasajes = ?";
        
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
  public ArrayList<Pasaje> listarVentasXPasajero(int id) {
        ArrayList<Pasaje> listaVentas = new ArrayList<>();
        String sql = "SELECT * FROM pasajes WHERE id_pasajero  = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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
                pasaje.setAsiento(rs.getInt("nroButaca"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                
                listaVentas.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex);
        }
        return listaVentas;
    }

    public ArrayList<Pasaje> listarVentas() {
        ArrayList<Pasaje> listaVentas = new ArrayList<>();
        String sql = "SELECT * FROM pasajes";
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
                pasaje.setAsiento(rs.getInt("nroButaca"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                
                listaVentas.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex);
        }
        return listaVentas;
    }
        
    //LISTO LOS ASIENTOS VENDIDOS DE DETERMINADO VIAJE Y COLECTIVO
    public ArrayList<Integer> AsientosVendidos(int id_colectivo, int id_ruta, LocalDate fechaViaje, LocalTime horaViaje){
        ArrayList<Integer> listaAsientosAsig = new ArrayList<>();
        
        String sql = "SELECT p.nroButaca FROM pasajes p "
                    + "WHERE p.id_colectivo = ? AND p.id_ruta = ? AND p.fecha_viaje = ? AND p.hora_viaje = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_colectivo);
            ps.setInt(2, id_ruta);
            ps.setDate(3, Date.valueOf(fechaViaje));
            ps.setTime(4, Time.valueOf(horaViaje));
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listaAsientosAsig.add(rs.getInt(1));                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes" + ex);
        }
        return listaAsientosAsig;
    }
    
    
      /* public Pasaje buscarVenta(Date fecha, Time hora,int ruta) {
        String sql = "SELECT * FROM colectivos\n" +
"JOIN pasajes ON colectivos.id_colectivo = pasajes.id_colectivo\n" +
"WHERE pasajes.fecha_viaje = \"2024-06-09\" AND pasajes.hora_viaje = \"12:00:00\" AND pasajes.id_ruta = 7 ";
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
                pasaje.setAsiento(rs.getInt("nroButaca"));
                pasaje.setPrecio(rs.getDouble("precio"));                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una pasaje con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return pasaje;
    }*/

/*    public void modificarVenta(Pasaje pasaje) {
        String sql = "UPDATE pasajes SET id_pasajero = ?, id_colectivo = ?, id_ruta = ?, fecha_viaje = ?, hora_viaje = ?, asiento = ?, precio = ? WHERE id_pasajes = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, pasaje.getFechaViaje().);
            ps.setTime(5, pasaje.getHoraViaje());
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.setInt(8, pasaje.getIdPasaje());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se modificó exitosamente la pasaje");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la pasaje a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
    }*/
    
    public ArrayList<Pasaje> prueba(String sql) {
        ArrayList<Pasaje> listaPasajes = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                
                pasaje.setIdPasaje(rs.getInt("id_pasajes"));
                Pasajeros psjr = new PasajerosData().buscarPasajero(rs.getInt("id_pasajero"));
                pasaje.setPasajero(psjr);
                Colectivos cole = new ColectivosData().buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(cole);
                Rutas ruta = new RutasData().buscarRuta(rs.getInt("id_ruta"));
                pasaje.setRuta(ruta);
                pasaje.setFechaViaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("nroButaca"));
                pasaje.setPrecio(rs.getDouble("precio"));       
                
                listaPasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex);
        }
        return listaPasajes;
    }    

}

