
package modelo;


public class pedido {
    private String id_pedido;
    private String id_empleado;
    private String id_producto;
    private String cedula;

    public pedido() {
    }

    public pedido(String id_pedido, String id_empleado, String id_producto, String cedula) {
        this.id_pedido = id_pedido;
        this.id_empleado = id_empleado;
        this.id_producto = id_producto;
        this.cedula = cedula;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    

   
}
