package vistas;

import accesoADatos.*;
import entidades.*;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class CargaDeHorario extends javax.swing.JInternalFrame {
    ArrayList<Rutas> listaRutas;
    Horarios horario = null;
    Rutas rt;
    LocalTime horaSalida;
    LocalTime horaLlegada;

    public CargaDeHorario() {
        initComponents();
        formatoSpinner();
        jCRutas.removeAllItems();
        ocultarBarraTitulo();
        listaRutas = new RutasData().listarRutas();
        llenarCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCRutas = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfHoraLlegada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Hora de salida:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Ruta:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jCRutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRutasActionPerformed(evt);
            }
        });
        jPanel3.add(jCRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, -1));

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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jLabel5.setText("Guardar");
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));

        jPanel3.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, -1));

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
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 70, 30));

        jPanel3.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Hora de llegada:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        tfHoraLlegada.setEditable(false);
        jPanel3.add(tfHoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 500, 220));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Horarios");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 40));

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

    private void jGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarMouseClicked
        if(rt==null||horaLlegada==null||horaSalida==null){
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
        }else{            
            guardar();
        }
    }//GEN-LAST:event_jGuardarMouseClicked

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jLimpiarMouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        calcularLlegada();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jCRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRutasActionPerformed
        calcularLlegada();
    }//GEN-LAST:event_jCRutasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCRutas;
    private javax.swing.JPanel jGuardar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField tfHoraLlegada;
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

    public void limpiarCampos() {
        formatoSpinner();
        tfHoraLlegada.setText("");
        jCRutas.setSelectedIndex(-1);
        rt=null;
        horaSalida=null;
        horaLlegada=null;
    }

    public void guardar() {
        horario = new Horarios(rt, horaLlegada, horaSalida, true);

        String texto = "DESEA GUARDAR EL HORARIO:\nRuta: "+rt+"\nSalida: "+horaSalida+"\nLlegada: "+horaLlegada;
        int guardar = JOptionPane.showConfirmDialog(this, texto, "CONFIRMAR HORARIO", JOptionPane.YES_NO_OPTION);
        if(guardar == 0){
            new HorariosData().guardarHorario(horario); 
            limpiarCampos();
        }
//        try {
//              int indice = jCRutas.getSelectedIndex();
//        Rutas rt = listaRutas.get(indice);
//
//        // Obtener la hora de salida del JSpinner y convertirla a LocalTime
//        Date date = (Date) jSpinner1.getValue();
//        Instant instant = date.toInstant();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//        LocalTime horaSalida = localDateTime.toLocalTime();
//
//        // Calcular la hora de llegada sumando la duración estimada de la ruta a la hora de salida
//        LocalTime horaLlegada = horaSalida.plusHours(rt.getDuracionEst().getHour())
//                .plusMinutes(rt.getDuracionEst().getMinute())
//                .plusSeconds(rt.getDuracionEst().getSecond());
//
//        Horarios hs = new Horarios();
//        hs.setHoraSalida(horaSalida);
//        hs.setHoraLLegada(horaLlegada);
//        hs.setRuta(rt);
//        hs.setEstado(true);
//
//        HorariosData hData = new HorariosData();
//        hData.guardarHorario(hs);
//        } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, "Tiene que elegir una ruta" );
//        }
         
        

    }

    public void llenarCombo() {
       
        for (Rutas rt : listaRutas) {
            jCRutas.addItem(rt.toString());
        }
        jCRutas.setSelectedIndex(-1);      
    }

    public void formatoSpinner() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date hora = sdf.parse("00:00");

            SpinnerDateModel sm = new SpinnerDateModel(hora, null, null, Calendar.HOUR_OF_DAY);
            jSpinner1.setModel(sm);

            JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm");
            jSpinner1.setEditor(de);

            JFormattedTextField txt = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
            txt.setEditable(false);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "El formato de horario ingresado no es válido, reintente.");
        }
    }

    private void calcularLlegada() {
        LocalTime s = LocalTime.of(00, 00);
        int indice = jCRutas.getSelectedIndex();
        if(indice>=0){
            rt = listaRutas.get(indice);      //Recupero la ruta seleccionada

    // Obtener la hora de salida del JSpinner y convertirla a LocalTime
            Time time = new Time((long)jSpinner1.getValue().hashCode());
            horaSalida = time.toLocalTime();

    //         Calcular la hora de llegada sumando la duración estimada de la ruta a la hora de salida
            LocalTime duracion = rt.getDuracionEst();
            long min = s.until(duracion, ChronoUnit.MINUTES);
            horaLlegada = horaSalida.plusMinutes(min);
            tfHoraLlegada.setText(horaLlegada.toString());            
        }
    }
}
