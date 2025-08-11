module co.edu.uniquindio.poo.clinicavet {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.clinicavet to javafx.fxml;
    exports co.edu.uniquindio.poo.clinicavet;
}