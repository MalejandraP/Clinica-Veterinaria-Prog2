package co.edu.uniquindio.poo.clinicavet.model;

public class Veterinario extends Persona {
    private String licencia;
    private boolean estado;
    private Especialidad especialidad;

    public Veterinario(String nombre, String id, String licencia, boolean estado, Especialidad especialidad) {
        super(nombre, id);
        this.licencia = licencia;
        this.estado = estado;
        this.especialidad = especialidad;

    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}