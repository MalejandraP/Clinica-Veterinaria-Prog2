package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Propietario;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;

public class RegistroPropietarioController {
    private Secretaria secretaria;
    private App app;
    public Veterinaria veterinaria;

    public RegistroPropietarioController(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }

    public boolean agregarPropietario(Propietario propietario) {
        secretaria.
    }

    public void setVeterinaria(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }
    public void setSecretaria(Secretaria secretaria){
        this.secretaria = secretaria;
    }
    public void setApp(App app){
        this.app = app;
    }
}
