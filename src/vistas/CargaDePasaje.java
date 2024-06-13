package vistas;

import accesoADatos.*;
import entidades.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.converter.LocalTimeStringConverter;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CargaDePasaje extends javax.swing.JInternalFrame {
    private PasajeData pasajeData = new PasajeData();
    private RutasData rutaData = new RutasData();
    private HorariosData horaData = new HorariosData();
    private ColectivosData coleData = new ColectivosData();
    private Pasajeros pasajero = null;
    private Pasaje venta = new Pasaje();
    private DefaultTableModel modeloTabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };
    private ArrayList lista = new ArrayList();
    
    public CargaDePasaje() {
        initComponents();
        llenarCombo(cbOrigen, rutaData.listarRutasPorOrigen());
        ocultarBarraTitulo();
        armarCabecera();
        dcFecha.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        dcFecha.setDate(Date.valueOf(LocalDate.now()));
        ((JTextField) this.dcFecha.getDateEditor()).setEditable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelAsiento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbAsientos = new javax.swing.JComboBox<>();
        btnAsignarUnidad = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        panelPasajero = new javax.swing.JPanel();
        btnCrearPas = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        ftfPrecio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        jLimpiar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Carga de Colectivo"));
        panelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 540, 210));

        panelAsiento.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Asiento:");
        panelAsiento.add(jLabel2, java.awt.BorderLayout.NORTH);

        cbAsientos.setEnabled(false);
        cbAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsientosActionPerformed(evt);
            }
        });
        panelAsiento.add(cbAsientos, java.awt.BorderLayout.SOUTH);

        panelTabla.add(panelAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 121, -1));

        btnAsignarUnidad.setText("Asignar Unidad"); // NOI18N
        btnAsignarUnidad.setEnabled(false);
        btnAsignarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarUnidadActionPerformed(evt);
            }
        });
        panelTabla.add(btnAsignarUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 110, -1));

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 720, 240));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPasajero.setBackground(new java.awt.Color(255, 255, 255));
        panelPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasajero", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        btnCrearPas.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCrearPas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil (1).png"))); // NOI18N
        btnCrearPas.setText("Crear Usuario");
        btnCrearPas.setToolTipText("");
        btnCrearPas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPasActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lPasajero.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lPasajero.setForeground(new java.awt.Color(0, 0, 51));
        lPasajero.setText("DNI:");

        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfPasajero.setEditable(false);
        tfPasajero.setBackground(new java.awt.Color(255, 255, 255));
        tfPasajero.setToolTipText("");

        javax.swing.GroupLayout panelPasajeroLayout = new javax.swing.GroupLayout(panelPasajero);
        panelPasajero.setLayout(panelPasajeroLayout);
        panelPasajeroLayout.setHorizontalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lPasajero)
                .addGap(4, 4, 4)
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasajeroLayout.createSequentialGroup()
                        .addComponent(tfDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnCrearPas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPasajeroLayout.setVerticalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDni)
                            .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscar)
                                .addComponent(lPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCrearPas)))
                .addContainerGap())
        );

        panelDatos.add(panelPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 540, -1));

        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ruta"));

        panelDestino.setBackground(new java.awt.Color(255, 255, 255));
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

        panelOrigen.setBackground(new java.awt.Color(255, 255, 255));
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
                .addGap(0, 14, Short.MAX_VALUE))
        );
        rutaLayout.setVerticalGroup(
            rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutaLayout.createSequentialGroup()
                .addComponent(panelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, -1, -1));

        horario.setBackground(new java.awt.Color(255, 255, 255));
        horario.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
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

        panelDatos.add(horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 293, 28));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setLayout(new java.awt.BorderLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Fecha:  ");
        fecha.add(jLabel12, java.awt.BorderLayout.WEST);
        fecha.add(dcFecha, java.awt.BorderLayout.CENTER);

        panelDatos.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 231, 28));

        jPanel2.setBackground(new java.awt.Color(138, 193, 223));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ftfPrecio.setEditable(false);
        ftfPrecio.setForeground(new java.awt.Color(255, 0, 0));
        ftfPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$#,##0.###"))));
        ftfPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfPrecio.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Precio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(ftfPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfPrecio)
                .addGap(6, 6, 6))
        );

        panelDatos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 140, 90));

        btnVender.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/autobus (1).png"))); // NOI18N
        btnVender.setText("Vender Pasaje");
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVender.setEnabled(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        panelDatos.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 50));

        jLimpiar.setBackground(new java.awt.Color(138, 193, 223));
        jLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        jLabel7.setText("Limpiar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLimpiar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        panelDatos.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 122, -1));

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 740, 300));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Pasajes");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 40));

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 40));

        getContentPane().add(panelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseMoved
         jLimpiar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jLimpiarMouseMoved

    private void jLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseExited
        jLimpiar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jLimpiarMouseExited

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            btnBuscar.doClick();
        }
        if(!(tfDni.getText()+evt.getKeyChar()).matches("\\d{1,8}")){
            evt.consume();
        }
    }//GEN-LAST:event_tfDniKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pasajero = new PasajerosData().buscarPasajeroDNI(tfDni.getText());
        String texto = "Usuario no encontrado";
        if(pasajero!=null){
            texto = pasajero.getApellido()+", "+pasajero.getNombre();
            venta.setPasajero(pasajero);
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
        btnAsignarUnidad.setEnabled(false);
    }//GEN-LAST:event_cbOrigenActionPerformed

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        lista.clear();
        cargarTabla(lista);
        Rutas r=null;
        if(cbDestino.getSelectedIndex()<1){
            cbHorarios.setEnabled(false);
            cbAsientos.setEnabled(false);
        }else{
            r = rutaData.buscarRuta((String) cbOrigen.getSelectedItem(), (String) cbDestino.getSelectedItem());
            llenarCombo(cbHorarios, horaData.listarHorariosXRuta(r.getIdRuta()));
            cbHorarios.setEnabled(true);           
        }
        if(r == null){
            ftfPrecio.setText("-----");
        }else{            
            double precio = calcularPrecio(r.getDuracionEst());
            venta.setPrecio(precio);
            ftfPrecio.setText("$ "+precio);
        }        
        btnAsignarUnidad.setEnabled(false);
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void cbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHorariosActionPerformed
        
        borrarFilas();
        if(cbHorarios.getSelectedIndex()>0){
            Rutas r = rutaData.buscarRuta((String)cbOrigen.getSelectedItem(), (String)cbDestino.getSelectedItem());
            Date f=new Date(dcFecha.getDate().getTime());  //Casteo de util.Date a sql.Date
            LocalDate fec = f.toLocalDate();     //recibo la fecha en sql.Date y la paso a localdate 
            String x = recuperarDato((String) cbHorarios.getSelectedItem(), "Salida: ([0-9:0-9]+)");
            LocalTime salida = new LocalTimeStringConverter().fromString(x);
            
              lista = coleData.listarColectivosAsignados(r.getIdRuta(), fec, salida);
              venta.setRuta(r);
              venta.setFechaViaje(fec);
              venta.setHoraViaje(salida);
        }
            cargarTabla(lista);
        cbAsientos.setEnabled(false);
    }//GEN-LAST:event_cbHorariosActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fs = tabla.getSelectedRow();
        if(fs>=0){
            System.out.println(fs);
            int idColectivo=(int)tabla.getValueAt(fs, 0);
            cbAsientos.setEnabled(true);
            ArrayList<Integer> ocupados = pasajeData.AsientosVendidos(idColectivo, venta.getRuta().getIdRuta(), venta.getFechaViaje(), venta.getHoraViaje());
            ArrayList<Integer> disponibles = new ArrayList<>();
            for(int i=1;i<=(int)tabla.getValueAt(fs, 2);i++){
                if(!ocupados.contains(i)){                
                    disponibles.add(i);
                }
            }
            venta.setColectivo(coleData.buscarColectivo(idColectivo));
            llenarCombo(cbAsientos, disponibles);            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        venta.setAsiento(Integer.parseInt(cbAsientos.getSelectedItem().toString()));
        if(pasajero!=null){
            pasajeData.guardarPasaje(venta);
            limpiarCampos();            
        }else{
            JOptionPane.showMessageDialog(this, "Cargue el pasajero");
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void cbAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsientosActionPerformed
        if(cbAsientos.getSelectedIndex()>0){
            btnVender.setEnabled(true);
        }else{
            btnVender.setEnabled(false);            
        }
    }//GEN-LAST:event_cbAsientosActionPerformed

    private void btnCrearPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPasActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        CargarPasajero cp = new CargarPasajero(f, true, tfDni.getText());

        cp.pack();
        cp.setLocationRelativeTo(null); 
    
    cp.setVisible(true);
    }//GEN-LAST:event_btnCrearPasActionPerformed

    private void btnAsignarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarUnidadActionPerformed
        Rutas r = rutaData.buscarRuta((String) cbOrigen.getSelectedItem(), (String) cbDestino.getSelectedItem());
        Date f = new Date(dcFecha.getDate().getTime());                      //Casteo de util.Date a sql.Date
        LocalDate fec = f.toLocalDate();                                    //recibo la fecha en sql.Date y la paso a localdate 
        String x = recuperarDato((String) cbHorarios.getSelectedItem(), "Salida: ([0-9:0-9]+)");
        String[] hora=x.split(":");
        LocalTime salida = LocalTime.of(Integer.parseInt(hora[0]), Integer.parseInt(hora[1]));    
