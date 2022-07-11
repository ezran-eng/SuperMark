package domain;

public class Domicilio {
    private Integer id;
    private String calle;
    private int numero;
    private int depNumero;
    private Localidad localidad;
    private int piso;
    private String descripcion;

    public Domicilio(Integer id) {
        this.id = id;
    }

    public Domicilio(){
      this("", 0, 0,0, new Localidad(),"");
    }
    public Domicilio(Integer id, String calle, Integer numero, Integer depNumero, Integer piso) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.depNumero = depNumero;
        this.piso = piso;
    }

    public Domicilio(String calle, int numero, int depNumero, int piso, Localidad localidad, String descripcion) {
        this(calle, numero, depNumero, piso, localidad.getProvincia(), localidad.getDepartamento(), localidad.getCiudad(), descripcion);
    }

    public Domicilio(String calle, int numero, int depNumero, int piso, String provincia, String departamento, String ciudad, String descripcion) {
        this.calle = calle;
        this.numero = numero;
        this.depNumero = depNumero;
        this.piso = piso;
        this.localidad = new Localidad(provincia, departamento, ciudad);
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

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", depNumero=" + depNumero +
                ", piso=" + piso +
                ", localidad=" + localidad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
