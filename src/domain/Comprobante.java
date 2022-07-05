package domain;
import java.sql.Timestamp;

public class Comprobante {
    private double total;
    private Timestamp fecha;
    private Usuario destinatario;
    private TarjetaCredito tarjeta;


    //Constructor
    public Comprobante( double total, Timestamp fecha, Usuario destinatario, TarjetaCredito tarjeta) {
        this.total = total;
        this.fecha = fecha;
        this.destinatario = destinatario;
        this.tarjeta = tarjeta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
}
