/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_empleados;
import Vista.V_mesas;
import Vista.V_productos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.ConexionPGA;
import modelo.empleados;
import modelo.modelo_cliente;
import modelo.modelo_empleados;
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
public class ControlEmpleado {

    private modelo_empleados mempleado;
    private V_empleados vempleado;

    public ControlEmpleado() {
    }

    public ControlEmpleado(modelo_empleados mempleado, V_empleados vempleado) {
        this.mempleado = mempleado;
        this.vempleado = vempleado;
        vempleado.setVisible(true);
        vempleado.setLocationRelativeTo(null);
    }

    public void iniciacontrol() {
        vempleado.getBtn_cerrar().addActionListener(l->salir());
        vempleado.getBtn_Reporte().addActionListener(l -> imprimereporte());
        vempleado.getBtn_Actualizar().addActionListener(l -> cargalista(""));
        vempleado.getBtn_Nuevo().addActionListener(l -> mostrardialogo());
       vempleado.getBtn_Guardar().addActionListener(l -> grabar());
        vempleado.getBtn_Editar().addActionListener(l -> editar());
        vempleado.getBtn_Eliminar().addActionListener(l -> eliminar());
        vempleado.getBtn_Mesas().addActionListener(l -> abrirmesas());
        vempleado.getBtn_Productos().addActionListener(l -> abrirproducto());
        vempleado.getBtn_Facturas().addActionListener(l -> abrirfactura());
        vempleado.getBtn_Cancelar().addActionListener(l -> cancelacion());
        vempleado.getBtn_Clientes().addActionListener(l -> abrircliente());
        vempleado.getBnt_Actualizar_regis().addActionListener(l -> actualizarpersona());
    }

