package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;

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
            app.openCrudSecretaria();
            return true;
            }
        return false;
    }

    public boolean redireccionarListaVeterinarios(){
        app.openCrudListaVeterinarios();
        return true;
    }

}
