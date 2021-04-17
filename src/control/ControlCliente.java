/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_mesas;
import Vista.V_productos;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.Cliente;
import modelo.ConexionPGA;
import modelo.modelo_cliente;
import modelo.modelo_pedido;
import modelo.modelo_producto;
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
public class ControlCliente {

    private modelo_cliente mcliente;
    private V_clientes vcliente;

    public ControlCliente() {
    }

    public ControlCliente(modelo_cliente mcliente, V_clientes vcliente) {
        this.mcliente = mcliente;
        this.vcliente = vcliente;
        vcliente.setVisible(true);
        vcliente.setLocationRelativeTo(null);
    }

    public void iniciacontrol() {
        vcliente.getBtn_Reporte().addActionListener(l -> imprimereporte());
       vcliente.getBtn_Actualizar().addActionListener(l->cargalista(""));
        vcliente.getBtn_Nuevo().addActionListener(l -> mostrardialogo());
        vcliente.getBtn_Guardar().addActionListener(l -> grabar());
        vcliente.getBtn_Editar().addActionListener(l -> editar());
        vcliente.getBtn_Eliminar().addActionListener(l -> eliminar());
        vcliente.getBtn_Mesas().addActionListener(l -> abrirmesas());
        vcliente.getBtn_Producto().addActionListener(l -> abrirproducto());
        vcliente.getBtn_factura().addActionListener(l -> abrirfactura());
        vcliente.getBtn_Cancelar().addActionListener(l -> cancelacion());
        vcliente.getBtn_Actualizar_diag().addActionListener(l -> actualizarcliente());
    }

