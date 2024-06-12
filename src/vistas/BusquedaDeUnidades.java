package vistas;

import accesoADatos.ColectivosData;
import entidades.Colectivos;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class BusquedaDeUnidades extends javax.swing.JInternalFrame {
    List<Colectivos> listaCole;
    ColectivosData coleData = new ColectivosData();
    List<Colectivos> listaMatri;
    List<Colectivos> listaMarca;
    List<Colectivos> listaCapac;
    List<Colectivos> listaEspecifica;

    

    public BusquedaDeUnidades() {
        initComponents();
        ocultarBarraTitulo();
        listaCole = coleData.listarColectivos();
        llenarCombos();
        armarCabecera();
        llenarTabla();
        
        
    }

     private DefaultTableModel modeloTabla = new DefaultTableModel(){
        public boolean isCellEditable(int i, int i1) {

            return true
                    ;

        }
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLimpiar1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jcMatricula = new javax.swing.JComboBox<>();
        jcMarca = new javax.swing.JComboBox<>();
        jcCapacidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jModificar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jEliminar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 490, 30));

        jGuardar.setBackground(new java.awt.Color(138, 193, 223));
        jGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jGuardarMouseMoved(evt);
            }
        });
        jGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGuardarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jGuardarMouseExited(evt);
            }
        });
        jGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jLabel5.setText("Buscar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jPanel3.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, -1));

        jLimpiar.setBackground(new java.awt.Color(138, 193, 223));
        jLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLimpiarMouseMoved(evt);
            }
        });
        jLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLimpiarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLimpiarMouseExited(evt);
            }
        });
        jLimpiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        jLabel7.setText("Limpiar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jLimpiar1.setBackground(new java.awt.Color(138, 193, 223));
        jLimpiar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLimpiar1MouseMoved(evt);
            }
        });
        jLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLimpiar1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLimpiar1MouseExited(evt);
            }
        });
        jLimpiar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        jLabel8.setText("Limpiar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jLimpiar.add(jLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 120, -1));

        jPanel3.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 120, -1));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 710, 260));

        jPanel3.add(jcMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, -1));

        jPanel3.add(jcMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, -1));

        jPanel3.add(jcCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Capacidad");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Marca");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Matricula");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jModificar.setBackground(new java.awt.Color(138, 193, 223));
        jModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jModificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jModificarMouseMoved(evt);
            }
        });
        jModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModificarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jModificarMouseExited(evt);
            }
        });
        jModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-de-edicion.png"))); // NOI18N
        jLabel11.setText("Modificar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jModificar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jPanel3.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        jEliminar.setBackground(new java.awt.Color(138, 193, 223));
        jEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jEliminarMouseMoved(evt);
            }
        });
        jEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEliminarMouseExited(evt);
            }
        });
        jEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        jLabel12.setText("Eliminar");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jEliminar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 30));

        jPanel3.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 710, 440));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda de Unidades");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseMoved
        jGuardar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jGuardarMouseMoved

    private void jGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseExited
         jGuardar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jGuardarMouseExited

    private void jLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseMoved
         jLimpiar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jLimpiarMouseMoved

    private void jLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseExited
        jLimpiar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jLimpiarMouseExited

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jLimpiarMouseClicked

    private void jGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseClicked
      borrarFilas();
      
        String  matricula = (String) jcMatricula.getSelectedItem();
        String marca = (String) jcMarca.getSelectedItem();
        String capac = (String) jcCapacidad.getSelectedItem();
  
       if(capac == null && marca == null) {
             buscarTabla(matricula);
        } else if (marca == null && matricula == null){
           buscarTablaCapac(capac);
        } else if (matricula== null && capac == null) {
             buscarTablaMarca(marca);
        }else if (marca != null && matricula != null && capac != null) {
            buscarTablaEspec(matricula, marca, capac);
           
        }else {
            jLabel6.setText("No se encontro el colectivo");
        }
        
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jLimpiar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiar1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiar1MouseMoved

    private void jLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiar1MouseClicked

    private void jLimpiar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiar1MouseExited

    private void jModificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificarMouseMoved
        jModificar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jModificarMouseMoved

    private void jModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificarMouseClicked
  int filaSeleccionada = jtTabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idColectivo = (int) jtTabla.getValueAt(filaSeleccionada, 0);
            String matricula = (String) jtTabla.getValueAt(filaSeleccionada, 1);
            String marca = (String) jtTabla.getValueAt(filaSeleccionada, 2);
            String modelo = (String) jtTabla.getValueAt(filaSeleccionada, 3);
            int capacidad = (int) jtTabla.getValueAt(filaSeleccionada, 4);

            Colectivos colectivo = new Colectivos(idColectivo, matricula, marca, modelo, capacidad);

            coleData.modificarColectivo(colectivo);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un colectivo para modificar");
          }
    }//GEN-LAST:event_jModificarMouseClicked

    private void jModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificarMouseExited
        jModificar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jModificarMouseExited

    private void jEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEliminarMouseMoved
       jEliminar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jEliminarMouseMoved

    private void jEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEliminarMouseClicked
          int filaSeleccionada = jtTabla.getSelectedRow();
    if (filaSeleccionada != -1) {
        int matricula = (Integer) jtTabla.getValueAt(filaSeleccionada, 0); 
        coleData.eliminarColectivo(matricula);
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un colectivo para eliminar");
    }
    }//GEN-LAST:event_jEliminarMouseClicked

    private void jEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEliminarMouseExited
       jEliminar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jEliminarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jEliminar;
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jLimpiar1;
    private javax.swing.JPanel jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCapacidad;
    private javax.swing.JComboBox<String> jcMarca;
    private javax.swing.JComboBox<String> jcMatricula;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    public void ocultarBarraTitulo(){
        JComponent Barra = null;
        Dimension dimBarra = null;
        Barra = ((BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }

    public void limpiarCampos(){
        jLabel6.setText("");
        llenarTabla();
        jcMarca.setSelectedItem(null);
        jcMatricula.setSelectedItem(null);
        jcCapacidad.setSelectedItem(null);

        
    }
    
    public void llenarCombos() {
    for (Colectivos c : listaCole){
        jcMarca.addItem(c.getMarca());
        jcMatricula.addItem(c.getMatricula());
        jcCapacidad.addItem(""+c.getCapacidad());
    }
    }
    
     private void armarCabecera() {  
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Matricula");
        modeloTabla.addColumn("Capacidad");
        jtTabla.setModel(modeloTabla);
    }
     
     
      private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
      
    private void llenarTabla() {
        borrarFilas();
        for (Colectivos c : listaCole) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
        }
    }
    
    private void buscarTabla(String matri) {
        listaMatri = new ArrayList();
        listaMatri.addAll(coleData.listarColePorMatricula(matri));
        for (Colectivos c : listaMatri) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
    }
        
    private void buscarTablaMarca(String marca) {
        listaMarca = new ArrayList();
        listaMarca.addAll(coleData.listarColePorMarca(marca));
        for (Colectivos c : listaMarca) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
}
    private void buscarTablaCapac(String cap) {
        listaCapac = new ArrayList();
        listaCapac.addAll(coleData.listarColePorCapaci(Integer.parseInt(cap)));
        for (Colectivos c : listaCapac) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
    }
    
    private void buscarTablaEspec(String matri, String marca, String cap) {
        listaEspecifica = new ArrayList<>();
        listaEspecifica.addAll(coleData.listarColePorEspec(matri, marca, Integer.parseInt(cap)));
        if (listaEspecifica.isEmpty()) {
            jLabel6.setText("No se encontró el colectivo");
        } else {
            for (Colectivos c : listaEspecifica) {
                modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            }
        
}
}
}


