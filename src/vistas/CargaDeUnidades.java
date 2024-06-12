package vistas;

import accesoADatos.ColectivosData;
import entidades.Colectivos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class CargaDeUnidades extends javax.swing.JInternalFrame {
    Colectivos colectivo = null;
    ColectivosData coleData = new ColectivosData();

    public CargaDeUnidades() {
        initComponents();
        ocultarBarraTitulo();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtMatricula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTCapacidad = new javax.swing.JTextField();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Matricula:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        jtMatricula.setForeground(new java.awt.Color(0, 0, 0));
        jtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMatriculaKeyTyped(evt);
            }
        });
        jPanel3.add(jtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Marca:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Modelo:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Capacidad:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTMarca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, -1));

        jTModelo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        jTCapacidad.setForeground(new java.awt.Color(0, 0, 0));
        jTCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCapacidadKeyTyped(evt);
            }
        });
        jPanel3.add(jTCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));

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
        jLabel5.setText("Guardar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));

        jPanel3.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

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
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 70, 30));

        jPanel3.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 260));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Unidades");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

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
        
        if (jtMatricula.getText().isEmpty() || jTModelo.getText().isEmpty() || jTMarca.getText().isEmpty() || jTCapacidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos para guardar");

        }else{
            String matricula = jtMatricula.getText();
            String marca = jTMarca.getText();
            String modelo = jTModelo.getText();
            int capacidad = Integer.parseInt(jTCapacidad.getText());
            boolean estado = true;
            colectivo = new Colectivos (matricula, marca, modelo, capacidad, estado);
            
            String texto = "DESEA GUARDAR LA UNIDAD/A:\n"+"Matricula: " + matricula 
                            + "\nMarca: " + marca + "\nModelo: " + modelo 
                            + "\nCapacidad: " + capacidad;
            int guardar = JOptionPane.showConfirmDialog(this, texto, "CONFIRMAR ALUMNO", JOptionPane.YES_NO_OPTION);
            if(guardar == 0){                               
                coleData.guardarColectivo(colectivo);
                limpiarCampos();
            }
        }
//        try {
//            int capac = Integer.parseInt(capacidad);
//            
//        if (colectivo == null) {
//            colectivo = new Colectivos (matricula, marca, modelo, capac, estado);
//            coleData.guardarColectivo(colectivo);
//        }
//        limpiarCampos(); 
//        }
//        catch(NumberFormatException ex) {
//            JOptionPane.showMessageDialog(null, "La capacidad debe ser un numero");
//        }

    
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jTCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCapacidadKeyTyped
        if(!(jTCapacidad.getText()+evt.getKeyChar()).matches("\\d{1,2}")){
            evt.consume();
        }
    }//GEN-LAST:event_jTCapacidadKeyTyped

    private void jtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMatriculaKeyTyped
        if(!(jtMatricula.getText()+evt.getKeyChar()).matches("^[a-zA-Z0-9]{0,7}$")){
            evt.consume();
        }
    }//GEN-LAST:event_jtMatriculaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jtMatricula;
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
        jTCapacidad.setText("");
        jtMatricula.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        colectivo = null;
    }
}
