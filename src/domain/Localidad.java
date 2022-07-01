package domain;

public class Localidad {
    private String provincia;
    private String departamento;
    private String ciudad;

    public Localidad(){
        this("no hay Provincia","no hay Departamento","no hay ciudad");
    }

    public Localidad(String provincia, String departamento, String ciudad) {
        this.provincia = provincia;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "provincia='" + provincia + '\'' +
                ", departamento='" + departamento + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
