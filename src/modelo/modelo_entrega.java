
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modelo_entrega extends entrega{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_entrega() {
    }

    public modelo_entrega(String id_entrega, int mesa, String delivery) {
        super(id_entrega, mesa, delivery);
    }
    
    public boolean grabarEntrega(){
        String sql;
        sql="INSERT INTO entrega(id_entrega,mesa,delivery) ";
        sql=" values('"+getId_entrega()+"','"+getMesa()+"','"+getDelivery()+"')";
        
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public static List<entrega> lista_entrega(String aguja){
        try {
            String query="select * from entrega where ";
            query+="UPPER(id_entrega) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(delivery) LIKE UPPER('%"+aguja+"%') OR ";
            
            ResultSet rs=con.query(query);
            List<entrega> lista=new ArrayList<>();
            
            while (rs.next()) {
                entrega e=new entrega();
                e.setId_entrega(rs.getString("id_entrega"));
                e.setMesa(rs.getInt("mesa"));
                e.setDelivery(rs.getString("delivery"));
                lista.add(e);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_entrega.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean actualiza_entrega(String id_entrega){
        String sql;
        sql="UPDATE entrega SET mesa='"+getMesa()+"',"
                + "delivery='"+getDelivery()+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean elimina(String id_entrega){
        String sql;
        sql="DELETE from entrega where id_entrega='"+id_entrega+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
}
