package domain;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenia;
    private int dni;
    private Domicilio domicilio;

    public Usuario() {
        this(0, "", "","", "", 0, new Domicilio());
    }

    public Usuario(int id, String nombre, String apellido, String email, String contrasenia, int dni, Domicilio domicilio) {
        this(id, nombre, apellido, email, contrasenia, dni, domicilio.getCalle(), domicilio.getNumero(), domicilio.getDepNumero(), domicilio.getPiso(), domicilio.getLocalidad().getProvincia(), domicilio.getLocalidad().getDepartamento(), domicilio.getLocalidad().getCiudad(), domicilio.getDescripcion());
    }

    public Usuario(int id, String nombre, String apellido, String email, String contrasenia, int dni, String calle, int numero, int depNumero, int piso, String provincia, String departamento, String ciudad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.contrasenia = contrasenia;
        this.domicilio = new Domicilio(calle, numero, depNumero, piso, descripcion, provincia, departamento, ciudad);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", dni=" + dni +
                ", domicilio=" + domicilio +
                '}';
    }
}

