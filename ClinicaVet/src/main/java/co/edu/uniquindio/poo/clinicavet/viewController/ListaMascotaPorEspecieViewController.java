package co.edu.uniquindio.poo.clinicavet.viewController;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.controller.ListaMascotaPorEspecieController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaMascotaPorEspecieViewController {
    private App app;
    private ListaMascotaPorEspecieController controller;

    @FXML
    private Button btnRegresar;
    @FXML
    private Label lblPerro, lblGato, lblAve, lblOtro;
    @FXML
    void onRegresar(){
        irASecretaria();
    }
    @FXML
    private void irASecretaria(){
        controller.irASecretaria();
    }
    public void initialize(){
        int cantPerros = controller.cantPerros();
        int cantGatos = controller.cantGatos();
        int cantAve = controller.cantAves();
        int cantOtro = controller.cantOtros();
        lblPerro.setText(String.valueOf(cantPerros));
        lblGato.setText(String.valueOf(cantGatos));
        lblAve.setText(String.valueOf(cantAve));
        lblOtro.setText(String.valueOf(cantOtro));
    }

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    public void setApp(App app) {
        this.app = app;
    }
    public void setListaMascotaPorEspecieController(ListaMascotaPorEspecieController controller) {
        this.controller = controller;
    }
}
