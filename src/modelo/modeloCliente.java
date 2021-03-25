
package modelo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.Base64;



public class modeloCliente extends Cliente {
    
      private static ConexionPGA con = new ConexionPGA();

    public modeloCliente() {
    }

    public modeloCliente(String cedula, String nombre, String apeliido, String direccion, String telefono) {
        super(cedula, nombre, apeliido, direccion, telefono);
    }
     
    
     public boolean grabar() {
        String sql;

        sql = "INSERT INTO cliente (cedula,nombre,apeliido,direccion,telefono)";
        sql += "VALUES ('" + getCedula() + "','" + getNombre() + "','" + getApeliido() + "','" + getDireccion() + "','"
                + getTelefono() + "')";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
     
     public static List<Cliente> listapersonas(String aguja) {
        try {
            String query = "select * from cliente WHERE ";
            query += "LOWER(cedula) like ('%" + aguja + "%') OR ";
            query += "LOWER(nombre) LIKE lower('%" + aguja + "%') OR ";
            query += "LOWER(apeliido) LIKE lower('%" + aguja + "%') OR ";
            query += "LOWER(direccion) LIKE lower('%" + aguja + "%') ";

            ResultSet rs = con.query(query);
            List<Cliente> lista = new ArrayList<Cliente>();
            byte[] bf;
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCedula(rs.getString("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApeliido(rs.getString("apellido"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                       
                lista.add(cliente);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
