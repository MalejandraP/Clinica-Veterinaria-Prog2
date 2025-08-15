package co.edu.uniquindio.poo.clinicavet.viewController;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.controller.SecretariaController;
import co.edu.uniquindio.poo.clinicavet.model.Secretaria;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class SecretariaViewController {
    private App app;
    private SecretariaController secretariaController;
    private Secretaria secretaria;//yo diria que no tengo que llamrlo porque no necesito su nombre ni nada, tampoco setearlo entonces

    public void setSecretariaController(SecretariaController secretariaController) {
        this.secretariaController = secretariaController;
    }
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    private void setApp(App app) {
        this.app = app;
    }
    @FXML
    private Button btnRegresar, btnRegistrarMascota, btnRegistrarPropietario, btnRegistrarVeterinario, btnRealizarConsulta, btnAgendarCita;
    @FXML
    void onRegresar(){
        abrirPrimary();
    }
    @FXML
    private void abrirPrimary(){
        secretariaController.regresarAlPrimary();
    }
    @FXML
    void onRegistrarMascota(){
        abrirRegistroMascota();
    }
    @FXML
    private void abrirRegistroMascota(){
        secretariaController.irAlRegistroMascota();
    }
    @FXML
    void onRegistrarPropietario(){
        abrirRegistroPropietario();
    }
    @FXML
    void abrirRegistroPropietario(){
        secretariaController.irAlRegistroPropietario();
    }
    @FXML
    void onRegistrarVeterinario(){
        abrirRegistroVeterinario();
    }
    @FXML
    private void abrirRegistroVeterinario(){
        secretariaController.irAlRegistroVeterinario();
    }
    @FXML
    void onRealizarConsulta(){
        abrirRealizarConsulta();
    }
    @FXML
    private void abrirRealizarConsulta(){
        secretariaController.realizarConsulta();
    }
    @FXML
    void onAgendarCita(){
        abrirAgendarCita();
    }
    @FXML
    private void abrirAgendarCita(){
        secretariaController.agendarCita();
    }
}
