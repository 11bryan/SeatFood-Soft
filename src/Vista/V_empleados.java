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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author foraneoblack
 */
public class V_empleados extends javax.swing.JFrame {

    /**
     * Creates new form V_productos
     */
    public V_empleados() {
        initComponents();
    }

    public JButton getBtn_Actualizar() {
        return btn_Actualizar;
    }

    public void setBtn_Actualizar(JButton btn_Actualizar) {
        this.btn_Actualizar = btn_Actualizar;
    }

    public JButton getBtn_Clientes() {
        return btn_Clientes;
    }

    public void setBtn_Clientes(JButton btn_Clientes) {
        this.btn_Clientes = btn_Clientes;
    }

    public JButton getBtn_Configuracion() {
        return btn_Configuracion;
    }

    public void setBtn_Configuracion(JButton btn_Configuracion) {
        this.btn_Configuracion = btn_Configuracion;
    }

    public JButton getBtn_Editar() {
        return btn_Editar;
    }

    public void setBtn_Editar(JButton btn_Editar) {
        this.btn_Editar = btn_Editar;
    }

    public JButton getBtn_Eliminar() {
        return btn_Eliminar;
    }

    public void setBtn_Eliminar(JButton btn_Eliminar) {
        this.btn_Eliminar = btn_Eliminar;
    }

    public JButton getBtn_Facturas() {
        return btn_Facturas;
    }

    public void setBtn_Facturas(JButton btn_Facturas) {
        this.btn_Facturas = btn_Facturas;
    }

    public JButton getBtn_Mesas() {
        return btn_Mesas;
    }

    public void setBtn_Mesas(JButton btn_Mesas) {
        this.btn_Mesas = btn_Mesas;
    }

    public JButton getBtn_Nuevo() {
        return btn_Nuevo;
    }

    public void setBtn_Nuevo(JButton btn_Nuevo) {
        this.btn_Nuevo = btn_Nuevo;
    }

    public JButton getBtn_Productos() {
        return btn_Productos;
    }

    public void setBtn_Productos(JButton btn_Productos) {
        this.btn_Productos = btn_Productos;
    }

    public JButton getBtn_Reporte() {
        return btn_Reporte;
    }

    public void setBtn_Reporte(JButton btn_Reporte) {
        this.btn_Reporte = btn_Reporte;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getJp_productos() {
        return jp_productos;
    }

    public void setJp_productos(JPanel jp_productos) {
        this.jp_productos = jp_productos;
    }

    public JTable getTb_Empleados() {
        return tb_Empleados;
    }

    public void setTb_Empleados(JTable tb_Empleados) {
        this.tb_Empleados = tb_Empleados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_productos = new FondoProductos();
        btn_Mesas = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_Facturas = new javax.swing.JButton();
        btn_Configuracion = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mesas.png"))); // NOI18N
        btn_Mesas.setBorderPainted(false);
        btn_Mesas.setContentAreaFilled(false);
        btn_Mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MesasActionPerformed(evt);
            }
        });

        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Productos.png"))); // NOI18N
        btn_Productos.setBorderPainted(false);
        btn_Productos.setContentAreaFilled(false);
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Clientes.png"))); // NOI18N
        btn_Clientes.setBorderPainted(false);
        btn_Clientes.setContentAreaFilled(false);

        btn_Facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Proveedores.png"))); // NOI18N
        btn_Facturas.setBorderPainted(false);
        btn_Facturas.setContentAreaFilled(false);
        btn_Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FacturasActionPerformed(evt);
            }
        });

        btn_Configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Configuracion.png"))); // NOI18N
        btn_Configuracion.setBorderPainted(false);
        btn_Configuracion.setContentAreaFilled(false);

        btn_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Reporte.png"))); // NOI18N
        btn_Reporte.setBorderPainted(false);
        btn_Reporte.setContentAreaFilled(false);

        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Actualizar.png"))); // NOI18N
        btn_Actualizar.setBorderPainted(false);
        btn_Actualizar.setContentAreaFilled(false);

        btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Nuevo.png"))); // NOI18N
        btn_Nuevo.setBorderPainted(false);
        btn_Nuevo.setContentAreaFilled(false);

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Editar.png"))); // NOI18N
        btn_Editar.setBorderPainted(false);
        btn_Editar.setContentAreaFilled(false);

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Eliminar.png"))); // NOI18N
        btn_Eliminar.setBorderPainted(false);
        btn_Eliminar.setContentAreaFilled(false);

        tb_Empleados.setBackground(new java.awt.Color(222, 138, 53));
        tb_Empleados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 138, 53), 2, true));
        tb_Empleados.setForeground(new java.awt.Color(222, 138, 53));
        tb_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Empleado", "Nombre", "Apellido", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tb_Empleados);

        javax.swing.GroupLayout jp_productosLayout = new javax.swing.GroupLayout(jp_productos);
        jp_productos.setLayout(jp_productosLayout);
        jp_productosLayout.setHorizontalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_Facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jp_productosLayout.setVerticalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jp_productosLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_productosLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MesasActionPerformed

    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_FacturasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Configuracion;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Facturas;
    private javax.swing.JButton btn_Mesas;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Productos;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_productos;
    private javax.swing.JTable tb_Empleados;
    // End of variables declaration//GEN-END:variables

    class FondoProductos extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/Fondo_Empleados.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
