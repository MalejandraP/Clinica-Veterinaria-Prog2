package co.edu.uniquindio.poo.clinicavet.viewController;

import co.edu.uniquindio.poo.clinicavet.App;
import co.edu.uniquindio.poo.clinicavet.controller.ListaConsultaPorMascotaController;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaConsultaPorMascotaViewController {
    private ListaConsultaPorMascotaController controller;
    private App app;
    private ListaConsultaPorMascotaController listaConsultaPorMascotaController;

    public void setApp(App app) {
        this.app = app;
    }

    public void setListaConsultaPorMascotaController(ListaConsultaPorMascotaController listaConsultaPorMascotaController) {
        this.listaConsultaPorMascotaController = listaConsultaPorMascotaController;
    }

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
}
