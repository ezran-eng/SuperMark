package domain;

import java.util.Date;

public class Detalle {
    private Producto producto;
    private Comprobante comprobante;
    private Integer cantidad;
    private int id;

    public Detalle(Producto producto, Integer cantidad) {
        super();
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Detalle(Producto producto, Comprobante comprobante, Integer cantidad) {
        this.producto = producto;
        this.comprobante = comprobante;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "producto=" + producto +
                ", comprobante=" + comprobante +
                ", cantidad=" + cantidad +
                ", id=" + id +
                '}';
    }
}
