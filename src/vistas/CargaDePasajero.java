package vistas;

import accesoADatos.PasajerosData;
import entidades.Pasajeros;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class CargaDePasajero extends javax.swing.JInternalFrame {

    Pasajeros per = null;
    PasajerosData p = new PasajerosData();
    Border bordeError;
    Border bordeOrig;
    public CargaDePasajero() {
        initComponents();
        ocultarBarraTitulo();
        bordeOrig  = jtCorreo.getBorder();
        bordeError = new LineBorder(Color.RED, 1);
        

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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("DNI:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jtDNI.setForeground(java.awt.SystemColor.activeCaptionBorder);
        jtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtDNIFocusGained(evt);
            }
        });
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

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, -1));

        jtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCorreoFocusLost(evt);
            }
        });
        jPanel3.add(jtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, -1));

        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 200, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 310));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Pasajero");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseMoved
        jGuardar.setBackground(new Color(184, 210, 224));
    }//GEN-LAST:event_jGuardarMouseMoved

    private void jGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseExited
        jGuardar.setBackground(new Color(138, 193, 223));
    }//GEN-LAST:event_jGuardarMouseExited

    private void jLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseMoved
        jLimpiar.setBackground(new Color(184, 210, 224));
    }//GEN-LAST:event_jLimpiarMouseMoved

    private void jLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseExited
        jLimpiar.setBackground(new Color(138, 193, 223));
    }//GEN-LAST:event_jLimpiarMouseExited

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jLimpiarMouseClicked

    private void jGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseClicked
        guardar();
       // limpiar();
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        if(!(jtDNI.getText()+evt.getKeyChar()).matches("\\d{1,8}")){
            evt.consume();
        }
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }   
    }//GEN-LAST:event_jtDNIKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        if(!(jtTelefono.getText()+evt.getKeyChar()).matches("\\d{1,40}")){
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
         if(!(jtTelefono.getText()+evt.getKeyChar()).matches("[a-zA-Z ]+")){
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
         if(!(jtApellido.getText()+evt.getKeyChar()).matches("[a-zA-Z ]+")){
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCorreoFocusLost
      
    }//GEN-LAST:event_jtCorreoFocusLost

    private void jtDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDNIFocusGained
       
    }//GEN-LAST:event_jtDNIFocusGained

    public void limpiar() {
       
        jtDNI.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtCorreo.setText("");
        jtTelefono.setText("");
        jtCorreo.setBorder(bordeOrig);
        jtDNI.setBorder(bordeOrig);
        jtApellido.setBorder(bordeOrig);
        jtNombre.setBorder(bordeOrig);
        jtTelefono.setBorder(bordeOrig);
        per = null;

    }
    //Pasajeros(String Nombre, String Apellido, String dni, String correo, String telefono, boolean estado)

    public void guardar() {
    String Nombre = jtNombre.getText();
    String Apellido = jtApellido.getText();
    String dni = jtDNI.getText();
    String correo = jtCorreo.getText();
    String telefono = jtTelefono.getText();
    boolean estado = true;
    

    if (Nombre.isEmpty() || Apellido.isEmpty() || dni.isEmpty()) {
        if (Nombre.isEmpty()) {
            jtNombre.setBorder(bordeError);
        } else {
            jtNombre.setBorder(bordeOrig);
        }
        if (Apellido.isEmpty()) {
            jtApellido.setBorder(bordeError);
        } else {
            jtApellido.setBorder(bordeOrig);
        }
        if(dni.isEmpty()) {
            jtDNI.setBorder(bordeError);
        } else {
            jtDNI.setBorder(bordeOrig);
        }
        JOptionPane.showMessageDialog(null, "Debe llenar los campos para continuar");
        return;
    }

    if (!telefono.isEmpty() && telefono.length() < 6 || telefono.length() > 20) {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener entre 6 y 20 dígitos");
        jtTelefono.setBorder(bordeError);
        return;
      
    }else {
        jtTelefono.setBorder(bordeOrig);
    }
    if (!correo.isEmpty() && !validarMail(jtCorreo.getText())) {
            jtCorreo.setBorder(bordeError);
            JOptionPane.showMessageDialog(null, "Debe ingresar un mail valido");
            return;
            
        }  
    else {
        jtCorreo.setBorder(bordeOrig);
    }
   
   int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de guardar los datos?", "Confirmacion", JOptionPane.YES_NO_OPTION);
         
   if(respuesta == JOptionPane.YES_OPTION) {
      per = new Pasajeros(Nombre, Apellido, dni, correo, telefono, estado);
    p.guardarPasajero(per);
    JOptionPane.showMessageDialog(null, "Datos guardados");
    limpiar();
   } 
   else {
       JOptionPane.showMessageDialog(null, "Cancelado");
   }
    
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
 
    public void ocultarBarraTitulo() {
        JComponent Barra = null;
        Dimension dimBarra = null;
        Barra = ((BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
public boolean validarMail(String email){
    Pattern patron= Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher mather = patron.matcher(email);
    return mather.find();
}
}
