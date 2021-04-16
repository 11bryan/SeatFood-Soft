/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_mesas;
import Vista.V_productos;
import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.ConexionPGA;
import modelo.modelo_cliente;
import modelo.modelo_producto;
import modelo.producto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class ControlProducto {

    private modelo_producto mproducto;
    private V_productos vproducto;

    public ControlProducto() {
    }

    public ControlProducto(modelo_producto mproducto, V_productos vproducto) {
        this.mproducto = mproducto;
        this.vproducto = vproducto;
        vproducto.setVisible(true);
        vproducto.setLocationRelativeTo(null);
    }

    public void iniciacontrol() {
        vproducto.getBtn_Reporte().addActionListener(l -> imprimereporte());
        vproducto.getBtn_Actualizar().addActionListener(l -> cargalista(""));
        vproducto.getBtn_Nuevo().addActionListener(l -> mostrardialogo());
        vproducto.getBtn_Guardar_d().addActionListener(l -> grabar());
        vproducto.getBtn_Editar().addActionListener(l -> editar());
        vproducto.getBtn_Eliminar().addActionListener(l -> eliminarproducto());
        vproducto.getBtn_Mesas().addActionListener(l -> abrirmesas());
        vproducto.getBtn_Productos().addActionListener(l -> abrirproducto());
        vproducto.getBtn_Facturas().addActionListener(l -> abrirfactura());
        vproducto.getBtn_Cancelar_d().addActionListener(l -> cancelacion());
        vproducto.getBtn_actualizar_d().addActionListener(l -> actualizarproducto());
        vproducto.getBtn_examinar().addActionListener(l -> cargarImagen());
    }

    private void imprimereporte() {
        ConexionPGA con = new ConexionPGA();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Productos.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrardialogo() {
        vproducto.getBtn_actualizar_d().setVisible(false);
        vproducto.getDialog_producto().setSize(320, 450);
        vproducto.getDialog_producto().setTitle("PRODUCTO");
        vproducto.getDialog_producto().setLocationRelativeTo(null);
        vproducto.setVisible(false);
        vproducto.getTxt_IdProducto().setText("");
        vproducto.getTxt_nombre().setText("");
        vproducto.getTxt_tipo().setText("");
        vproducto.getTxt_cantidad().setText("");
        vproducto.getTxt_descripcion().setText("");
        vproducto.getTxt_tipo().setText("");

        vproducto.getDialog_producto().setVisible(true);

    }

    private void grabar() {

        String id = vproducto.getTxt_IdProducto().getText();
        String nombre = vproducto.getTxt_nombre().getText();
        String tipo = vproducto.getTxt_tipo().getText();
        int cantidad = Integer.parseInt(vproducto.getTxt_cantidad().getText());
        String descripcion = vproducto.getTxt_descripcion().getText();
        double precio = Double.valueOf(vproducto.getTxt_precio().getText());
        ImageIcon imagen = (ImageIcon) vproducto.getLb_foto().getIcon();
        modelo_producto producto = new modelo_producto();
        producto.setId_producto(id);
        producto.setNombre(nombre);
        producto.setId_tipo(tipo);
        producto.setCantidad(cantidad);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setImagen(imagen.getImage());
        if (producto.grabar_producto()) {
            cargalista("");
            vproducto.getDialog_producto().setVisible(false);
            JOptionPane.showMessageDialog(vproducto, "Cliente grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vproducto, "ERROR");
        }

    }

    private void cargarImagen() {

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vproducto.getLb_foto().getWidth(),
                        vproducto.getLb_foto().getHeight(),
                        Image.SCALE_DEFAULT
                );
                Icon ic = new ImageIcon(icono);
                vproducto.getLb_foto().setIcon(ic);
                vproducto.getLb_foto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void cargalista(String aguja) {

        vproducto.getTb_Productos().setDefaultRenderer(Object.class, new ImagenTabla());
        vproducto.getTb_Productos().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();//DefaultTableCellHeaderRenderer();

        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vproducto.getTb_Productos().getModel();
        tblmodelo.setNumRows(0);
        List<producto> lista = modelo_producto.lista_producto(aguja);
        lista.stream().forEach(p1 -> {
            int ncols = tblmodelo.getColumnCount();
            Holder<Integer> i = new Holder<>(0);
            tblmodelo.addRow(new Object[ncols]);
            tblmodelo.addRow(new Object[ncols]);
            vproducto.getTb_Productos().setValueAt(p1.getId_producto(), i.value, 0);
            vproducto.getTb_Productos().setValueAt(p1.getNombre(), i.value, 1);
            vproducto.getTb_Productos().setValueAt(p1.getId_tipo(), i.value, 2);
            vproducto.getTb_Productos().setValueAt(p1.getCantidad(), i.value, 3);
            vproducto.getTb_Productos().setValueAt(p1.getDescripcion(), i.value, 4);
            vproducto.getTb_Productos().setValueAt(p1.getPrecio(), i.value, 5);

            //completar datos
            Image img = p1.getImagen();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vproducto.getTb_Productos().setValueAt(new JLabel(icon), i.value, 7);
            } else {
                vproducto.getTb_Productos().setValueAt(null, i.value, 7);
            }
            i.value++;
            ;

        });

    }

    private void editar() {
        vproducto.getDialog_producto().setLocationRelativeTo(null);
        vproducto.setVisible(false);
        vproducto.getBtn_actualizar_d().setVisible(true);
        int ind = vproducto.getTb_Productos().getSelectedRow();
        if (ind != -1) {
            mostrardialogo();
            vproducto.getBtn_Guardar_d().setVisible(false);
            vproducto.getTxt_IdProducto().setEditable(false);
            vproducto.getTxt_tipo().setEditable(false);
            vproducto.getTb_Productos().setSize(700, 500);

            String id = vproducto.getTb_Productos().getValueAt(ind, 0).toString();
            String nombre = vproducto.getTb_Productos().getValueAt(ind, 1).toString();
            String tipo = vproducto.getTb_Productos().getValueAt(ind, 2).toString();
            int cantidad = Integer.parseInt(vproducto.getTb_Productos().getValueAt(ind, 3).toString());
            String descripcion = vproducto.getTb_Productos().getValueAt(ind, 4).toString();
            double precio = Double.valueOf(vproducto.getTb_Productos().getValueAt(ind, 5).toString());
            ImageIcon imagen = (ImageIcon) vproducto.getTb_Productos().getValueAt(ind, 6);
            vproducto.getTxt_IdProducto().setText(id);
            vproducto.getTxt_nombre().setText(nombre);
            vproducto.getTxt_tipo().setText(tipo);
            vproducto.getTxt_cantidad().setText(cantidad);
            vproducto.getTxt_descripcion().setText(descripcion);
            vproducto.getTxt_precio().setText(precio);
            vproducto.getLb_foto().setText(imagen);
            
            vproducto.getTb_Productos().setVisible(true);

        }
    }

    private void actualizarproducto() {
         String id = vproducto.getTxt_IdProducto().getText();
        String nombre = vproducto.getTxt_nombre().getText();
        String tipo = vproducto.getTxt_tipo().getText();
        int cantidad = Integer.parseInt(vproducto.getTxt_cantidad().getText());
        String descripcion = vproducto.getTxt_descripcion().getText();
        double precio = Double.valueOf(vproducto.getTxt_precio().getText());
        ImageIcon imagen = (ImageIcon) vproducto.getLb_foto().getIcon();
        modelo_producto producto = new modelo_producto();
        producto.setId_producto(id);
        producto.setNombre(nombre);
        producto.setId_tipo(tipo);
        producto.setCantidad(cantidad);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setImagen(imagen.getImage());
        if (producto.actualiza_producto(id)) {
            cargalista("");
            vproducto.getDialog_producto().setVisible(false);
            JOptionPane.showMessageDialog(vproducto, "Producto editado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vproducto, "ERROR");
        }
    }

    private void eliminarproducto() {
        int ind = vproducto.getTb_Productos().getSelectedRow();
        if (ind == -1) {
            JOptionPane.showMessageDialog(vproducto, "Seleccione una fila");
        } else {
            String id = vproducto.getTb_Productos().getValueAt(ind, 0).toString();
            modelo_producto modelo = new modelo_producto();
            modelo.setId_producto(id);
            if (modelo.eliminar_producto(id)) {
                cargalista("");
                JOptionPane.showMessageDialog(vproducto, "Producto Eliminado con Exito");
            } else {
                JOptionPane.showMessageDialog(vproducto, "FALLO AL ELIMINAR EL PRODUCTO");
            }
        }
    }

    private void abrirmesas() {
        V_mesas mesa = new V_mesas();
        mesa.setVisible(true);
        mesa.setLocationRelativeTo(null);
        vproducto.setVisible(false);

    }

    private void abrirproducto() {
        vproducto.setVisible(false);
        V_productos producto = new V_productos();
        modelo_producto prod = new modelo_producto();
        producto.setVisible(true);
        producto.setLocationRelativeTo(null);
        ControlProducto control = new ControlProducto(prod, producto);
        control.iniciacontrol();

    }

    private void abrircliente() {
        V_clientes cliente = new V_clientes();
        modelo_cliente cli = new modelo_cliente();
        ControlCliente clientes = new ControlCliente(cli, cliente);
        clientes.iniciacontrol();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        vproducto.setVisible(false);

    }

    private void abrirfactura() {

        V_mesas mesa = new V_mesas();
        mesa.getDialog_factura().setVisible(true);
        mesa.getDialog_factura().setLocationRelativeTo(null);
    }

    private void cancelacion() {
        vproducto.setVisible(false);

    }
}
