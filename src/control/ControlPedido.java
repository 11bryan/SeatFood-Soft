/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_mesas;
import Vista.V_productos;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        vpedido.getBtn_Reporte().addActionListener(l -> imprimereporte());
        vpedido.getBtn_guardar().addActionListener(l -> grabarpedido());
        vpedido.getBtn_mesas().addActionListener(l -> abrirmesas());
        vpedido.getBtn_producto().addActionListener(l -> abrirproducto());
        vpedido.getBtn_factura().addActionListener(l -> abrirfactura());
        vpedido.getBtn_cancelar().addActionListener(l->cancelacion());
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

    private void grabarpedido() {

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
        vpedido.setVisible(true);
    }
}
