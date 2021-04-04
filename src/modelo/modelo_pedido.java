
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modelo_pedido extends pedido{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_pedido() {
    }

    public modelo_pedido(String id_pedido, String id_empleado, String id_producto, String id_entrega, String cedula, String p_adicinal) {
        super(id_pedido, id_empleado, id_producto, id_entrega, cedula, p_adicinal);
    }
    
    public boolean grabarPedido(){
        String sql;
        sql="INSERT INTO pedido(id_pedido,id_empleado,id_producto,id_entrega,cedula,p_adicinal) ";
        sql+=" values ('"+getId_pedido()+"','"+getId_empleado()+"',"
                + "'"+getId_producto()+"','"+getId_entrega()+"',"
                + "'"+getCedula()+"','"+getP_adicinal()+"')";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //lista o muestra pedidos por id_pedido cedula id_entrega id_producto
    public static List<pedido> lista_pedido(String aguja){
        try {
            String query="select * from pedido where ";
            query="UPPER(id_pedido) LIKE UPPER('%"+aguja+"%') OR ";
            query="UPPER(id_producto) LIKE UPPER('%"+aguja+"%') OR ";
            query="UPPER(cedula) LIKE UPPER('%"+aguja+"%') OR ";
            query="UPPER(id_entrega) LIKE UPPER('%"+aguja+"%') OR ";
            
            ResultSet rs=con.query(query);
            List<pedido> lista=new ArrayList<>();
            
            while (rs.next()) {
                pedido p=new pedido();
                p.setId_pedido(rs.getString("id_pedido"));
                p.setId_empleado(rs.getString("id_empleado"));
                p.setId_producto(rs.getString("id_producto"));
                lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean actualiza_pedido (String id_pedido){
        String sql;
        sql="UPDATE pedido set id_empleado='"+getId_empleado()+"',"
                + "id_producto='"+getId_producto()+"',"
                + "id_entrega'"+getId_entrega()+"',"
                + "cedula'"+getCedula()+"',"
                + "p_adicinal'"+getP_adicinal()+"',"
                + " where id_pedido='"+id_pedido+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean elimina_peedido (String id_pedido){
        String sql;
        sql="DELETE from pedido where id_pedido='"+id_pedido+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
}
