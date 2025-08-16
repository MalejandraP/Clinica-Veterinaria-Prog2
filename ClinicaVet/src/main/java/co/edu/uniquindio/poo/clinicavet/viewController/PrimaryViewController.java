package co.edu.uniquindio.poo.clinicavet.viewController;


import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.controller.PrimaryController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryViewController {
    private PrimaryController primaryController;
    private App app;

    public PrimaryViewController(){
    }

    public void setPrimaryController(PrimaryController primaryController) {
        this.primaryController = primaryController;
        if (this.app != null){
            this.primaryController.setApp(app);
        }
    }

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    private Button  btnIngresar;

    @FXML
    private TextField txtIdentificacion;


    @FXML
    void onIngresarId (){
        String id = txtIdentificacion.getText();
        boolean redireccionado = primaryController.redireccionarSegunId(id);
    }


    public void setApp(App app) {
        this.app = app;
        if (this.primaryController != null){
            this.primaryController.setApp(app);
        }
    }
    @FXML
    void initialize() {

    }
}
