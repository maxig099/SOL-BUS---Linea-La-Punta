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
import java.awt.Frame;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.converter.LocalTimeStringConverter;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
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
        dcFecha.setDate(Date.valueOf(LocalDate.now().minusDays(2)));
        
        
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
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ftfPrecio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelPrincipal.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 590));

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Carga de Colectivo"));

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

        btnAsignarUnidad.setText("Asignar Unidad"); // NOI18N
        btnAsignarUnidad.setEnabled(false);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarUnidad))
                .addGap(32, 32, 32))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addComponent(panelAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAsignarUnidad))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 550, 150));

        panelPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasajero", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        btnCrearPas.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCrearPas.setText("Crear Usuario");
        btnCrearPas.setToolTipText("");
        btnCrearPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPasActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lPasajero.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lPasajero.setForeground(new java.awt.Color(0, 0, 51));
        lPasajero.setText("DNI:");

        tfDni.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGap(21, 21, 21)
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addComponent(lPasajero)
                        .addGap(4, 4, 4)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearPas)
                .addGap(28, 28, 28))
        );
        panelPasajeroLayout.setVerticalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(lPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnCrearPas)))
                .addContainerGap())
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
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 550, 300));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVender.setText("Vender Pasaje");
        btnVender.setEnabled(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
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
                    .addComponent(ftfPrecio))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(btnVender)
                .addGap(75, 75, 75)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 550, 70));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 590));

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
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void cbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHorariosActionPerformed
        Rutas r = rutaData.buscarRuta((String)cbOrigen.getSelectedItem(), (String)cbDestino.getSelectedItem());
        
        borrarFilas();
        if(cbHorarios.getSelectedIndex()>0){
            Date f=new Date(dcFecha.getDate().getTime());  //Casteo de util.Date a sql.Date
            LocalDate fec = f.toLocalDate();     //recibo la fecha en sql.Date y la paso a localdate 
            String x = recuperarDato((String) cbHorarios.getSelectedItem(), "Salida: ([0-9:0-9]+)");
            LocalTime salida = new LocalTimeStringConverter().fromString(x);
            
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        venta.setAsiento(Integer.parseInt(cbAsientos.getSelectedItem().toString()));
        pasajeData.guardarPasaje(venta);
        limpiarCampos();
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
        cp.setVisible(true);
    }//GEN-LAST:event_btnCrearPasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarUnidad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbAsientos;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbHorarios;
    private javax.swing.JComboBox<String> cbOrigen;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JPanel fecha;
    private javax.swing.JFormattedTextField ftfPrecio;
    private javax.swing.JPanel horario;
    private javax.swing.JPanel jGuardar;
    private javax.swing.JPanel jHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPasajero;
    private javax.swing.JPanel menuLateral;
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
        
    }
}
