/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import vista.V_loggins;
//import vista.V_mesas;
import Vista.V_empleados;
import Vista.V_loggins;
import javax.swing.JOptionPane;
import modelo.modelo_empleados;

/**
 *
 * @author USER
 */
public class ControlLoggin {
    private V_loggins vlo;

    public ControlLoggin(V_loggins vlo) {
        this.vlo = vlo;
        vlo.setVisible(true);
        vlo.setLocationRelativeTo(null);
    }
    
   public void iniciocontrol(){
   vlo.getBtn_Iniciar().addActionListener(l -> seccion());
   } 
 
  public void iniciar(){
      V_empleados empleados=new V_empleados();
     modelo_empleados empl=new modelo_empleados();
     ControlEmpleado em=new ControlEmpleado(empl,empleados);
     em.iniciacontrol();
     vlo.setVisible(false);
    
  }
  private void seccion(){
   
        if ((("holalaola".equals(vlo.getTxtNombre().getText())) && ("12345".equals(vlo.getTxtContrasena().getText())))) {
            iniciar();
        }else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña Incorrectas");
        }
       
   }
}

