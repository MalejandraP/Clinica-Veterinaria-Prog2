package co.edu.uniquindio.poo.clinicavet.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cita {
    private String id;
    private LocalDate fecha;
    private String horaInicial;
    private String horaFinal;
    private Sede sede;
    private String consultorio;
    private Veterinario veterinario;
    private List<Consulta> listConsultas;

    public Cita(String id, LocalDate fecha, String horaInicial, String horaFinal, Sede sede, String consultorio, Veterinario veterinario) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.sede = sede;
        this.consultorio = consultorio;
        this.listConsultas = new ArrayList<>();
        this.veterinario = veterinario;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Consulta> getListConsultas() {
        return listConsultas;
    }

    public void setListConsultas(List<Consulta> listConsultas) {
        this.listConsultas = listConsultas;
    }
}
