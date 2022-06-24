package domain;

import java.util.Date;

public class Producto {
    private int id;
    private String nombre;
    private String marca;
    private Date fechaVencimiento;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, String marca, Date fechaVencimiento, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
