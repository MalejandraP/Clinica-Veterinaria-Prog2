package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Consulta;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;

import java.util.List;

public class ListaConsultaPorMascotaController {
    private App app;
    private Secretaria secretaria;

    public List<Consulta> hallarHistorial(String id){
        return secretaria.hallarlistaConsultasMascota(id);
    }
    public void abrirSecretaria(){
        app.openCrudSecretaria(secretaria);
    }
    public void setApp(App app) {
        this.app = app;
    }

}
