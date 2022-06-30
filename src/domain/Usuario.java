package domain;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private int dni;
    private Domicilio domicilio;

    public Usuario(int id, String nombre, String apellido, String contrasenia, int dni, Domicilio domicilio) {
        this(id, nombre, apellido, contrasenia, dni, domicilio.getCalle(), domicilio.getNumero(), domicilio.getDepNumero(), domicilio.getPiso(), domicilio.getDescripcion());
    }

    public Usuario(int id, String nombre, String apellido, String contrasenia, int dni, String calle, int numero, int depNumero, int piso, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contrasenia = contrasenia;
        this.domicilio = new Domicilio(calle, numero, depNumero, piso, descripcion);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", dni=" + dni +
                ", domicilio=" + domicilio +
                '}';
    }
}

