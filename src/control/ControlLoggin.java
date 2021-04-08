/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import Vista.V_loggins;
import Vista.V_mesas;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControlLoggin {
    private V_loggins vloggin;
    
   public void iniciocontrol(){
    vloggin.getBtn_Iniciar().addActionListener(l -> inicioregistro());
   } 
   public void inicioregistro(){
      boolean datos = false;
        if ((datos==true)||(("holalaola".equals(vloggin.getTxtNombre().getText())) && ("12345".equals(String.valueOf(vloggin.getTxtContrasena().getText()))))) {
           
           V_mesas mesa=new V_mesas();
           mesa.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña Incorrectas");
        }   
   }
}
