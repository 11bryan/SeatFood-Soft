
package modelo;


public class detalle {
    private String id_detalle;
    private String id_pedido;
    private double costo_adicional;
    private double total;
    private int cantidad;

    public detalle() {
    }

    public detalle(String id_detalle, String id_pedido, double costo_adicional, double total, int cantidad) {
        this.id_detalle = id_detalle;
        this.id_pedido = id_pedido;
        this.costo_adicional = costo_adicional;
        this.total = total;
        this.cantidad = cantidad;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public double getCosto_adicional() {
        return costo_adicional;
    }

    public void setCosto_adicional(double costo_adicional) {
        this.costo_adicional = costo_adicional;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
}
