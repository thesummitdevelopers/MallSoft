
package Formularios;

import Clases.Productos;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pr_normal extends javax.swing.JFrame {
    DefaultTableModel model = null;

    public Pr_normal() {
        setUndecorated(true);
        initComponents();
        cargarLista();
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
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        radID = new javax.swing.JRadioButton();
        radSector = new javax.swing.JRadioButton();
        radCat = new javax.swing.JRadioButton();
        radMar = new javax.swing.JRadioButton();
        radPre = new javax.swing.JRadioButton();
        radDis = new javax.swing.JRadioButton();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 43)); // NOI18N
        jLabel1.setText("Lista de Productos:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 340, 80);

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
        btnMostrar.setBounds(700, 50, 220, 39);

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

        btnBuscar1.setBackground(new java.awt.Color(147, 198, 249));
        btnBuscar1.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        btnBuscar1.setText("Registrarse...");
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar1);
        btnBuscar1.setBounds(840, 680, 140, 35);

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

        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Ordenar por:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 130, 30);

        grupoOrdenar.add(radID);
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

        grupoOrdenar.add(radSector);
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

        grupoOrdenar.add(radCat);
        radCat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radCat.setText("Categoría");
        radCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radCatMouseClicked(evt);
            }
        });
        jPanel4.add(radCat);
        radCat.setBounds(30, 100, 110, 40);

        grupoOrdenar.add(radMar);
        radMar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radMar.setText("Marca");
        radMar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radMarMouseClicked(evt);
            }
        });
        jPanel4.add(radMar);
        radMar.setBounds(30, 130, 110, 40);

        grupoOrdenar.add(radPre);
        radPre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radPre.setText("Precio");
        radPre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPreMouseClicked(evt);
            }
        });
        jPanel4.add(radPre);
        radPre.setBounds(30, 160, 110, 40);

        grupoOrdenar.add(radDis);
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo_registro.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 400, 520, 330);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo WO.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -2, 1024, 770);

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Inicio in;
        try {
            in = new Inicio();
            in.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_normal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pr_normal.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnAtrasActionPerformed

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
        }
    }//GEN-LAST:event_jPanel2MouseEntered

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        Fregistro_normal fr = new Fregistro_normal();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        btnMostrar.setEnabled(true);        
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int fila = tablaProductos.getSelectedRow();
        String sector = (tablaProductos.getValueAt(fila, 1)+"");
        
        try {
            Frame_imagen fr = new Frame_imagen(sector); 
            fr.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pr_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed
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
            java.util.logging.Logger.getLogger(Pr_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pr_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pr_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pr_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pr_normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JCheckBox cheCategoria;
    private javax.swing.JCheckBox cheID;
    private javax.swing.JCheckBox cheMarca;
    private javax.swing.JCheckBox chePrecio;
    private javax.swing.JCheckBox cheSector;
    private javax.swing.ButtonGroup grupoOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    // End of variables declaration//GEN-END:variables
}
