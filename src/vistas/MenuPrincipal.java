package vistas;

import java.awt.Color;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelAdmin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelAdmin = new javax.swing.JLabel();
        jPanelVentas = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabelVentas = new javax.swing.JLabel();
        jPanelBusqueda = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelBusqueda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanelUnidades = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelRutas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPaneHorario = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelPasajero = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanelPasajero1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelPasajero2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jInicio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoReal.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        jPanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAdmin.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 40));

        jLabelAdmin.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabelAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion.png"))); // NOI18N
        jLabelAdmin.setText("  Administracion");
        jLabelAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAdminMouseExited(evt);
            }
        });
        jPanelAdmin.add(jLabelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jPanel1.add(jPanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 40));

        jPanelVentas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelVentas.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 40));

        jLabelVentas.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabelVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.png"))); // NOI18N
        jLabelVentas.setText("    Ventas");
        jLabelVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelVentasMouseExited(evt);
            }
        });
        jPanelVentas.add(jLabelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jPanel1.add(jPanelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 40));

        jPanelBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelBusqueda.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 40));

        jLabelBusqueda.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabelBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Busqueda (2).png"))); // NOI18N
        jLabelBusqueda.setText("    Busqueda");
        jLabelBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBusquedaMouseExited(evt);
            }
        });
        jPanelBusqueda.add(jLabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jPanel1.add(jPanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 670));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bienvenido a SolBusApplication");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 280, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brailleb.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 880, -1));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanelUnidades.setBackground(new java.awt.Color(250, 250, 250));
        jPanelUnidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUnidadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUnidadesMouseExited(evt);
            }
        });
        jPanelUnidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Unidades.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanelUnidades.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 9, -1, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Carga de Unidades");
        jPanelUnidades.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, -1));

        jPanelRutas.setBackground(new java.awt.Color(250, 250, 250));
        jPanelRutas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRutasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRutasMouseExited(evt);
            }
        });
        jPanelRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rutas.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanelRutas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, -1, -1, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setText("Carga de Rutas");
        jPanelRutas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPaneHorario.setBackground(new java.awt.Color(250, 250, 250));
        jPaneHorario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPaneHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPaneHorarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPaneHorarioMouseExited(evt);
            }
        });
        jPaneHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Horarios.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPaneHorario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, -1, -1, 100));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setText("Carga de Horarios");
        jPaneHorario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanelPasajero.setBackground(new java.awt.Color(250, 250, 250));
        jPanelPasajero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPasajeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPasajeroMouseExited(evt);
            }
        });
        jPanelPasajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanelPasajero.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 90));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel12.setText("Carga de pasajero");
        jPanelPasajero.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 100, 130, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(jPaneHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanelRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jPanelUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanelPasajero1.setBackground(new java.awt.Color(250, 250, 250));
        jPanelPasajero1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPasajero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPasajero1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPasajero1MouseExited(evt);
            }
        });
        jPanelPasajero1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rutas.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanelPasajero1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, -1, -1, 100));

        jLabel16.setText("Busqueda de Rutas");
        jPanelPasajero1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanelPasajero2.setBackground(new java.awt.Color(250, 250, 250));
        jPanelPasajero2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPasajero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPasajero2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPasajero2MouseExited(evt);
            }
        });
        jPanelPasajero2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Horarios.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanelPasajero2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, -1, -1, 100));

        jLabel18.setText("Busqueda de Horarios");
        jPanelPasajero2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jPanelPasajero1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jPanelPasajero2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(690, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanelPasajero1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jPanelPasajero2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel11);

        jInicio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jInicioLayout = new javax.swing.GroupLayout(jInicio);
        jInicio.setLayout(jInicioLayout);
        jInicioLayout.setHorizontalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        jInicioLayout.setVerticalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jInicio);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 880, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVentasMouseClicked
        jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        CargaDePasaje cp=new CargaDePasaje();
        cp.setVisible(true);
        cp.setLocation(0, 10);
        
       
        jInicio.add(cp);
    }//GEN-LAST:event_jLabelVentasMouseClicked

    private void jLabelBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusquedaMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabelBusquedaMouseClicked

    private void jPanelPasajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajeroMouseEntered
       jPanelPasajero.setBackground(new Color(245,245,245));
    }//GEN-LAST:event_jPanelPasajeroMouseEntered

    private void jPanelPasajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajeroMouseExited
        jPanelPasajero.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jPanelPasajeroMouseExited

    private void jPaneHorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneHorarioMouseExited
         jPaneHorario.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jPaneHorarioMouseExited

    private void jPanelRutasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRutasMouseExited
       jPanelRutas.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jPanelRutasMouseExited

    private void jPanelUnidadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUnidadesMouseExited
        jPaneHorario.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jPanelUnidadesMouseExited

    private void jPaneHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneHorarioMouseEntered
         jPaneHorario.setBackground(new Color(245,245,245));
    }//GEN-LAST:event_jPaneHorarioMouseEntered

    private void jPanelRutasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRutasMouseEntered
        jPanelRutas.setBackground(new Color(245,245,245));
    }//GEN-LAST:event_jPanelRutasMouseEntered

    private void jPanelUnidadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUnidadesMouseEntered
        jPanelUnidades.setBackground(new Color(245,245,245));
    }//GEN-LAST:event_jPanelUnidadesMouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        CargaDePasajero ap=new CargaDePasajero();
        ap.setVisible(true);
        ap.setLocation(0, 10);
        
       
        jInicio.add(ap);
       
      
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
         jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        CargaDeHorario ap=new CargaDeHorario();
        ap.setVisible(true);
        ap.setLocation(0, 10);
        
       
        jInicio.add(ap);
        
      
       
       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        CargaDeRutas ap=new CargaDeRutas();
        ap.setVisible(true);
        ap.setLocation(0, 10);
        
       
        jInicio.add(ap);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        CargaDeUnidades ap=new CargaDeUnidades();
        ap.setVisible(true);
        ap.setLocation(0, 10);
        
       
        jInicio.add(ap);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdminMouseClicked
       jTabbedPane1.setSelectedIndex(0);
      
     
    }//GEN-LAST:event_jLabelAdminMouseClicked

    private void jLabelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdminMouseEntered
       jPanelAdmin.setBackground(new Color(183,236,252));
    }//GEN-LAST:event_jLabelAdminMouseEntered

    private void jLabelAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdminMouseExited
       jPanelAdmin.setBackground(new Color(255,255,255));
       
    }//GEN-LAST:event_jLabelAdminMouseExited

    private void jLabelVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVentasMouseEntered
        jPanelVentas.setBackground(new Color(183,236,252));
    }//GEN-LAST:event_jLabelVentasMouseEntered

    private void jLabelVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVentasMouseExited
        jPanelVentas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabelVentasMouseExited

    private void jLabelBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusquedaMouseEntered
     jPanelBusqueda.setBackground(new Color(183,236,252));
    }//GEN-LAST:event_jLabelBusquedaMouseEntered

    private void jLabelBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBusquedaMouseExited
       jPanelBusqueda.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabelBusquedaMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanelPasajero1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajero1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPasajero1MouseEntered

    private void jPanelPasajero1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajero1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPasajero1MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jTabbedPane1.setSelectedIndex(3);
        jInicio.removeAll();
        jInicio.repaint();
        BusquedaHorarios ap=new BusquedaHorarios();
        ap.setVisible(true);
        ap.setLocation(0, 10);
        
       
        jInicio.add(ap);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jPanelPasajero2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajero2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPasajero2MouseEntered

    private void jPanelPasajero2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPasajero2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPasajero2MouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelVentas;
    private javax.swing.JPanel jPaneHorario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelPasajero;
    private javax.swing.JPanel jPanelPasajero1;
    private javax.swing.JPanel jPanelPasajero2;
    private javax.swing.JPanel jPanelRutas;
    private javax.swing.JPanel jPanelUnidades;
    private javax.swing.JPanel jPanelVentas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

//    private void mostrarPestaña(JInternalFrame x) {
//        jInicio.removeAll();
//        jInicio.repaint();
//        x.setVisible(true);
//        jInicio.add(x);
//        
//        //La ventana interna ocupa todo el escritorio (ventana principal)
//        try {
//            x.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
}
