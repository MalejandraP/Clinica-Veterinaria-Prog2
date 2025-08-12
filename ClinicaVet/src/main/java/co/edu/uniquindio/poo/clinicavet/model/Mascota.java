package co.edu.uniquindio.poo.clinicavet.model;

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private String id;
    private Especie especie;
    private Propietario propietario;

    public Mascota(String nombre, String raza, int edad, String id, Especie especie, Propietario propietario){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.id = id;
        this.especie = especie;
        this.propietario = propietario;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
