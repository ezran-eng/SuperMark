package domain;

public class Descuento {
    private float porcentaje;
    private String dia;
    private Integer id;

    public Descuento(Integer id){
        this(id,0, "no hay dia");
    }

    public Descuento(Integer id, float porcentaje, String dia) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.dia = dia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Descuento{" +
                "porcentaje=" + porcentaje +
                ", dia='" + dia + '\'' +
                ", id=" + id +
                '}';
    }
}
