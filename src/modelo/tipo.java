
package modelo;


public class tipo {
    private String id_tipo;
    private String nombre;
    private String descripcion;

    public tipo() {
    }

    public tipo(String id_tipo, String nombre, String descripcion) {
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
