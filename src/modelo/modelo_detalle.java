
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modelo_detalle extends detalle{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_detalle() {
    }

    public modelo_detalle(String id_detalle, String id_pedido, double costo_adicional, double total, int cantidad) {
        super(id_detalle, id_pedido, costo_adicional, total, cantidad);
    }
    
    public boolean grabarDetalle(){
        String sql;
        sql="INSERT INTO detalle (id_detalle,id_pedido,costo_adicional,total,cantidad) ";
        sql+=" values ('"+getId_detalle()+"','"+getId_pedido()+"',"
                + "'"+getCosto_adicional()+"','"+getTotal()+"','"+getCantidad()+"',)";
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    //lista o muestra deatlle por id_detalle o pedido
    public static List<detalle> lista_detalle(String aguja){
        try {
            String query="select * from detalle where ";
            query+=" UPPER (id_detalle) LIKE UPPER('%"+aguja+"%') OR ";
            query+=" UPPER (id_pedido) LIKE UPPER('%"+aguja+"%') OR ";
            
            ResultSet rs=con.query(query);
            List<detalle> lista=new ArrayList<>();
            
            while (rs.next()) {
                detalle d=new detalle();
                d.setId_detalle(rs.getString("id_detalle"));
                d.setId_pedido(rs.getString("id_pedido"));
                d.setCosto_adicional(rs.getInt("costo_adicional"));
                d.setTotal(rs.getInt("total"));
                d.setCantidad(rs.getInt("cantidad"));
                lista.add(d);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_detalle.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public boolean actualiza_detalle (String id_detalle){
        
       String sql;
       sql="UPDATE detalle set costo_adicional='"+getCosto_adicional()+"',"
               + "total='"+getTotal()+"',cantidad ='"+getCantidad()+"'"
               + " where id_detalle='"+id_detalle+"'";
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
       
       
    }
    
    
    
}
