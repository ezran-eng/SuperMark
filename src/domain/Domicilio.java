package domain;

public class Domicilio {
    private String calle;
    private int numero;
    private int depNumero;
    private int piso;
    private String descripcion;

    public Domicilio(String calle, int numero, int depNumero, int piso, String descripcion) {
        this.calle = calle;
        this.numero = numero;
        this.depNumero = depNumero;
        this.piso = piso;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDepNumero() {
        return depNumero;
    }

    public void setDepNumero(int depNumero) {
        this.depNumero = depNumero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", depNumero=" + depNumero +
                ", piso=" + piso +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
