module co.edu.uniquindio.poo.ClinicaVet {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.ClinicaVet to javafx.fxml;
    exports co.edu.uniquindio.poo.ClinicaVet;
    exports co.edu.uniquindio.poo.ClinicaVet.viewController;
    opens co.edu.uniquindio.poo.ClinicaVet.viewController to javafx.fxml;

}