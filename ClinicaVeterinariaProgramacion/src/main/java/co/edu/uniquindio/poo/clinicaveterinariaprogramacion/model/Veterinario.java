package co.edu.uniquindio.poo.clinicaveterinariaprogramacion.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Persona {
    private String licencia;
    private Especialidad especialidad;
    private Veterinaria veterinaria;
    private List<Consulta> consultas;

    public Veterinario(String nombre, String id, String licencia, Especialidad especialidad) {
        super(nombre, id);
        this.licencia = licencia;
        this.especialidad = especialidad;

    }
    public void eliminarConsulta(String id) {
        App.veterinaria.eliminarConsulta(id);
    }
    public void agregarConsulta(Consulta consulta){
        App.veterinaria.agregarConsulta(consulta);
    }
    public void actualizarConsulta(String id, Consulta consulta){
        App.veterinaria.actualizarConsulta(id, consulta);
    }



    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
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


}


