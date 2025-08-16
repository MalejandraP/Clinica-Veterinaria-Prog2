package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.*;

import java.time.LocalDate;
import java.util.List;

public class VeterinarioController {
    private App app;
    private Veterinario veterinario;
    public Veterinaria veterinaria;
    private Secretaria secretaria;

    public void regresarAlPrimary(){
        app.openViewPrincipal();
    }
    public boolean registrarConsulta(Consulta consulta){
        veterinario.agregarConsulta(consulta);
        return true;
    }
    public List<Hora> obtenerHorasVeterinario(String id, LocalDate newDate){
        return veterinaria.buscarVeterinarioOcupado(id, newDate);
    }
    public List<Mascota> obtenerListaMascotas(){
        return veterinaria.getListMascotas();
    }
    public List<Tratamiento> obtenerListaTratamientos(){
        return veterinaria.getListTratamientos();
    }
    public VeterinarioController(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }
    public void setApp(App app) {
        this.app = app;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
