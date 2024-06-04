package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ColectivosData {
    private Connection con =  null;

    public ColectivosData() {
       con = Conexion.getConexion();
    }

    public void guardarColectivo(Colectivos colectivo) {
        String sql = "INSERT INTO colectivos (matricula, marca, modelo, capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());
            
            ps.executeUpdate();
            ResultSet idColectivo = ps.getGeneratedKeys();
            if (idColectivo.next()) {
                colectivo.setIdColectivo(idColectivo.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Se guardo el colectivo");
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Colectivo repetido");               
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
            }
        }
    }

    public Colectivos buscarColectivo(int id) {
        String sql = "SELECT * FROM colectivos WHERE estado = 1 AND id_colectivo = ?";
        Colectivos colectivo = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(rs.getBoolean("estado"));
               
                JOptionPane.showMessageDialog(null, "Colectivo encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe un colectivo con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return colectivo;
    }

    public void modificarColectivo(Colectivos colectivo) {
        String sql = "UPDATE colectivos SET matricula = ?, marca = ?, modelo = ?, capacidad = ? WHERE id_colectivo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setInt(5, colectivo.getIdColectivo());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el colectivo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el colectivo a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
    }

    public void eliminarColectivo(int id) {
        String sql = "UPDATE colectivos SET estado = 0 WHERE id_colectivo = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente el colectivo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el colectivo a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
    }

    public List<Colectivos> listarColectivos() {
        ArrayList<Colectivos> listaColectivos = new ArrayList<>();
        String sql = "SELECT * FROM colectivos WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Colectivos colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                
                listaColectivos.add(colectivo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return listaColectivos;
    }
}

