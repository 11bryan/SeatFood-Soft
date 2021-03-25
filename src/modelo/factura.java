
package modelo;

import java.sql.Date;


public class factura {
    private String id_factura;
    private String id_detalle;
    private String cedula;
    private Date fecha;
    private String id_pedido;

    public factura() {
    }

    public factura(String id_factura, String id_detalle, String cedula, Date fecha, String id_pedido) {
        this.id_factura = id_factura;
        this.id_detalle = id_detalle;
        this.cedula = cedula;
        this.fecha = fecha;
        this.id_pedido = id_pedido;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }
    
            
    
}
