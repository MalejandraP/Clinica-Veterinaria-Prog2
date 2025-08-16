package co.edu.uniquindio.poo.clinicavet.viewController;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.controller.RegistroCitaController;
import co.edu.uniquindio.poo.clinicavet.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.StringConverter;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class RegistroCitaViewController {
    private App app;
    private RegistroCitaController registroCitaController;

    @FXML
    private TextField txtIdCita, txtConsultorio;
    @FXML
    private Button btnRegresar, btnRegistrar;
    @FXML
    private DatePicker dtpFecha;
    @FXML
    private ComboBox<Veterinario> cbxVeterinario;
    @FXML
    private ComboBox<Hora> cbxHora;
    @FXML
    private ComboBox<Mascota> cbxMascota;
    @FXML
    private ComboBox<Sede> cbxSede;
    @FXML
    void onRegresar(){
        regresarASecretaria();
    }
    @FXML
    void onRegistrar(){
        registrarCita();
    }
    @FXML
    private void regresarASecretaria(){
        registroCitaController.regresarASecretaria();
    }
    @FXML
    private void registrarCita(){
        try{
            Consulta consulta = buildConsulta();
            if(consulta == null){
                mostrarAlerta("Errorcito","Por fa completa todos los campos");
                return;
            }
            if(veterinarioController.registrarConsulta(consulta)){
                mostrarAlerta("Exito","Agregado exitosamente");
            } else{
                mostrarAlerta("Error", "No se pudo agregar la consulta");
            }
        } catch (Exception e) {
            mostrarAlerta("Error", "Datos inválidos: " + e.getMessage());
        }
    }
    private Cita buildCita(){
        String id = txtIdCita.getText();
        LocalDate fecha = dtpFecha.getValue();
        Hora hora = cbxHora.getValue();
        Sede sede = cbxSede.getValue();
        String consultorio = txtConsultorio.getText();
        Mascota mascota = cbxMascota.getValue();
        Veterinario veterinario = cbxVeterinario.getValue();
        Cita cita = new Cita(id, fecha, hora, sede, consultorio, veterinario);
        return cita;
    }
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    public void initialize(){
        cbxMascota.getItems().addAll(registroCitaController.obtenerListaMascotas());
        cbxMascota.setConverter(new StringConverter<Mascota>() {
            @Override
            public String toString(Mascota mascota) {
                return mascota != null ? mascota.getNombre() : "";
            }

            @Override
            public Mascota fromString(String s) {
                return null;
            }
        });
        cbxVeterinario.getItems().addAll(registroCitaController.obtenerListaVeterinarios());
        cbxVeterinario.setConverter(new StringConverter<Veterinario>() {
            @Override
            public String toString(Veterinario veterinario) {
                return veterinario != null ? veterinario.getNombre() : "";
            }

            @Override
            public Veterinario fromString(String s) {
                return null;
            }
        });
        cbxSede.getItems().addAll(Sede.values());
    }
    public void setApp(App app){
        this.app = app;
    }
    public void setRegistroCitaController(RegistroCitaController registroCitaController){
        this.registroCitaController = registroCitaController;
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

}
