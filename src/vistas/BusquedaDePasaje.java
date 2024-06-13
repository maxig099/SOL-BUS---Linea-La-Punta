package vistas;

import accesoADatos.*;
import entidades.*;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class BusquedaDePasaje extends javax.swing.JInternalFrame {

    private Pasaje pasajeUnico;
    private List<Pasaje> listaPasaje;
   
    private PasajeData pasajeData = new PasajeData();
   
    private Pasajeros pasajero = null;
    private List<Pasaje> muchosPasajes;
    private Pasaje pasaje = new Pasaje();
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };

    public BusquedaDePasaje() {
        initComponents();
        armarCabecera();
       
        listaPasaje = pasajeData.listarVentas();
        cargarTabla();
        ocultarBarraTitulo();
//        dcDesde.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
//        dcDesde.setDate(Date.valueOf(LocalDate.now()));
//        dcHasta.setMaxSelectableDate(Date.valueOf(LocalDate.now()));
//        dcHasta.setDate(Date.valueOf(LocalDate.now()));
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

        panelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 350));

        panelAsiento.setLayout(new java.awt.BorderLayout());
        panelTabla.add(panelAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 18, 121, -1));

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 770, 390));

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

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDPasaje", "IDPasajero" }));

        javax.swing.GroupLayout panelPasajeroLayout = new javax.swing.GroupLayout(panelPasajero);
        panelPasajero.setLayout(panelPasajeroLayout);
        panelPasajeroLayout.setHorizontalGroup(
            panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPasajeroLayout.createSequentialGroup()
                        .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(303, Short.MAX_VALUE))
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

        panelDatos.add(panelPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, 90));

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 130));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda de Pasajes");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        getContentPane().add(panelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int tipo = cbBuscar.getSelectedIndex();
        if (tfDni.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Tiene que ingresar algun ID");
            cargarTabla();
        }
        if (tipo == 0) {
            pasajeUnico = pasajeData.buscarVenta(Integer.parseInt(tfDni.getText()));
            String texto = "Pasaje Encontrado";
//            if (pasajero != null) {
//                texto = pasajero.getApellido() + ", " + pasajero.getNombre();
//                pasaje.setPasajero(pasajero);
//            }
//            tfPasajero.setText(texto);
            busquedaTabla();
        } else if (tipo == 1) {      //LISTAR POR ID PASAJE
            pasajero = new PasajerosData().buscarPasajero(Integer.parseInt(tfDni.getText()));
            muchosPasajes = pasajeData.listarVentasXPasajero(pasajero.getIdPasajero());
            String texto = "Usuario no encontrado";
            if (pasajero != null) {
                texto = pasajero.getApellido() + ", " + pasajero.getNombre();
                pasaje.setPasajero(pasajero);
            }
            tfPasajero.setText(texto);
            busquedaTabla();
        } 
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        if (!(tfDni.getText() + evt.getKeyChar()).matches("\\d{1,8}")) {
            evt.consume();
        }
        
    }//GEN-LAST:event_tfDniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAsiento;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelPasajero;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
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

    private void busquedaTabla() {
        borrarFilas();
        int tipo = cbBuscar.getSelectedIndex();

        if (tipo == 0) {
            modeloTabla.addRow(new Object[]{pasajeUnico.getIdPasaje(),pasajeUnico.getPasajero(),pasajeUnico.getFechaViaje(),pasajeUnico.getColectivo(),pasajeUnico.getAsiento(),pasajeUnico.getPrecio()});
        } else if (tipo == 1) {
            for (Pasaje x : muchosPasajes) {
                modeloTabla.addRow(new Object[]{x.getIdPasaje(), x.getPasajero(), x.getRuta(), x.getFechaViaje(), x.getHoraViaje(), x.getColectivo(), x.getAsiento(), x.getPrecio()});
            }
        }

    }

    private void cargarTabla() {
        borrarFilas();
        for (Pasaje x : listaPasaje) {
            modeloTabla.addRow(new Object[]{x.getIdPasaje(), x.getPasajero(), x.getRuta(), x.getFechaViaje(), x.getHoraViaje(), x.getColectivo(), x.getAsiento(), x.getPrecio()});
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
