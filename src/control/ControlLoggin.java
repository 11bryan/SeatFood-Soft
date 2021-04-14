/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import vista.V_loggins;
//import vista.V_mesas;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControlLoggin {
   // private V_loggins vlo;
    
   public void iniciocontrol(){
   // vlo.getBtn_Iniciar().addActionListener(l -> inicioregistro());
   } 
   public void inicioregistro(){
  
    boolean valor = false;
       // if ((valor==true)||(("holalaola".equals(vlo.getTxtNombre().getText())) && ("12345".equals(vlo.getTxtContrasena().getText())))) {
            //V_mesas mesa=new V_mesas();
            // mesa.setVisible(true);
      //  }else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña Incorrectas");
        }
  // }
}
