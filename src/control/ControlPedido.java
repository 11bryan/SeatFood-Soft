/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_mesas;
import Vista.V_productos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConexionPGA;
import modelo.modelo_cliente;
import modelo.modelo_entrega;
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
public class ControlPedido {

    private modelo_pedido mpedido;
    private V_mesas vpedido;

    public ControlPedido() {
    }

    public ControlPedido(modelo_pedido mpedido, V_mesas vpedido) {
        this.mpedido = mpedido;
        this.vpedido = vpedido;
        vpedido.setVisible(true);
        vpedido.setLocationRelativeTo(null);
    }

    public void iniciacontrol() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        vpedido.getBtn_Reporte().addActionListener(l -> imprimereporte());
        vpedido.getBtn_guardar().addActionListener(l -> grabarpedido());
        vpedido.getBtn_mesas().addActionListener(l -> abrirmesas());
        vpedido.getBtn_producto().addActionListener(l -> abrirproducto());
        vpedido.getBtn_factura().addActionListener(l -> abrirfactura());
        vpedido.getBtn_cancelar().addActionListener(l -> cancelacion());
        vpedido.getBtn_cliente().addActionListener(l -> abrircliente());
        vpedido.getBtn_n1().addActionListener(l -> pedido1());
        vpedido.getBtn_n2().addActionListener(l -> pedido1());
        vpedido.getBtn_n3().addActionListener(l -> pedido1());
        vpedido.getBtn_n4().addActionListener(l -> pedido1());
        vpedido.getBtn_n5().addActionListener(l -> pedido1());
        vpedido.getBtn_n6().addActionListener(l -> pedido1());
        vpedido.getBtn_n7().addActionListener(l -> pedido1());
        vpedido.getBtn_n8().addActionListener(l -> pedido1());
        vpedido.getBtn_n9().addActionListener(l -> pedido1());
        vpedido.getBtn_n10().addActionListener(l -> pedido1());
        vpedido.getBtn_n11().addActionListener(l -> pedido1());
        vpedido.getBtn_n12().addActionListener(l -> pedido1());
        vpedido.getCb_Entrega().addActionListener(l -> entrega());
        vpedido.getBtn_factura().addActionListener(l->facturapedido());

    }

    private void productos() {
        ControlProducto prod = new ControlProducto();

    }

    private void imprimereporte() {
        ConexionPGA con = new ConexionPGA();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Pedidos.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public int id_incrementable(){
         int id=1;
         PreparedStatement ps=null;
          ResultSet rs=null;
          ConexionPGA con =new ConexionPGA();
           try {
            ps=con.getCon().prepareStatement("SELECT MAX(id_pedido) from pedido");
           rs=ps.executeQuery();
            
       
            while (rs.next()) {
                id=rs.getInt(1)+1;  
            }
            
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelo_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
      }
    private void grabarpedido() {
   /*  String id = vpedido.gett
       
        id_pedido, id_empleado, id_producto, id_entrega, cedula, p_adicinal
        modelo_entrega entrega = new modelo_entrega(cedula, nombre, apellido, rol);

        if (entrega.) {
            cargalista("");
            vpedido.getDialog_mesas().setVisible(false);
            JOptionPane.showMessageDialog(vpedido, "Pedido grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vpedido, "ERROR");
        }*/

    }
    

    private void facturapedido() {
        V_mesas abremesa = new V_mesas();
        abremesa.getDialog_factura().setVisible(true);
        abremesa.getDialog_factura().setSize(350, 500);
        abremesa.getDialog_factura().setLocationRelativeTo(null);
        

    }

    private void entrega() {
        if (vpedido.getCb_Entrega().isSelected()) {
            modelo_entrega en = new modelo_entrega();
            V_mesas men = new V_mesas();
            ControlEntrega entrega = new ControlEntrega(en, men);
        } else {
            vpedido.getDialog_factura().setVisible(true);
        }
    }

    private void pedido1() {
        V_mesas abremesa = new V_mesas();
        abremesa.getDialog_mesas().setVisible(true);
        abremesa.getDialog_mesas().setSize(350, 500);
        abremesa.getDialog_mesas().setLocationRelativeTo(null);
        vpedido.setVisible(false);

    }

    private void abrirproducto() {
        V_productos producto = new V_productos();
        modelo_producto prod = new modelo_producto();
        producto.setVisible(true);
        ControlProducto control = new ControlProducto(prod, producto);
        control.iniciacontrol();
        vpedido.setVisible(false);
    }

    private void abrircliente() {
        V_clientes cliente = new V_clientes();
        modelo_cliente cli = new modelo_cliente();
        ControlCliente clientes = new ControlCliente(cli, cliente);
        clientes.iniciacontrol();
        cliente.setVisible(true);
        vpedido.setVisible(false);
    }

    private void abrirmesas() {
        V_mesas mesa = new V_mesas();
        modelo_pedido ped = new modelo_pedido();
        ControlPedido pedido = new ControlPedido(ped, mesa);
        pedido.iniciacontrol();
        mesa.setVisible(true);
        mesa.setLocationRelativeTo(null);
        vpedido.setVisible(false);

    }

    private void abrirfactura() {
        V_mesas mesa = new V_mesas();
        mesa.getDialog_factura().setVisible(true);

    }

    private void cancelacion() {
        V_mesas mesa = new V_mesas();
        modelo_pedido ped = new modelo_pedido();
        ControlPedido pedido = new ControlPedido(ped, mesa);
        pedido.iniciacontrol();
        mesa.setVisible(true);
        mesa.setLocationRelativeTo(null);
        vpedido.setVisible(false);
    }
}
