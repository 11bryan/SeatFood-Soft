
package seafood.soft;

import Vista.V_clientes;
import Vista.V_empleados;
import Vista.V_productos;
import control.ControlCliente;
import modelo.modelo_cliente;


public class main {
   
    public static void main(String[] args) {
      V_clientes clientes=new V_clientes();
   modelo_cliente cli=new modelo_cliente();
   ControlCliente clien=new ControlCliente(cli,clientes);
   clien.iniciacontrol();
    }
}
