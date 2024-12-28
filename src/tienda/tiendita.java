package tienda;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class tiendita extends javax.swing.JFrame {

    //Atributos de tiendita
    String productos[] = {"Doritos", "Coca Cola", "Bolt", "Cafe", "Sopa", "Galletas", "Chicles", "Yogurd", "Cigarro", "Cerveza"};
    double precios[] = {2.5, 3, 2.4, 4.0, 5.2, 10, 2, 6.7, 1.5, 6.5};
    double precio = 0;
    int cantidad = 0;

    double iva;
    double total;
    double subtotal;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();

    public tiendita() {
        initComponents();
        this.setTitle("TIENDITA MINORISTA");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tienda.png"));
        this.setIconImage(icono);

        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tienda.png"));
        lblLogo.setIcon(new ImageIcon(icono.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setSize(650, 650);
        this.setLocationRelativeTo(null);

        Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/agregar.png"));
        btnAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        //encabezado de la tabla
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        cboProducto.setModel(comboModel);
        modelo.addColumn("DESCRIPCÓN");
        modelo.addColumn("PRECIO U.");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        actualizarTabla();
        calcularPrecio();
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblPrecio = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setText("jLabel1");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PRODUCTO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CANTIDAD");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 90, 30));

        lblImporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblImporte.setText("S/. 0.00 ");
        lblImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("IMPORTE");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        cboProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 40));

        spnCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PRECIO");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("S/. 0.00 ");
        lblTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 510, 160));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setText("S/. 0.00 ");
        lblPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        lblIva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIva.setText("S/. 0.00 ");
        lblIva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("IGV");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("SUBTOTAL");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubtotal.setText("S/. 0.00 ");
        lblSubtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Minimarket");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 70, 70));

        btnCobrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Venta venta = new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setDescripcion(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio * cantidad);

        if (!buscarVenta(venta)) {
            listaVentas.add(venta);
        }

        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed
    public boolean buscarVenta(Venta nueva) {
        for (Venta v : listaVentas) {
            if (v.getId() == nueva.getId()) {
                int nuevaCantidad = v.getCantidad() + nueva.getCantidad();

                v.setCantidad(nuevaCantidad);

                v.setImporte(v.getPrecio() * nuevaCantidad);
                return true;
            }
        }
        return false;
    }

    public void borrarVenta() {
        precio = 0;
        cantidad = 1;

        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();

    }
    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed


    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();

    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        //Movilización de datos al formulario CobrarCliente + apertura del formulario
        CobrarCliente cobrar = new CobrarCliente();
        cobrar.Tabla(subtotal, iva, total, modelo);
        cobrar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnCobrarActionPerformed
    public void calcularPrecio() {
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio * cantidad));

    }

    public String aMoneda(double precio) {
        return "S/. " + Math.round(precio * 100.0) / 100.0;
    }
    
    public void actualizarTabla() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        subtotal = 0;
        for (Venta v : listaVentas) {
            Object x[] = new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getImporte());
            subtotal += v.getImporte();
            modelo.addRow(x);
        }
        iva = subtotal * 0.18;
        total = subtotal + iva;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));

        tblProductos.setModel(modelo); 
    }

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
            java.util.logging.Logger.getLogger(tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiendita().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
