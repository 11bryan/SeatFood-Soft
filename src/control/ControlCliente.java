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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.Cliente;
import modelo.ConexionPGA;
import modelo.modelo_cliente;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sun.swing.table.DefaultTableCellHeaderRenderer;


/**
 *
 * @author USER
 */
public class ControlCliente {
  private modelo_cliente mcliente;
    private V_clientes vclientes;

    public ControlCliente(modelo_cliente mcliente, V_clientes vclientes) {
        this.mcliente = mcliente;
        this.vclientes = vclientes;
        vclientes.setVisible(true);
    }

    public void iniciacontrol() {
        vclientes.getBtn_Reporte().addActionListener(l -> imprimereporte());
        vclientes.getBtn_Actualizar().addActionListener(l -> cargalista(""));
        vclientes.getBtn_Nuevo().addActionListener(l -> mostrardialogo());
        vclientes.getBtn_Editar().addActionListener(l -> editar());
        vclientes.getBtn_Eliminar().addActionListener(l -> eliminar());
        vclientes.getBtn_Mesas().addActionListener(l -> abrirmesas());
        vclientes.getBtn_Producto().addActionListener(l -> abrirproducto());
        vclientes.getBtn_factura().addActionListener(l -> abrirfactura());
        vclientes.getBtn_Guardar().addActionListener(l -> grabar());
        vclientes.getBtn_Cancelar().addActionListener(l -> cancelacion());
        //vclientes.getBtn_actualizardatos().addActionListener(l -> actualizarpersona());

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

    private void cargalista(String aguja) {
        mcliente.actualiza(aguja);
        vclientes.getTb_Clientes().setDefaultRenderer(Object.class, new ImagenTabla());
        vclientes.getTb_Clientes().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();
        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vclientes.getTb_Clientes().getModel();
        tblmodelo.setNumRows(0);

        List<Cliente> listac = modelo_cliente.lista_cliente(aguja);
        listac.stream().forEach(p1 -> {
            int ncols = tblmodelo.getColumnCount();
            Holder<Integer> i = new Holder<>(0);
            String[] Cliente = {p1.getCedula(), p1.getNombre(), p1.getApellido(), p1.getDireccion(), p1.getTelefono()};
            tblmodelo.addRow(Cliente);
            tblmodelo.addRow(new Object[ncols]);
            vclientes.getTb_Clientes().setValueAt(p1.getCedula(), i.value, 0);
            vclientes.getTb_Clientes().setValueAt(p1.getNombre(), i.value, 1);
            vclientes.getTb_Clientes().setValueAt(p1.getApellido(), i.value, 2);
            vclientes.getTb_Clientes().setValueAt(p1.getDireccion(), i.value, 3);
            vclientes.getTb_Clientes().setValueAt(p1.getTelefono(), i.value, 4);
            //completar datos

            i.value++;
            ;

        });
    }

    private void mostrardialogo() {
        vclientes.getjDialog1().setSize(320, 450);
        vclientes.getjDialog1().setTitle("CLIENTE");
        vclientes.getjDialog1().setLocationRelativeTo(vclientes);
        vclientes.getTxt_idUser().setText("");
        vclientes.getTxt_Nombre().setText("");
        vclientes.getTxt_apellido().setText("");
        vclientes.getTxt_direccion().setText("");
        vclientes.getTxt_telefono().setText("");
        vclientes.getjDialog1().setVisible(true);

    }

    private void grabar() {
        String cedula = vclientes.getTxt_idUser().getText();
        String nombre = vclientes.getTxt_Nombre().getText();
        String apellido = vclientes.getTxt_apellido().getText();
        String direccion = vclientes.getTxt_direccion().getText();
        String telefono = vclientes.getTxt_telefono().getText();
        modelo_cliente cliente = new modelo_cliente(cedula, nombre, apellido, direccion, telefono);

        if (cliente.grabarCliente()) {
            cargalista("");
            vclientes.getjDialog1().setVisible(false);
            JOptionPane.showMessageDialog(vclientes, "Cliente grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vclientes, "ERROR");
        }

    }

    private void editar() {
        int ind = vclientes.getTb_Clientes().getSelectedRow();
        if (ind != -1) {
            mostrardialogo();
            vclientes.getBtn_Guardar().setVisible(false);
            vclientes.getTxt_idUser().setEditable(false);
            vclientes.getTb_Clientes().setSize(700, 500);

            String cedula = vclientes.getTb_Clientes().getValueAt(ind, 0).toString();
            String nombre = vclientes.getTb_Clientes().getValueAt(ind, 1).toString();
            String apeliido = vclientes.getTb_Clientes().getValueAt(ind, 2).toString();
            String direccion = vclientes.getTb_Clientes().getValueAt(ind, 3).toString();
            String telefono = vclientes.getTb_Clientes().getValueAt(ind, 4).toString();

            vclientes.getTxt_idUser().setText(cedula);
            vclientes.getTxt_Nombre().setText(nombre);
            vclientes.getTxt_apellido().setText(apeliido);
            vclientes.getTxt_direccion().setText(direccion);
            vclientes.getTxt_telefono().setText(telefono);
            vclientes.getTb_Clientes().setVisible(true);

        }
    }

    private void eliminar() {
        int ind = vclientes.getTb_Clientes().getSelectedRow();
        if (ind == -1) {
            JOptionPane.showMessageDialog(vclientes, "Seleccione una fila");
        } else {
            String cedula = vclientes.getTb_Clientes().getValueAt(ind, 0).toString();
            modelo_cliente modelo = new modelo_cliente();
            modelo.setCedula(cedula);
            if (modelo.elimina(cedula)) {
                //cargaLista();
                JOptionPane.showMessageDialog(vclientes, "Usuario Eliminado con Exito");
            } else {
                JOptionPane.showMessageDialog(vclientes, "FALLO AL ELIMINAR EL REGISTROS");
            }
        }
    }

    private void abrircliente() {
        V_clientes cliente = new V_clientes();
        cliente.setVisible(true);
        // vmesas.setVisible(false);
    }

    private void actualizarpersona() {
        String cedula = vclientes.getTxt_idUser().getText();
        String nombre = vclientes.getTxt_Nombre().getText();
        String apellido = vclientes.getTxt_apellido().getText();
        String telefono = vclientes.getTxt_telefono().getText();
        String direccion = vclientes.getTxt_direccion().getText();
         modelo_cliente cliente = new modelo_cliente(cedula, nombre, apellido, direccion, telefono);
         if (cliente.actualiza(cedula)) {
            cargalista("");
            vclientes.getjDialog1().setVisible(false);
            JOptionPane.showMessageDialog(vclientes, "Cliente editado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vclientes, "ERROR");
        }
    }

    private void abrirmesas() {
        V_mesas mesa = new V_mesas();
        mesa.setVisible(true);

    }

    private void abrirproducto() {
        V_productos producto = new V_productos();
        producto.setVisible(true);
        // vmesas.setVisible(false);
    }

    private void abrirfactura() {
        V_productos producto = new V_productos();
        producto.setVisible(true);
        // vmesas.setVisible(false);
    }

    private void cancelacion() {
        vclientes.setVisible(true);
    }


}
