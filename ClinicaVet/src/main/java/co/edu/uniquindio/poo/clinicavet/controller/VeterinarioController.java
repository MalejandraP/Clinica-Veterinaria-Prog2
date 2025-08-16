package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinario;

public class VeterinarioController {
    private App app;
    private Veterinario veterinario;
    public Veterinaria veterinaria;

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
