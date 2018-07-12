
package Formularios;

import Clases.BaseDatos;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Frame_imagen_usuario extends javax.swing.JFrame {
    private String sector, usuario;
    
    public Frame_imagen_usuario(String s, String u) throws SQLException, IOException {
        setUndecorated(true);
        sector = s;
        usuario = u;
        initComponents();
        cargarImagen();
    }
    public void cargarImagen() throws SQLException, IOException{
        int id=0;
        if(sector.equals("A")){
            id=2;
        }
        else if(sector.equals("B")){
            id=3;
        }
        else if(sector.equals("C")){
            id=4;
        }
        else if(sector.equals("D")){
            id=5;
        }
        else if(sector.equals("E")){
            id=6;
        }
        else if(sector.equals("F")){
            id=7;
        }
        else if(sector.equals("G")){
            id=8;
        }
        else if(sector.equals("H")){
            id=9;
        }
        else if(sector.equals("I")){
            id=10;
        }
        else if(sector.equals("J")){
            id=11;
        }
        else if(sector.equals("K")){
            id=12;
        }
        else if(sector.equals("L")){
            id=13;
        }
        else if(sector.equals("M")){
            id=14;
        }
        
        String sql = "Select imagen from imagenes where imagen_id="+id;
        ImageIcon ii = null;
        InputStream is = null; 
        try{
            BaseDatos bd = new BaseDatos();     
            Connection xcon = bd.Conectar();
            Statement st = xcon.createStatement();           
            ResultSet rs = st.executeQuery(sql);            
            
            if(rs.next()){
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                ii = new ImageIcon(bi);                
            }            
            xcon.close();
        }
        finally{
            lblImagen.setIcon(ii);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        btnAtras.setBackground(new java.awt.Color(0, 255, 0));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(390, 660, 160, 70);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(0, 0, 1020, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Pr_usuario pr = new Pr_usuario(usuario);
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String s, String u) {
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
            java.util.logging.Logger.getLogger(Frame_imagen_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_imagen_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_imagen_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_imagen_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frame_imagen_usuario(s, u).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame_imagen_usuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Frame_imagen_usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
