package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"));
        Image image = icon.getImage();
        jInicio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCargaPasajero = new javax.swing.JMenuItem();
        jCargaHorario = new javax.swing.JMenuItem();
        jCargaRuta = new javax.swing.JMenuItem();
        jUnidades = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMRutas = new javax.swing.JMenuItem();
        jMPasajeros = new javax.swing.JMenuItem();
        jMHorarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jInicioLayout = new javax.swing.GroupLayout(jInicio);
        jInicio.setLayout(jInicioLayout);
        jInicioLayout.setHorizontalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jInicioLayout.setVerticalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N

        jMenu1.setText("Administracion");

        jCargaPasajero.setText("Carga de Pasajero");
        jCargaPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargaPasajeroActionPerformed(evt);
            }
        });
        jMenu1.add(jCargaPasajero);

        jCargaHorario.setText("Carga de Horarios");
        jCargaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargaHorarioActionPerformed(evt);
            }
        });
        jMenu1.add(jCargaHorario);

        jCargaRuta.setText("Carga de Rutas");
        jCargaRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargaRutaActionPerformed(evt);
            }
        });
        jMenu1.add(jCargaRuta);

        jUnidades.setText("Carga de Unidades");
        jUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUnidadesActionPerformed(evt);
            }
        });
        jMenu1.add(jUnidades);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Busqueda");

        jMRutas.setText("Rutas");
        jMRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRutasActionPerformed(evt);
            }
        });
        jMenu2.add(jMRutas);

        jMPasajeros.setText("Pasajeros");
        jMPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPasajerosActionPerformed(evt);
            }
        });
        jMenu2.add(jMPasajeros);

        jMHorarios.setText("Horarios");
        jMHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHorariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMHorarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ventas");

        jMenuItem8.setText("Generar Boleto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Listar Ventas");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInicio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPasajerosActionPerformed
         jInicio.removeAll();
        jInicio.repaint();
        CargaDePasaje ap=new CargaDePasaje();
        ap.setVisible(true);
        //ap.setLocation(200, 100);
        
       
        jInicio.add(ap);
        jInicio.moveToFront(ap);
    }//GEN-LAST:event_jMPasajerosActionPerformed

    private void jMRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRutasActionPerformed
        // TODO add your handling code here:
        mostrarPestaña(new Rutas());
    }//GEN-LAST:event_jMRutasActionPerformed

    private void jMHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHorariosActionPerformed
        // TODO add your handling code here:
        mostrarPestaña(new Horarios());
    }//GEN-LAST:event_jMHorariosActionPerformed

    private void jCargaPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargaPasajeroActionPerformed
        mostrarPestaña(new CargaDePasajero());
    }//GEN-LAST:event_jCargaPasajeroActionPerformed

    private void jCargaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargaHorarioActionPerformed
         mostrarPestaña(new CargaDeHorario());
    }//GEN-LAST:event_jCargaHorarioActionPerformed

    private void jCargaRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargaRutaActionPerformed
        mostrarPestaña(new Rutas());
    }//GEN-LAST:event_jCargaRutaActionPerformed

    private void jUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUnidadesActionPerformed
         mostrarPestaña(new CargaDeUnidades());
    }//GEN-LAST:event_jUnidadesActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        mostrarPestaña(new CargaDePasaje());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
    private javax.swing.JMenuItem jCargaHorario;
    private javax.swing.JMenuItem jCargaPasajero;
    private javax.swing.JMenuItem jCargaRuta;
    private javax.swing.JDesktopPane jInicio;
    private javax.swing.JMenuItem jMHorarios;
    private javax.swing.JMenuItem jMPasajeros;
    private javax.swing.JMenuItem jMRutas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jUnidades;
    // End of variables declaration//GEN-END:variables

    private void mostrarPestaña(JInternalFrame x) {
        jInicio.removeAll();
        jInicio.repaint();
        x.setVisible(true);
        jInicio.add(x);
        
        //La ventana interna ocupa todo el escritorio (ventana principal)
        try {
            x.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
