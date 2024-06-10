package vistas;

import accesoADatos.ColectivosData;
import accesoADatos.HorariosData;
import accesoADatos.PasajeData;
import accesoADatos.PasajerosData;
import accesoADatos.RutasData;
import entidades.Colectivos;
import entidades.Horarios;
import entidades.Pasaje;
import entidades.Pasajeros;
import entidades.Rutas;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.converter.LocalTimeStringConverter;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CargaDePasaje extends javax.swing.JInternalFrame {
    private Pasajeros pasajero = null;
    private PasajerosData pasData = new PasajerosData();
    private PasajeData pasajeData = new PasajeData();
    private RutasData rutaData = new RutasData();
    private HorariosData horaData = new HorariosData();
    private ColectivosData coleData = new ColectivosData();
    private Rutas rutas = new Rutas();
    private Pasaje venta = new Pasaje();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private ArrayList lista = new ArrayList();
    
    public CargaDePasaje() {
        initComponents();
        //cbDestino.setSelectedIndex(-1);
        llenarCombo(cbOrigen, rutaData.listarRutasPorOrigen());
        //llenarComboRuta(cbOrigen,rutaData.listarRutasPorOrigen());
        //ocultarBarraTitulo();
        armarCabecera();
        //dcFecha.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        dcFecha.setDate(Date.valueOf(LocalDate.now().minusDays(1)));
        
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jHistorial = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelPasajero = new javax.swing.JPanel();
        jBCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lPasajero = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        tfPasajero = new javax.swing.JTextField();
        ruta = new javax.swing.JPanel();
        panelDestino = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        panelOrigen = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cbOrigen = new javax.swing.JComboBox<>();
        horario = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbHorarios = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        panelAsiento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbAsientos = new javax.swing.JComboBox<>();
        panelTabla = new javax.swing.JPanel();
        panelOrdenar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbOrden = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 225, 225));
        jLabel3.setText("Carga de Pasajes");
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 340, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brailleb.png"))); // NOI18N
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 40));

        menuLateral.setBackground(new java.awt.Color(138, 193, 223));
        menuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoReal.jpg"))); // NOI18N
        menuLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 100));

        jHistorial.setBackground(new java.awt.Color(138, 193, 223));
        jHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jHistorial.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jHistorialMouseMoved(evt);
            }
        });
        jHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jHistorialMouseExited(evt);
            }
        });
        jHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N
        jLabel9.setText("Historial");
        jHistorial.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));

        menuLateral.add(jHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, -1));

        jLimpiar.setBackground(new java.awt.Color(138, 193, 223));
        jLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLimpiarMouseMoved(evt);
            }
        });
        jLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
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

        menuLateral.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        jGuardar.setBackground(new java.awt.Color(138, 193, 223));
        jGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jGuardarMouseMoved(evt);
            }
        });
        jGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jGuardarMouseExited(evt);
            }
        });
        jGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jLabel5.setText("Guardar");
        jGuardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 30));

        menuLateral.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, -1));

        panelPrincipal.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 570));

        panelPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasajero", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        jBCrear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBCrear.setText("Crear");
        jBCrear.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lPasajero.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lPasajero.setForeground(new java.awt.Color(0, 0, 51));
        lPasajero.setText("DNI:");

        tfDni.setForeground(java.awt.SystemColor.activeCaptionBorder);
        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfPasajero.setEditable(false);
        tfPasajero.setToolTipText("");

        javax.swing.GroupLayout panelPasajeroLayout = new javax.swing.GroupLayout(panelPasajero);
        panelPasajero.setLayout(panelPasajeroLayout);
        panelPasajeroLayout.setHorizontalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPasajeroLayout.setVerticalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jBCrear)))
            .addComponent(lPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ruta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ruta"));

        panelDestino.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Destino:  ");
        panelDestino.add(jLabel8, java.awt.BorderLayout.WEST);

        cbDestino.setEnabled(false);
        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoActionPerformed(evt);
            }
        });
        panelDestino.add(cbDestino, java.awt.BorderLayout.CENTER);

        panelOrigen.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Origen:    ");
        panelOrigen.add(jLabel13, java.awt.BorderLayout.WEST);

        cbOrigen.setToolTipText("");
        cbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrigenActionPerformed(evt);
            }
        });
        panelOrigen.add(cbOrigen, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout rutaLayout = new javax.swing.GroupLayout(ruta);
        ruta.setLayout(rutaLayout);
        rutaLayout.setHorizontalGroup(
            rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutaLayout.createSequentialGroup()
                .addGroup(rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rutaLayout.setVerticalGroup(
            rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutaLayout.createSequentialGroup()
                .addComponent(panelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        horario.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Horario:  ");
        horario.add(jLabel10, java.awt.BorderLayout.WEST);

        cbHorarios.setEnabled(false);
        cbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHorariosActionPerformed(evt);
            }
        });
        horario.add(cbHorarios, java.awt.BorderLayout.CENTER);

        fecha.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Fecha:  ");
        fecha.add(jLabel12, java.awt.BorderLayout.WEST);
        fecha.add(dcFecha, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Asiento");

        cbAsientos.setEnabled(false);

        javax.swing.GroupLayout panelAsientoLayout = new javax.swing.GroupLayout(panelAsiento);
        panelAsiento.setLayout(panelAsientoLayout);
        panelAsientoLayout.setHorizontalGroup(
            panelAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAsientoLayout.setVerticalGroup(
            panelAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsientoLayout.createSequentialGroup()
                .addGroup(panelAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97)
                        .addComponent(panelAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(panelPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 550, 300));

        panelTabla.setLayout(new java.awt.BorderLayout());

        panelOrdenar.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Ordenar por:  ");
        panelOrdenar.add(jLabel11, java.awt.BorderLayout.NORTH);

        panelOrdenar.add(cbOrden, java.awt.BorderLayout.CENTER);

        jLabel6.setText("                                                                                                                                        ");
        panelOrdenar.add(jLabel6, java.awt.BorderLayout.LINE_START);

        panelTabla.add(panelOrdenar, java.awt.BorderLayout.NORTH);

        tabla.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panelTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 550, 220));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 570));

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

    private void jHistorialMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHistorialMouseMoved
        jHistorial.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jHistorialMouseMoved

    private void jHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHistorialMouseExited
         jHistorial.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jHistorialMouseExited

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        if(!(tfDni.getText()+evt.getKeyChar()).matches("\\d{1,8}")){
            evt.consume();
        }
    }//GEN-LAST:event_tfDniKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pasajero = new PasajerosData().buscarPasajeroDNI(tfDni.getText());
        String texto = "Usuario no encontrado";
        if(pasajero!=null){
            texto = pasajero.getApellido()+", "+pasajero.getNombre();
        }
        tfPasajero.setText(texto);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrigenActionPerformed
        lista.clear();
        cargarTabla(lista);
        if(cbOrigen.getSelectedIndex()<1){
            cbDestino.setEnabled(false);
            cbHorarios.setEnabled(false);
        }else{
            llenarCombo(cbDestino, rutaData.listarRutasDestino((String) cbOrigen.getSelectedItem()));
            cbDestino.setEnabled(true);
        }
    }//GEN-LAST:event_cbOrigenActionPerformed

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        lista.clear();
        cargarTabla(lista);
        if(cbDestino.getSelectedIndex()<1){
            cbHorarios.setEnabled(false);
            cbAsientos.setEnabled(false);            
        }else{
            Rutas r = rutaData.buscarRuta((String) cbOrigen.getSelectedItem(), (String) cbDestino.getSelectedItem());
            llenarCombo(cbHorarios, horaData.listarHorariosXRuta(r.getIdRuta()));
            cbHorarios.setEnabled(true);           
        }
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void cbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHorariosActionPerformed
        //si hay un colectivo asignado a la ruta y horario; y si hay lugares disponibles
        //si no hay lugares disponibles, listar colectivos disponibles
        Rutas r = rutaData.buscarRuta((String)cbOrigen.getSelectedItem(), (String)cbDestino.getSelectedItem());
        borrarFilas();
        if(cbHorarios.getSelectedIndex()>0){
            Date f=new Date(dcFecha.getDate().getTime());  //Casteo de util.Date a sql.Date
            LocalDate fec = f.toLocalDate();     //recibo la fecha en sql.Date y la paso a localdate 
            String x = recuperarDato((String) cbHorarios.getSelectedItem(), "Salida: ([0-9:0-9]+)");
            LocalTime salida = new LocalTimeStringConverter().fromString(x);
            
//            String y = recuperarDato((String) cbHorarios.getSelectedItem(), "Llegada: ([0-9:0-9]+)");
//            LocalTime llegada = new LocalTimeStringConverter().fromString(y);
//            ArrayList lista = coleData.listarColectivosDisponibles(fec, salida, llegada);

              lista = pasajeData.listarColectivosAsignados(r.getIdRuta(), fec, salida);
              venta.setRuta(r);
              venta.setFechaViaje(fec);
              venta.setHoraViaje(salida);
            cargarTabla(lista);
        }
        cbAsientos.setEnabled(false);
    }//GEN-LAST:event_cbHorariosActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fs = tabla.getSelectedRow();
        if(fs>=0){
            cbAsientos.setEnabled(true);
            ArrayList<Integer> ocupados = pasajeData.AsientosVendidos((Integer)tabla.getValueAt(fs, 0), venta.getRuta().getIdRuta(), venta.getFechaViaje(), venta.getHoraViaje());
            ArrayList<Integer> disponibles = new ArrayList<>();
            for(int i=1;i<=(int)tabla.getValueAt(fs, 2);i++){
                if(!ocupados.contains(i)){                
                    disponibles.add(i);
                }
            }
            llenarCombo(cbAsientos, disponibles);            
        }
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbAsientos;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbHorarios;
    private javax.swing.JComboBox<String> cbOrden;
    private javax.swing.JComboBox<String> cbOrigen;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JPanel fecha;
    private javax.swing.JPanel horario;
    private javax.swing.JButton jBCrear;
    private javax.swing.JPanel jGuardar;
    private javax.swing.JPanel jHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPasajero;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel panelAsiento;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JPanel panelOrdenar;
    private javax.swing.JPanel panelOrigen;
    private javax.swing.JPanel panelPasajero;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel ruta;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfPasajero;
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
    
    private void armarCabecera(){
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Colectivo");
        modeloTabla.addColumn("Capacidad");
        modeloTabla.addColumn("Disponibilidad");
        tabla.setModel(modeloTabla);    
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    private void cargarTabla(Collection<Colectivos> lista) {
        borrarFilas();
        cbAsientos.removeAllItems();
        for(Colectivos x: lista){
            int asientosVendidos = pasajeData.AsientosVendidos(x.getIdColectivo(), venta.getRuta().getIdRuta(), venta.getFechaViaje(), venta.getHoraViaje()).size();
            int dispon = x.getCapacidad() - asientosVendidos;
                    
            modeloTabla.addRow(new Object[]{x.getIdColectivo(), x.toString(), x.getCapacidad(), dispon});
        }
    }

    private void llenarCombo(JComboBox<String> combo, Collection lista){
        combo.removeAllItems();
        combo.addItem("---");
        for (Object x : lista){
            combo.addItem(x.toString());
        }
    }
    
    private String recuperarDato(String cadena, String patron){
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);

        //vemos si coincide el patrón con el texto
        if (matcher.find()) {
            //Coincidió => obtener el valor del grupo 1
            return matcher.group(1);
        }
        return "No se encontro";
    }

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
}
