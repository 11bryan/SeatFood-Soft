/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author foraneoblack
 */
public class V_mesas extends javax.swing.JFrame {

    /**
     * Creates new form V_mesas
     */
    public V_mesas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_mesas = new javax.swing.JDialog();
        jp_mesas_dialog = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mesas = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        cb_Entrega = new javax.swing.JCheckBox();
        dialog_factura = new javax.swing.JDialog();
        jp_factura = new FondoDialogFactura();
        txt_nombre_d = new javax.swing.JTextField();
        txt_direccion_d = new javax.swing.JTextField();
        txt_ruc_d = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Factura = new javax.swing.JTable();
        btn_Imprimir = new javax.swing.JButton();
        btn_cancelar_d2 = new javax.swing.JButton();
        dialog_entrega = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txt_identrega = new javax.swing.JTextField();
        txt_nmesa = new javax.swing.JTextField();
        txt_delivery = new javax.swing.JTextField();
        jp_mesas = new FondoMesas();
        btn_mesas = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_Factura = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btn_n1 = new javax.swing.JButton();
        btn_n2 = new javax.swing.JButton();
        btn_n3 = new javax.swing.JButton();
        btn_n4 = new javax.swing.JButton();
        btn_n5 = new javax.swing.JButton();
        btn_n6 = new javax.swing.JButton();
        btn_n7 = new javax.swing.JButton();
        btn_n8 = new javax.swing.JButton();
        btn_n9 = new javax.swing.JButton();
        btn_n10 = new javax.swing.JButton();
        btn_n11 = new javax.swing.JButton();
        btn_n12 = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();

