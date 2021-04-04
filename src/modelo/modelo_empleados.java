
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modelo_empleados extends empleados{
    
    private static ConexionPGA con=new ConexionPGA();

    public modelo_empleados() {
    }

    public modelo_empleados(String id_empleado, String nombre, String apellido, String rol) {
        super(id_empleado, nombre, apellido, rol);
    }
    
    public boolean grabar_empleados(){
        String sql;
        sql="INSERT INTO empleado (id_empleado,nombre,apellido,rol)";
        sql+=" VALUES ('"+getId_empleado()+"','"+getNombre()+"','"+getApellido()+"','"+getRol()+"')";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //listar o buscar empleados por id_empleado ron nombre apellido
    
    public static List<empleados> lista_empleados(String aguja){
        try {
            String query="Select * from empleado where ";
            query+="UPPER(id_empleado) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(nombre) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(apellido) LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(rol) LIKE UPPER('%"+aguja+"%')";            
            
            ResultSet rs=con.query(query);
            List<empleados> lista=new ArrayList<>();
            
            while (rs.next()) {
                empleados e=new empleados();
                e.setId_empleado(rs.getString("id_empleado"));
                e.setNombre(rs.getString("nombre"));
                e.setApellido(rs.getString("apellido"));
                e.setRol(rs.getString("rol"));
                lista.add(e);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_empleados.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean actualiza_empleado(String id_empleado){
        String sql;
        sql="UPDATE empleado set nombre='"+getNombre()+"',"
                + "'"+getApellido()+"',"
                + "'"+getRol()+"'"
                + " where id_empleado='"+id_empleado+"'";  
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar_empleado(String id_empleado){
        String sql;
        sql="DELETE from empleado where id_empleado='"+id_empleado+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
}
