/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_clientes;
import Vista.V_mesas;
import Vista.V_productos;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.Cliente;
import modelo.empleados;
import modelo.modelo_cliente;
import modelo.modelo_empleados;
import modelo.modelo_pedido;
import modelo.modelo_producto;
import modelo.pedido;
import modelo.producto;


/**
 *
 * @author USER
 */
public class ControlPedido {

    private modelo_pedido mpedido;
    private V_mesas vpedido;
    private modelo_empleados mempleado;
    private modelo_cliente mcliente;
    private static String cedula;
    private String id_empleado;
    private String id_producto;
    
    private static int contador=-1;
    

    public ControlPedido() {
        
    }

    public ControlPedido(modelo_pedido mpedido, V_mesas vpedido, modelo_empleados mempleado, modelo_cliente mcliente) {
        this.mpedido = mpedido;
        this.vpedido = vpedido;
        this.mempleado = mempleado;
        this.mcliente = mcliente;
        
        vpedido.getTxt_consumidor().setEditable(false);
        vpedido.getTxt_empledo().setEditable(false);
        
    }
    public void iniciacontrol(){
        cargaclientes("");
        cargaempleados("");
        cargaproducto("");
//        vpedido.getBtn_n1().addActionListener(l -> pedido1());
//        vpedido.getBtn_n2().addActionListener(l -> pedido1());
//        vpedido.getBtn_n3().addActionListener(l -> pedido1());
//        vpedido.getBtn_n4().addActionListener(l -> pedido1());
//        vpedido.getBtn_n5().addActionListener(l -> pedido1());
//        vpedido.getBtn_n6().addActionListener(l -> pedido1());
        vpedido.getBtn_cerrar().addActionListener(l ->cerrar());
        vpedido.getBtn_generar().addActionListener(l ->grabarpedido());
        vpedido.getBtn_factura().addActionListener(l ->mostrarfactura());
        vpedido.getBtn_cancelar_d2().addActionListener(l ->Cancelar());
        
        MouseListener mo=new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                cargar();
                cargar1();
                cargar2();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        
        
        vpedido.getTb_clientes().addMouseListener(mo);
        vpedido.getTb_empleados().addMouseListener(mo);
        vpedido.getTb_productos().addMouseListener(mo);
    }
    
    private void mostrarfactura() {
        vpedido.setVisible(false);
        vpedido.getDialog_factura().setLocationRelativeTo(null);
        vpedido.getDialog_factura().setVisible(true);
        vpedido.getDialog_factura().setSize(420, 430);
        vpedido.getDialog_factura().setTitle("CLIENTE");
        vpedido.getTxt_cedulafactura().setEditable(false);
         modelo_pedido mp=new modelo_pedido(vpedido.getTxt_idpedido().getText(), 
                vpedido.getTxt_empledo().getText(), 
                ids, vpedido.getTxt_consumidor().getText());
         
         Calendar cal = new GregorianCalendar();
        int mesA = cal.get(Calendar.MONTH);
        int anioA = cal.get(Calendar.YEAR);
        int diaA = cal.get(Calendar.DAY_OF_MONTH);
        vpedido.getTxt_fecha().setText(anioA+"-"+mesA+"-"+diaA);

         vpedido.getTxt_cedulafactura().setText(mp.getCedula());
    }
    
    private void cargaclientes(String aguja) {
     
        DefaultTableModel tblmodelo  ;
        tblmodelo = (DefaultTableModel) vpedido.getTb_clientes().getModel();
        tblmodelo.setNumRows(0);

        List<Cliente> listac = modelo_cliente.lista_cliente(aguja);
        int ncols = tblmodelo.getColumnCount();
            Holder<Integer> i = new Holder<>(0);
        
            listac.stream().forEach(p1 -> {
            tblmodelo.addRow(new Object[ncols]);
            
            vpedido.getTb_clientes().setValueAt(p1.getCedula(), i.value, 0);
            vpedido.getTb_clientes().setValueAt(p1.getNombre(), i.value, 1);
            vpedido.getTb_clientes().setValueAt(p1.getApellido(), i.value, 2);
            //vpedido.getTb_clientes().setValueAt(p1.getDireccion(), i.value, 3);
            //vpedido.getTb_clientes().setValueAt(p1.getTelefono(), i.value, 4);
            i.value++;
            ;

        });
    }
     
