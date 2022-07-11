package services;

import domain.Localidad;

import java.sql.SQLException;

public class CRUDLocalidad {
    private final Conexion conexion;
    private String sql;

    public CRUDLocalidad() {
        this.conexion = new Conexion("supermark");
        this.conexion.connect(); //Abre la conexion
        this.sql = "";
    }

    public void register(Localidad loca) { //-->Registrar una localidad

        this.sql = "INSERT INTO localidad " + "(provincia,departamento,ciudad) " + "VALUE ('" + loca.getProvincia() + "','" + loca.getDepartamento() + "','" + loca.getCiudad() + "')";
        try {
            conexion.getStmt().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Localidad registrada");
        }
    }

    public Localidad getLocalidad(Integer id) {
        this.sql = "SELECT * FROM localidad " + "WHERE localidad.id=" + id;
        Localidad localidad = null;
        try {
            conexion.setRs(conexion.getStmt().executeQuery(sql));
            localidad = new Localidad(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return localidad;
    }
}
