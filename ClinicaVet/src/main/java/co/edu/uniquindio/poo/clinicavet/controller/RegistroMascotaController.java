package co.edu.uniquindio.poo.clinicavet.controller;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.model.Mascota;
import co.edu.uniquindio.poo.clinicavet.model.Propietario;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import co.edu.uniquindio.poo.clinicavet.model.Veterinaria;

import java.util.List;

public class RegistroMascotaController {
    private Secretaria secretaria;
    private App app;
    public Veterinaria veterinaria;

    public List<Propietario> obtenerPropietarios() {
        return veterinaria.getListPropietarios();
    }
    public List<Mascota> obtenerMascotas() {
        return veterinaria.getListMascotas();
    }
    public boolean actualizarMascota(String id, Mascota actualizada){
        secretaria.actualizarMascota(id, actualizada);
        return true;
    }
    public boolean eliminarMascota(String id){
        secretaria.eliminarMascota(id);
        return true;
    }
    public boolean agregarMascota(Mascota mascota){
        secretaria.agregarMascota(mascota);
        return true;
    }
    public void regresarSecretaria(){
        app.openCrudSecretaria(secretaria);
    }
    public RegistroMascotaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public void setApp(App app){
        this.app = app;
    }
    public void setSecretaria(Secretaria secretaria){
        this.secretaria = secretaria;
    }
}
