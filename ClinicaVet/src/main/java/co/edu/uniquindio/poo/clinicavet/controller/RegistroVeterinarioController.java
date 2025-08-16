package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;

public class RegistroVeterinarioController {
    private App app;
    private Secretaria secretaria;
    public Veterinaria veterinaria;

    public RegistroVeterinarioController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }
    public void setApp(App app){
        this.app = app;
    }
    public void setSecretaria(Secretaria secretaria){
        this.secretaria = secretaria;
    }
}
