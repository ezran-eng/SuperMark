package services;

import domain.Localidad;

public class Test {
    public static void main(String[] args) {
        CRUDLocalidad localidad = new CRUDLocalidad();
        Localidad l = new Localidad("Salta", "Salta", "Salta Capital");

        localidad.register(l);
    }
}
