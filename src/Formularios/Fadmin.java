package Formularios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Fadmin extends javax.swing.JFrame {
    private String usuario; 
    public Fadmin(String u) {  
        usuario = u;
        setUndecorated(true);        
        initComponents();
        System.out.println(usuario);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnOfertas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        btnPerfil.setBackground(new java.awt.Color(147, 198, 249));
        btnPerfil.setFont(new java.awt.Font("Showcard Gothic", 1, 50)); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerfil);
        btnPerfil.setBounds(320, 40, 380, 110);

        btnProductos.setBackground(new java.awt.Color(147, 198, 249));
        btnProductos.setFont(new java.awt.Font("Showcard Gothic", 1, 45)); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductos);
        btnProductos.setBounds(320, 170, 380, 110);

        btnOfertas.setBackground(new java.awt.Color(147, 198, 249));
        btnOfertas.setFont(new java.awt.Font("Showcard Gothic", 1, 50)); // NOI18N
        btnOfertas.setText("Anuncios");
        btnOfertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });
        jPanel1.add(btnOfertas);
        btnOfertas.setBounds(320, 450, 380, 110);

        btnSalir.setBackground(new java.awt.Color(147, 198, 249));
        btnSalir.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        btnSalir.setText("Cerrar Sesión");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(320, 620, 380, 110);

        btnUsuarios.setBackground(new java.awt.Color(147, 198, 249));
        btnUsuarios.setFont(new java.awt.Font("Showcard Gothic", 1, 50)); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios);
        btnUsuarios.setBounds(320, 310, 380, 110);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1024, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Pr_admin prad = new Pr_admin(usuario);
        prad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        Per_admin pa;
        try {
            pa = new Per_admin(usuario);
            pa.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Fadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de cerrar su sesión?", "Salir", JOptionPane.YES_OPTION);
        if(resp==JOptionPane.YES_OPTION){
            Inicio in;
            try {
                in = new Inicio();
                in.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Fadmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Fadmin.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Users_admin usuarios = new Users_admin(usuario);
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        Anu_admin anu = new Anu_admin(usuario);
        anu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOfertasActionPerformed
    public static void main(String u) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fadmin(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
