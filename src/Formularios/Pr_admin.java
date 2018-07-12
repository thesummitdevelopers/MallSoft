
package Formularios;

import Clases.Productos;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pr_admin extends javax.swing.JFrame {
    private String usuario;
    DefaultTableModel model = null;

    public Pr_admin(String u) {
        usuario = u;
        setUndecorated(true);
        initComponents();
        cargarLista();
        btnGuardarNuevo.setVisible(false);
        btnCancelarNuevo.setVisible(false);   
        btnGuardarModificar.setVisible(false);
        btnCancelarModificar.setVisible(false);
    }
    public void cargarLista(){
        model = new DefaultTableModel();        
        tablaProductos.setModel(model);
        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");
                      
        Productos productos = new Productos();
        Vector arrProductos = (Vector)productos.getProductos();
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
                model.addRow(dato);
        }
        tablaProductos.updateUI();                                        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOrdenar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmID = new javax.swing.JTextField();
        txtmSector = new javax.swing.JTextField();
        txtmCategoria = new javax.swing.JTextField();
        txtmMarca = new javax.swing.JTextField();
        txtmPrecio = new javax.swing.JTextField();
        txtmDisponible = new javax.swing.JTextField();
        btnGuardarNuevo = new javax.swing.JButton();
        btnCancelarNuevo = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardarModificar = new javax.swing.JButton();
        btnCancelarModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        cheID = new javax.swing.JCheckBox();
        cheSector = new javax.swing.JCheckBox();
        cheCategoria = new javax.swing.JCheckBox();
        cheMarca = new javax.swing.JCheckBox();
        chePrecio = new javax.swing.JCheckBox();
        txtID = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        radID = new javax.swing.JRadioButton();
        radSector = new javax.swing.JRadioButton();
        radCat = new javax.swing.JRadioButton();
        radMar = new javax.swing.JRadioButton();
        radPre = new javax.swing.JRadioButton();
        radDis = new javax.swing.JRadioButton();
        btnAtras = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        btnModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnModificar.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);
        btnModificar.setBounds(310, 80, 110, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 30, 110, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sector:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 70, 110, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Categoría:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 110, 110, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Marca:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 150, 110, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Precio:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 190, 110, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel7.setText(" Disponible:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 230, 110, 40);

        txtmID.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmID.setEnabled(false);
        txtmID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtmID);
        txtmID.setBounds(150, 40, 60, 30);

        txtmSector.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmSector.setEnabled(false);
        jPanel3.add(txtmSector);
        txtmSector.setBounds(150, 80, 60, 30);

        txtmCategoria.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmCategoria.setEnabled(false);
        jPanel3.add(txtmCategoria);
        txtmCategoria.setBounds(150, 120, 150, 30);

        txtmMarca.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmMarca.setEnabled(false);
        jPanel3.add(txtmMarca);
        txtmMarca.setBounds(150, 160, 150, 30);

        txtmPrecio.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmPrecio.setEnabled(false);
        jPanel3.add(txtmPrecio);
        txtmPrecio.setBounds(150, 200, 110, 30);

        txtmDisponible.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtmDisponible.setEnabled(false);
        jPanel3.add(txtmDisponible);
        txtmDisponible.setBounds(150, 240, 70, 30);

        btnGuardarNuevo.setBackground(new java.awt.Color(147, 198, 249));
        btnGuardarNuevo.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarNuevo);
        btnGuardarNuevo.setBounds(310, 190, 110, 40);

        btnCancelarNuevo.setBackground(new java.awt.Color(147, 198, 249));
        btnCancelarNuevo.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnCancelarNuevo.setText("Cancelar");
        btnCancelarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelarNuevo);
        btnCancelarNuevo.setBounds(310, 250, 110, 40);

        btnNuevo.setBackground(new java.awt.Color(147, 198, 249));
        btnNuevo.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo);
        btnNuevo.setBounds(310, 30, 110, 40);

        btnEliminar.setBackground(new java.awt.Color(147, 198, 249));
        btnEliminar.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar);
        btnEliminar.setBounds(310, 130, 110, 40);

        btnGuardarModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnGuardarModificar.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnGuardarModificar.setText("Guardar");
        btnGuardarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarModificar);
        btnGuardarModificar.setBounds(310, 180, 110, 40);

        btnCancelarModificar.setBackground(new java.awt.Color(147, 198, 249));
        btnCancelarModificar.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnCancelarModificar.setText("Cancelar");
        btnCancelarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelarModificar);
        btnCancelarModificar.setBounds(310, 240, 110, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("S/.");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(130, 200, 20, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 390, 470, 310);

        btnMostrar.setBackground(new java.awt.Color(147, 198, 249));
        btnMostrar.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        btnMostrar.setText("Mostrar Ubicación");
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar);
        btnMostrar.setBounds(700, 40, 220, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 43)); // NOI18N
        jLabel1.setText("Lista de Productos:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 340, 80);

        tablaProductos.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Sector", "Categoría", "Marca", "Precio", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setRowHeight(23);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 960, 280);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(null);

        btnBuscar.setBackground(new java.awt.Color(147, 198, 249));
        btnBuscar.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(60, 210, 100, 30);

        cheID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheID.setText("ID:");
        cheID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheID.setPreferredSize(new java.awt.Dimension(89, 25));
        cheID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheIDActionPerformed(evt);
            }
        });
        jPanel2.add(cheID);
        cheID.setBounds(10, 10, 89, 25);

        cheSector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheSector.setText("Sector:");
        cheSector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheSector.setPreferredSize(new java.awt.Dimension(89, 25));
        cheSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheSectorActionPerformed(evt);
            }
        });
        jPanel2.add(cheSector);
        cheSector.setBounds(10, 50, 89, 25);

        cheCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheCategoria.setText("Categoría:");
        cheCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(cheCategoria);
        cheCategoria.setBounds(10, 90, 89, 25);

        cheMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheMarca.setText("Marca:");
        cheMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheMarca.setPreferredSize(new java.awt.Dimension(89, 25));
        cheMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(cheMarca);
        cheMarca.setBounds(10, 130, 89, 25);

        chePrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chePrecio.setText("Precio:");
        chePrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chePrecio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chePrecio.setPreferredSize(new java.awt.Dimension(89, 25));
        chePrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chePrecioActionPerformed(evt);
            }
        });
        jPanel2.add(chePrecio);
        chePrecio.setBounds(10, 170, 89, 25);

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setEnabled(false);
        jPanel2.add(txtID);
        txtID.setBounds(110, 10, 100, 30);

        txtSector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSector.setEnabled(false);
        jPanel2.add(txtSector);
        txtSector.setBounds(110, 50, 100, 30);

        txtCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategoria.setEnabled(false);
        jPanel2.add(txtCategoria);
        txtCategoria.setBounds(110, 90, 100, 30);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca.setEnabled(false);
        jPanel2.add(txtMarca);
        txtMarca.setBounds(110, 130, 100, 30);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio.setEnabled(false);
        jPanel2.add(txtPrecio);
        txtPrecio.setBounds(120, 170, 86, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("S/.");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(100, 170, 20, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 390, 220, 250);

        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Ordenar por:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 130, 30);

        radID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radID.setText("ID");
        radID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radIDMouseClicked(evt);
            }
        });
        radID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radIDActionPerformed(evt);
            }
        });
        jPanel4.add(radID);
        radID.setBounds(30, 40, 110, 40);

        radSector.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radSector.setSelected(true);
        radSector.setText("Sector");
        radSector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radSectorMouseClicked(evt);
            }
        });
        jPanel4.add(radSector);
        radSector.setBounds(30, 70, 110, 40);

        radCat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radCat.setText("Categoría");
        radCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radCatMouseClicked(evt);
            }
        });
        jPanel4.add(radCat);
        radCat.setBounds(30, 100, 110, 40);

        radMar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radMar.setText("Marca");
        radMar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radMarMouseClicked(evt);
            }
        });
        jPanel4.add(radMar);
        radMar.setBounds(30, 130, 110, 40);

        radPre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radPre.setText("Precio");
        radPre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPreMouseClicked(evt);
            }
        });
        jPanel4.add(radPre);
        radPre.setBounds(30, 160, 110, 40);

        radDis.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radDis.setText("Disponibilidad");
        radDis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radDisMouseClicked(evt);
            }
        });
        jPanel4.add(radDis);
        radDis.setBounds(30, 190, 110, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(280, 390, 170, 250);

        btnAtras.setBackground(new java.awt.Color(230, 0, 51));
        btnAtras.setFont(new java.awt.Font("Showcard Gothic", 0, 45)); // NOI18N
        btnAtras.setText("REGRESAR");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(100, 660, 260, 90);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -2, 1024, 770);

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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtmSector.setEnabled(true);
        txtmCategoria.setEnabled(true);
        txtmMarca.setEnabled(true);
        txtmPrecio.setEnabled(true);
        txtmDisponible.setEnabled(true);

        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardarModificar.setVisible(true);
        btnCancelarModificar.setVisible(true);
        tablaProductos.setEnabled(false);
        tablaProductos.setFocusable(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtmIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmIDActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        if("".equals(txtmSector.getText()) || "".equals(txtmCategoria.getText()) || "".equals(txtmMarca.getText()) ||
            "".equals(txtmPrecio.getText()) || "".equals(txtmDisponible.getText())){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int i = JOptionPane.showConfirmDialog(null,"Realmente desea guardar este registro?","Guardar",JOptionPane.YES_NO_OPTION);

            if(i==JOptionPane.YES_OPTION){
                Productos productos = new Productos();
                String[] datos = new String[5];
                datos[0] = txtmSector.getText().toString().trim();
                datos[1] = txtmCategoria.getText().toString().trim();
                datos[2] = txtmMarca.getText().toString().trim();
                datos[3] = txtmPrecio.getText().toString().trim();
                datos[4] = txtmDisponible.getText().toString().trim();

                try {
                    productos.grabarNuevoProducto(datos);
                    cargarLista();
                    JOptionPane.showMessageDialog(this, "Registro agregado correctamente");
                    txtmID.setEnabled(false);
                    txtmID.setText("");
                    txtmSector.setEnabled(false);
                    txtmSector.setText("");
                    txtmCategoria.setEnabled(false);
                    txtmCategoria.setText("");
                    txtmMarca.setEnabled(false);
                    txtmMarca.setText("");
                    txtmPrecio.setEnabled(false);
                    txtmPrecio.setText("");
                    txtmDisponible.setEnabled(false);
                    txtmDisponible.setText("");

                    btnNuevo.setEnabled(true);
                    btnModificar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                    tablaProductos.setFocusable(true);
                    tablaProductos.setEnabled(true);

                    btnGuardarNuevo.setVisible(false);
                    btnCancelarNuevo.setVisible(false);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al intentar insertar Registro.");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private void btnCancelarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoActionPerformed
        txtmID.setEnabled(false);
        txtmID.setText("");
        txtmSector.setEnabled(false);
        txtmSector.setText("");
        txtmCategoria.setEnabled(false);
        txtmCategoria.setText("");
        txtmMarca.setEnabled(false);
        txtmMarca.setText("");
        txtmPrecio.setEnabled(false);
        txtmPrecio.setText("");
        txtmDisponible.setEnabled(false);
        txtmDisponible.setText("");

        btnNuevo.setEnabled(true);
        tablaProductos.setFocusable(true);
        tablaProductos.setEnabled(true);

        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnGuardarNuevo.setVisible(false);
        btnCancelarNuevo.setVisible(false);
    }//GEN-LAST:event_btnCancelarNuevoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtmID.setText("");
        txtmSector.setText("");
        txtmSector.setEnabled(true);
        txtmCategoria.setText("");
        txtmCategoria.setEnabled(true);
        txtmMarca.setText("");
        txtmMarca.setEnabled(true);
        txtmPrecio.setText("");
        txtmPrecio.setEnabled(true);
        txtmDisponible.setText("");
        txtmDisponible.setEnabled(true);

        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        tablaProductos.setEnabled(false);
        tablaProductos.setFocusable(false);

        btnGuardarNuevo.setVisible(true);
        btnCancelarNuevo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);

        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?\n"
            + "\nProducto: "+txtmCategoria.getText()
            + "\nMarca: "+txtmMarca.getText()
            + "\nPrecio: S/."+txtmPrecio.getText()
            + "\nDisponible: "+txtmDisponible.getText(), "Eliminar", JOptionPane.YES_NO_OPTION);

        if(resp==JOptionPane.YES_OPTION){
            Productos productos = new Productos();
            String dato = txtmID.getText();

            try {
                productos.eliminarProducto(dato);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar registro");
            }
        }
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificarActionPerformed
        int i = JOptionPane.showConfirmDialog(null,"¿Realmente desea modificar este registro?");
        if(i==JOptionPane.YES_OPTION){
            Productos productos = new Productos();
            String[] datos = new String[5];

            datos[0] = txtmCategoria.getText().trim();
            datos[1] = txtmMarca.getText().trim();
            datos[2] = txtmPrecio.getText().trim();
            datos[3] = txtmDisponible.getText().trim();
            datos[4] = txtmSector.getText().trim();

            try {
                productos.modificarProducto(datos, txtmID.getText());
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
                txtmID.setEnabled(false);
                txtmSector.setEnabled(false);
                txtmCategoria.setEnabled(false);
                txtmMarca.setEnabled(false);
                txtmPrecio.setEnabled(false);
                txtmDisponible.setEnabled(false);

                btnNuevo.setEnabled(true);
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                tablaProductos.setEnabled(true);
                tablaProductos.setFocusable(true);

                btnGuardarModificar.setVisible(false);
                btnCancelarModificar.setVisible(false);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar modificar Registro.\nPruebe otra vez.");
            }
        }
    }//GEN-LAST:event_btnGuardarModificarActionPerformed

    private void btnCancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModificarActionPerformed
        txtmSector.setEnabled(false);
        txtmCategoria.setEnabled(false);
        txtmMarca.setEnabled(false);
        txtmPrecio.setEnabled(false);
        txtmDisponible.setEnabled(false);

        btnNuevo.setEnabled(true);
        tablaProductos.setFocusable(true);
        tablaProductos.setEnabled(true);

        btnModificar.setEnabled(false);
        btnGuardarModificar.setVisible(false);
        btnCancelarModificar.setVisible(false);
    }//GEN-LAST:event_btnCancelarModificarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int fila = tablaProductos.getSelectedRow();
        
        txtmID.setText(tablaProductos.getValueAt(fila, 0) + "");
        txtmSector.setText(tablaProductos.getValueAt(fila, 1) + "");
        txtmCategoria.setText(tablaProductos.getValueAt(fila, 2) + "");
        txtmMarca.setText(tablaProductos.getValueAt(fila, 3) + "");
        txtmPrecio.setText(tablaProductos.getValueAt(fila, 4) + "");
        txtmDisponible.setText(tablaProductos.getValueAt(fila, 5) + "");

        btnMostrar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id="", sector="", categoria="", marca="", precio="", a="";

        if(txtID.getText().equals(a) && txtSector.getText().equals(a) && txtCategoria.getText().equals(a)
            && txtPrecio.getText().equals(a) && txtMarca.getText().equals(a)){
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

            if(cheSector.isSelected()){
                if(txtSector.getText().equals(a)){
                    cheSector.setSelected(false);
                    txtSector.setEnabled(false);
                    txtSector.setEnabled(false);
                }
                sector=txtSector.getText();
            }

            if(cheCategoria.isSelected()){
                if(txtCategoria.getText().equals(a)){
                    cheCategoria.setSelected(false);
                    txtCategoria.setEnabled(false);
                    txtCategoria.setEnabled(false);
                }
                categoria=txtCategoria.getText();
            }

            if(cheMarca.isSelected()){
                if(txtMarca.getText().equals(a)){
                    cheMarca.setSelected(false);
                    txtMarca.setEnabled(false);
                    txtMarca.setEnabled(false);
                }
                marca=txtMarca.getText();
            }

            if(chePrecio.isSelected()){
                if(txtPrecio.getText().equals(a)){
                    chePrecio.setSelected(false);
                    txtPrecio.setEnabled(false);
                    txtPrecio.setEnabled(false);
                }
                precio=txtPrecio.getText();
            }

            Productos productos = new Productos();

            model = new DefaultTableModel();
            tablaProductos.setModel(model);

            model.addColumn("ID");
            model.addColumn("SECTOR");
            model.addColumn("CATEGORIA");
            model.addColumn("MARCA");
            model.addColumn("PRECIO");
            model.addColumn("DISPONIBLE");

            Vector arrProductos = null;
            try {
                arrProductos = (Vector)productos.buscarProducto(id,sector,categoria,marca,precio);
            } catch (SQLException ex) {
                Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
            }

            for(int i=0;i<arrProductos.size();i++){
                Vector dato = (Vector)arrProductos.get(i);
                model.addRow(dato);
            }
            tablaProductos.updateUI();
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

    private void cheSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheSectorActionPerformed
        if(cheSector.isSelected()){
            txtSector.setEnabled(true);
        }
        else{
            txtSector.setEnabled(false);
            txtSector.setText("");
        }
    }//GEN-LAST:event_cheSectorActionPerformed

    private void cheCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheCategoriaActionPerformed
        if(cheCategoria.isSelected()){
            txtCategoria.setEnabled(true);
        }
        else{
            txtCategoria.setEnabled(false);
            txtCategoria.setText("");
        }
    }//GEN-LAST:event_cheCategoriaActionPerformed

    private void cheMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheMarcaActionPerformed
        if(cheMarca.isSelected()){
            txtMarca.setEnabled(true);
        }
        else{
            txtMarca.setEnabled(false);
            txtMarca.setText("");
        }
    }//GEN-LAST:event_cheMarcaActionPerformed

    private void chePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chePrecioActionPerformed
        if(chePrecio.isSelected()){
            txtPrecio.setEnabled(true);
        }
        else{
            txtPrecio.setEnabled(false);
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_chePrecioActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        String a="";
        if(txtID.getText().equals(a) && txtSector.getText().equals(a) && txtCategoria.getText().equals(a) && txtMarca.getText().equals(a) && txtPrecio.getText().equals(a)){
            cargarLista();
            btnMostrar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jPanel2MouseEntered

    private void radIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radIDMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("producto_id");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radIDMouseClicked

    private void radIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radIDActionPerformed

    private void radSectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radSectorMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("sector");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radSectorMouseClicked

    private void radCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radCatMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("categoria");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radCatMouseClicked

    private void radMarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radMarMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("marca");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radMarMouseClicked

    private void radPreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radPreMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("precio");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radPreMouseClicked

    private void radDisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radDisMouseClicked
        Productos productos = new Productos();

        model = new DefaultTableModel();
        tablaProductos.setModel(model);

        model.addColumn("ID");
        model.addColumn("SECTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("MARCA");
        model.addColumn("PRECIO");
        model.addColumn("DISPONIBLE");

        Vector arrProductos = (Vector)productos.ordenarLista("disponibilidad");;
        for(int i=0;i<arrProductos.size();i++){
            Vector dato = (Vector)arrProductos.get(i);
            model.addRow(dato);
        }
        tablaProductos.updateUI();
    }//GEN-LAST:event_radDisMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Fadmin fu = new Fadmin(usuario);
        fu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int fila = tablaProductos.getSelectedRow();
        String sector = (tablaProductos.getValueAt(fila, 1)+"");
        
        try {
            Frame_imagen_admin fr = new Frame_imagen_admin(sector, usuario); 
            fr.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed
    public static void main(String u) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pr_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pr_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pr_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pr_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pr_admin(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarModificar;
    private javax.swing.JButton btnCancelarNuevo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarModificar;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox cheCategoria;
    private javax.swing.JCheckBox cheID;
    private javax.swing.JCheckBox cheMarca;
    private javax.swing.JCheckBox chePrecio;
    private javax.swing.JCheckBox cheSector;
    private javax.swing.ButtonGroup grupoOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radCat;
    private javax.swing.JRadioButton radDis;
    private javax.swing.JRadioButton radID;
    private javax.swing.JRadioButton radMar;
    private javax.swing.JRadioButton radPre;
    private javax.swing.JRadioButton radSector;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtmCategoria;
    private javax.swing.JTextField txtmDisponible;
    private javax.swing.JTextField txtmID;
    private javax.swing.JTextField txtmMarca;
    private javax.swing.JTextField txtmPrecio;
    private javax.swing.JTextField txtmSector;
    // End of variables declaration//GEN-END:variables
}
