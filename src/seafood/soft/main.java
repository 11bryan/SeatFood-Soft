
package seafood.soft;

import Vista.V_clientes;
import Vista.V_empleados;
import Vista.V_loggins;
import Vista.V_mesas;
import Vista.V_productos;
import control.ControlCliente;
import control.ControlEmpleado;
import control.ControlLoggin;
import modelo.modelo_cliente;
import modelo.modelo_empleados;


public class main {
   
    public static void main(String[] args) {
     V_loggins log=new V_loggins();
     ControlLoggin login=new ControlLoggin(log);
     login.iniciocontrol();
     
     
    }
}