    private void imprimereporte() {
        ConexionPGA con = new ConexionPGA();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Clientes.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrardialogo() {
        vcliente.getBtn_Actualizar_diag().setVisible(false);
        vcliente.getDlg_clientes().setSize(320, 450);
        vcliente.getDlg_clientes().setTitle("CLIENTE");
        vcliente.getDlg_clientes().setLocationRelativeTo(null);
        vcliente.setVisible(false);
        vcliente.getDlg_clientes().setLocationRelativeTo(vcliente);
        vcliente.getTxt_idUser().setText("");
        vcliente.getTxt_Nombre().setText("");
        vcliente.getTxt_apellido().setText("");
        vcliente.getTxt_direccion().setText("");
        vcliente.getTxt_telefono().setText("");
        vcliente.getDlg_clientes().setVisible(true);

    }

    private void grabar() {
        
        String cedula = vcliente.getTxt_idUser().getText();
        String nombre = vcliente.getTxt_Nombre().getText();
        String apellido = vcliente.getTxt_apellido().getText();
        String direccion = vcliente.getTxt_direccion().getText();
        String telefono = vcliente.getTxt_telefono().getText();
        modelo_cliente cliente = new modelo_cliente(cedula, nombre, apellido, direccion, telefono);

        if (cliente.grabarCliente()) {
            cargalista("");
            vcliente.getDlg_clientes().setVisible(false);
            JOptionPane.showMessageDialog(vcliente, "Cliente grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vcliente, "ERROR");
        }

    }

    private void cargalista(String aguja) {
     
        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vcliente.getTb_Clientes().getModel();
        tblmodelo.setNumRows(0);

        List<Cliente> listac = modelo_cliente.lista_cliente(aguja);
        listac.stream().forEach(p1 -> {
            int ncols = tblmodelo.getColumnCount();
            Holder<Integer> i = new Holder<>(0);
            String[] Cliente = {p1.getCedula(), p1.getNombre(), p1.getApellido(), p1.getDireccion(), p1.getTelefono()};
            tblmodelo.addRow(Cliente);
            tblmodelo.addRow(new Object[ncols]);
            vcliente.getTb_Clientes().setValueAt(p1.getCedula(), i.value, 0);
            vcliente.getTb_Clientes().setValueAt(p1.getNombre(), i.value, 1);
            vcliente.getTb_Clientes().setValueAt(p1.getApellido(), i.value, 2);
            vcliente.getTb_Clientes().setValueAt(p1.getDireccion(), i.value, 3);
            vcliente.getTb_Clientes().setValueAt(p1.getTelefono(), i.value, 4);
            //completar datos

            i.value++;
            ;

        });
    }

    private void editar() {
        vcliente.getDlg_clientes().setLocationRelativeTo(null);
        vcliente.setVisible(false);
        vcliente.getBtn_Actualizar_diag().setVisible(true);
        int ind = vcliente.getTb_Clientes().getSelectedRow();
        if (ind != -1) {
            mostrardialogo();
            vcliente.getBtn_Guardar().setVisible(false);
            vcliente.getTxt_idUser().setEditable(false);
            vcliente.getTb_Clientes().setSize(700, 500);

            String cedula = vcliente.getTb_Clientes().getValueAt(ind, 0).toString();
            String nombre = vcliente.getTb_Clientes().getValueAt(ind, 1).toString();
            String apeliido = vcliente.getTb_Clientes().getValueAt(ind, 2).toString();
            String direccion = vcliente.getTb_Clientes().getValueAt(ind, 3).toString();
            String telefono = vcliente.getTb_Clientes().getValueAt(ind, 4).toString();

            vcliente.getTxt_idUser().setText(cedula);
            vcliente.getTxt_Nombre().setText(nombre);
            vcliente.getTxt_apellido().setText(apeliido);
            vcliente.getTxt_direccion().setText(direccion);
            vcliente.getTxt_telefono().setText(telefono);
            vcliente.getTb_Clientes().setVisible(true);

        }
    }

    private void eliminar() {
        int ind = vcliente.getTb_Clientes().getSelectedRow();
        if (ind == -1) {
            JOptionPane.showMessageDialog(vcliente, "Seleccione una fila");
        } else {
            String cedula = vcliente.getTb_Clientes().getValueAt(ind, 0).toString();
            modelo_cliente modelo = new modelo_cliente();
            modelo.setCedula(cedula);
            if (modelo.elimina(cedula)) {
                cargalista("");
                JOptionPane.showMessageDialog(vcliente, "Usuario Eliminado con Exito");
            } else {
                JOptionPane.showMessageDialog(vcliente, "FALLO AL ELIMINAR EL REGISTROS");
            }
        }
    }

  

    private void actualizarcliente() {
        String cedula = vcliente.getTxt_idUser().getText();
        String nombre = vcliente.getTxt_Nombre().getText();
        String apellido = vcliente.getTxt_apellido().getText();
        String telefono = vcliente.getTxt_telefono().getText();
        String direccion = vcliente.getTxt_direccion().getText();
        modelo_cliente cliente = new modelo_cliente(cedula, nombre, apellido, direccion, telefono);
        if (cliente.actualiza(cedula)) {
            cargalista("");
            vcliente.getDlg_clientes().setVisible(false);
            JOptionPane.showMessageDialog(vcliente, "Cliente editado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vcliente, "ERROR");
        }
    }
  private void abrircliente() {
        V_clientes cliente = new V_clientes();
        cliente.setVisible(true);
        // vmesas.setVisible(false);
    }
    private void abrirmesas() {
        V_mesas mesa = new V_mesas();
        mesa.setVisible(true);
        modelo_pedido ped=new modelo_pedido();
        ControlPedido pedido = new ControlPedido(ped,mesa);
        pedido.iniciacontrol();

    }

    private void abrirproducto() {
        V_productos producto = new V_productos();
        modelo_producto prod=new modelo_producto();
        producto.setVisible(true);
        ControlProducto control=new ControlProducto(prod,producto);
        control.iniciacontrol();
        vcliente.setVisible(false);
    }

    private void abrirfactura() {
        V_mesas mesa = new V_mesas();
        mesa.getDialog_factura().setVisible(true);

    }

    private void cancelacion() {
        vcliente.setVisible(true);
    }
}
