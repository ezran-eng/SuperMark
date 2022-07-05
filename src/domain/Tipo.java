package domain;

public class Tipo {
    private Integer id;
    String descripcion;
    Descuento descuento;

    //Constructores
    public Tipo(Integer id){
        this(id,"no hay descripcion", new Descuento(id));
    }

    public Tipo(Integer id,String descripcion, Descuento descuento) {
        this(id, descripcion, descuento.getPorcentaje(), descuento.getDia());
    }
    public Tipo(Integer id, String descripcion, float porcentaje, String dia) {
        this.id = id;
        this.descripcion = descripcion;
        this.descuento = new Descuento(id, porcentaje, dia);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
