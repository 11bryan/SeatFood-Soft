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
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author foraneoblack
 */
public class V_clientes extends javax.swing.JFrame {

    /**
     * Creates new form V_clientes
     */
    public V_clientes() {
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

        jDialog1 = new javax.swing.JDialog();
        jp_dialogClient = new FondoDialogCliente();
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        txt_idUser = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jp_clientes = new FondoClientes();
        btn_Mesas = new javax.swing.JButton();
        btn_Producto = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Clientes = new javax.swing.JTable();

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Guardar.png"))); // NOI18N
        btn_Guardar.setBorderPainted(false);
        btn_Guardar.setContentAreaFilled(false);

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Cancelar.png"))); // NOI18N
        btn_Cancelar.setBorderPainted(false);
        btn_Cancelar.setContentAreaFilled(false);

        javax.swing.GroupLayout jp_dialogClientLayout = new javax.swing.GroupLayout(jp_dialogClient);
        jp_dialogClient.setLayout(jp_dialogClientLayout);
        jp_dialogClientLayout.setHorizontalGroup(
            jp_dialogClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogClientLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogClientLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jp_dialogClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jp_dialogClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogClientLayout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)))
        );
        jp_dialogClientLayout.setVerticalGroup(
            jp_dialogClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogClientLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(txt_idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btn_Guardar)
                .addGap(19, 19, 19))
            .addGroup(jp_dialogClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogClientLayout.createSequentialGroup()
                    .addContainerGap(373, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar)
                    .addGap(18, 18, 18)))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jp_dialogClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jp_dialogClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_mesas.png"))); // NOI18N
        btn_Mesas.setBorderPainted(false);
        btn_Mesas.setContentAreaFilled(false);
        btn_Mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MesasActionPerformed(evt);
            }
        });

        btn_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Productos.png"))); // NOI18N
        btn_Producto.setBorderPainted(false);
        btn_Producto.setContentAreaFilled(false);
        btn_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductoActionPerformed(evt);
            }
        });

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Clientes.png"))); // NOI18N
        btn_Clientes.setBorderPainted(false);
        btn_Clientes.setContentAreaFilled(false);
        btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClientesActionPerformed(evt);
            }
        });

        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Proveedores.png"))); // NOI18N
        btn_factura.setBorderPainted(false);
        btn_factura.setContentAreaFilled(false);
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Configuracion.png"))); // NOI18N
        btn_configuracion.setBorderPainted(false);
        btn_configuracion.setContentAreaFilled(false);
        btn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionActionPerformed(evt);
            }
        });

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

        btn_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Reporte.png"))); // NOI18N
        btn_Reporte.setBorderPainted(false);
        btn_Reporte.setContentAreaFilled(false);

        tb_Clientes.setBackground(new java.awt.Color(222, 138, 53));
        tb_Clientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 138, 53), 2, true));
        tb_Clientes.setForeground(new java.awt.Color(222, 138, 53));
        tb_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_Usuario", "Nombre", "Apellido", "Direccion", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tb_Clientes);

        javax.swing.GroupLayout jp_clientesLayout = new javax.swing.GroupLayout(jp_clientes);
        jp_clientes.setLayout(jp_clientesLayout);
        jp_clientesLayout.setHorizontalGroup(
            jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clientesLayout.createSequentialGroup()
                .addGroup(jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_clientesLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_clientesLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btn_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jp_clientesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jp_clientesLayout.setVerticalGroup(
            jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clientesLayout.createSequentialGroup()
                .addGroup(jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_clientesLayout.createSequentialGroup()
                        .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_clientesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jp_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MesasActionPerformed

    private void btn_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProductoActionPerformed

    private void btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ClientesActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_configuracionActionPerformed

    public JButton getBtn_Actualizar() {
        return btn_Actualizar;
    }

    public void setBtn_Actualizar(JButton btn_Actualizar) {
        this.btn_Actualizar = btn_Actualizar;
    }

    public JButton getBtn_Cancelar() {
        return btn_Cancelar;
    }

    public void setBtn_Cancelar(JButton btn_Cancelar) {
        this.btn_Cancelar = btn_Cancelar;
    }

    public JButton getBtn_Clientes() {
        return btn_Clientes;
    }

    public void setBtn_Clientes(JButton btn_Clientes) {
        this.btn_Clientes = btn_Clientes;
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

    public JButton getBtn_Guardar() {
        return btn_Guardar;
    }

    public void setBtn_Guardar(JButton btn_Guardar) {
        this.btn_Guardar = btn_Guardar;
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

    public JButton getBtn_Producto() {
        return btn_Producto;
    }

    public void setBtn_Producto(JButton btn_Producto) {
        this.btn_Producto = btn_Producto;
    }

    public JButton getBtn_Reporte() {
        return btn_Reporte;
    }

    public void setBtn_Reporte(JButton btn_Reporte) {
        this.btn_Reporte = btn_Reporte;
    }

    public JButton getBtn_configuracion() {
        return btn_configuracion;
    }

    public void setBtn_configuracion(JButton btn_configuracion) {
        this.btn_configuracion = btn_configuracion;
    }

    public JButton getBtn_factura() {
        return btn_factura;
    }

    public void setBtn_factura(JButton btn_factura) {
        this.btn_factura = btn_factura;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JPanel getJp_dialogClient() {
        return jp_dialogClient;
    }

    public void setJp_dialogClient(JPanel jp_dialogClient) {
        this.jp_dialogClient = jp_dialogClient;
    }

    public JTable getTb_Clientes() {
        return tb_Clientes;
    }

    public void setTb_Clientes(JTable tb_Clientes) {
        this.tb_Clientes = tb_Clientes;
    }

    public JTextField getTxt_Nombre() {
        return txt_Nombre;
    }

    public void setTxt_Nombre(JTextField txt_Nombre) {
        this.txt_Nombre = txt_Nombre;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_direccion() {
        return txt_direccion;
    }

    public void setTxt_direccion(JTextField txt_direccion) {
        this.txt_direccion = txt_direccion;
    }

    public JTextField getTxt_idUser() {
        return txt_idUser;
    }

    public void setTxt_idUser(JTextField txt_idUser) {
        this.txt_idUser = txt_idUser;
    }

    public JTextField getTxt_telefono() {
        return txt_telefono;
    }

    public void setTxt_telefono(JTextField txt_telefono) {
        this.txt_telefono = txt_telefono;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Mesas;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Producto;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_factura;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_clientes;
    private javax.swing.JPanel jp_dialogClient;
    private javax.swing.JTable tb_Clientes;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idUser;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
    
    class FondoClientes extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/Fondo_Clientes.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    class FondoDialogCliente extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Imagenes/dialog_Clientes.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
}
