
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modelo_tipo extends tipo{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_tipo() {
    }

    public modelo_tipo(String id_tipo, String nombre, String descripcion) {
        super(id_tipo, nombre, descripcion);
    }
    
    public boolean grabarTipo(){
        String sql;
        sql="INSERT INTO tipo(id_tipo,nombre,descripcion) ";
        sql+="values ('"+getId_tipo()+"','"+getNombre()+"','"+getDescripcion()+"')";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //lista o busca tipo por id_tipo nombre y descripcion
    public static List<tipo> lita_tipo (String aguja){
        try {
            String query=" select  * from tipo where";
            query+="UPPER(id_tipo) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(nombre) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(descripcion) LIKE UPPER('%"+aguja+"%')";
            
            ResultSet rs=con.query(query);
            List<tipo> lista=new ArrayList<>();
            while (rs.next()) {
                tipo t=new tipo();
                t.setId_tipo(rs.getString("id_tipo"));
                t.setNombre(rs.getString("nombre"));
                t.setDescripcion(rs.getString("descripcion"));
                lista.add(t);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_tipo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean actualiza_tipo(String id_tipo){
        String sql;
        sql="UPDATE tipo set nombre='"+getNombre()+"',"
                + "descripcion='"+getDescripcion()+"'"
                + " where id_tipo='"+id_tipo+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
            
    public boolean elimina_tipo(String id_tipo){
        String sql;
        sql="DELETE FROM tipo where id_tipo='"+id_tipo+"'";
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
}
