package domain;

public class Tipo {
    String descripcion;
    Descuento descuento;

    //Constructores
    public Tipo(){
        this("no hay descripcion", new Descuento());
    }

    public Tipo(String descripcion, Descuento descuento) {
        this(descripcion, descuento.getPorcentaje(), descuento.getDia());
    }
    public Tipo(String descripcion, float porcentaje, String dia) {
        this.descripcion = descripcion;
        this.descuento = new Descuento(porcentaje, dia);
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

    @Override
    public String toString() {
        return "Tipo{" +
                "descripcion='" + descripcion + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