    private void imprimereporte() {
        ConexionPGA con = new ConexionPGA();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Empleados.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrardialogo() {
        vempleado.getBnt_Actualizar_regis().setVisible(false);
        vempleado.getDlg_Register().setLocationRelativeTo(null);
        vempleado.setVisible(false);
        vempleado.getDlg_Register().setSize(320, 550);
        vempleado.getDlg_Register().setTitle("EMPLEADO");
        vempleado.getDlg_Register().setLocationRelativeTo(vempleado);
        vempleado.getTxt_iduser().setText("");
        vempleado.getTxt_nombreemp().setText("");
        vempleado.getTxt_apellidosemp().setText("");
        vempleado.getCb_rolemp().setSelectedItem("");
        vempleado.getDlg_Register().setVisible(true);

    }
public int id_incrementable(){
          int id=1;
          
         PreparedStatement ps=null;
         ResultSet rs=null;
          ConexionPGA con =new ConexionPGA();
           try {
               ps=con.getCon().prepareStatement("SELECT MAX(id_empleado) from empleado");
               rs=ps.executeQuery();
            while (rs.next()) {
                id=rs.getInt(1)+1;
            }
            
        } catch (SQLException ex) {
               System.out.println("Error"+ex.getMessage());
               } finally{
               try{
                  ps.close();
                  rs.close();
               }catch(Exception ex){
                   
               }
           }
        return id;
      
     
    }
    private void grabar() {

        String cedula = vempleado.getTxt_iduser().getText();
        String nombre = vempleado.getTxt_nombreemp().getText();
        String apellido = vempleado.getTxt_apellidosemp().getText();
        String rol = (String) vempleado.getCb_rolemp().getSelectedItem();

        modelo_empleados empleado = new modelo_empleados(cedula, nombre, apellido, rol);

        if (empleado.grabar_empleados()) {
            cargalista("");
            vempleado.getDlg_Register().setVisible(false);
            vempleado.setVisible(true);
            JOptionPane.showMessageDialog(vempleado, "Empleado grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vempleado, "ERROR");
        }

    }
  
    private void cargalista(String aguja) {

        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vempleado.getTb_Empleados().getModel();
        tblmodelo.setNumRows(0);

        List<empleados> listac = modelo_empleados.lista_empleados(aguja);
        int ncols = tblmodelo.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        listac.stream().forEach(p1 -> {
            tblmodelo.addRow(new Object[ncols]);
            vempleado.getTb_Empleados().setValueAt(p1.getId_empleado(), i.value, 0);
            vempleado.getTb_Empleados().setValueAt(p1.getNombre(), i.value, 1);
            vempleado.getTb_Empleados().setValueAt(p1.getApellido(), i.value, 2);
            vempleado.getTb_Empleados().setValueAt(p1.getRol(), i.value, 3);

            i.value++;
            ;

        });
    }

    private void editar() {
        vempleado.getDlg_Register().setLocationRelativeTo(null);

        int ind = vempleado.getTb_Empleados().getSelectedRow();
        if (ind != -1) {
            mostrardialogo();
            vempleado.getBtn_Guardar().setVisible(false);
            vempleado.getBnt_Actualizar_regis().setVisible(true);
            vempleado.getTxt_iduser().setEditable(false);
            vempleado.getTb_Empleados().setSize(700, 500);

            String cedula = vempleado.getTb_Empleados().getValueAt(ind, 0).toString();
            String nombre = vempleado.getTb_Empleados().getValueAt(ind, 1).toString();
            String apeliido = vempleado.getTb_Empleados().getValueAt(ind, 2).toString();
            String rol = vempleado.getTb_Empleados().getValueAt(ind, 3).toString();

            vempleado.getTxt_iduser().setText(cedula);
            vempleado.getTxt_nombreemp().setText(nombre);
            vempleado.getTxt_apellidosemp().setText(apeliido);
            vempleado.getCb_rolemp().setSelectedItem(rol);
            vempleado.getTb_Empleados().setVisible(true);

        }
    }

    private void eliminar() {
        int ind = vempleado.getTb_Empleados().getSelectedRow();
        if (ind == -1) {
            JOptionPane.showMessageDialog(vempleado, "Seleccione una fila");
        } else {
            String cedula = vempleado.getTb_Empleados().getValueAt(ind, 0).toString();
            modelo_empleados modeloe = new modelo_empleados();
            modeloe.setId_empleado(cedula);
            if (modeloe.eliminar_empleado(cedula)) {
                cargalista("");
                JOptionPane.showMessageDialog(vempleado, "Empleado Eliminado con Exito");
            } else {
                JOptionPane.showMessageDialog(vempleado, "FALLO AL ELIMINAR EL REGISTRO");
            }
        }
    }

    private void actualizarpersona() {
        vempleado.setVisible(true);
        String cedula = vempleado.getTxt_iduser().getText();
        String nombre = vempleado.getTxt_nombreemp().getText();
        String apellido = vempleado.getTxt_apellidosemp().getText();
        String rol = (String) vempleado.getCb_rolemp().getSelectedItem();
        modelo_empleados empleados = new modelo_empleados(cedula, nombre, apellido, rol);
        if (empleados.actualiza_empleado(cedula)) {
            cargalista("");
            vempleado.getDlg_Register().setVisible(false);
            JOptionPane.showMessageDialog(vempleado, "Empleado editado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vempleado, "ERROR");
        }
    }

    private void abrirmesas() {
        V_mesas mesa = new V_mesas();
        mesa.setVisible(true);
        modelo_pedido ped=new modelo_pedido();
        modelo_empleados em=new modelo_empleados();
        modelo_cliente cl=new modelo_cliente();
        ControlPedido pedido = new ControlPedido(ped,mesa,em,cl);
        pedido.iniciacontrol();
        mesa.setLocationRelativeTo(null);
        vempleado.setVisible(false);

    }

    private void abrirproducto() {

        vempleado.setVisible(false);
        V_productos producto = new V_productos();
        modelo_producto prod = new modelo_producto();
        producto.setVisible(true);
        ControlProducto control = new ControlProducto(prod, producto);
        control.iniciacontrol();
        vempleado.setVisible(false);
    }

    private void abrircliente() {
        V_clientes cliente = new V_clientes();
        modelo_cliente cli = new modelo_cliente();
        ControlCliente clientes = new ControlCliente(cli, cliente);
        clientes.iniciacontrol();
        cliente.setVisible(true);
        vempleado.setVisible(false);
    }

    private void abrirfactura() {
        V_mesas mesa = new V_mesas();
        mesa.getDialog_factura().setVisible(true);

    }

    private void cancelacion() {
        vempleado.setVisible(true);
        vempleado.getDlg_Register().setVisible(false);
    }
    private void salir(){
   vempleado.dispose();   
  }
}
