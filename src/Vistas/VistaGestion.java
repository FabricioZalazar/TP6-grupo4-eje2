/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Producto;
import java.util.TreeMap;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zalaz
 */
public class VistaGestion extends javax.swing.JInternalFrame {

    static TreeMap<Long, Producto> Product = new TreeMap();
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form VistaGestion
     */
    public VistaGestion() {
        initComponents();
        llenadoProductos();
        ArmarCabecera();
        DesactivarCampo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblTitulo = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jCCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLCodigo = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLRubro = new javax.swing.JLabel();
        jLStock = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jCRubro = new javax.swing.JComboBox<>();
        jSStock = new javax.swing.JSpinner();
        jBCerrar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();

        setTitle("DeTodo S.A: Productos");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Gestion de Productos");

        jLCategoria.setText("Filtrar por Categoria:");

        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Perfumeria", "Limpieza" }));
        jCCategoria.setSelectedIndex(-1);
        jCCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCategoriaItemStateChanged(evt);
            }
        });
        jCCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCategoriaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLCodigo.setText("Codigo:");

        jLDescripcion.setText("Descripcion:");

        jLPrecio.setText("Precio:");

        jLRubro.setText("Rubro:");

        jLStock.setText("Stock:");

        jCRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        jCRubro.setSelectedIndex(-1);
        jCRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCodigo)
                        .addGap(80, 80, 80)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPrecio)
                                    .addComponent(jLRubro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLStock)
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jCRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRubro)
                    .addComponent(jCRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStock)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/xmag_search_find_export_locate_5984 (1).png"))); // NOI18N

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Save_37110.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/business_package_box_accept_productorpackagetoaccept_negocio_paquet_2334.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete_unapprove_discard_remove_x_red_icon-icons.com_55984.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gui_approve_icon_157246.png"))); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLCategoria)
                .addGap(107, 107, 107)
                .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(258, 258, 258))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategoria)
                    .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jBCerrar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        if (ValidarCamposVacios(jDesktopPane1)) {
            try {
                long codigoSelect = Long.parseLong(txtCodigo.getText());
                String descripcion = txtDescripcion.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                String rubro = (String) jCRubro.getSelectedItem();
                int stock = (Integer) jSStock.getValue();
                for (long ele : Product.keySet()) {
                    if (ele == codigoSelect) {
                        Product.get(ele).actualizar(codigoSelect, descripcion, precio, rubro, stock);
                        jCCategoria.setSelectedItem(rubro);
                        modelo.setRowCount(0);
                        for (Producto p : Product.values()) {
                            if (p.getRubro().equalsIgnoreCase(rubro)) {
                                modelo.addRow(new Object[]{p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getRubro(), p.getStock()});
                            }
                        }
                        txtCodigo.setText("");
                        txtDescripcion.setText("");
                        txtPrecio.setText("");
                        jCRubro.setSelectedIndex(-1);
                        jSStock.setValue(0);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Codigo no Existente");
            } catch (NumberFormatException r) {
                JOptionPane.showMessageDialog(this, "complete los campos", "Error", HEIGHT);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete los Campos", "Error", HEIGHT);
            txtCodigo.setText("");
            txtDescripcion.setText("");
            txtPrecio.setText("");
            jCRubro.setSelectedIndex(-1);
            jSStock.setValue(0);
        }

    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        hide();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        ActivarCampo();
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        jCRubro.setSelectedIndex(-1);
        jSStock.setValue(0);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jCRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCRubroActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (ValidarCamposVacios(jDesktopPane1)) {

            long codigo = Long.parseLong(txtCodigo.getText());
            String descripcion = txtDescripcion.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String rubro = (String) jCRubro.getSelectedItem();
            int stock = (Integer) jSStock.getValue();

            if (Product.containsKey(codigo)) {
                JOptionPane.showMessageDialog(this, "El código de producto ya existe. Por favor, use un código diferente.");
                return;
            }
            Producto producto = new Producto(codigo, descripcion, precio, rubro, stock);
            Product.putIfAbsent(codigo, producto);

            jCCategoria.setSelectedItem(rubro);
        } else {
            JOptionPane.showMessageDialog(this, "Complete los Campos", "Error", HEIGHT);
        }

        DesactivarCampo();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();  // OBTENGO LA FILA

        if (filaSeleccionada != -1) {
            long codigo = (Long) jTable1.getValueAt(filaSeleccionada, 0);
            Product.remove(codigo);
            modelo.removeRow(filaSeleccionada);
            txtCodigo.setText("");
            txtDescripcion.setText("");
            txtPrecio.setText("");
            jCRubro.setSelectedIndex(-1);
            jSStock.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "No se seleccionó ninguna fila.");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jCCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCategoriaActionPerformed

    }//GEN-LAST:event_jCCategoriaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ActivarCampo();
        int filaSelecionada = jTable1.getSelectedRow();
        if (filaSelecionada != -1) {
            long codigo = (Long) jTable1.getValueAt(filaSelecionada, 0);
            String descripcion = (String) jTable1.getValueAt(filaSelecionada, 1);
            double precio = (Double) jTable1.getValueAt(filaSelecionada, 2);
            String rubro = (String) jTable1.getValueAt(filaSelecionada, 3);
            int stock = (int) jTable1.getValueAt(filaSelecionada, 4);

            txtCodigo.setText(codigo + "");
            txtDescripcion.setText(descripcion);
            txtPrecio.setText(precio + "");
            jCRubro.setSelectedItem(rubro);
            jSStock.setValue(stock);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jCCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCategoriaItemStateChanged
        String categoriaSeleccionada = (String) jCCategoria.getSelectedItem();

        modelo.setRowCount(0);
        for (Producto p : Product.values()) {
            if (p.getRubro().equals(categoriaSeleccionada)) {
                modelo.addRow(new Object[]{p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getRubro(), p.getStock()});
            }
        }
    }//GEN-LAST:event_jCCategoriaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JComboBox<String> jCRubro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLRubro;
    private javax.swing.JLabel jLStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    private void ArmarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        jTable1.setModel(modelo);

    }

    private void DesactivarCampo() {
        jCRubro.setSelectedIndex(-1);
        txtPrecio.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtDescripcion.setEnabled(false);
        jCRubro.setEnabled(false);
        jSStock.setEnabled(false);
    }

    private void ActivarCampo() {
        txtPrecio.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtDescripcion.setEnabled(true);
        jCRubro.setEnabled(true);
        jSStock.setEnabled(true);
    }

    public boolean ValidarCamposVacios(JDesktopPane jDesktopPane1) {
        boolean bandera = true;
        for (int i = 0; i < jDesktopPane1.getComponents().length; i++) {
            if (!bandera) {
                break;
            }
            if (jDesktopPane1.getComponents()[i] instanceof JTextField) {
                bandera = !((JTextField) jDesktopPane1.getComponents()[i]).getText().equals("") ? true : false;
                jDesktopPane1.getComponents()[i].requestFocus();
            }
        }
        return bandera;
    }

    public void llenadoProductos() {

        Producto p1 = new Producto(100, "Pan", 1400, "Comestible", 40);
        Producto p2 = new Producto(101, "Pan Lactal", 1600, "Comestible", 30);
        Producto p3 = new Producto(102, "Tortita", 800, "Comestible", 20);
        Producto p4 = new Producto(103, "Avon", 2500, "Perfumeria", 10);
        Producto p5 = new Producto(104, "Natura", 1100, "Perfumeria", 50);
        Producto p6 = new Producto(105, "Lavandina", 600, "Limpieza", 99);
        Producto p7 = new Producto(106, "Jabon", 300, "Limpieza", 120);
        Producto p8 = new Producto(107, "Desodorante", 800, "Limpieza", 30);
        Producto p9 = new Producto(108, "Ciff", 1400, "Limpieza", 40);
        Producto p10 = new Producto(109, "Hamburguesa", 10000, "Comestible", 400);
        Product.putIfAbsent((long) 100, p1);
        Product.putIfAbsent((long) 101, p2);
        Product.putIfAbsent((long) 102, p3);
        Product.putIfAbsent((long) 103, p4);
        Product.putIfAbsent((long) 104, p5);
        Product.putIfAbsent((long) 105, p6);
        Product.putIfAbsent((long) 106, p7);
        Product.putIfAbsent((long) 107, p8);
        Product.putIfAbsent((long) 108, p9);
        Product.putIfAbsent((long) 109, p10);
    }
}
