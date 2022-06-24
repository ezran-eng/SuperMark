package domain;

import java.util.Date;

public class Detalle {
    private Producto descripcion;
    private int cantidad;
    private double descuento;

    public Detalle(Producto descripcion, int cantidad, double descuento) {
        this(descripcion.getId(), descripcion.getNombre(), descripcion.getMarca(), descripcion.getFechaVencimiento(), descripcion.getPrecio(), descripcion.getStock(), cantidad, descuento);
    }

    public Detalle(int id, String nombre, String marca, Date fechaVencimiento, double precio, int stock, int cantidad, double descuento) {
        this.descripcion = new Producto(id, nombre, marca, fechaVencimiento, precio, stock);
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public Producto getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Producto descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "descripcion=" + descripcion +
                ", cantidad=" + cantidad +
                ", descuento=" + descuento +
                '}';
    }
}
