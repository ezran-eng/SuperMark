package domain;

public class Descuento {
    private float porcentaje;
    private String dia;

    public Descuento(){
        this(0, "no hay dia");
    }

    public Descuento(float porcentaje, String dia) {
        this.porcentaje = porcentaje;
        this.dia = dia;
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
                '}';
    }
}
