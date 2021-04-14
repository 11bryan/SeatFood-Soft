/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.V_empleados;
import Vista.V_register;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConexionPGA;
import modelo.empleados;
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
     private V_empleados empleado;

    
   //costructor
    public ControlEmpleado(modelo_empleados mempleado, V_register vempleado) {
        this.mempleado = mempleado;
        this.vempleado = vempleado;
        vempleado.setVisible(true);
    }

   //botones
    public void iniciacontrol(){
    vempleado.getBtn_Registrarse().addActionListener(l -> listaempleados());
     empleado.getBtn_Actualizar().addActionListener(l->cargaLista(" "));
    empleado.getBtn_Reporte().addActionListener(l->imprimereporte());
    }
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
    
   ///guardar     
    
     private void grabarempleado() {
      String id_empleado=vempleado.getTxt_NombreUsuario().getText();
      String nombre=vempleado.getTxt_Nombre().getText();
      String apellido=vempleado.getTxt_Apellido().getText();
      String rol=(String) vempleado.getCb_Rol().getSelectedItem();
      modelo_empleados modelo=new  modelo_empleados();
      modelo.setId_empleado(id_empleado);
      modelo.setNombre(nombre);
      modelo.setApellido(apellido);
      modelo.setRol(rol);
     }  
     
     private void cargaLista(String aguja) {
         List<empleados> lista =modelo_empleados.lista_empleados(aguja);
           String matris[][] = new String[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getId_empleado();
            matris[i][1] = lista.get(i).getNombre();
            matris[i][2] = lista.get(i).getApellido();
            matris[i][3] = lista.get(i).getRol();
           
        }
        empleado.getTb_Empleados().setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Id_empleado", "Nombre", "Apellido", "Rol"
                        
                }
        ));
     }
          public void EliminarPersona() {
        int ind = empleado.getTb_Empleados().getSelectedRow();
        if (ind == -1) {
            JOptionPane.showMessageDialog(empleado, "Seleccione una fila");
        } else {
            String id_empleado = empleado.getTb_Empleados().getValueAt(ind, 0).toString();
            modelo_empleados modelo = new modelo_empleados();
            modelo.setId_empleado(id_empleado);
            if (modelo.eliminar_empleado(id_empleado)) {
                //cargaLista();
                JOptionPane.showMessageDialog(empleado, "Usuario Eliminado con Exito");
            } else {
                JOptionPane.showMessageDialog(empleado, "FALLO AL ELIMINAR EL REGISTRO");
            }
        }
          }
}

