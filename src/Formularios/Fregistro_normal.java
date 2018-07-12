
package Formularios;

import Clases.BaseDatos;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Fregistro_normal extends javax.swing.JFrame {
    public Fregistro_normal() {
        setUndecorated(true);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();
        txtEmail2 = new javax.swing.JComboBox<>();
        txtDistrito = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Comprobar contraseña:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 690, 290, 50);

        btnRegistrarse.setBackground(new java.awt.Color(147, 198, 249));
        btnRegistrarse.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse);
        btnRegistrarse.setBounds(750, 550, 260, 80);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtNombre);
        txtNombre.setBounds(380, 40, 370, 50);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(380, 390, 570, 50);

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jPanel1.add(txtCelular);
        txtCelular.setBounds(380, 180, 180, 50);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtEmail);
        txtEmail.setBounds(380, 480, 220, 50);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(380, 550, 250, 50);

        txtContraseña2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtContraseña2);
        txtContraseña2.setBounds(380, 690, 250, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 40, 290, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 110, 290, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Celular:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 180, 290, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Distrito:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(630, 300, 90, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("e-mail:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 480, 290, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Usuario:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 550, 290, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 620, 290, 50);

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(380, 620, 250, 50);

        btnAtras.setBackground(new java.awt.Color(230, 0, 51));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(810, 650, 150, 80);

        txtEmail2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@hotmail.com", "@outlook.com", "@gmail.com" }));
        jPanel1.add(txtEmail2);
        txtEmail2.setBounds(620, 480, 200, 50);

        txtDistrito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto Selva Alegre", "Arequipa", "Cayma", "Cerro Colorado", "Characato", "Chiguata", "Jacobo Hnter", "José Luis B. y R.", "La Joya", "Mariano Melgar", "Miraflores", "Mollebaya", "Paucarpata", "Pocsi", "Polobaya", "Quequeña", "Sabandia", "Sachaca", "San Juan de Siguas", "San Juan de Tarucani", "Santa Isabel de Siguas", "Santa Rita de Siguas", "Socabara", "Tiabaya", "Uchumayo", "Vitor", "Yanahuara", "Yarabamba", "Yura" }));
        jPanel1.add(txtDistrito);
        txtDistrito.setBounds(730, 300, 282, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Dirección Domiciliaria:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 390, 280, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Departamento:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 300, 180, 50);

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arequipa" }));
        jPanel1.add(txtDepartamento);
        txtDepartamento.setBounds(230, 300, 133, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Provincia:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 300, 120, 50);

        txtProvincia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arequipa" }));
        jPanel1.add(txtProvincia);
        txtProvincia.setBounds(490, 300, 133, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Lugar de domicilio:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 250, 240, 50);

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(380, 110, 370, 50);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1024, 768);

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

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String a="";

        String nombre       = txtNombre.getText();
        String apellidos    = txtApellidos.getText();
        String usuario      = txtUsuario.getText();
        String contraseña   = txtContraseña.getText();
        String contraseña2  = txtContraseña2.getText();
        String celular      = txtCelular.getText();
        String direccion    = txtDepartamento.getSelectedItem().toString() +", "+
        txtProvincia.getSelectedItem().toString() +", "+
        txtDistrito.getSelectedItem().toString() +". "+ txtDireccion.getText();
        String email        = txtEmail.getText() + txtEmail2.getSelectedItem().toString();

        if(nombre.equals(a) || apellidos.equals(a) || usuario.equals(a) || contraseña.equals(a) ||
            contraseña2.equals(a) || celular.equals(a) || direccion.equals(a) || email.equals(a)){

            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else{
            if(usuario.length()>16){
                JOptionPane.showMessageDialog(null, "El usuario puede contener como máximo 16 caracteres.", "Limite sobrepasado",
                    JOptionPane.INFORMATION_MESSAGE);
            }

            else if(contraseña.length()>16 || contraseña2.length()>16){
                JOptionPane.showMessageDialog(null, "La contraseña puede contener como máximo 16 caracteres.", "Limite sobrepasado",
                    JOptionPane.INFORMATION_MESSAGE);
            }

            else if(contraseña.equals(contraseña2)){
                BaseDatos bd = new BaseDatos();
                try {
                    bd.registrarUsuario(nombre, apellidos, usuario, contraseña, celular, direccion, email, "normal");
                    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente. Por términos de seguridad, usted debe logearse.");
                    Login lo = new Login();
                    lo.setVisible(true);
                    this.setVisible(false);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al intentar registrar, vuelva a intentarlo.");                }
            }

            else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                txtContraseña.setText("");
                txtContraseña2.setText("");
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed

    }//GEN-LAST:event_txtCelularActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Pr_normal pr = new Pr_normal();
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Fregistro_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fregistro_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fregistro_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fregistro_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fregistro_normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarse;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JComboBox<String> txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JComboBox<String> txtDistrito;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtEmail2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtProvincia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
