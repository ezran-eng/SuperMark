package domain;

import java.util.Date;
import java.util.HashMap;

public class Comprobante {
    private int id;
    private double total;
    private char tipo;
    private Date fecha;
    private HashMap<Integer, Detalle> detalles;

    //Constructor
    public Comprobante(int id, double total, char tipo, Date fecha) {
        this.id = id;
        this.total = total;
        this.tipo = tipo;
        this.fecha = fecha;
        this.detalles = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public HashMap<Integer, Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(HashMap<Integer, Detalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Comprobante{" +
                "id=" + id +
                ", total=" + total +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                ", detalles=" + detalles +
                '}';
    }
}