//LISTO LOS COLECTIVOS DIPONIBLES
        ArrayList listaDispon = coleData.listarColectivosDisponibles(r.getIdRuta(), fec, salida);

        if(modeloTabla.getRowCount()==listaDispon.size()){            
            JOptionPane.showMessageDialog(this, "No hay colectivos disponibles");
        }else{            
            cargarTabla(listaDispon);
        }
    }//GEN-LAST:event_btnAsignarUnidadActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarUnidad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPas;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbAsientos;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbHorarios;
    private javax.swing.JComboBox<String> cbOrigen;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JPanel fecha;
    private javax.swing.JFormattedTextField ftfPrecio;
    private javax.swing.JPanel horario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLimpiar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPasajero;
    private javax.swing.JPanel panelAsiento;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDestino;
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
        tabla.getColumnModel().getColumn(0).setPreferredWidth(7);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(130);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(18);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(20);
    }
    
    private void cargarTabla(Collection<Colectivos> lista) {
        boolean noHayDisp=true;
        borrarFilas();
        cbAsientos.removeAllItems();
        for(Colectivos x: lista){
            int idP = x.getIdColectivo();
            int idR = venta.getRuta().getIdRuta();
            LocalDate fV = venta.getFechaViaje();
            LocalTime hV = venta.getHoraViaje();
            int asientosVendidos = pasajeData.AsientosVendidos(idP, idR, fV, hV).size();
            int a = x.getCapacidad() - asientosVendidos;
            String dispon = a+"";
            if(a==0 && noHayDisp){
                btnAsignarUnidad.setEnabled(true);
            }else{
                noHayDisp=false;
                btnAsignarUnidad.setEnabled(false);
            }
            if(a==0){                
                dispon="LLENO";
            }
            modeloTabla.addRow(new Object[]{x.getIdColectivo(), x.toString(), x.getCapacidad(), dispon});
        }
        if(tabla.getRowCount()==0){
            btnAsignarUnidad.setEnabled(true);
        }else{
//            if(tabla.getSelectedRowCount()>0){
//                btnVender.setEnabled(true);
//            }
        }
    }
    
