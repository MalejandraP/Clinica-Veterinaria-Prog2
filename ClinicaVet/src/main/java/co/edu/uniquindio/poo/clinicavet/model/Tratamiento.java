package co.edu.uniquindio.poo.clinicavet.model;

public class Tratamiento {
    private String medicamento;
    private String dosis;
    private String tiempo;

    public Tratamiento(String medicamento, String dosis, String tiempo) {
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.tiempo = tiempo;

    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}