package co.edu.uniquindio.poo.clinicavet.model;

public class Secretaria extends Personal{
    private String experiencia;
    private Veterinaria veterinaria;

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
    public void eliminarConsulta(String id){
        App.veterinaria.eliminarConsulta(id);
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
    public void agregarConsulta(Consulta consulta){
        App.veterinaria.agregarConsulta(consulta);
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
    public void actualizarConsulta(String id, Consulta consulta){
        App.veterinaria.actualizarConsulta(id, consulta);
    }
    public void buscarPropietario(String id){
        App.veterinaria.buscarPropietario(id);
    }
    public  void buscarMascota(String id){
        App.veterinaria.buscarMascota(id);
    }
    public void buscarVeterinario(String id){
        App.veterinaria.buscarVeterinario(id);
    }
    public void buscarSecretaria(String id){
        App.veterinaria.buscarSecretaria(id);
    }
    public void buscarAseo(String id){
        App.veterinaria.buscarAseo(id);
    }
    public void buscarCita(String id){
        App.veterinaria.buscarCita(id);
    }
    public void buscarConsulta(String id){
        App.veterinaria.buscarConsulta(id);
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
}
