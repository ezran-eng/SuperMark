package domain;

import java.util.Date;

public class Producto {
    private Integer id;
    private String nombre;
    private String marca;
    private Date fechaVencimiento;
    private double precio;
    private int stock;
    private Tipo tipo;

    public Producto(Integer id) {
        this(id,"no hay nombre", "no hay marca", new Date(0), 0, 0, new Tipo(id));
    }

    public Producto(Integer id,String nombre, String marca, Date fechaVencimiento, double precio, int stock, Tipo tipo) {
        this(id, nombre, marca, fechaVencimiento, precio, stock, tipo.getDescripcion(), tipo.getDescuento().getPorcentaje(), tipo.getDescuento().getDia());
    }

    public Producto(Integer id,String nombre, String marca, Date fechaVencimiento, double precio, int stock, String descripcion, float porcentaje, String dia) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.stock = stock;
        this.tipo = new Tipo(id, descripcion, porcentaje, dia);
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                ", tipo=" + tipo +
                '}';
    }
}
