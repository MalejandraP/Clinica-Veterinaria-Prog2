package co.edu.uniquindio.poo.clinicavet.model;

public class Secretaria extends Personal{
    private String experiencia;

    public Secretaria(String nombre, String id, double salario, String experiencia) {
        super(nombre, id, salario);
        this.experiencia = experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