        tb_mesas.setBackground(new java.awt.Color(222, 138, 53));
        tb_mesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb_mesas.setForeground(new java.awt.Color(222, 138, 53));
        tb_mesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tb_mesas);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Guardar.png"))); // NOI18N
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Cancelar.png"))); // NOI18N
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setContentAreaFilled(false);

        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_factura-13.png"))); // NOI18N
        btn_factura.setBorderPainted(false);
        btn_factura.setContentAreaFilled(false);

        cb_Entrega.setText("Entrega a domicilio");

        javax.swing.GroupLayout jp_mesas_dialogLayout = new javax.swing.GroupLayout(jp_mesas_dialog);
        jp_mesas_dialog.setLayout(jp_mesas_dialogLayout);
        jp_mesas_dialogLayout.setHorizontalGroup(
            jp_mesas_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesas_dialogLayout.createSequentialGroup()
                .addGroup(jp_mesas_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jp_mesas_dialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_mesas_dialogLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_mesas_dialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_mesas_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addGroup(jp_mesas_dialogLayout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_Entrega))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jp_mesas_dialogLayout.setVerticalGroup(
            jp_mesas_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesas_dialogLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_Entrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jp_mesas_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout dialog_mesasLayout = new javax.swing.GroupLayout(dialog_mesas.getContentPane());
        dialog_mesas.getContentPane().setLayout(dialog_mesasLayout);
        dialog_mesasLayout.setHorizontalGroup(
            dialog_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mesas_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_mesasLayout.setVerticalGroup(
            dialog_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mesas_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tb_Factura.setBackground(new java.awt.Color(222, 138, 53));
        tb_Factura.setForeground(new java.awt.Color(222, 138, 53));
        tb_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Descripcion", "P.Unit", "P.Total"
            }
        ));
        jScrollPane2.setViewportView(tb_Factura);

        btn_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_imprimir.png"))); // NOI18N
        btn_Imprimir.setBorderPainted(false);
        btn_Imprimir.setContentAreaFilled(false);

        btn_cancelar_d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Cancelar.png"))); // NOI18N
        btn_cancelar_d2.setBorderPainted(false);
        btn_cancelar_d2.setContentAreaFilled(false);

        javax.swing.GroupLayout jp_facturaLayout = new javax.swing.GroupLayout(jp_factura);
        jp_factura.setLayout(jp_facturaLayout);
        jp_facturaLayout.setHorizontalGroup(
            jp_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_facturaLayout.createSequentialGroup()
                .addGroup(jp_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_facturaLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jp_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ruc_d, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion_d, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_d, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_facturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_facturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cancelar_d2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jp_facturaLayout.setVerticalGroup(
            jp_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_facturaLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(txt_nombre_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_direccion_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ruc_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jp_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_d2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout dialog_facturaLayout = new javax.swing.GroupLayout(dialog_factura.getContentPane());
        dialog_factura.getContentPane().setLayout(dialog_facturaLayout);
        dialog_facturaLayout.setHorizontalGroup(
            dialog_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_facturaLayout.setVerticalGroup(
            dialog_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(txt_identrega)
                    .addComponent(txt_nmesa))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(txt_identrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout dialog_entregaLayout = new javax.swing.GroupLayout(dialog_entrega.getContentPane());
        dialog_entrega.getContentPane().setLayout(dialog_entregaLayout);
        dialog_entregaLayout.setHorizontalGroup(
            dialog_entregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_entregaLayout.setVerticalGroup(
            dialog_entregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mesas.png"))); // NOI18N
        btn_mesas.setBorderPainted(false);
        btn_mesas.setContentAreaFilled(false);

        btn_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Productos.png"))); // NOI18N
        btn_producto.setBorderPainted(false);
        btn_producto.setContentAreaFilled(false);

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Clientes.png"))); // NOI18N
        btn_cliente.setBorderPainted(false);
        btn_cliente.setContentAreaFilled(false);

        btn_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Proveedores.png"))); // NOI18N
        btn_Factura.setBorderPainted(false);
        btn_Factura.setContentAreaFilled(false);

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Configuracion.png"))); // NOI18N
        btn_configuracion.setBorderPainted(false);
        btn_configuracion.setContentAreaFilled(false);

        btn_n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_1.png"))); // NOI18N
        btn_n1.setBorderPainted(false);
        btn_n1.setContentAreaFilled(false);

        btn_n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_2.png"))); // NOI18N
        btn_n2.setBorderPainted(false);
        btn_n2.setContentAreaFilled(false);

        btn_n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_3.png"))); // NOI18N
        btn_n3.setBorderPainted(false);
        btn_n3.setContentAreaFilled(false);

        btn_n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_4.png"))); // NOI18N
        btn_n4.setBorderPainted(false);
        btn_n4.setContentAreaFilled(false);

        btn_n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_5.png"))); // NOI18N
        btn_n5.setBorderPainted(false);
        btn_n5.setContentAreaFilled(false);

        btn_n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_6.png"))); // NOI18N
        btn_n6.setBorderPainted(false);
        btn_n6.setContentAreaFilled(false);

        btn_n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_7.png"))); // NOI18N
        btn_n7.setBorderPainted(false);
        btn_n7.setContentAreaFilled(false);

        btn_n8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_8.png"))); // NOI18N
        btn_n8.setBorderPainted(false);
        btn_n8.setContentAreaFilled(false);

        btn_n9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_9.png"))); // NOI18N
        btn_n9.setBorderPainted(false);
        btn_n9.setContentAreaFilled(false);

        btn_n10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_10.png"))); // NOI18N
        btn_n10.setBorderPainted(false);
        btn_n10.setContentAreaFilled(false);

        btn_n11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_11.png"))); // NOI18N
        btn_n11.setBorderPainted(false);
        btn_n11.setContentAreaFilled(false);

        btn_n12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_12.png"))); // NOI18N
        btn_n12.setBorderPainted(false);
        btn_n12.setContentAreaFilled(false);

        btn_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Reporte.png"))); // NOI18N
        btn_Reporte.setBorderPainted(false);
        btn_Reporte.setContentAreaFilled(false);

        javax.swing.GroupLayout jp_mesasLayout = new javax.swing.GroupLayout(jp_mesas);
        jp_mesas.setLayout(jp_mesasLayout);
        jp_mesasLayout.setHorizontalGroup(
            jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_mesasLayout.createSequentialGroup()
                        .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_mesasLayout.createSequentialGroup()
                        .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_n12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jp_mesasLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btn_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_mesasLayout.setVerticalGroup(
            jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesasLayout.createSequentialGroup()
                .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jp_mesasLayout.createSequentialGroup()
                            .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_mesasLayout.createSequentialGroup()
                            .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_mesas)
                                .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(160, 160, 160)
                            .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_n11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_n10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_n12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_Factura() {
        return btn_Factura;
    }

    public void setBtn_Factura(JButton btn_Factura) {
        this.btn_Factura = btn_Factura;
    }

    public JButton getBtn_Reporte() {
        return btn_Reporte;
    }

    public void setBtn_Reporte(JButton btn_Reporte) {
        this.btn_Reporte = btn_Reporte;
    }

    public JButton getBtn_cliente() {
        return btn_cliente;
    }

    public void setBtn_cliente(JButton btn_cliente) {
        this.btn_cliente = btn_cliente;
    }

    public JButton getBtn_configuracion() {
        return btn_configuracion;
    }

    public void setBtn_configuracion(JButton btn_configuracion) {
        this.btn_configuracion = btn_configuracion;
    }

    public JButton getBtn_mesas() {
        return btn_mesas;
    }

    public void setBtn_mesas(JButton btn_mesas) {
        this.btn_mesas = btn_mesas;
    }

    public JButton getBtn_n1() {
        return btn_n1;
    }

    public void setBtn_n1(JButton btn_n1) {
        this.btn_n1 = btn_n1;
    }

    public JButton getBtn_n10() {
        return btn_n10;
    }

    public void setBtn_n10(JButton btn_n10) {
        this.btn_n10 = btn_n10;
    }

    public JButton getBtn_n11() {
        return btn_n11;
    }

    public void setBtn_n11(JButton btn_n11) {
        this.btn_n11 = btn_n11;
    }

    public JButton getBtn_n12() {
        return btn_n12;
    }

    public void setBtn_n12(JButton btn_n12) {
        this.btn_n12 = btn_n12;
    }

    public JButton getBtn_n2() {
        return btn_n2;
    }

    public void setBtn_n2(JButton btn_n2) {
        this.btn_n2 = btn_n2;
    }

    public JButton getBtn_n3() {
        return btn_n3;
    }

    public void setBtn_n3(JButton btn_n3) {
        this.btn_n3 = btn_n3;
    }

    public JButton getBtn_n4() {
        return btn_n4;
    }

    public void setBtn_n4(JButton btn_n4) {
        this.btn_n4 = btn_n4;
    }

    public JButton getBtn_n5() {
        return btn_n5;
    }

    public void setBtn_n5(JButton btn_n5) {
        this.btn_n5 = btn_n5;
    }

    public JButton getBtn_n6() {
        return btn_n6;
    }

    public void setBtn_n6(JButton btn_n6) {
        this.btn_n6 = btn_n6;
    }

    public JButton getBtn_n7() {
        return btn_n7;
    }

    public void setBtn_n7(JButton btn_n7) {
        this.btn_n7 = btn_n7;
    }

    public JButton getBtn_n8() {
        return btn_n8;
    }

    public void setBtn_n8(JButton btn_n8) {
        this.btn_n8 = btn_n8;
    }

    public JButton getBtn_n9() {
        return btn_n9;
    }

    public void setBtn_n9(JButton btn_n9) {
        this.btn_n9 = btn_n9;
    }

    public JButton getBtn_producto() {
        return btn_producto;
    }

    public void setBtn_producto(JButton btn_producto) {
        this.btn_producto = btn_producto;
    }

    public JPanel getJp_mesas() {
        return jp_mesas;
    }

    public void setJp_mesas(JPanel jp_mesas) {
        this.jp_mesas = jp_mesas;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

    public JButton getBtn_factura() {
        return btn_factura;
    }

    public void setBtn_factura(JButton btn_factura) {
        this.btn_factura = btn_factura;
    }

    public JButton getBtn_guardar() {
        return btn_guardar;
    }

    public void setBtn_guardar(JButton btn_guardar) {
        this.btn_guardar = btn_guardar;
    }

    public JDialog getDialog_mesas() {
        return dialog_mesas;
    }

    public void setDialog_mesas(JDialog dialog_mesas) {
        this.dialog_mesas = dialog_mesas;
    }

    public JTable getTb_mesas() {
        return tb_mesas;
    }

    public void setTb_mesas(JTable tb_mesas) {
        this.tb_mesas = tb_mesas;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

    public JButton getBtn_Imprimir() {
        return btn_Imprimir;
    }

    public void setBtn_Imprimir(JButton btn_Imprimir) {
        this.btn_Imprimir = btn_Imprimir;
    }

    public JButton getBtn_cancelar_d2() {
        return btn_cancelar_d2;
    }

    public void setBtn_cancelar_d2(JButton btn_cancelar_d2) {
        this.btn_cancelar_d2 = btn_cancelar_d2;
    }

    public JDialog getDialog_factura() {
        return dialog_factura;
    }

    public void setDialog_factura(JDialog dialog_factura) {
        this.dialog_factura = dialog_factura;
    }

    public JPanel getJp_factura() {
        return jp_factura;
    }

    public void setJp_factura(JPanel jp_factura) {
        this.jp_factura = jp_factura;
    }

    public JPanel getJp_mesas_dialog() {
        return jp_mesas_dialog;
    }

    public void setJp_mesas_dialog(JPanel jp_mesas_dialog) {
        this.jp_mesas_dialog = jp_mesas_dialog;
    }

    public JTable getTb_Factura() {
        return tb_Factura;
    }

    public void setTb_Factura(JTable tb_Factura) {
        this.tb_Factura = tb_Factura;
    }

    public JTextField getTxt_direccion_d() {
        return txt_direccion_d;
    }

    public void setTxt_direccion_d(JTextField txt_direccion_d) {
        this.txt_direccion_d = txt_direccion_d;
    }

    public JTextField getTxt_nombre_d() {
        return txt_nombre_d;
    }

    public void setTxt_nombre_d(JTextField txt_nombre_d) {
        this.txt_nombre_d = txt_nombre_d;
    }

    public JTextField getTxt_ruc_d() {
        return txt_ruc_d;
    }

    public void setTxt_ruc_d(JTextField txt_ruc_d) {
        this.txt_ruc_d = txt_ruc_d;
    }

    public JCheckBox getCb_Entrega() {
        return cb_Entrega;
    }

    public void setCb_Entrega(JCheckBox cb_Entrega) {
        this.cb_Entrega = cb_Entrega;
    }

    public JDialog getDialog_entrega() {
        return dialog_entrega;
    }

    public void setDialog_entrega(JDialog dialog_entrega) {
        this.dialog_entrega = dialog_entrega;
    }

    public JTextField getTxt_delivery() {
        return txt_delivery;
    }

    public void setTxt_delivery(JTextField txt_delivery) {
        this.txt_delivery = txt_delivery;
    }

    public JTextField getTxt_identrega() {
        return txt_identrega;
    }

    public void setTxt_identrega(JTextField txt_identrega) {
        this.txt_identrega = txt_identrega;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Factura;
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar_d2;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_mesas;
    private javax.swing.JButton btn_n1;
    private javax.swing.JButton btn_n10;
    private javax.swing.JButton btn_n11;
    private javax.swing.JButton btn_n12;
    private javax.swing.JButton btn_n2;
    private javax.swing.JButton btn_n3;
    private javax.swing.JButton btn_n4;
    private javax.swing.JButton btn_n5;
    private javax.swing.JButton btn_n6;
    private javax.swing.JButton btn_n7;
    private javax.swing.JButton btn_n8;
    private javax.swing.JButton btn_n9;
    private javax.swing.JButton btn_producto;
    private javax.swing.JCheckBox cb_Entrega;
    private javax.swing.JDialog dialog_entrega;
    private javax.swing.JDialog dialog_factura;
    private javax.swing.JDialog dialog_mesas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp_factura;
    private javax.swing.JPanel jp_mesas;
    private javax.swing.JPanel jp_mesas_dialog;
    private javax.swing.JTable tb_Factura;
    private javax.swing.JTable tb_mesas;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_delivery;
    private javax.swing.JTextField txt_direccion_d;
    private javax.swing.JTextField txt_identrega;
    private javax.swing.JTextField txt_nmesa;
    private javax.swing.JTextField txt_nombre_d;
    private javax.swing.JTextField txt_ruc_d;
    // End of variables declaration//GEN-END:variables
    
    class FondoMesas extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/Fondo_Mesas.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
    class FondoDialogMesas extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/dialog_mesas.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }

    class FondoDialogFactura extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/dialog_factura.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
