package vistas;

import accesoADatos.PasajerosData;
import entidades.Pasajeros;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class CargarPasajero extends javax.swing.JDialog {
    Pasajeros per = null;
    PasajerosData p = null;

    public CargarPasajero(java.awt.Frame parent, boolean modal, String texto) {
        super(parent, modal);
        initComponents();
        jtDNI.setText(texto);
        jlError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("DNI:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jtDNI.setForeground(java.awt.Color.black);
        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });
        jPanel3.add(jtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 200, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Nombre:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Apellido:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Correo:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setText("Telefono:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jtApellido.setForeground(java.awt.Color.black);
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, -1));

        jtCorreo.setForeground(java.awt.Color.black);
        jPanel3.add(jtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, -1));

        jtTelefono.setForeground(java.awt.Color.black);
        jtTelefono.setToolTipText("Ingresar 8 digitos");
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 200, -1));

        jtNombre.setForeground(java.awt.Color.black);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, -1));

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
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));

        jPanel3.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));

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
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 70, 30));

        jPanel3.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 10, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 20, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 20, -1));

        jLabel9.setText("Campos opcionales");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jlError.setText("Minimo 8 digitos");
        jPanel3.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 200, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 330));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Pasajero");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseMoved
        jGuardar.setBackground(new Color(184, 210, 224));
    }//GEN-LAST:event_jGuardarMouseMoved

    private void jGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseExited
        jGuardar.setBackground(new Color(138, 193, 223));
    }//GEN-LAST:event_jGuardarMouseExited

    private void jLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseMoved
        jLimpiar.setBackground(new Color(184, 210, 224));
    }//GEN-LAST:event_jLimpiarMouseMoved

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jLimpiarMouseClicked

    private void jLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseExited
        jLimpiar.setBackground(new Color(138, 193, 223));
    }//GEN-LAST:event_jLimpiarMouseExited

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        if(!(jtDNI.getText()+evt.getKeyChar()).matches("\\d{1,8}")){
            evt.consume();
        }
    }//GEN-LAST:event_jtDNIKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        if(!(jtNombre.getText()+evt.getKeyChar()).matches("[a-zA-Z ]+")){
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        if(!(jtApellido.getText()+evt.getKeyChar()).matches("[a-zA-Z ]+")){
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        if(!(jtTelefono.getText()+evt.getKeyChar()).matches("\\d{1,20}")){
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlError;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        jtDNI.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtCorreo.setText("");
        jtTelefono.setText("");
        per = null;

    }

    public void guardar() {
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        String dni = jtDNI.getText();
        String correo = jtCorreo.getText();
        String telefono = jtTelefono.getText();
        boolean estado = true;
        
        boolean cor = correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        if(!(cor||correo.isEmpty())){
            jtCorreo.setForeground(Color.red);
        }else{
            jtCorreo.setForeground(Color.BLACK);
        }
        
        boolean tel = telefono.matches("\\d{8,20}");
        if(!(tel||telefono.isEmpty())){
            jtTelefono.setForeground(Color.red);
            jlError.setVisible(true);
        }else{
            jtTelefono.setForeground(Color.BLACK);
            jlError.setVisible(false);
        }
        
        if(jtDNI.getText().isEmpty()||jtApellido.getText().isEmpty()||jtNombre.getText().isEmpty()||!(cor||correo.isEmpty())||!(tel||telefono.isEmpty())){
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
            
        }else{            
            Pasajeros pasajero = new Pasajeros(nombre,apellido,dni,correo,telefono,estado);
            
            String texto = "DESEA GUARDAR EL PASAJERO:\n"+pasajero.toString();
            int guardar = JOptionPane.showConfirmDialog(this, texto, "CONFIRMAR PASAJERO", JOptionPane.YES_NO_OPTION);
            if(guardar == 0){
                new PasajerosData().guardarPasajero(pasajero);
                dispose();               
            }
        }
    }
}
