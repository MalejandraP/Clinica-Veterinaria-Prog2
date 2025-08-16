module co.edu.uniquindio.poo.clinicaVet {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.clinicavet to javafx.fxml;
    exports co.edu.uniquindio.poo.clinicavet;
    exports co.edu.uniquindio.poo.clinicavet.viewController;
    opens co.edu.uniquindio.poo.clinicavet.viewController to javafx.fxml;

}
