package vistas;

import accesoADatos.*;
import entidades.*;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class BusquedaDePasaje extends javax.swing.JInternalFrame {
    private PasajeData pasajeData = null;
    private RutasData rutaData = new RutasData();
    private HorariosData horaData = new HorariosData();
    private ColectivosData coleData = new ColectivosData();
    private Pasajeros pasajero = null;
    private Pasaje pasaje = new Pasaje();
    private DefaultTableModel modeloTabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };
    private ArrayList<Pasaje> listaPasajes = null;
    
    public BusquedaDePasaje() {
        initComponents();
        armarCabecera();
//        llenarCombo(cbOrigen, rutaData.listarRutasPorOrigen());
        ocultarBarraTitulo();
        dcDesde.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
        dcDesde.setDate(Date.valueOf(LocalDate.now()));
        dcHasta.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
        dcHasta.setDate(Date.valueOf(LocalDate.now()));
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelAsiento = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        panelPasajero = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        tfDni = new javax.swing.JTextField();
        tfPasajero = new javax.swing.JTextField();
        cbBuscar = new javax.swing.JComboBox<>();
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
        fDesde = new javax.swing.JPanel();
        dcDesde = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        fHasta = new javax.swing.JPanel();
        dcHasta = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jListar = new javax.swing.JPanel();
        btnListar = new javax.swing.JLabel();
        horario1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbHorarios1 = new javax.swing.JComboBox<>();
        jLimpiar1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasaje"));
        panelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 320));

        panelAsiento.setLayout(new java.awt.BorderLayout());
        panelTabla.add(panelAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 18, 121, -1));

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 770, 350));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPasajero.setBackground(new java.awt.Color(255, 255, 255));
        panelPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasaje", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfPasajero.setEditable(false);
        tfPasajero.setBackground(new java.awt.Color(255, 255, 255));
        tfPasajero.setToolTipText("");

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "ID" }));

        javax.swing.GroupLayout panelPasajeroLayout = new javax.swing.GroupLayout(panelPasajero);
        panelPasajero.setLayout(panelPasajeroLayout);
        panelPasajeroLayout.setHorizontalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPasajero)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelPasajeroLayout.setVerticalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(panelPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 90));

        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ruta y Horario"));

        panelDestino.setBackground(new java.awt.Color(255, 255, 255));
        panelDestino.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Destino:  ");
        panelDestino.add(jLabel8, java.awt.BorderLayout.WEST);

        cbDestino.setEnabled(false);
        panelDestino.add(cbDestino, java.awt.BorderLayout.CENTER);

        panelOrigen.setBackground(new java.awt.Color(255, 255, 255));
        panelOrigen.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Origen:    ");
        panelOrigen.add(jLabel13, java.awt.BorderLayout.WEST);

        cbOrigen.setToolTipText("");
        panelOrigen.add(cbOrigen, java.awt.BorderLayout.CENTER);

        horario.setBackground(new java.awt.Color(255, 255, 255));
        horario.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Horario:  ");
        horario.add(jLabel10, java.awt.BorderLayout.WEST);

        cbHorarios.setEnabled(false);
        horario.add(cbHorarios, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout rutaLayout = new javax.swing.GroupLayout(ruta);
        ruta.setLayout(rutaLayout);
        rutaLayout.setHorizontalGroup(
            rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutaLayout.createSequentialGroup()
                .addComponent(panelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        rutaLayout.setVerticalGroup(
            rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutaLayout.createSequentialGroup()
                .addGroup(rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 55));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha"));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Desde:");

        javax.swing.GroupLayout fDesdeLayout = new javax.swing.GroupLayout(fDesde);
        fDesde.setLayout(fDesdeLayout);
        fDesdeLayout.setHorizontalGroup(
            fDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fDesdeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fDesdeLayout.setVerticalGroup(
            fDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(dcDesde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Hasta:");

        javax.swing.GroupLayout fHastaLayout = new javax.swing.GroupLayout(fHasta);
        fHasta.setLayout(fHastaLayout);
        fHastaLayout.setHorizontalGroup(
            fHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fHastaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fHastaLayout.setVerticalGroup(
            fHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(dcHasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fechaLayout = new javax.swing.GroupLayout(fecha);
        fecha.setLayout(fechaLayout);
        fechaLayout.setHorizontalGroup(
            fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fechaLayout.setVerticalGroup(
            fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fechaLayout.createSequentialGroup()
                .addComponent(fDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 270, 90));

        jListar.setBackground(new java.awt.Color(138, 193, 223));
        jListar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jListarMouseMoved(evt);
            }
        });
        jListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jListarMouseExited(evt);
            }
        });
        jListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });
        jListar.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 120, 30));

        panelDatos.add(jListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 122, -1));

        horario1.setBackground(new java.awt.Color(255, 255, 255));
        horario1.setLayout(new java.awt.BorderLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Colectivo:  ");
        horario1.add(jLabel11, java.awt.BorderLayout.WEST);

        cbHorarios1.setEnabled(false);
        horario1.add(cbHorarios1, java.awt.BorderLayout.CENTER);

        panelDatos.add(horario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 28));

        jLimpiar1.setBackground(new java.awt.Color(138, 193, 223));
        jLimpiar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLimpiar1MouseMoved(evt);
            }
        });
        jLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLimpiar1MouseExited(evt);
            }
        });
        jLimpiar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        jLabel9.setText("Limpiar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLimpiar1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 90, 30));

        panelDatos.add(jLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 122, -1));

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 190));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga de Pasajes");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 40));

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        getContentPane().add(panelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListarMouseMoved
        jListar.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jListarMouseMoved

    private void jListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListarMouseExited
        jListar.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jListarMouseExited

    private void jLimpiar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiar1MouseMoved
        jLimpiar1.setBackground(new Color(184,210,224));
    }//GEN-LAST:event_jLimpiar1MouseMoved

    private void jLimpiar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiar1MouseExited
        jLimpiar1.setBackground(new Color(138,193,223));
    }//GEN-LAST:event_jLimpiar1MouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int tipo = cbBuscar.getSelectedIndex();
        if(tipo==0){
            pasajero = new PasajerosData().buscarPasajeroDNI(tfDni.getText());
            String texto = "Usuario no encontrado";
            if(pasajero!=null){
                texto = pasajero.getApellido()+", "+pasajero.getNombre();
                pasaje.setPasajero(pasajero);
            }
            tfPasajero.setText(texto);
            
        }else if(tipo==1){      //LISTAR POR ID PASAJE
            pasajero = new PasajerosData().buscarPasajeroDNI(tfDni.getText());
            String texto = "Usuario no encontrado";
            if(pasajero!=null){
                texto = pasajero.getApellido()+", "+pasajero.getNombre();
                pasaje.setPasajero(pasajero);
            }
            tfPasajero.setText(texto);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        if(!(tfDni.getText()+evt.getKeyChar()).matches("\\d{1,8}")){
            evt.consume();
        }
    }//GEN-LAST:event_tfDniKeyTyped

    private void jListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListarMouseClicked
        cargarTabla();
    }//GEN-LAST:event_jListarMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        listaPasajes = new PasajeData().listarVentas();
        cargarTabla();
    }//GEN-LAST:event_btnListarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnListar;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbHorarios;
    private javax.swing.JComboBox<String> cbHorarios1;
    private javax.swing.JComboBox<String> cbOrigen;
    private com.toedter.calendar.JDateChooser dcDesde;
    private com.toedter.calendar.JDateChooser dcHasta;
    private javax.swing.JPanel fDesde;
    private javax.swing.JPanel fHasta;
    private javax.swing.JPanel fecha;
    private javax.swing.JPanel horario;
    private javax.swing.JPanel horario1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLimpiar1;
    private javax.swing.JPanel jListar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
        modeloTabla.addColumn("Pasajero");
        modeloTabla.addColumn("Ruta");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Hora");
        modeloTabla.addColumn("Colectivo");
        modeloTabla.addColumn("Butaca");
        modeloTabla.addColumn("Precio");
        
        tabla.setModel(modeloTabla);    
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(7);
    }
    
    private void cargarTabla() {
        borrarFilas();
        for (Pasaje x : listaPasajes) {
            modeloTabla.addRow(new Object[]{x.getIdPasaje(), x.getPasajero(), x.getRuta(), x.getFechaViaje(), x.getHoraViaje(), x.getColectivo(),x.getAsiento(), x.getPrecio()});
        }
    }
//    
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
//
//    private void llenarCombo(JComboBox<String> combo, Collection lista){
//        combo.removeAllItems();
//        combo.addItem("---");
//        for (Object x : lista){
//            combo.addItem(x.toString());
//        }
//    }
//    
//    private String recuperarDato(String cadena, String patron){
//        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(cadena);
//
//        //vemos si coincide el patrón con el texto
//        if (matcher.find()) {
//            //Coincidió => obtener el valor del grupo 1
//            return matcher.group(1);
//        }
//        return "No se encontro";
//    }
//
    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
//
//    private double calcularPrecio(LocalTime tiempo) {
//        LocalTime s = LocalTime.of(00, 00);
//        long minutos = s.until(tiempo, ChronoUnit.MINUTES);
//        double precio = minutos*5.5;
//        return precio;
//    }
//
//    private void limpiarCampos() {
//        tfDni.setText("");
//        tfPasajero.setText("");
//        cbOrigen.setSelectedIndex(-1);
//        cbDestino.setSelectedIndex(-1);
//        cbHorarios.setSelectedIndex(-1);
//        cbAsientos.setSelectedIndex(-1);
//        ftfPrecio.setText("");
//        
//    }
}
