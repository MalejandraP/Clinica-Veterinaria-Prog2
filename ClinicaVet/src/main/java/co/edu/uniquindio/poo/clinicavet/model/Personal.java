package co.edu.uniquindio.poo.clinicavet.model;

public class Personal extends Persona{
    private double salario;

    public Personal(String nombre, String id, double salario) {
        super(nombre, id);
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}