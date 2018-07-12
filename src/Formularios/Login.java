package Formularios;

import Clases.BaseDatos;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        setUndecorated(true);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnOlvido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 68)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 100, 290, 120);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 68)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Clave:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 250, 290, 120);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 68)); // NOI18N
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(470, 100, 390, 110);

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 68)); // NOI18N
        jPanel1.add(txtClave);
        txtClave.setBounds(470, 260, 390, 110);

        btnIngresar.setBackground(new java.awt.Color(147, 198, 249));
        btnIngresar.setFont(new java.awt.Font("Showcard Gothic", 1, 80)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(440, 510, 450, 100);

        btnAtras.setBackground(new java.awt.Color(230, 0, 51));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(150, 520, 190, 80);

        btnRegistro.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(51, 51, 255));
        btnRegistro.setText("¿Es nuevo? Regístrese...");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro);
        btnRegistro.setBounds(570, 630, 300, 50);

        btnOlvido.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnOlvido.setForeground(new java.awt.Color(255, 51, 51));
        btnOlvido.setText("Olvidé mi contraseña");
        btnOlvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnOlvido);
        btnOlvido.setBounds(600, 390, 240, 37);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1024, 768);

        jButton1.setText("1");
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 20, 39, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Inicio in;
        try {
            in = new Inicio();
            in.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = txtUsuario.getText().trim();
        String clave   = txtClave.getText();
        BaseDatos bd= new BaseDatos();
        
        if ("".equals(usuario) || "".equals(clave)){
            JOptionPane.showMessageDialog(null, "Ingrese su usuario y contraseña. O regístrese...", "Error de Login",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (bd.validarUsuario(usuario,clave)){           
            if(bd.frameNormal(usuario, clave)==true){
                Fusuario frmUsuario = new Fusuario(usuario);
                frmUsuario.setVisible(true);
                this.setVisible(false);                 
            }
            else{                
                Fadmin frmAdmin = new Fadmin(usuario);
                frmAdmin.setVisible(true);
                this.setVisible(false);
            }            
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña ingresadas son incorrectas.",
                    "Error de Login",JOptionPane.WARNING_MESSAGE);            
            txtUsuario.requestFocus();
        }                
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Fregistro fr = new Fregistro();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnOlvido;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
