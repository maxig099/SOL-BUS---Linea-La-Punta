/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoADatos.RutasData;
import entidades.Rutas;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Cristian
 */
public class BusquedaRutas extends javax.swing.JInternalFrame {
    RutasData ruData = new RutasData();
    List<Rutas> listaRutas;
    List<Rutas> listaRutasporOrigen;
    List<Rutas> listaRutasporDestino;
    List<Rutas> listaRutasEspecificas;
    
    /**
     * Creates new form Pasaje
     */
    
    private DefaultTableModel modeloTabla = new DefaultTableModel(){
        public boolean isCellEditable(int i, int i1) {

            return false;

        }
    };
    
    public BusquedaRutas() {
        initComponents();
        armarCabecera();
        ocultarBarraTitulo();
        listaRutas = ruData.listarRutas();
        listaRutasporOrigen = ruData.listarRutasPorOrigen();
        listaRutasporDestino = ruData.listarRutasDestino();
        llenarComboOrigen();
        llenarComboDestino();
        llenarTablas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCBOrigen = new javax.swing.JComboBox<>();
        jCBDestino = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(138, 193, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoReal.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 100));

        jLimpiar.setBackground(new java.awt.Color(138, 193, 223));
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
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 90, 30));

        jPanel2.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        jGuardar.setBackground(new java.awt.Color(138, 193, 223));
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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jLabel5.setText("Buscar");
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 30));

        jPanel2.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 560));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 225, 225));
        jLabel3.setText("Rutas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 340, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brailleb.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincerely-media-gPnHi8AmO5k-unsplash.jpg"))); // NOI18N
        jLabel2.setText("dad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 650, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Filtrar por:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Origen:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Destino:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jCBOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jCBOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOrigenActionPerformed(evt);
            }
        });
        jPanel3.add(jCBOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, -1));

        jCBDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jCBDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDestinoActionPerformed(evt);
            }
        });
        jPanel3.add(jCBDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 650, 180));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ruta", "Origen", "Destino", "Duracion Estimada"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 650, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 560));

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

    private void jCBOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBOrigenActionPerformed

    private void jCBDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBDestinoActionPerformed

    private void jGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseClicked
        // TODO add your handling code here:
        borrarFilas();
        String origen = (String) jCBOrigen.getSelectedItem();
        String destino = (String) jCBDestino.getSelectedItem();
        buscarTabla(origen, destino);
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        // TODO add your handling code here:
        jCBOrigen.setSelectedIndex(-1);
        jCBDestino.setSelectedIndex(-1);
        llenarTablas();
    }//GEN-LAST:event_jLimpiarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBDestino;
    private javax.swing.JComboBox<String> jCBOrigen;
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
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
    
    private void llenarTablas(){
        borrarFilas();
        for (Rutas x : listaRutas) {
                modeloTabla.addRow(new Object[]{x.getIdRuta(), x.getOrigen(), x.getDestino(), x.getDuracionEst()});
            }
    }
    
    public void buscarTabla(String origen, String destino){
        listaRutasEspecificas = new ArrayList();
        listaRutasEspecificas.addAll(ruData.listarRutasEspecificas(origen, destino));
        for (Rutas x : listaRutasEspecificas) {
            modeloTabla.addRow(new Object[]{x.getIdRuta(), x.getOrigen(), x.getDestino(), x.getDuracionEst()});
        }
            
    }
    
    private void armarCabecera() {        
        modeloTabla.addColumn("Ruta");
        modeloTabla.addColumn("Origen");
        modeloTabla.addColumn("Destino");
        modeloTabla.addColumn("Duracion Estimada");
        jTable.setModel(modeloTabla);
    }

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
    
    public void llenarComboOrigen(){
        for (Rutas e : listaRutasporOrigen) {
            jCBOrigen.addItem(e.getOrigen());
        }
        jCBOrigen.setSelectedIndex(-1);
    }
    
    public void llenarComboDestino(){
        for (Rutas x : listaRutasporDestino) {
            jCBDestino.addItem(x.getDestino());
        }
        jCBDestino.setSelectedIndex(-1);
    }
}