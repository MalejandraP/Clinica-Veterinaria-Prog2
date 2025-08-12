package co.edu.uniquindio.poo.clinicavet.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private Sede sede;
    private List<Propietario> listPropietarios;
    private List<Mascota> listMascotas;
    private List<Veterinario> listVeterinarios;
    private List<Secretaria> listSecretarias;
    private List<Aseo> listAseos;
    private List<Cita> listCitas;
    private List<Personal> listPersonales;
    private List<Consulta> listConsultas;

    public Veterinaria(String nombre, String direccion, Sede sede) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.sede = sede;
        this.listPropietarios = new ArrayList<>();
        this. listMascotas = new ArrayList<>();
        this.listVeterinarios = new ArrayList<>();
        this.listSecretarias = new ArrayList<>();
        this.listAseos = new ArrayList<>();
        this.listCitas = new ArrayList<>();
        this.listPersonales = new ArrayList<>();
        this.listConsultas = new ArrayList<>();
    }

    public List<Consulta> getListConsultas() {
        return listConsultas;
    }

    public void setListConsultas(List<Consulta> listConsultas) {
        this.listConsultas = listConsultas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(List<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    public List<Mascota> getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(List<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public List<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }

    public void setListVeterinarios(List<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    public List<Secretaria> getListSecretarias() {
        return listSecretarias;
    }

    public void setListSecretarias(List<Secretaria> listSecretarias) {
        this.listSecretarias = listSecretarias;
    }

    public List<Aseo> getListAseos() {
        return listAseos;
    }

    public void setListAseos(List<Aseo> listAseos) {
        this.listAseos = listAseos;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public List<Personal> getListPersonales() {
        return listPersonales;
    }

    public void setListPersonales(List<Personal> listPersonales) {
        this.listPersonales = listPersonales;
    }
}
