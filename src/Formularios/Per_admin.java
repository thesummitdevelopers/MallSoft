
package Formularios;

import Clases.BaseDatos;
import Clases.Usuarios;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Per_admin extends javax.swing.JFrame {
    
    private String usuario;    
    DefaultTableModel model = null;
    
    public Per_admin(String u) throws SQLException{
        usuario = u;
        setUndecorated(true);
        initComponents();
        cargarLista();
        cargarDatos();
        
        btnGuardar1.setVisible(false);
        btnCancelar1.setVisible(false);
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);        
    }
    public void cargarDatos(){
        txtNombre.setText(tablaDatos.getValueAt(0, 0)+"");
        txtApellidos.setText(tablaDatos.getValueAt(0, 1)+"");
        txtTelefono.setText(tablaDatos.getValueAt(0, 2)+"");
        txtDireccion.setText(tablaDatos.getValueAt(0, 3)+"");
        txtEmail.setText(tablaDatos.getValueAt(0, 4)+"");
        txtUsuario.setText(tablaDatos.getValueAt(0, 5)+"");
    }   
    public void cargarLista() throws SQLException{
        model = new DefaultTableModel();
        tablaDatos.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Celular");
        model.addColumn("Direccion");
        model.addColumn("Email");
        model.addColumn("Usuario");
        
        Usuarios usuarios = new Usuarios();        
        Vector arrUsuarios = null;
        
        arrUsuarios = (Vector)usuarios.datosUsuario(usuario);                
        for(int i=0;i<arrUsuarios.size();i++){
            Vector dato = (Vector)arrUsuarios.get(i);
                model.addRow(dato);
        }
        tablaDatos.updateUI();                                                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContraseña2 = new javax.swing.JPasswordField();
        txtContraseña1 = new javax.swing.JPasswordField();
        txtContraseña3 = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 50, 150, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Teléfono:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 170, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Dirección:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 230, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 150, 30);

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtNombre.setEnabled(false);
        jPanel2.add(txtNombre);
        txtNombre.setBounds(190, 50, 340, 40);

        txtApellidos.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtApellidos.setEnabled(false);
        jPanel2.add(txtApellidos);
        txtApellidos.setBounds(190, 110, 340, 40);

        txtTelefono.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtTelefono.setEnabled(false);
        jPanel2.add(txtTelefono);
        txtTelefono.setBounds(190, 170, 150, 40);

        txtDireccion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDireccion.setEnabled(false);
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(190, 230, 610, 40);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtEmail.setEnabled(false);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(190, 290, 400, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("E - mail:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 290, 150, 30);

        btnGuardar1.setBackground(new java.awt.Color(147, 198, 249));
        btnGuardar1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar1);
        btnGuardar1.setBounds(620, 90, 160, 50);

        btnCancelar1.setBackground(new java.awt.Color(147, 198, 249));
        btnCancelar1.setFont(new java.awt.Font("Showcard Gothic", 1, 27)); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar1);
        btnCancelar1.setBounds(600, 160, 200, 60);

        btnEditar1.setBackground(new java.awt.Color(147, 198, 249));
        btnEditar1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        btnEditar1.setText("Editar");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar1);
        btnEditar1.setBounds(630, 40, 140, 39);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(140, 20, 810, 360);

        jPanel3.setLayout(null);

        btnEditar.setBackground(new java.awt.Color(147, 198, 249));
        btnEditar.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar);
        btnEditar.setBounds(630, 40, 140, 39);

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtUsuario.setEnabled(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsuario);
        txtUsuario.setBounds(353, 26, 220, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Usuario:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(73, 32, 245, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Contraseña Actual:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 83, 308, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nueva Contraseña:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(73, 134, 245, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(34, 185, 284, 30);

        txtContraseña2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtContraseña2.setEnabled(false);
        jPanel3.add(txtContraseña2);
        txtContraseña2.setBounds(353, 128, 220, 40);

        txtContraseña1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtContraseña1.setText("s23123123123");
        txtContraseña1.setEnabled(false);
        jPanel3.add(txtContraseña1);
        txtContraseña1.setBounds(353, 77, 220, 40);

        txtContraseña3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtContraseña3.setEnabled(false);
        jPanel3.add(txtContraseña3);
        txtContraseña3.setBounds(353, 179, 220, 40);

        btnCancelar.setBackground(new java.awt.Color(147, 198, 249));
        btnCancelar.setFont(new java.awt.Font("Showcard Gothic", 1, 27)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);
        btnCancelar.setBounds(600, 160, 200, 60);

        btnGuardar.setBackground(new java.awt.Color(147, 198, 249));
        btnGuardar.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar);
        btnGuardar.setBounds(620, 90, 160, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(140, 400, 810, 230);

        btnAtras.setBackground(new java.awt.Color(230, 0, 51));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 0, 50)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(450, 650, 190, 90);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1024, 768);

        tablaDatos.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Telefono", "Direccion", "Email", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setRowHeight(23);
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 500, 70, 50);

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

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String a="";

        if(txtTelefono.getText().equals(a) || txtDireccion.getText().equals(a) || txtEmail.getText().equals(a)){            
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios.","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            int i = JOptionPane.showConfirmDialog(null,"¿Realmente desea modificar este registro?","Modificar",JOptionPane.YES_NO_OPTION);
        
            if(i==JOptionPane.YES_OPTION){
                Usuarios usuarios = new Usuarios();
                
                String[] datos = new String[3];

                datos[0] = txtTelefono.getText().trim();
                datos[1] = txtDireccion.getText().trim();
                datos[2] = txtEmail.getText().trim();
                
                try {
                    usuarios.modificarPerfil(datos, usuario);
                    cargarLista();
                    JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
                    
                    txtTelefono.setEnabled(false);
                    txtDireccion.setEnabled(false);
                    txtEmail.setEnabled(false);                    

                    btnGuardar1.setEnabled(false);
                    btnEditar1.setEnabled(true);
                    btnCancelar1.setEnabled(false);
                    btnGuardar1.setVisible(false);
                    btnCancelar1.setVisible(false);

                } catch (SQLException ex) {
                    Logger.getLogger(Per_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);

        btnCancelar1.setVisible(false);
        btnGuardar1.setVisible(false);
        btnEditar1.setEnabled(true);
        cargarDatos();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        btnEditar1.setEnabled(false);
        btnGuardar1.setVisible(true);
        btnCancelar1.setVisible(true);
        btnGuardar1.setEnabled(true);
        btnCancelar1.setEnabled(true);

        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setEnabled(false);
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);

        txtContraseña1.setText("");
        txtContraseña1.setEnabled(true);
        txtContraseña2.setEnabled(true);
        txtContraseña3.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        txtContraseña1.setText("111111111111");
        txtContraseña1.setEnabled(false);
        txtContraseña2.setEnabled(false);
        txtContraseña3.setEnabled(false);

        btnEditar.setEnabled(true);
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String a="";
        BaseDatos bd = new BaseDatos();
        if(bd.validarUsuario(usuario, txtContraseña1.getText().trim())){
            if(txtContraseña1.getText().equals(a) || txtContraseña2.getText().equals(a) || txtContraseña3.getText().equals(a)){            
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(txtContraseña2.getText().length()>16 || txtContraseña3.getText().length()>16){
                    JOptionPane.showMessageDialog(null, "La contraseña puede contener como máximo 16 caracteres.", "Limite sobrepasado",
                        JOptionPane.INFORMATION_MESSAGE);
                }

                else if(txtContraseña2.getText().equals(txtContraseña3.getText())){
                    int i = JOptionPane.showConfirmDialog(null,"¿Realmente desea modificar su contraseña?","Modificar",JOptionPane.YES_NO_OPTION);

                    if(i==JOptionPane.YES_OPTION){
                        Usuarios us = new Usuarios();
                        try {
                            us.modificarContraseña(txtContraseña2.getText(),usuario);
                            JOptionPane.showMessageDialog(this, "Contraseña modificada correctamente.");   
                            btnGuardar.setVisible(false);
                            btnCancelar.setVisible(false);
                            btnEditar.setEnabled(true);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(this, "Error al intentar cambiar la contraseña. Vuelva a intentarlo.");              
                        }
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                    txtContraseña2.setText("");
                    txtContraseña3.setText("");
                    }                                        
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La contraseña actual es incorrecta","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked

    }//GEN-LAST:event_tablaDatosMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Fadmin fa = new Fadmin(usuario);
        fa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    public static void main(String u) {
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
            java.util.logging.Logger.getLogger(Per_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Per_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Per_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Per_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Per_admin(u).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Per_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JPasswordField txtContraseña3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
