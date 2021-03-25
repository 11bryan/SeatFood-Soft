
package modelo;


public class producto {
    private String id_producto;
    private String nombre;
    private String id_tipo;
    private int cantidad;
    private String descripcion;
    private double precio;
    private byte imagen;

    public producto() {
    }

    public producto(String id_producto, String nombre, String id_tipo, int cantidad, String descripcion, double precio, byte imagen) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.id_tipo = id_tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }
    
    
}
