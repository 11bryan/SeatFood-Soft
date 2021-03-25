
package modelo;


public class entrega {
    private String id_entrega;
    private int mesa;
    private String delivery;

    public entrega() {
    }

    public entrega(String id_entrega, int mesa, String delivery) {
        this.id_entrega = id_entrega;
        this.mesa = mesa;
        this.delivery = delivery;
    }

    public String getId_entrega() {
        return id_entrega;
    }

    public void setId_entrega(String id_entrega) {
        this.id_entrega = id_entrega;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
    
    
    
}
