
package modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.postgresql.util.Base64;


public class modelo_producto extends producto{
    private static ConexionPGA con =new ConexionPGA();

    public modelo_producto() {
    }

    public modelo_producto(String id_producto, String nombre, String tipo, int cantidad, String descripcion, double precio, Image imagen) {
        super(id_producto, nombre, tipo, cantidad, descripcion, precio, imagen);
    }

    
   
    public boolean grabar_producto(){
        String sql;
        String imagen64=null;
        try {
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            BufferedImage img = imgB(getImagen());
            ImageIO.write(img, "png", bos);
            byte[]imgb=bos.toByteArray();
            imagen64 = Base64.encodeBytes(imgb);
        } catch (IOException ex) {
            Logger.getLogger(modelo_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sql="INSERT INTO producto (id_producto,nombre,tipo,cantidad,descripcion,precio,imagen) ";
        sql+="values ('"+getId_producto()+"','"+getNombre()+"',"
                + "'"+getTipo()+"','"+getCantidad()+"','"+getDescripcion()+"',"
                + "'"+getPrecio()+"','"+imagen64+"')";
        
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
        
    }
    
    private BufferedImage imgB(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics bGB = bi.createGraphics();
        bGB.drawImage(img, 0, 0, null);
        bGB.dispose();
        return bi;
    }
    
    //lista o busca productos por id_producto nombre id_tipo descripcion
    
    public static List<producto> lista_producto(String aguja){
        try {
            String query="select * from producto where ";
            query +="UPPER (id_producto) LIKE UPPER('%"+aguja+"%') OR ";
            query +="UPPER (nombre) LIKE UPPER('%"+aguja+"%') OR ";
            query +="UPPER (tipo) LIKE UPPER('%"+aguja+"%') OR ";
            query +="UPPER (descripcion) LIKE UPPER('%"+aguja+"%')";
            
            ResultSet rs=con.query(query);
            List<producto> lista=new ArrayList<producto>();
            byte[] bf;
            while (rs.next()) {
                producto p=new producto();
                p.setId_producto(rs.getString("id_producto"));
                p.setNombre(rs.getString("nombre"));
                p.setTipo(rs.getString("tipo"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getInt("precio"));
                bf=rs.getBytes("imagen");
                
                if (bf!=null) {
                    bf = Base64.decode(bf, 0, bf.length);
                    try {
                        p.setImagen(ObteneImagen(bf));
                    } catch (IOException ex) {
                        p.setImagen(null);
                        Logger.getLogger(modelo_producto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    p.setImagen(null);
                }
                lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public static Image ObteneImagen(byte[] bytes)throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }
    
    public boolean actualiza_producto(String id_prodcuto){
         String imagen64=null;
         try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            BufferedImage img = imgB(getImagen());
            ImageIO.write(img, "png", bos);
            byte[] imgb = bos.toByteArray();
            imagen64 = Base64.encodeBytes(imgb);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         
         String sql;
         sql="UPDATE producto SET nombre='"+getNombre()+"',"
                 + "'"+getTipo()+"',"
                 + "'"+getCantidad()+"',"
                 + "'"+getDescripcion()+"',"
                 + "'"+getPrecio()+"',"
                 + "'"+imagen64+"'";
         sql+=" WHERE id_producto='"+id_prodcuto+"'";
         
         if (con.noQuery(sql)==null) {
            return true;
        }else{
             return false;
         }
    }
    
    public boolean eliminar_producto(String id_producto){
        String sql;
        sql="DELETE from producto where id_producto='"+id_producto+"'";
        
        if (con.noQuery(sql)==null) {
            return true;
        }else{
            return false;
        }
    }
}
