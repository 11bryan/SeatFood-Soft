
package modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modelo_factura extends factura{
    private static ConexionPGA con=new ConexionPGA();

    public modelo_factura() {
    }

    public modelo_factura(String id_factura, String id_detalle, String cedula, Date fecha, String id_pedido) {
        super(id_factura, id_detalle, cedula, fecha, id_pedido);
    }

    
    public boolean grabarFactura(){
        String sql;
        sql="INSERT INTO factura(id_factura,id_detalle,cedula,fecha,id_pedido) ";
        sql+=" values ('"+getId_factura()+"','"+getId_detalle()+"',"
                + "'"+getCedula()+"','"+getFecha()+"',"
                + "'"+getId_pedido()+"',)";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //lista o busca las factura por id_factura cedula fecha
    
    public static List<factura> lista_factura(String aguja ){
        try {
            String query="select * from factura where";
            query+=" UPPER(id_factura) LIKE UPPER('%"+aguja+"%') OR ";
            query+=" UPPER(cedula) LIKE UPPER ('%"+aguja+"%') OR ";
            query+=" UPPER(fecha) LIKE UPPER ('%"+aguja+"%') OR ";
            
            ResultSet rs=con.query(query);
            List<factura> lista=new ArrayList<>();
            
            while (rs.next()) {
                factura f=new factura();
                f.setId_factura(rs.getString("id_factura"));
                f.setId_detalle(rs.getString("id_detalle"));
                f.setCedula(rs.getString("cedula"));
                f.setFecha(rs.getDate("fecha"));
                f.setId_pedido(rs.getString("id_pedido"));
                lista.add(f);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_factura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //facturas no puede actualizarse tampoco eleminar
    
}
