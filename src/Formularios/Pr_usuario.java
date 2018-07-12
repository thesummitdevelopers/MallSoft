
package Formularios;

import Clases.BaseDatos;
import Clases.Productos;
import Clases.Usuarios;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Pr_usuario extends javax.swing.JFrame {
    
    private String usuario;
    
    DefaultTableModel model = null;
    DefaultTableModel model1 = null;
    
    public Pr_usuario(String u) {
        usuario = u;
        setUndecorated(true);
        initComponents();
        cargarLista();
                        
        model1 = new DefaultTableModel();
        tablaCarrito.setModel(model1);

        model1.addColumn("ID");
        model1.addColumn("CATEGORIA");
        model1.addColumn("MARCA");
        model1.addColumn("CANTIDAD");
        model1.addColumn("PRECIO");
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
        btnCarrito = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        btnComprar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnSaldoDisponible = new javax.swing.JButton();
        btnVaciarCarrito = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnBuscar1 = new javax.swing.JButton();
        cheID1 = new javax.swing.JCheckBox();
        cheSector1 = new javax.swing.JCheckBox();
        cheCategoria1 = new javax.swing.JCheckBox();
        cheMarca1 = new javax.swing.JCheckBox();
        chePrecio1 = new javax.swing.JCheckBox();
        txtID1 = new javax.swing.JTextField();
        txtSector1 = new javax.swing.JTextField();
        txtCategoria1 = new javax.swing.JTextField();
        txtMarca1 = new javax.swing.JTextField();
        txtPrecio1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        radID1 = new javax.swing.JRadioButton();
        radSector1 = new javax.swing.JRadioButton();
        radCat1 = new javax.swing.JRadioButton();
        radMar1 = new javax.swing.JRadioButton();
        radPre1 = new javax.swing.JRadioButton();
        radDis1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        btnCarrito.setBackground(new java.awt.Color(147, 198, 249));
        btnCarrito.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        btnCarrito.setText("Agregar al Carrito");
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.setEnabled(false);
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarrito);
        btnCarrito.setBounds(720, 40, 220, 40);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Carrito:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 28);

        tablaCarrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Categoría", "Marca", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCarrito.getTableHeader().setReorderingAllowed(false);
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCarrito);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 540, 150);

        btnComprar.setBackground(new java.awt.Color(230, 0, 51));
        btnComprar.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprar);
        btnComprar.setBounds(420, 260, 120, 30);

        btnQuitar.setBackground(new java.awt.Color(147, 198, 249));
        btnQuitar.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setEnabled(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuitar);
        btnQuitar.setBounds(440, 10, 100, 30);

        btnSaldoDisponible.setBackground(new java.awt.Color(147, 198, 249));
        btnSaldoDisponible.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnSaldoDisponible.setText("Saldo Disponible");
        btnSaldoDisponible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaldoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoDisponibleActionPerformed(evt);
            }
        });
        jPanel3.add(btnSaldoDisponible);
        btnSaldoDisponible.setBounds(210, 260, 200, 30);

        btnVaciarCarrito.setBackground(new java.awt.Color(147, 198, 249));
        btnVaciarCarrito.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnVaciarCarrito.setText("Vaciar Carrito");
        btnVaciarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaciarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCarritoActionPerformed(evt);
            }
        });
        jPanel3.add(btnVaciarCarrito);
        btnVaciarCarrito.setBounds(30, 260, 170, 30);

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotal.setText("0");
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(txtTotal);
        txtTotal.setBounds(440, 210, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("S/.");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(410, 210, 20, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(350, 210, 40, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(440, 410, 570, 320);

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
        btnMostrar.setBounds(490, 40, 220, 40);

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

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });
        jPanel5.setLayout(null);

        btnBuscar1.setBackground(new java.awt.Color(147, 198, 249));
        btnBuscar1.setFont(new java.awt.Font("Sitka Banner", 1, 23)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscar1);
        btnBuscar1.setBounds(60, 210, 100, 30);

        cheID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheID1.setText("ID:");
        cheID1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheID1.setPreferredSize(new java.awt.Dimension(89, 25));
        cheID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheID1ActionPerformed(evt);
            }
        });
        jPanel5.add(cheID1);
        cheID1.setBounds(10, 10, 89, 25);

        cheSector1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheSector1.setText("Sector:");
        cheSector1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheSector1.setPreferredSize(new java.awt.Dimension(89, 25));
        cheSector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheSector1ActionPerformed(evt);
            }
        });
        jPanel5.add(cheSector1);
        cheSector1.setBounds(10, 50, 89, 25);

        cheCategoria1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheCategoria1.setText("Categoría:");
        cheCategoria1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheCategoria1ActionPerformed(evt);
            }
        });
        jPanel5.add(cheCategoria1);
        cheCategoria1.setBounds(10, 90, 89, 25);

        cheMarca1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheMarca1.setText("Marca:");
        cheMarca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheMarca1.setPreferredSize(new java.awt.Dimension(89, 25));
        cheMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheMarca1ActionPerformed(evt);
            }
        });
        jPanel5.add(cheMarca1);
        cheMarca1.setBounds(10, 130, 89, 25);

        chePrecio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chePrecio1.setText("Precio:");
        chePrecio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chePrecio1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chePrecio1.setPreferredSize(new java.awt.Dimension(89, 25));
        chePrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chePrecio1ActionPerformed(evt);
            }
        });
        jPanel5.add(chePrecio1);
        chePrecio1.setBounds(10, 170, 89, 25);

        txtID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID1.setEnabled(false);
        jPanel5.add(txtID1);
        txtID1.setBounds(110, 10, 100, 30);

        txtSector1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSector1.setEnabled(false);
        jPanel5.add(txtSector1);
        txtSector1.setBounds(110, 50, 100, 30);

        txtCategoria1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategoria1.setEnabled(false);
        jPanel5.add(txtCategoria1);
        txtCategoria1.setBounds(110, 90, 100, 30);

        txtMarca1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca1.setEnabled(false);
        jPanel5.add(txtMarca1);
        txtMarca1.setBounds(110, 130, 100, 30);

        txtPrecio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio1.setEnabled(false);
        jPanel5.add(txtPrecio1);
        txtPrecio1.setBounds(120, 170, 86, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("S/.");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(100, 170, 20, 14);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 390, 220, 250);

        jPanel6.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Ordenar por:");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(10, 10, 130, 30);

        grupoOrdenar.add(radID1);
        radID1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radID1.setText("ID");
        radID1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radID1MouseClicked(evt);
            }
        });
        radID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radID1ActionPerformed(evt);
            }
        });
        jPanel6.add(radID1);
        radID1.setBounds(30, 40, 110, 40);

        grupoOrdenar.add(radSector1);
        radSector1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radSector1.setText("Sector");
        radSector1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radSector1MouseClicked(evt);
            }
        });
        jPanel6.add(radSector1);
        radSector1.setBounds(30, 70, 110, 40);

        grupoOrdenar.add(radCat1);
        radCat1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radCat1.setText("Categoría");
        radCat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radCat1MouseClicked(evt);
            }
        });
        jPanel6.add(radCat1);
        radCat1.setBounds(30, 100, 110, 40);

        grupoOrdenar.add(radMar1);
        radMar1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radMar1.setText("Marca");
        radMar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radMar1MouseClicked(evt);
            }
        });
        jPanel6.add(radMar1);
        radMar1.setBounds(30, 130, 110, 40);

        grupoOrdenar.add(radPre1);
        radPre1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radPre1.setText("Precio");
        radPre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPre1MouseClicked(evt);
            }
        });
        jPanel6.add(radPre1);
        radPre1.setBounds(30, 160, 110, 40);

        grupoOrdenar.add(radDis1);
        radDis1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radDis1.setText("Disponibilidad");
        radDis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radDis1MouseClicked(evt);
            }
        });
        jPanel6.add(radDis1);
        radDis1.setBounds(30, 190, 110, 40);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(260, 390, 170, 250);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -2, 1024, 770);

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

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        int cantidad = 1;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades desea?","1"));
        
        int fila = tablaProductos.getSelectedRow();
        String[] datos = new String[5];
        String p = (String) tablaProductos.getValueAt(fila, 4);
        double num1 = Double.parseDouble(p);        
        
        float fnum1 = (float) num1;
        
        float precio = (float) (fnum1 * cantidad);
        
        datos[0] = (String) tablaProductos.getValueAt(fila, 0);
        datos[1] = (String) tablaProductos.getValueAt(fila, 2);
        datos[2] = (String) tablaProductos.getValueAt(fila, 3);
        datos[3] = ""+cantidad;                        
        datos[4] = ""+precio;    

        model1.addRow(datos);
        
        double total = Double.parseDouble(txtTotal.getText());
        
        float ftotal = (float) total;
        
        float nuevoTotal = ftotal+precio;
        
        txtTotal.setText(""+nuevoTotal);
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnVaciarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCarritoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de vaciar su carrito?", "Confirmar",JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){   
            model1 = new DefaultTableModel();
            tablaCarrito.setModel(model1);

            model1.addColumn("ID");
            model1.addColumn("CATEGORIA");
            model1.addColumn("MARCA");
            model1.addColumn("CANTIDAD");
            model1.addColumn("PRECIO");
            
            txtTotal.setText("0");
        }
    }//GEN-LAST:event_btnVaciarCarritoActionPerformed

    private void btnSaldoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoDisponibleActionPerformed
        Usuarios usuarios = new Usuarios();
        Double saldo=0.0;
        
        try {
            saldo = (Double) usuarios.saldoUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s = ""+saldo;
        JOptionPane.showMessageDialog(null, "Su saldo actual es: S/."+s,"Saldo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaldoDisponibleActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        
    }//GEN-LAST:event_txtTotalActionPerformed

    private void tablaCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseEntered
        
    }//GEN-LAST:event_tablaCarritoMouseEntered

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        double costo = Double.parseDouble(txtTotal.getText());
        Usuarios usuarios = new Usuarios();
        
        Double saldo=0.0;
        try {
            saldo = (Double) usuarios.saldoUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(costo<=saldo){
            int numf = tablaCarrito.getRowCount();
            int numc = tablaCarrito.getColumnCount();

            String[][] datos = new String[numf][numc];

            int fil=0;
            int col=0;

            for(int f=0; f<numf; f++){
                for(int c=0; c<numc; c++){
                    datos[fil][col]=(tablaCarrito.getValueAt(f, c).toString());
                    col+=1;
                    if(c==numc-1){
                        col=0;
                    }
                }
                fil+=1;
            }              
            
            for(int f=0; f<numf; f++){
                for(int c=0; c<numc; c++){
                    System.out.println(datos[f][c]);
                }
                System.out.println("----");
            }
            
            Productos productos = new Productos();
            try {
                productos.comprarProducto(datos);
                productos.crearCarrito(datos, costo, usuario);
            } catch (SQLException ex) {
                Logger.getLogger(Pr_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Felicidades, su compra fue realizada con éxito.","Éxito",JOptionPane.INFORMATION_MESSAGE);  
            try {
                usuarios.restarSaldo(costo, usuario);
            } catch (SQLException ex) {
                Logger.getLogger(Pr_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                // TODO add your handling code here:
                BaseDatos bd = new BaseDatos();
                Connection xcon = bd.Conectar();    
                JasperReport reporte = null;
                reporte = (JasperReport) JRLoader.loadObjectFromFile("src/reportes/compras.jasper");        
                JasperPrint print = JasperFillManager.fillReport(reporte, null, xcon);
                JasperViewer ver = new JasperViewer(print,false);
                ver.setTitle("Zonas");
                ver.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No tiene saldo suficiente para realizar la compra. Necesita: S/."+(costo-saldo),"Saldo Insuficiente",JOptionPane.INFORMATION_MESSAGE);
        }
        cargarLista();
        btnCarrito.setEnabled(false);
        btnMostrar.setEnabled(false);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
        btnQuitar.setEnabled(true);
    }//GEN-LAST:event_tablaCarritoMouseClicked

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int fila = tablaCarrito.getSelectedRow();
        
        String p = (String) tablaCarrito.getValueAt(fila,4);
        double pr= Double.parseDouble(p);
        float pre= (float) pr;
        
        String precio = txtTotal.getText();
        double preci  = Double.parseDouble(precio);
        float prec    = (float) preci;
        
        float nuevoTotal = prec - pre;
        
        txtTotal.setText(""+nuevoTotal);
        model1.removeRow(fila);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id="", sector="", categoria="", marca="", precio="", a="";

        if(txtID1.getText().equals(a) && txtSector1.getText().equals(a) && txtCategoria1.getText().equals(a)
            && txtPrecio1.getText().equals(a) && txtMarca1.getText().equals(a)){
            JOptionPane.showMessageDialog(null, "Escriba al menos en un campo.", "Error",JOptionPane.INFORMATION_MESSAGE);

        }else{
            if(cheID1.isSelected()){
                if(txtID1.getText().equals(a)){
                    cheID1.setSelected(false);
                    txtID1.setEnabled(false);
                    txtID1.setEnabled(false);
                }
                id=txtID1.getText();
            }

            if(cheSector1.isSelected()){
                if(txtSector1.getText().equals(a)){
                    cheSector1.setSelected(false);
                    txtSector1.setEnabled(false);
                    txtSector1.setEnabled(false);
                }
                sector=txtSector1.getText();
            }

            if(cheCategoria1.isSelected()){
                if(txtCategoria1.getText().equals(a)){
                    cheCategoria1.setSelected(false);
                    txtCategoria1.setEnabled(false);
                    txtCategoria1.setEnabled(false);
                }
                categoria=txtCategoria1.getText();
            }

            if(cheMarca1.isSelected()){
                if(txtMarca1.getText().equals(a)){
                    cheMarca1.setSelected(false);
                    txtMarca1.setEnabled(false);
                    txtMarca1.setEnabled(false);
                }
                marca=txtMarca1.getText();
            }

            if(chePrecio1.isSelected()){
                if(txtPrecio1.getText().equals(a)){
                    chePrecio1.setSelected(false);
                    txtPrecio1.setEnabled(false);
                    txtPrecio1.setEnabled(false);
                }
                precio=txtPrecio1.getText();
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
        if(cheID1.isSelected()){
            txtID1.setEnabled(true);
        }
        else{
            txtID1.setEnabled(false);
            txtID1.setText("");
        }
    }//GEN-LAST:event_cheIDActionPerformed

    private void cheSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheSectorActionPerformed
        if(cheSector1.isSelected()){
            txtSector1.setEnabled(true);
        }
        else{
            txtSector1.setEnabled(false);
            txtSector1.setText("");
        }
    }//GEN-LAST:event_cheSectorActionPerformed

    private void cheCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheCategoriaActionPerformed
        if(cheCategoria1.isSelected()){
            txtCategoria1.setEnabled(true);
        }
        else{
            txtCategoria1.setEnabled(false);
            txtCategoria1.setText("");
        }
    }//GEN-LAST:event_cheCategoriaActionPerformed

    private void cheMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheMarcaActionPerformed
        if(cheMarca1.isSelected()){
            txtMarca1.setEnabled(true);
        }
        else{
            txtMarca1.setEnabled(false);
            txtMarca1.setText("");
        }
    }//GEN-LAST:event_cheMarcaActionPerformed

    private void chePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chePrecioActionPerformed
        if(chePrecio1.isSelected()){
            txtPrecio1.setEnabled(true);
        }
        else{
            txtPrecio1.setEnabled(false);
            txtPrecio1.setText("");
        }
    }//GEN-LAST:event_chePrecioActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        String a="";
        if(txtID1.getText().equals(a) && txtSector1.getText().equals(a) && txtCategoria1.getText().equals(a) && txtMarca1.getText().equals(a) && txtPrecio1.getText().equals(a)){
            cargarLista();
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
        Fusuario fu = new Fusuario(usuario);
        fu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        btnMostrar.setEnabled(true);
        btnCarrito.setEnabled(true);
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        String id="", sector="", categoria="", marca="", precio="", a="";

        if(txtID1.getText().equals(a) && txtSector1.getText().equals(a) && txtCategoria1.getText().equals(a)
            && txtPrecio1.getText().equals(a) && txtMarca1.getText().equals(a)){
            JOptionPane.showMessageDialog(null, "Escriba al menos en un campo.", "Error",JOptionPane.INFORMATION_MESSAGE);

        }else{
            if(cheID1.isSelected()){
                if(txtID1.getText().equals(a)){
                    cheID1.setSelected(false);
                    txtID1.setEnabled(false);
                    txtID1.setEnabled(false);
                }
                id=txtID1.getText();
            }

            if(cheSector1.isSelected()){
                if(txtSector1.getText().equals(a)){
                    cheSector1.setSelected(false);
                    txtSector1.setEnabled(false);
                    txtSector1.setEnabled(false);
                }
                sector=txtSector1.getText();
            }

            if(cheCategoria1.isSelected()){
                if(txtCategoria1.getText().equals(a)){
                    cheCategoria1.setSelected(false);
                    txtCategoria1.setEnabled(false);
                    txtCategoria1.setEnabled(false);
                }
                categoria=txtCategoria1.getText();
            }

            if(cheMarca1.isSelected()){
                if(txtMarca1.getText().equals(a)){
                    cheMarca1.setSelected(false);
                    txtMarca1.setEnabled(false);
                    txtMarca1.setEnabled(false);
                }
                marca=txtMarca1.getText();
            }

            if(chePrecio1.isSelected()){
                if(txtPrecio1.getText().equals(a)){
                    chePrecio1.setSelected(false);
                    txtPrecio1.setEnabled(false);
                    txtPrecio1.setEnabled(false);
                }
                precio=txtPrecio1.getText();
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
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void cheID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheID1ActionPerformed
        if(cheID1.isSelected()){
            txtID1.setEnabled(true);
        }
        else{
            txtID1.setEnabled(false);
            txtID1.setText("");
        }
    }//GEN-LAST:event_cheID1ActionPerformed

    private void cheSector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheSector1ActionPerformed
        if(cheSector1.isSelected()){
            txtSector1.setEnabled(true);
        }
        else{
            txtSector1.setEnabled(false);
            txtSector1.setText("");
        }
    }//GEN-LAST:event_cheSector1ActionPerformed

    private void cheCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheCategoria1ActionPerformed
        if(cheCategoria1.isSelected()){
            txtCategoria1.setEnabled(true);
        }
        else{
            txtCategoria1.setEnabled(false);
            txtCategoria1.setText("");
        }
    }//GEN-LAST:event_cheCategoria1ActionPerformed

    private void cheMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheMarca1ActionPerformed
        if(cheMarca1.isSelected()){
            txtMarca1.setEnabled(true);
        }
        else{
            txtMarca1.setEnabled(false);
            txtMarca1.setText("");
        }
    }//GEN-LAST:event_cheMarca1ActionPerformed

    private void chePrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chePrecio1ActionPerformed
        if(chePrecio1.isSelected()){
            txtPrecio1.setEnabled(true);
        }
        else{
            txtPrecio1.setEnabled(false);
            txtPrecio1.setText("");
        }
    }//GEN-LAST:event_chePrecio1ActionPerformed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        String a="";
        if(txtID1.getText().equals(a) && txtSector1.getText().equals(a) && txtCategoria1.getText().equals(a) && txtMarca1.getText().equals(a) && txtPrecio1.getText().equals(a)){
            cargarLista();
        }
    }//GEN-LAST:event_jPanel5MouseEntered

    private void radID1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radID1MouseClicked
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
    }//GEN-LAST:event_radID1MouseClicked

    private void radID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radID1ActionPerformed

    private void radSector1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radSector1MouseClicked
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
    }//GEN-LAST:event_radSector1MouseClicked

    private void radCat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radCat1MouseClicked
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
    }//GEN-LAST:event_radCat1MouseClicked

    private void radMar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radMar1MouseClicked
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
    }//GEN-LAST:event_radMar1MouseClicked

    private void radPre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radPre1MouseClicked
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
    }//GEN-LAST:event_radPre1MouseClicked

    private void radDis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radDis1MouseClicked
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
    }//GEN-LAST:event_radDis1MouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int fila = tablaProductos.getSelectedRow();
        String sector = (tablaProductos.getValueAt(fila, 1)+"");
        
        try {
            Frame_imagen_usuario fr = new Frame_imagen_usuario(sector, usuario); 
            fr.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pr_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pr_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pr_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pr_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pr_usuario(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnSaldoDisponible;
    private javax.swing.JButton btnVaciarCarrito;
    private javax.swing.JCheckBox cheCategoria1;
    private javax.swing.JCheckBox cheID1;
    private javax.swing.JCheckBox cheMarca1;
    private javax.swing.JCheckBox chePrecio1;
    private javax.swing.JCheckBox cheSector1;
    private javax.swing.ButtonGroup grupoOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radCat1;
    private javax.swing.JRadioButton radDis1;
    private javax.swing.JRadioButton radID1;
    private javax.swing.JRadioButton radMar1;
    private javax.swing.JRadioButton radPre1;
    private javax.swing.JRadioButton radSector1;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria1;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtSector1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
