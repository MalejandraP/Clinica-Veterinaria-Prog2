package co.edu.uniquindio.poo.clinicavet.model;

import java.util.List;

public class Secretaria extends Personal{
    private String experiencia;
    private Veterinaria veterinaria;
    private List<Propietario> listPropietarios;
    private List<Veterinario> listVeterinarios;
    private List<Mascota> listMascotas;
    private List<Cita> listCitas;

    public Secretaria(String nombre, String id, double salario, String experiencia) {
        super(nombre, id, salario);
        this.experiencia = experiencia;
    }

    public void eliminarVeterinario(String id){
        App.veterinaria.eliminarVeterinario(id);
    }
    public void eliminarMascota(String id){
        App.veterinaria.eliminarMascota(id);
    }
    public void eliminarPropietario(String id){
        App.veterinaria.eliminarPropietario(id);
    }
    public void eliminarSecretaria(String id){
        App.veterinaria.eliminarSecretaria(id);
    }
    public void eliminarAseo(String id){
        App.veterinaria.eliminarAseo(id);
    }
    public void eliminarCita(String id){
        App.veterinaria.eliminarCita(id);
    }

    public void agregarPropietario(Propietario propietario){
        App.veterinaria.agregarPropietario(propietario);
    }
    public void agregarMascota(Mascota mascota){
        App.veterinaria.agregarMascota(mascota);
    }
    public void agregarVeterinario(Veterinario veterinario){
        App.veterinaria.agregarVeterinario(veterinario);
    }
    public void agregarSecretaria(Secretaria secretaria){
        App.veterinaria.agregarSecretaria(secretaria);
    }
    public void agregarAseo(Aseo aseo){
        App.veterinaria.agregarAseo(aseo);
    }
    public void agregarCita(Cita cita){
        App.veterinaria.agregarCita(cita);
    }
    public void actualizarPropietario(String id, Propietario actualizado){
        App.veterinaria.actualizarPropietario(id, actualizado);
    }
    public void actualizarMascota(String id, Mascota actualizado){
        App.veterinaria.actualizarMascota(id, actualizado);
    }
    public void actualizarVeterinario(String id, Veterinario actualizado){
        App.veterinaria.actualizarVeterinario(id, actualizado);
    }
    public void actualizarSecretaria(String id, Secretaria actualizado){
        App.veterinaria.actualizarSecretaria(id, actualizado);
    }
    public void actualizarAseo(String id, Aseo actualizado){
        App.veterinaria.actualizarAseo(id, actualizado);
    }
    public void actualizarCita(String id, Cita cita){
        App.veterinaria.actualizarCita(id, cita);
    }

    public int cantidadPerros(Mascota mascota){
        int perros= App.veterinaria.cantidadPerros(mascota);
        return perros;
    }
    public int cantidadGatos(Mascota mascota){
        int gatos= App.veterinaria.cantidadGatos(mascota);
        return gatos;
    }
    public int cantidadAves(Mascota mascota){
        int aves= App.veterinaria.cantidadAves(mascota);
        return aves;
    }
    public int cantidadOtrasMascotas(Mascota mascota){
        int otros= App.veterinaria.cantidadOtrasMascotas(mascota);
        return otros;
    }






    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public List<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(List<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    public List<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }

    public void setListVeterinarios(List<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    public List<Mascota> getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(List<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}
