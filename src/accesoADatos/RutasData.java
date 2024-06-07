package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RutasData {
    private Connection con = null;

    public RutasData() {
        con =  Conexion.getConexion();
    }

    public void guardarRuta(Rutas ruta) {
        
        String sql = "INSERT INTO ruta(origen, destino, duracion_estimada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracionEst()));
            ps.setBoolean(4, ruta.isEstado());
            
            ps.executeUpdate();            
            ResultSet idRuta = ps.getGeneratedKeys();
            
            if (idRuta.next()) {
                ruta.setIdRuta(idRuta.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creó exitosamente la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                System.out.println("Ruta Repetida");

            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
            }
        }
    }

    public Rutas buscarRuta(int id) {
        String sql = "SELECT * FROM ruta WHERE estado = 1 AND id_ruta = ?";
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
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(true);
                
                JOptionPane.showMessageDialog(null, "Ruta encontrada");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una ruta con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return ruta;
    }

    public void modificarRuta(Rutas ruta) {
        String sql = "UPDATE ruta SET origen= ?, destino= ?, duracion_estimada= ? WHERE id_ruta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracionEst()));
            ps.setInt(4, ruta.getIdRuta());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas ==1) {
                JOptionPane.showMessageDialog(null, "Se modificó la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
    }

    public void eliminarRuta(int id) {
        String sql = "UPDATE ruta SET estado= 0 WHERE id_ruta = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
    }

    public List<Rutas> listarRutas() {
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT * FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(rs.getBoolean("estado"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
    public List<Rutas> listarRutasPorOrigen() {
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT origen FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                ruta.setOrigen(rs.getString("origen"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
    public List<Rutas> listarRutasPorDestino() {
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT destino FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                ruta.setDestino(rs.getString("destino"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
    public List<Rutas> listarRutasEspecificas(String origen, String destino) {
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT * FROM ruta WHERE estado = 1 AND origen = ? AND destino = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ps.setString(2, destino);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(rs.getBoolean("estado"));
                rutas.add(ruta);
            }
            JOptionPane.showMessageDialog(null, "Rutas listadas");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
}

