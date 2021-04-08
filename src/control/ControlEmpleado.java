/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_register;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ConexionPGA;
import modelo.modelo_empleados;
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
    private V_register vempleado;

    
   //costructor
    public ControlEmpleado(modelo_empleados mempleado, V_register vempleado) {
        this.mempleado = mempleado;
        this.vempleado = vempleado;
        vempleado.setVisible(true);
    }

   //botones
    /*public void iniciacontrol(){
    vempleado.getBtnregistro().addActionListener(l -> grabarempleado());
    }*/
    //reporte
    private void imprimereporte(){
        ConexionPGA con=new ConexionPGA(); 
       try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/vista/Reportes/Empleados.jasper"));
            JasperPrint jp= JasperFillManager.fillReport(jr, null,con.getCon());
            JasperViewer jv=new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
    private void listaempleados(){
        
    }
    /*private void grabarempleado() {
        String id_empleado=vempleado.getTxtnombreusuario().getText();
        String nombre=vempleado.getTxtnombre().getText();
        String apellido=vempleado.getTxtapellido().getText();
        String rol=(String) vempleado.getCbxrol().getSelectedItem();
        modelo_empleados modelo=new  modelo_empleados();
        modelo.setId_empleado(id_empleado);
        modelo.setNombre(nombre);
        modelo.setApellido(apellido);
        modelo.setRol(rol);
     }  */
}
