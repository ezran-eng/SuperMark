package domain;

import java.sql.Date;

public class TarjetaCredito {
    private Integer numero;
    private String banco;
    protected double balance;
    private double limite;
    private Usuario usuario;
    private Date fechaCaducidad;

    public TarjetaCredito(int numero, String banco, double balance, double limite, Usuario usuario, Date fechaCaducidad) {
        this(numero, banco, balance, limite, usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getContrasenia(), usuario.getDni(), usuario.getDomicilio().getCalle(), usuario.getDomicilio().getDepNumero(), usuario.getDomicilio().getPiso(), usuario.getDomicilio().getLocalidad().getProvincia(), usuario.getDomicilio().getLocalidad().getDepartamento(), usuario.getDomicilio().getLocalidad().getCiudad(), usuario.getDomicilio().getDescripcion(), fechaCaducidad);
    }

    public TarjetaCredito(int numero, String banco, double balance, double limite, String nombre, String apellido, String email, String contrasenia, int dni, String calle, int depNumero, int piso, String provincia, String departamento, String ciudad, String descripcion, Date fechaCaducidad) {
        this.numero = numero;
        this.banco = banco;
        this.balance = balance;
        this.limite = limite;
        this.usuario = new Usuario(nombre, apellido, email, contrasenia, dni, calle, numero, depNumero, piso, provincia, departamento, ciudad, descripcion);
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "numero=" + numero +
                ", banco='" + banco + '\'' +
                ", balance=" + balance +
                ", limite=" + limite +
                ", usuario=" + usuario +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
