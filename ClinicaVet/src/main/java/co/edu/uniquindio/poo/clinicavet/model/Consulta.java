package co.edu.uniquindio.poo.clinicavet.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate fecha;
    private String hora;
    private String motivo;
    private String diagnostico;
    private List<Tratamiento> listtratamientos;

    public Consulta(LocalDate fecha, String hora, String motivo, String diagnostico) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.listtratamientos = new ArrayList<>();

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Tratamiento> getListtratamientos() {
        return listtratamientos;
    }

    public void setListtratamientos(List<Tratamiento> listtratamientos) {
        this.listtratamientos = listtratamientos;
    }
}
