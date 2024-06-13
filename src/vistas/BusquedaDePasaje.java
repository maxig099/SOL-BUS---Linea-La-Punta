package vistas;

import accesoADatos.*;
import entidades.*;
import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class BusquedaDePasaje extends javax.swing.JInternalFrame {
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };

    public BusquedaDePasaje() {
        initComponents();
        armarCabecera();
        llenarComboColectivos();
        llenarComboRutas();
        llenarComboHorarios();
        ocultarBarraTitulo();
        dcDesde.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
        dcDesde.setDate(Date.valueOf(LocalDate.now()));
        dcHasta.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
        dcHasta.setDate(Date.valueOf(LocalDate.now()));
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelAsiento = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        pFecha = new javax.swing.JPanel();
        pDesde = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dcDesde = new com.toedter.calendar.JDateChooser();
        pHasta = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        dcHasta = new com.toedter.calendar.JDateChooser();
        panelPasajero = new javax.swing.JPanel();
        tfId = new javax.swing.JTextField();
        tfPasajero = new javax.swing.JTextField();
        cbBuscar = new javax.swing.JComboBox<>();
        pRutasHorarios = new javax.swing.JPanel();
        pColectivos = new javax.swing.JPanel();
        cbColectivos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pHorario = new javax.swing.JPanel();
        cbHorarios = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pRuta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbRutas = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));
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

        panelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 350));

        panelAsiento.setLayout(new java.awt.BorderLayout());
        panelTabla.add(panelAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 18, 121, -1));

        principal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 770, 300));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pFecha.setBackground(new java.awt.Color(255, 255, 255));
        pFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha"));

        pDesde.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Desde:");

        javax.swing.GroupLayout pDesdeLayout = new javax.swing.GroupLayout(pDesde);
        pDesde.setLayout(pDesdeLayout);
        pDesdeLayout.setHorizontalGroup(
            pDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDesdeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(dcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDesdeLayout.setVerticalGroup(
            pDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDesdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(dcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pHasta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Hasta:");

        javax.swing.GroupLayout pHastaLayout = new javax.swing.GroupLayout(pHasta);
        pHasta.setLayout(pHastaLayout);
        pHastaLayout.setHorizontalGroup(
            pHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHastaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addComponent(dcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pHastaLayout.setVerticalGroup(
            pHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHastaLayout.createSequentialGroup()
                .addGroup(pHastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFechaLayout = new javax.swing.GroupLayout(pFecha);
        pFecha.setLayout(pFechaLayout);
        pFechaLayout.setHorizontalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pFechaLayout.setVerticalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFechaLayout.createSequentialGroup()
                .addComponent(pDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        panelDatos.add(pFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 270, 90));

        panelPasajero.setBackground(new java.awt.Color(255, 255, 255));
        panelPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pasaje", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdKeyTyped(evt);
            }
        });

        tfPasajero.setEditable(false);
        tfPasajero.setBackground(new java.awt.Color(255, 255, 255));
        tfPasajero.setToolTipText("");

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI Pasajero", "ID Pasaje" }));
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPasajeroLayout = new javax.swing.GroupLayout(panelPasajero);
        panelPasajero.setLayout(panelPasajeroLayout);
        panelPasajeroLayout.setHorizontalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelPasajeroLayout.setVerticalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(panelPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 90));

        pRutasHorarios.setBackground(new java.awt.Color(255, 255, 255));
        pRutasHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Colectivo, Ruta, Horario"));

        pColectivos.setBackground(new java.awt.Color(255, 255, 255));
        pColectivos.setLayout(new java.awt.BorderLayout());

        pColectivos.add(cbColectivos, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Colectivo:  ");
        pColectivos.add(jLabel1, java.awt.BorderLayout.WEST);

        pHorario.setBackground(new java.awt.Color(255, 255, 255));
        pHorario.setLayout(new java.awt.BorderLayout());
        pHorario.add(cbHorarios, java.awt.BorderLayout.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Horario:   ");
        pHorario.add(jLabel10, java.awt.BorderLayout.WEST);

        pRuta.setBackground(new java.awt.Color(255, 255, 255));
        pRuta.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Ruta:         ");
        pRuta.add(jLabel6, java.awt.BorderLayout.WEST);
        pRuta.add(cbRutas, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pRutasHorariosLayout = new javax.swing.GroupLayout(pRutasHorarios);
        pRutasHorarios.setLayout(pRutasHorariosLayout);
        pRutasHorariosLayout.setHorizontalGroup(
            pRutasHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRutasHorariosLayout.createSequentialGroup()
                .addGroup(pRutasHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRutasHorariosLayout.setVerticalGroup(
            pRutasHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRutasHorariosLayout.createSequentialGroup()
                .addComponent(pColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDatos.add(pRutasHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, 130));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 100, 40));

        btnBuscar.setText("FILTRAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelDatos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 100, 40));

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelDatos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 100, 40));

        principal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 220));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda de Pasajes");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        principal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        getContentPane().add(principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String sql = "";
        String sqlColectivo = "";
        String sqlRutas = "";
        String sqlHorario = "";
        String sqlDni = "";

//SELECCIONO TIPO DE BUSQUEDA
        int tipo = cbBuscar.getSelectedIndex();

        if (tipo == 0) {        //BUSCAR PASAJERO
            if(!tfId.getText().isEmpty()){          //CONTROLO LA ENTRADA DEL PASAJERO
                String dni = tfId.getText();
                Pasajeros x = new PasajerosData().buscarPasajeroDNI(dni);
                if(x != null){
                    tfPasajero.setText(x.getApellido()+", "+x.getNombre());
                    sqlDni = " AND id_pasajero = "+ x.getIdPasajero();
                }else{
                    tfPasajero.setText("Pasajero no encontrado");
                }
            }
            
//RECUPERO FECHAS
            Date f=new Date(dcDesde.getDate().getTime());  //Casteo de util.Date a sql.Date
            LocalDate desde = f.toLocalDate();     //recibo la fecha en sql.Date y la paso a localdate
            Date f2=new Date(dcHasta.getDate().getTime());  //Casteo de util.Date a sql.Date
            LocalDate hasta = f2.toLocalDate();     //recibo la fecha en sql.Date y la paso a localdate

//REVISO COMBO COLECTIVOS
            if(cbColectivos.getSelectedIndex()>0){
                Colectivos colec = (Colectivos)cbColectivos.getSelectedItem();
                sqlColectivo = " AND id_colectivo = "+colec.getIdColectivo();
            }

//REVISO COMBO RUTAS
            if(cbRutas.getSelectedIndex()>0){
                Rutas ruta = (Rutas)cbRutas.getSelectedItem();
                sqlRutas = " AND id_ruta = "+ruta.getIdRuta();
            }

//REVISO COMBO HORARIOS
            if(cbHorarios.getSelectedIndex()>0){
                Horarios horario = (Horarios)cbHorarios.getSelectedItem();
                sqlHorario = " AND hora_viaje = '"+horario.getHoraSalida()+"'";
            }

//ARMO EL STRING PARA LA CONSULTA
            sql = " SELECT * FROM pasajes WHERE (fecha_viaje BETWEEN '"+desde+"' AND '"+hasta+"')"+sqlColectivo+sqlRutas+sqlHorario+sqlDni;
            System.out.println(sql);


        } else if (tipo == 1) {         //BUSCA ID DE BOLETO
            int idBoleto = Integer.parseInt(tfId.getText());
            sql = " SELECT * FROM pasajes WHERE id_pasajes = "+idBoleto;
        }
//PASO LA CONSULTA A PASAJEDATA Y CARGO LA TABLA
        cargarTabla(new PasajeData().prueba(sql));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyTyped
        if (!(tfId.getText() + evt.getKeyChar()).matches("\\d{1,8}")) {
            evt.consume();
        }
        
    }//GEN-LAST:event_tfIdKeyTyped

    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed
        tfId.setText("");
        borrarFilas();
        if(cbBuscar.getSelectedIndex()==0){
            cbColectivos.setEnabled(true);
            cbHorarios.setEnabled(true);
            cbRutas.setEnabled(true);
            dcDesde.setEnabled(true);
            dcHasta.setEnabled(true);
        }else if(cbBuscar.getSelectedIndex()==1){
            cbColectivos.setEnabled(false);
            cbHorarios.setEnabled(false);
            cbRutas.setEnabled(false);
            dcDesde.setEnabled(false);
            dcHasta.setEnabled(false);
        }
    }//GEN-LAST:event_cbBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaTabla = tabla.getSelectedRow();

        if (filaTabla != (-1)) {
            int idPasaje = (Integer) modeloTabla.getValueAt(filaTabla, 0);
            String texto = "¿¿SEGURO QUE DESEA ELIMINAR EL PASAJE??";
            int guardar = JOptionPane.showConfirmDialog(this, texto, "CONFIRMAR ELIMINAR", JOptionPane.YES_NO_OPTION);
            if(guardar == 0){
                new PasajeData().eliminarVenta(idPasaje);
            }
            btnBuscar.doClick();
        } else {
            JOptionPane.showInternalMessageDialog(this, "Seleccione un Pasaje");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JComboBox<Object> cbColectivos;
    private javax.swing.JComboBox<Object> cbHorarios;
    private javax.swing.JComboBox<Object> cbRutas;
    private com.toedter.calendar.JDateChooser dcDesde;
    private com.toedter.calendar.JDateChooser dcHasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pColectivos;
    private javax.swing.JPanel pDesde;
    private javax.swing.JPanel pFecha;
    private javax.swing.JPanel pHasta;
    private javax.swing.JPanel pHorario;
    private javax.swing.JPanel pRuta;
    private javax.swing.JPanel pRutasHorarios;
    private javax.swing.JPanel panelAsiento;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelPasajero;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfId;
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

    private void armarCabecera() {
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

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void cargarTabla(ArrayList<Pasaje> listaPasaje) {
        borrarFilas();
        for (Pasaje x : listaPasaje) {
            modeloTabla.addRow(new Object[]{x.getIdPasaje(), x.getPasajero(), x.getRuta(), x.getFechaViaje(), x.getHoraViaje(), x.getColectivo(), x.getAsiento(), x.getPrecio()});
        }
    }

    private void llenarComboColectivos(){
        ArrayList<Colectivos> lista = new ColectivosData().listarColectivos();
        cbColectivos.addItem("---");
        for (Colectivos x : lista){
            cbColectivos.addItem(x);
        }
    }
    
    public void llenarComboRutas() {
        ArrayList<Rutas> lista = new RutasData().listarRutas();
        cbRutas.addItem("---");
        for (Rutas x : lista) {
            cbRutas.addItem(x);
        }        
    }
    
    public void llenarComboHorarios() {
        ArrayList<Horarios> lista = new HorariosData().listarHorarios();
        cbHorarios.addItem("---");
        for (Horarios x : lista) {
            cbHorarios.addItem(x);
        }        
    }
    
    private void limpiarCampos() {
        tfId.setText("");
        tfPasajero.setText("");
        cbColectivos.setSelectedIndex(0);
        cbHorarios.setSelectedIndex(0);
        cbRutas.setSelectedIndex(0);        
        dcDesde.setDate(Date.valueOf(LocalDate.now()));        
        dcHasta.setDate(Date.valueOf(LocalDate.now())); 
        borrarFilas();
    }
}