//    private void sumarATabla(Collection<Colectivos> lista) {
//        for(Colectivos x: lista){
//            int idP = x.getIdColectivo();
//            int idR = venta.getRuta().getIdRuta();
//            LocalDate fV = venta.getFechaViaje();
//            LocalTime hV = venta.getHoraViaje();
//            int asientosVendidos = pasajeData.AsientosVendidos(idP, idR, fV, hV).size();
//            int a = x.getCapacidad() - asientosVendidos;
//            String dispon = a+"";
//            modeloTabla.addRow(new Object[]{x.getIdColectivo(), x.toString(), x.getCapacidad(), dispon});
//        }
//    }

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

    private double calcularPrecio(LocalTime tiempo) {
        LocalTime s = LocalTime.of(00, 00);
        long minutos = s.until(tiempo, ChronoUnit.MINUTES);
        double precio = minutos*5.5;
        return precio;
    }

    private void limpiarCampos() {
        tfDni.setText("");
        tfPasajero.setText("");
        cbOrigen.setSelectedIndex(-1);
        cbDestino.setSelectedIndex(-1);
        cbHorarios.setSelectedIndex(-1);
        cbAsientos.setSelectedIndex(-1);
        ftfPrecio.setText("");
        dcFecha.setDate(Date.valueOf(LocalDate.now()));        
    }
}
