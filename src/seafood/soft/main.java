
package seafood.soft;

import Vista.V_clientes;
import Vista.V_empleados;
import Vista.V_productos;
import control.ControlCliente;
import control.ControlEmpleado;
import modelo.modelo_cliente;
import modelo.modelo_empleados;


public class main {
   
    public static void main(String[] args) {
     V_empleados empleados=new V_empleados();
     modelo_empleados empl=new modelo_empleados();
     ControlEmpleado em=new ControlEmpleado(empl,empleados);
     em.iniciacontrol();
     
     
    }
}
