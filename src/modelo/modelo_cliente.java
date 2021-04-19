
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modelo_cliente extends Cliente{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_cliente() {
    }

    public modelo_cliente(String cedula, String nombre, String apellido, String direccion, String telefono) {
        super(cedula, nombre, apellido, direccion, telefono);
    }
    
    public boolean grabarCliente(){
        String sql;
        sql="INSERT INTO cliente(cedula,nombre,apellido,direccion,telefono)";
        sql+=" VALUES ('"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"')";
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
        
    }
    
    //lista 0 busca los cliente por cedula nombre apellido telefono
    
    public static List<Cliente> lista_cliente(String aguja){
        try {
            String query="select * from cliente where ";
            query+="UPPER(cedula) like UPPER ('%"+aguja+"%') OR ";
            query+="UPPER(nombre) like UPPER ('%"+aguja+"%') OR ";
            query+="UPPER(apellido) like UPPER ('%"+aguja+"%') OR ";
            query+="UPPER(telefono) like UPPER ('%"+aguja+"%') ";
            
            ResultSet rs=con.query(query);
            List<Cliente> lista=new ArrayList<Cliente>();
            
            while (rs.next()) {                
                Cliente cliente =new Cliente();
                cliente.setCedula(rs.getString("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                lista.add(cliente);
            }
            rs.close();
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(modelo_cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public boolean actualiza(String cedula){
        String sql;
        sql="UPDATE cliente set nombre='"+getNombre()+"',"
                + "apellido='"+getApellido()+"',"
                + "direccion='"+getDireccion()+"',"
                + "telefono='"+getTelefono()+"'"
                + " where cedula='"+cedula+"'";
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
                
    }
    
    public boolean elimina (String cedula){
        String sql;
        sql="Delete from cliente where cedula='"+cedula+"'";
        
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    
   
    
}
