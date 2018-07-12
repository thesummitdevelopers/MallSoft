
package Formularios;

import Clases.Usuarios;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Users_admin extends javax.swing.JFrame {
    private String usuario;
    DefaultTableModel model = null;
    
    public Users_admin(String u) {
        usuario = u;
        setUndecorated(true);
        initComponents();
        cargarLista();
        btnGuardarModificar.setVisible(false);
        btnCancelarModificar.setVisible(false);  
        System.out.println(usuario);
    }
    public void cargarLista(){
        model = new DefaultTableModel();        
        tablaUsuarios.setModel(model);
        model.addColumn("ID");
        model.addColumn("USUARIO");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDOS");
        model.addColumn("CELULAR");
        model.addColumn("DIRECCIÓN");
        model.addColumn("EMAIL");
        model.addColumn("TIPO");
                      
        Usuarios usuarios = new Usuarios();
        Vector arrUsuarios = (Vector)usuarios.getUsuarios();
        for(int i=0;i<arrUsuarios.size();i++){
            Vector dato = (Vector)arrUsuarios.get(i);
                model.addRow(dato);
        }
        tablaUsuarios.updateUI();                                        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        cheID = new javax.swing.JCheckBox();
        cheUsuario = new javax.swing.JCheckBox();
        cheNombre = new javax.swing.JCheckBox();
        cheApellidos = new javax.swing.JCheckBox();
        cheTipo = new javax.swing.JCheckBox();
        txtID = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cheCelular = new javax.swing.JCheckBox();
        cheDireccion = new javax.swing.JCheckBox();
        cheEmail = new javax.swing.JCheckBox();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTipo = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmID = new javax.swing.JTextField();
        txtmUsuario = new javax.swing.JTextField();
        txtmNombre = new javax.swing.JTextField();
        txtmApellidos = new javax.swing.JTextField();
        txtmCelular = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardarModificar = new javax.swing.JButton();
        btnCancelarModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmDireccion = new javax.swing.JTextField();
        txtmEmail = new javax.swing.JTextField();
        boxTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(null);

        btnBuscar.setBackground(new java.awt.Color(147, 198, 249));
        btnBuscar.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(50, 330, 110, 35);

        cheID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheID.setText("ID:");
        cheID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheID.setPreferredSize(new java.awt.Dimension(89, 25));
        cheID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheIDActionPerformed(evt);
            }
        });
        jPanel2.add(cheID);
        cheID.setBounds(10, 10, 89, 30);

        cheUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheUsuario.setText("Usuario:");
        cheUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheUsuario.setPreferredSize(new java.awt.Dimension(89, 25));
        cheUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(cheUsuario);
        cheUsuario.setBounds(10, 50, 89, 30);

        cheNombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheNombre.setText("Nombre:");
        cheNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheNombreActionPerformed(evt);
            }
        });
        jPanel2.add(cheNombre);
        cheNombre.setBounds(10, 90, 90, 30);

        cheApellidos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheApellidos.setText("Apellidos:");
        cheApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheApellidos.setPreferredSize(new java.awt.Dimension(89, 25));
        cheApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheApellidosActionPerformed(evt);
            }
        });
        jPanel2.add(cheApellidos);
        cheApellidos.setBounds(10, 130, 89, 30);

        cheTipo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheTipo.setText("Tipo:");
        cheTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheTipo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cheTipo.setPreferredSize(new java.awt.Dimension(89, 25));
        cheTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheTipoActionPerformed(evt);
            }
        });
        jPanel2.add(cheTipo);
        cheTipo.setBounds(10, 290, 89, 30);

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setEnabled(false);
        jPanel2.add(txtID);
        txtID.setBounds(110, 10, 100, 30);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setEnabled(false);
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(110, 50, 100, 30);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        jPanel2.add(txtNombre);
        txtNombre.setBounds(110, 90, 100, 30);

        cheCelular.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheCelular.setText("Celular:");
        cheCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheCelular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cheCelular.setPreferredSize(new java.awt.Dimension(89, 25));
        cheCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheCelularActionPerformed(evt);
            }
        });
        jPanel2.add(cheCelular);
        cheCelular.setBounds(10, 170, 89, 30);

        cheDireccion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheDireccion.setText("Dirección:");
        cheDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheDireccion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cheDireccion.setPreferredSize(new java.awt.Dimension(89, 25));
        cheDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(cheDireccion);
        cheDireccion.setBounds(10, 210, 89, 30);

        cheEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cheEmail.setText("Email:");
        cheEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cheEmail.setPreferredSize(new java.awt.Dimension(89, 25));
        cheEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheEmailActionPerformed(evt);
            }
        });
        jPanel2.add(cheEmail);
        cheEmail.setBounds(10, 250, 89, 30);

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidos.setEnabled(false);
        jPanel2.add(txtApellidos);
        txtApellidos.setBounds(110, 130, 100, 30);

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCelular.setEnabled(false);
        jPanel2.add(txtCelular);
        txtCelular.setBounds(110, 170, 100, 30);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setEnabled(false);
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(110, 210, 100, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setEnabled(false);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(110, 250, 100, 30);

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        txtTipo.setEnabled(false);
        jPanel2.add(txtTipo);
        txtTipo.setBounds(110, 290, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 310, 220, 370);

        btnAtras.setBackground(new java.awt.Color(230, 0, 51));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 0, 34)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(50, 690, 150, 60);

        tablaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nombre", "Apellidos", "Celular", "Direccion", "Email", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setRowHeight(23);
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(3).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(4).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(5).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(6).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 1000, 220);

        jPanel3.setLayout(null);

        btnModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnModificar.setFont(new java.awt.Font("Sitka Banner", 1, 28)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);
        btnModificar.setBounds(527, 170, 143, 45);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 30, 100, 36);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Usuario:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 80, 100, 36);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 130, 100, 36);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 180, 100, 36);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Celular:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 230, 100, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 380, 100, 36);

        txtmID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmID.setEnabled(false);
        jPanel3.add(txtmID);
        txtmID.setBounds(140, 30, 80, 36);

        txtmUsuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmUsuario.setEnabled(false);
        jPanel3.add(txtmUsuario);
        txtmUsuario.setBounds(140, 80, 190, 36);

        txtmNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmNombre.setEnabled(false);
        jPanel3.add(txtmNombre);
        txtmNombre.setBounds(140, 130, 190, 36);

        txtmApellidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmApellidos.setEnabled(false);
        jPanel3.add(txtmApellidos);
        txtmApellidos.setBounds(140, 180, 190, 36);

        txtmCelular.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmCelular.setEnabled(false);
        jPanel3.add(txtmCelular);
        txtmCelular.setBounds(140, 230, 120, 36);

        btnNuevo.setBackground(new java.awt.Color(147, 198, 249));
        btnNuevo.setFont(new java.awt.Font("Sitka Banner", 1, 28)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo);
        btnNuevo.setBounds(530, 30, 140, 45);

        btnEliminar.setBackground(new java.awt.Color(147, 198, 249));
        btnEliminar.setFont(new java.awt.Font("Sitka Banner", 1, 28)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar);
        btnEliminar.setBounds(530, 100, 140, 45);

        btnGuardarModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnGuardarModificar.setFont(new java.awt.Font("Sitka Banner", 1, 28)); // NOI18N
        btnGuardarModificar.setText("Guardar");
        btnGuardarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarModificar);
        btnGuardarModificar.setBounds(401, 390, 130, 40);

        btnCancelarModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnCancelarModificar.setFont(new java.awt.Font("Sitka Banner", 1, 28)); // NOI18N
        btnCancelarModificar.setText("Cancelar");
        btnCancelarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelarModificar);
        btnCancelarModificar.setBounds(543, 390, 130, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Dirección:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 280, 100, 36);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 330, 100, 36);

        txtmDireccion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmDireccion.setEnabled(false);
        jPanel3.add(txtmDireccion);
        txtmDireccion.setBounds(140, 280, 540, 36);

        txtmEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmEmail.setEnabled(false);
        jPanel3.add(txtmEmail);
        txtmEmail.setBounds(140, 330, 380, 36);

        boxTipo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        boxTipo.setEnabled(false);
        jPanel3.add(boxTipo);
        boxTipo.setBounds(140, 380, 130, 36);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(290, 310, 700, 440);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Lista de Usuarios:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 280, 60);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1024, 770);

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id="", usuario="", nombre="", apellidos="", celular="", direccion="", email="", tipo="", a="";

        if(txtID.getText().equals(a) && txtUsuario.getText().equals(a) && txtNombre.getText().equals(a)
            && txtApellidos.getText().equals(a) && txtCelular.getText().equals(a) && txtDireccion.getText().equals(a) 
            && txtEmail.getText().equals(a) && !cheTipo.isSelected()){
            
            JOptionPane.showMessageDialog(null, "Escriba al menos en un campo.", "Error",JOptionPane.INFORMATION_MESSAGE);

        }else{
            if(cheID.isSelected()){
                if(txtID.getText().equals(a)){
                    cheID.setSelected(false);
                    txtID.setEnabled(false);
                    txtID.setEnabled(false);
                }
                id=txtID.getText();
            }

            if(cheUsuario.isSelected()){
                if(txtUsuario.getText().equals(a)){
                    cheUsuario.setSelected(false);
                    txtUsuario.setEnabled(false);
                    txtUsuario.setEnabled(false);
                }
                usuario=txtUsuario.getText();
            }

            if(cheNombre.isSelected()){
                if(txtNombre.getText().equals(a)){
                    cheNombre.setSelected(false);
                    txtNombre.setEnabled(false);
                    txtNombre.setEnabled(false);
                }
                nombre=txtNombre.getText();
            }

            if(cheApellidos.isSelected()){
                if(txtApellidos.getText().equals(a)){
                    cheApellidos.setSelected(false);
                    txtApellidos.setEnabled(false);
                    txtApellidos.setEnabled(false);
                }
                apellidos=txtApellidos.getText();
            }
            
            if(cheCelular.isSelected()){
                if(txtCelular.getText().equals(a)){
                    cheCelular.setSelected(false);
                    txtCelular.setEnabled(false);
                    txtCelular.setEnabled(false);
                }
                celular=txtCelular.getText();
            }
            
            if(cheDireccion.isSelected()){
                if(txtDireccion.getText().equals(a)){
                    cheDireccion.setSelected(false);
                    txtDireccion.setEnabled(false);
                    txtDireccion.setEnabled(false);
                }
                direccion=txtDireccion.getText();
            }
            
            if(cheEmail.isSelected()){
                if(txtEmail.getText().equals(a)){
                    cheEmail.setSelected(false);
                    txtEmail.setEnabled(false);
                    txtEmail.setEnabled(false);
                }
                email=txtEmail.getText();
            }
            
            if(cheTipo.isSelected()){                
                if(txtTipo.getSelectedItem().toString().equals(a)){
                    cheTipo.setSelected(false);
                    txtTipo.setEnabled(false);
                    txtTipo.setEnabled(false);
                }
                tipo=txtTipo.getSelectedItem().toString();
            }

            Usuarios usuarios = new Usuarios();

            model = new DefaultTableModel();
            tablaUsuarios.setModel(model);

            model.addColumn("ID");
            model.addColumn("USUARIO");
            model.addColumn("NOMBRE");
            model.addColumn("APELLIDOS");
            model.addColumn("CELULAR");
            model.addColumn("DIRECCIÓN");
            model.addColumn("EMAIL");
            model.addColumn("TIPO");

            Vector arrUsuarios = null;
            try {
                arrUsuarios = (Vector)usuarios.buscarUsuarios(id,usuario,nombre,apellidos,celular,direccion,email,tipo);
            } catch (SQLException ex) {
                Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
            }

            for(int i=0;i<arrUsuarios.size();i++){
                Vector dato = (Vector)arrUsuarios.get(i);
                model.addRow(dato);
            }
            tablaUsuarios.updateUI();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cheIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheIDActionPerformed
        if(cheID.isSelected()){
            txtID.setEnabled(true);
        }
        else{
            txtID.setEnabled(false);
            txtID.setText("");
        }
    }//GEN-LAST:event_cheIDActionPerformed

    private void cheUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheUsuarioActionPerformed
        if(cheUsuario.isSelected()){
            txtUsuario.setEnabled(true);
        }
        else{
            txtUsuario.setEnabled(false);
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_cheUsuarioActionPerformed

    private void cheNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheNombreActionPerformed
        if(cheNombre.isSelected()){
            txtNombre.setEnabled(true);
        }
        else{
            txtNombre.setEnabled(false);
            txtNombre.setText("");
        }
    }//GEN-LAST:event_cheNombreActionPerformed

    private void cheApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheApellidosActionPerformed
        if(cheApellidos.isSelected()){
            txtApellidos.setEnabled(true);
        }
        else{
            txtApellidos.setEnabled(false);
            txtApellidos    .setText("");
        }
    }//GEN-LAST:event_cheApellidosActionPerformed

    private void cheTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheTipoActionPerformed
        if(cheTipo.isSelected()){
            txtTipo.setEnabled(true);
        }
        else{
            txtTipo.setEnabled(false);            
        }
    }//GEN-LAST:event_cheTipoActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        String a="";
        if(txtID.getText().equals(a) && txtUsuario.getText().equals(a) && txtNombre.getText().equals(a) && txtApellidos.getText().equals(a) && txtCelular.getText().equals(a) && txtDireccion.getText().equals(a) && txtEmail.getText().equals(a) && !txtTipo.isEnabled()){
            cargarLista();
        }
    }//GEN-LAST:event_jPanel2MouseEntered

    private void cheCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheCelularActionPerformed
        if(cheCelular.isSelected()){
            txtCelular.setEnabled(true);
        }
        else{
            txtCelular.setEnabled(false);
            txtCelular.setText("");
        }
    }//GEN-LAST:event_cheCelularActionPerformed

    private void cheDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheDireccionActionPerformed
        if(cheDireccion.isSelected()){
            txtDireccion.setEnabled(true);
        }
        else{
            txtDireccion.setEnabled(false);
            txtDireccion.setText("");
        }
    }//GEN-LAST:event_cheDireccionActionPerformed

    private void cheEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheEmailActionPerformed
        if(cheEmail.isSelected()){
            txtEmail.setEnabled(true);
        }
        else{
            txtEmail.setEnabled(false);
            txtEmail.setText("");
        }
    }//GEN-LAST:event_cheEmailActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Fadmin fa = new Fadmin(usuario);
        fa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtmUsuario.setEnabled(true);
        txtmNombre.setEnabled(true);
        txtmApellidos.setEnabled(true);
        txtmCelular.setEnabled(true);
        txtmDireccion.setEnabled(true);
        txtmEmail.setEnabled(true);
        boxTipo.setEnabled(false);


        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardarModificar.setVisible(true);
        btnCancelarModificar.setVisible(true);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Fregistro_admin registro = new Fregistro_admin(usuario);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);

        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar\na "+txtmNombre.getText()+" "+ txtmApellidos.getText()+"?");            

        if(resp==JOptionPane.YES_OPTION){
            
            Usuarios usuarios = new Usuarios();
            String dato = txtmID.getText();

            try {
                usuarios.eliminarUsuario(dato);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar usuario");
            }
        }
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        txtmID.setText("");
        txtmUsuario.setText("");
        txtmNombre.setText("");
        txtmApellidos.setText("");
        txtmCelular.setText("");
        txtmDireccion.setText("");
        txtmEmail.setText("");        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModificarActionPerformed
        txtmID.setEnabled(false);
        txtmUsuario.setEnabled(false);
        txtmNombre.setEnabled(false);
        txtmApellidos.setEnabled(false);
        txtmCelular.setEnabled(false);
        txtmDireccion.setEnabled(false);
        txtmEmail.setEnabled(false);
        boxTipo.setEnabled(false);

        btnNuevo.setEnabled(true);

        btnModificar.setEnabled(false);
        btnGuardarModificar.setVisible(false);
        btnCancelarModificar.setVisible(false);
    }//GEN-LAST:event_btnCancelarModificarActionPerformed

    private void btnGuardarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificarActionPerformed
        String id="", usuario="", nombre="", apellidos="", celular="", direccion="", email="", tipo="", a="";

        if(txtmID.getText().equals(a) || txtmUsuario.getText().equals(a) || txtmNombre.getText().equals(a)
            || txtmApellidos.getText().equals(a) || txtmCelular.getText().equals(a) || txtmDireccion.getText().equals(a) 
            || txtmEmail.getText().equals(a)){
            
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios.","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            int i = JOptionPane.showConfirmDialog(null,"¿Realmente desea modificar este registro?","Modificar",JOptionPane.YES_NO_OPTION);
        
            if(i==JOptionPane.YES_OPTION){
                Usuarios usuarios = new Usuarios();
                
                String[] datos = new String[7];

                datos[0] = txtmID.getText().trim();
                datos[1] = txtmUsuario.getText().trim();
                datos[2] = txtmNombre.getText().trim();
                datos[3] = txtmApellidos.getText().trim();
                datos[4] = txtmCelular.getText().trim();
                datos[5] = txtmDireccion.getText().trim();
                datos[6] = txtmEmail.getText().trim();

                try {
                    usuarios.modificarUsuario(datos);
                    cargarLista();
                    JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
                    
                    txtmID.setEnabled(false);
                    txtmUsuario.setEnabled(false);
                    txtmNombre.setEnabled(false);
                    txtmApellidos.setEnabled(false);
                    txtmCelular.setEnabled(false);
                    txtmDireccion.setEnabled(false);
                    txtmEmail.setEnabled(false);
                    boxTipo.setEnabled(false);

                    btnNuevo.setEnabled(true);
                    btnModificar.setEnabled(true);
                    btnEliminar.setEnabled(true);

                    btnGuardarModificar.setVisible(false);
                    btnCancelarModificar.setVisible(false);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al intentar modificar Registro.\nPruebe otra vez.");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarModificarActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int fila = tablaUsuarios.getSelectedRow();
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        txtmID.setText(tablaUsuarios.getValueAt(fila, 0) + "");
        txtmUsuario.setText(tablaUsuarios.getValueAt(fila, 1) + "");
        txtmNombre.setText(tablaUsuarios.getValueAt(fila, 2) + "");
        txtmApellidos.setText(tablaUsuarios.getValueAt(fila, 3) + "");
        txtmCelular.setText(tablaUsuarios.getValueAt(fila, 4) + "");
        txtmDireccion.setText(tablaUsuarios.getValueAt(fila, 5) + "");
        txtmEmail.setText(tablaUsuarios.getValueAt(fila, 6) + "");
        
        if(tablaUsuarios.getValueAt(fila, 7).equals("normal")){
            boxTipo.setSelectedIndex(0);
        }
        else{
            boxTipo.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    public static void main(String u) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users_admin(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarModificar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox cheApellidos;
    private javax.swing.JCheckBox cheCelular;
    private javax.swing.JCheckBox cheDireccion;
    private javax.swing.JCheckBox cheEmail;
    private javax.swing.JCheckBox cheID;
    private javax.swing.JCheckBox cheNombre;
    private javax.swing.JCheckBox cheTipo;
    private javax.swing.JCheckBox cheUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtmApellidos;
    private javax.swing.JTextField txtmCelular;
    private javax.swing.JTextField txtmDireccion;
    private javax.swing.JTextField txtmEmail;
    private javax.swing.JTextField txtmID;
    private javax.swing.JTextField txtmNombre;
    private javax.swing.JTextField txtmUsuario;
    // End of variables declaration//GEN-END:variables
}
