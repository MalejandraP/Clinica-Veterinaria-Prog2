package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinario;

public class PrimaryController {
    private Veterinaria veterinaria;
    private App app;

    public PrimaryController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
    public void setApp(App app) {
        this.app = app;
    }

    public boolean redireccionarSegunId(String id){
        Secretaria secretaria = veterinaria.buscarSecretaria(id);
        if(secretaria != null){
            app.openCrudSecretaria(secretaria);
            return true;
        }
        Veterinario veterinario = veterinaria.buscarVeterinario(id);
        if(veterinario != null){
            app.openCrudVeterinario(veterinario);
            return true;
        }
        return false;
    }


}
