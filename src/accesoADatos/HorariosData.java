package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HorariosData {
    
    private Connection con = null;
    private RutasData rutaData = new RutasData();
    

    public HorariosData() {
        con = Conexion.getConexion();
    }

    public void guardarHorario(Horarios horario) {
        String sql = "INSERT INTO horarios(id_ruta, hora_salida, hora_llegada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(3, Time.valueOf(horario.getHoraLLegada()));
            ps.setBoolean(4, horario.isEstado());
            
            ps.executeUpdate();
            ResultSet idHorario = ps.getGeneratedKeys();

            if (idHorario.next()) {
                horario.setIdHorarios(idHorario.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo el horario");
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                System.out.println("Horario Repetido");                
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
            }
        }
    }

    public Horarios buscarHorario(int id) {
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND id_horario = ?";
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
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
                JOptionPane.showMessageDialog(null, "Horario encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe un horario con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario" + ex);
        }
        return horario;
    }

    public void modificarHorario(Horarios horario) {
        String sql = "UPDATE horarios SET id_ruta = ?, hora_salida = ?, hora_llegada = ? WHERE ID_Horario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(3, Time.valueOf(horario.getHoraLLegada()));
            ps.setInt(4, horario.getIdHorarios());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
    }

    public void eliminarHorario(int id) {
        String sql = "UPDATE horarios SET estado = 0 WHERE id_horario = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas ==1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
    }

    public List<Horarios> listarHorarios() {
        List<Horarios> horarios = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Horarios horario = new Horarios();
                
                horario.setIdHorarios(rs.getInt("id_horario"));
                horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
                horarios.add(horario);
            }
            JOptionPane.showMessageDialog(null, "Horarios listados");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return horarios;
    }
    
    public ArrayList<Horarios> listarHorariosXRuta(int idRuta) {
        ArrayList<Horarios> listaHorarios = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND id_ruta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idRuta);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Horarios horario = new Horarios();
                
                horario.setIdHorarios(rs.getInt("id_horario"));
                horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
                listaHorarios.add(horario);
            }
            JOptionPane.showMessageDialog(null, "Horarios listados");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return listaHorarios;
    }
}