    private void cargaempleados(String aguja) {

        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vpedido.getTb_empleados().getModel();
        tblmodelo.setNumRows(0);

        List<empleados> listac = modelo_empleados.lista_empleados(aguja);
        int ncols = tblmodelo.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        listac.stream().forEach(p1 -> {
            tblmodelo.addRow(new Object[ncols]);
            vpedido.getTb_empleados().setValueAt(p1.getId_empleado(), i.value, 0);
            vpedido.getTb_empleados().setValueAt(p1.getNombre(), i.value, 1);
            vpedido.getTb_empleados().setValueAt(p1.getApellido(), i.value, 2);
            //vpedido.getTb_empleados().setValueAt(p1.getRol(), i.value, 3);
            i.value++;
            ;

        });
    }
             
    public void cargaproducto(String aguja) {
        
        DefaultTableModel tblmodelo;
        tblmodelo = (DefaultTableModel) vpedido.getTb_productos().getModel();
        tblmodelo.setNumRows(0);
        List<producto> lista = modelo_producto.lista_producto(aguja);
        
        int ncols = tblmodelo.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1 -> {
            tblmodelo.addRow(new Object[ncols]);
            vpedido.getTb_productos().setValueAt(p1.getId_producto(), i.value, 0);
            vpedido.getTb_productos().setValueAt(p1.getNombre(), i.value, 1);
            //vpedido.getTb_productos().setValueAt(p1.getTipo(), i.value, 2);
           // vpedido.getTb_productos().setValueAt(p1.getCantidad(), i.value, 3);
           // vpedido.getTb_productos().setValueAt(p1.getDescripcion(), i.value, 4);
            vpedido.getTb_productos().setValueAt(p1.getPrecio(), i.value, 2);
            //completar datos
            
            i.value++;
            ;

        });

    }
    
    public void cargar(){
        
        int ind = vpedido.getTb_clientes().getSelectedRow();
        if (ind >-1) {
            vpedido.getTxt_consumidor().setText(vpedido.getTb_clientes().getValueAt(ind, 0).toString()
            );
            
        }
        
    }
    public void cargar1(){
        
        int ind2 = vpedido.getTb_empleados().getSelectedRow();
        if (ind2 >-1) {
            vpedido.getTxt_empledo().setText(vpedido.getTb_empleados().getValueAt(ind2, 0).toString()
            );
            
        }
    }
    String ids="";
    
    public void cargar2(){
        
        int ind2 = vpedido.getTb_productos().getSelectedRow();
        Holder<Integer> i = new Holder<>(0);
        if (ind2 >-1) {
            contador++;
            String id=vpedido.getTb_productos().getValueAt(ind2, 0).toString();
            ids=ids+" "+id;
            String nombre=vpedido.getTb_productos().getValueAt(ind2, 1).toString();
            String precio=vpedido.getTb_productos().getValueAt(ind2, 2).toString();
            vpedido.getTb_pedido().setValueAt(id, contador, 0);
            vpedido.getTb_pedido().setValueAt(nombre, contador, 1);
            vpedido.getTb_pedido().setValueAt(precio, contador, 2);
            
        }
        
    }
    
    public void grabarpedido(){
        modelo_pedido mp=new modelo_pedido(vpedido.getTxt_idpedido().getText(), 
                vpedido.getTxt_empledo().getText(), 
                ids, vpedido.getTxt_consumidor().getText());
       
        if (mp.grabarPedido()) {
            JOptionPane.showMessageDialog(vpedido, "Pedido grabado satisfactoriaamente");
            ids="";
        } else {
            JOptionPane.showMessageDialog(vpedido, "ERROR");
        }
    }
    
    
    void cerrar(){
        vpedido.dispose();
    }

    
    void Cancelar(){
        vpedido.getDialog_factura().setVisible(false);
        vpedido.setVisible(true);
    }

}
