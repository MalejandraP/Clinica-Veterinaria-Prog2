package co.edu.uniquindio.poo.clinicavet.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeterinariaTest {

    @Test
    void verificarPropietario() {
        Veterinaria veterinaria=new Veterinaria("Merry","Alabasta", Sede.SEDE1);
        Propietario propietario1=new Propietario("Carlos","123","456","AbenidaQuensinton");
        assertFalse(veterinaria.verificarPropietario(propietario1.getId()));
    }

    @Test
    void verificarMascota() {
        Veterinaria veterinaria = new Veterinaria("veterinaria2", "direccion2", Sede.SEDE2);
        Propietario propetario = new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota1= new Mascota("Wilbur", "pitbull", 3, "1234", Especie.PERRO, propetario);
        assertFalse(veterinaria.verificarMascota(mascota1.getId()));

    }

    @Test
    void verificarVeterinario() {
        Veterinaria veterinaria=new Veterinaria("veterinaria3","direccion3",Sede.SEDE3);
        Veterinario veterinario1=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        veterinaria.agregarVeterinario(veterinario1);
        assertTrue(veterinaria.verificarVeterinario(veterinario1.getId()));
    }

    @Test
    void verificarSecretaria() {
        Veterinaria veterinaria=new Veterinaria("veterinaria4","direccion4",Sede.SEDE2);
        Secretaria secretaria1=new Secretaria("Sandra","312",10000,"Uñas");
        assertFalse(veterinaria.verificarSecretaria(secretaria1.getId()));
    }

    @Test
    void verificarAseo() {
        Veterinaria veterinaria=new Veterinaria("veterinaria5","direccion5",Sede.SEDE1);
        Aseo aseador1=new Aseo("Jhon","359",5000);
        assertFalse(veterinaria.verificarAseo(aseador1.getId()));
    }

    @Test
    void verificarConsulta() {
        Veterinaria veterinaria=new Veterinaria("V1","D1",Sede.SEDE3);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta1=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.CUARTACITA4A6PM,"Le duele el estomago","Comer algo en mal estado",veterinario);
        assertFalse(veterinaria.verificarConsulta(consulta1.getId()));
    }

    @Test
    void verificarCita() {
        Veterinaria veterinaria=new Veterinaria("V2","D2",Sede.SEDE2);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Cita cita1=new Cita("345",LocalDate.of(2025,7,4),Hora.PRIMERCITA8A10AM,Sede.SEDE1,"La que fuese",mascota,veterinario);
        assertFalse(veterinaria.verificarCita(cita1.getId()));
    }

    @Test
    void verificarTratamiento() {
        Veterinaria veterinaria=new Veterinaria("V5","D5",Sede.SEDE1);
        Tratamiento tratamiento1=new Tratamiento("Medicina","777","Buena cantidad","Cada noche");
        veterinaria.agregarTratamiento(tratamiento1);
        assertTrue(veterinaria.verificarTratamiento(tratamiento1.getId()));
    }

    @Test
    void eliminarPropietario() {
        Veterinaria veterinaria=new Veterinaria("veterinaria6","direccion6",Sede.SEDE1);
        Propietario propietario2=new Propietario("Pacho","321","654","Abenida");
        veterinaria.agregarPropietario(propietario2);
        assertFalse(veterinaria.eliminarPropietario(propietario2.getId()));
    }

    @Test
    void eliminarMascota() {
        Veterinaria veterinaria=new Veterinaria("veterinaria7","direccion7",Sede.SEDE1);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota2=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        assertFalse(veterinaria.eliminarMascota(mascota2.getId()));
    }

    @Test
    void eliminarVeterinario() {
        Veterinaria veterinaria=new Veterinaria("veterinaria8","direccion8",Sede.SEDE2);
        Veterinario veterinario2=new Veterinario("Raul","234","cualquiera",Especialidad.EXOTICOS);
        veterinaria.agregarVeterinario(veterinario2);
        assertTrue(veterinaria.eliminarVeterinario(veterinario2.getId()));
    }

    @Test
    void eliminarSecretaria() {
        Veterinaria veterinaria=new Veterinaria("veterinaria9","direccion9",Sede.SEDE2);
        Secretaria secretaria2=new Secretaria("Marta","312",10000,"Cabello");
        veterinaria.agregarSecretaria(secretaria2);
        assertTrue(veterinaria.eliminarSecretaria(secretaria2.getId()));
    }

    @Test
    void eliminarAseo() {
        Veterinaria veterinaria=new Veterinaria("veterinaria10","direccion10",Sede.SEDE2);
        Aseo aseador2=new Aseo("Juan Jose","359",5000);
        assertFalse(veterinaria.eliminarAseo(aseador2.getId()));
    }

    @Test
    void eliminarCita() {
        Veterinaria veterinaria=new Veterinaria("V3","D3",Sede.SEDE3);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Cita cita2=new Cita("345", LocalDate.of(2025,7,4),Hora.PRIMERCITA8A10AM,Sede.SEDE1,"La que fuese",mascota,veterinario);
        assertFalse(veterinaria.eliminarCita(cita2.getId()));
    }

    @Test
    void eliminarConsulta() {
        Veterinaria veterinaria=new Veterinaria("V4","D4",Sede.SEDE3);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta2=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.PRIMERCITA8A10AM,"Caga mucho","Comer algo en mal estado",veterinario);
        assertFalse(veterinaria.eliminarConsulta(consulta2.getId()));
    }

    @Test
    void eliminarTratamiento() {
        Veterinaria veterinaria=new Veterinaria("V6","D6",Sede.SEDE3);
        Tratamiento tratamiento2=new Tratamiento("Medic","7778","Buena cantidad","Cada noche");
        assertFalse(veterinaria.eliminarTratamiento(tratamiento2.getId()));
    }

    @Test
    void agregarPropietario() {
        Veterinaria veterinaria=new Veterinaria("V7","D7",Sede.SEDE2);
        Propietario propietario3=new Propietario("Willian","584","123","END");
        assertFalse(veterinaria.agregarPropietario(propietario3));
    }

    @Test
    void agregarMascota() {
        Veterinaria veterinaria=new Veterinaria("V8","D8",Sede.SEDE1);
        Propietario propietario3=new Propietario("Vivi","584","123","Alabasta");
        Mascota mascota3=new Mascota("Karou","PatoGigante",4,"717",Especie.AVE,propietario3);
        veterinaria.agregarMascota(mascota3);
        assertFalse(veterinaria.agregarMascota(mascota3));
    }

    @Test
    void agregarVeterinario() {
        Veterinaria veterinaria=new Veterinaria("V9","D9",Sede.SEDE1);
        Veterinario veterinario3=new Veterinario("nombre","234","cualquiera",Especialidad.GRANDES);
        veterinaria.agregarVeterinario(veterinario3);
        assertFalse(veterinaria.agregarVeterinario(veterinario3));
    }

    @Test
    void agregarSecretaria() {
        Veterinaria veterinaria=new Veterinaria("V01","D01",Sede.SEDE1);
        Secretaria secretaria3=new Secretaria("Alejandra","312",10000,"Archivar");
        assertTrue(veterinaria.agregarSecretaria(secretaria3));
    }

    @Test
    void agregarAseo() {
        Veterinaria veterinaria=new Veterinaria("V02","D02",Sede.SEDE2);
        Aseo aseador3=new Aseo("Mike","359",5000);
        veterinaria.agregarAseo(aseador3);
        assertFalse(veterinaria.agregarAseo(aseador3));
    }

    @Test
    void agregarCita() {
        Veterinaria veterinaria = new Veterinaria("V03", "D03",Sede.SEDE3);
        Propietario propetario = new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota = new Mascota("Wilbur", "pitbull", 3, "123", Especie.PERRO, propetario);
        Veterinario veterinario = new Veterinario("nombre", "234", "cualquiera", Especialidad.PEQUENIOS);
        Cita cita3 = new Cita("345", LocalDate.of(2025, 07, 04), Hora.PRIMERCITA8A10AM, Sede.SEDE1, "La que fuese", mascota, veterinario);
        assertFalse(veterinaria.agregarCita(cita3));
    }

    @Test
    void disponibilidadCitas() {
    }

    @Test
    void agregarConsulta() {
        Veterinaria veterinaria=new Veterinaria("V04","D04",Sede.SEDE3);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta3=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.SEGUNDCITA10A12PM,"Caga mucho","Comer algo en mal estado",veterinario);
        veterinaria.agregarConsulta(consulta3);
        assertFalse(veterinaria.agregarConsulta(consulta3));
    }

    @Test
    void agregarTratamiento() {
        Veterinaria veterinaria=new Veterinaria("V05","D05",Sede.SEDE1);
        Tratamiento tratamiento3=new Tratamiento("Medicina","777","Buena cantidad","Cada noche");
        assertTrue(veterinaria.agregarTratamiento(tratamiento3));
    }

    @Test
    void actualizarPropietario() {
        Veterinaria veterinaria=new Veterinaria("V06","D06",Sede.SEDE1);
        Propietario propietario4=new Propietario("Roberto","584","123","Boom");
        Propietario propietarioNuevo= new Propietario("Carlos", "36", "310478936","la casona" );
        assertFalse(veterinaria.actualizarPropietario(propietario4.getId(),propietarioNuevo));
    }

    @Test
    void actualizarMascota() {
        Veterinaria veterinaria=new Veterinaria("V07","D08",Sede.SEDE2);
        Propietario propietario4=new Propietario("Vivi","584","123","Alabasta");
        Mascota mascota4=new Mascota("Karou","PatoGigante",4,"717",Especie.AVE,propietario4);
        Mascota mascotaNueva = new Mascota("Karou", "pato", 2, "369", Especie.AVE, propietario4);
        assertFalse(veterinaria.actualizarMascota(mascota4.getId(),mascotaNueva));
    }

    @Test
    void actualizarVeterinario() {
        Veterinaria veterinaria=new Veterinaria("V09","D09",Sede.SEDE3);
        Veterinario veterinario4=new Veterinario("nombre","234","cualquiera",Especialidad.GRANDES);
        Veterinario vetNuevo = new Veterinario("Carlos", "234", "cualaquiera", Especialidad.GRANDES);
        veterinaria.agregarVeterinario(veterinario4);
        assertTrue(veterinaria.actualizarVeterinario(veterinario4.getId(), vetNuevo));
    }

    @Test
    void actualizarSecretaria() {
        Veterinaria veterinaria=new Veterinaria("V010","D010",Sede.SEDE1);
        Secretaria secretaria4=new Secretaria("Celeste","312",10000,"Diseño");
        Secretaria secNueva=new Secretaria("Amparo", "312", 80000, "Atención cliente");
        veterinaria.agregarSecretaria(secretaria4);
        assertTrue(veterinaria.actualizarSecretaria(secretaria4.getId(),secNueva));
    }

    @Test
    void actualizarAseo() {
        Veterinaria veterinaria=new Veterinaria("Ve1","Di1",Sede.SEDE2);
        Aseo aseador4=new Aseo("Alferdo","359",5000);
        assertFalse(veterinaria.actualizarAseo(aseador4.getId(),aseador4));
    }

    @Test
    void actualizarCita() {
        Veterinaria veterinaria=new Veterinaria("Ve2","Di2",Sede.SEDE3);
        Propietario propetario = new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota = new Mascota("Wilbur", "pitbull", 3, "123", Especie.PERRO, propetario);
        Veterinario veterinario = new Veterinario("nombre", "234", "cualquiera", Especialidad.PEQUENIOS);
        Cita cita4= new Cita("345", LocalDate.of(2025, 07, 04), Hora.PRIMERCITA8A10AM, Sede.SEDE1, "La que fuese", mascota, veterinario);
        assertFalse(veterinaria.actualizarCita(cita4.getId(),cita4));
    }

    @Test
    void actualizarConsulta() {
        Veterinaria veterinaria=new Veterinaria("Ve3","Di3",Sede.SEDE2);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta4=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.SEGUNDCITA10A12PM,"Le duele la barriga","Comer algo en mal estado",veterinario);
        Consulta consultaNueva=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.CUARTACITA4A6PM,"Le duele la barriga","Comer una canica",veterinario);
        assertFalse(veterinaria.actualizarConsulta(consulta4.getId(),consultaNueva));
    }

    @Test
    void actualizarTratamiento() {
        Veterinaria veterinaria=new Veterinaria("Ve4","Di4",Sede.SEDE3);
        Tratamiento tratamiento4=new Tratamiento("Medicina","777","Buena cantidad","Cada noche");
        assertFalse(veterinaria.actualizarTratamiento(tratamiento4.getId(),tratamiento4));
    }

    @Test
    void buscarPropietario() {
        Veterinaria veterinaria=new Veterinaria("Ve5","Di5",Sede.SEDE1);
        Propietario propietario5=new Propietario("Silvia","584","123","Wander");
        assertNull(veterinaria.buscarPropietario(propietario5.getId()));
    }

    @Test
    void buscarMascota() {
        Veterinaria veterinaria=new Veterinaria("Ve6","Di6",Sede.SEDE2);
        Propietario propietario=new Propietario("Vivi","584","123","Alabasta");
        Mascota mascota5=new Mascota("Karou","PatoGigante",4,"717",Especie.AVE,propietario);
        assertNull(veterinaria.buscarMascota(mascota5.getId()));
    }

    @Test
    void buscarVeterinario() {
        Veterinaria veterinaria=new Veterinaria("Ve7","Di7",Sede.SEDE3);
        Veterinario veterinario5=new Veterinario("nombre","234","cualquiera",Especialidad.EXOTICOS);
        assertNull(veterinaria.buscarVeterinario(veterinario5.getId()));
    }

    @Test
    void buscarSecretaria() {
        Veterinaria veterinaria=new Veterinaria("Ve8","Di8",Sede.SEDE2);
        Secretaria secretaria5=new Secretaria("Colek","312",10000,"Cocinar");
        veterinaria.agregarSecretaria(secretaria5);
        assertNotNull(veterinaria.buscarSecretaria(secretaria5.getId()));
    }

    @Test
    void buscarAseo() {
        Veterinaria veterinaria=new Veterinaria("Ve9","Di9",Sede.SEDE1);
        Aseo aseador5=new Aseo("Wall-E","359",5000);
        assertNull(veterinaria.buscarAseo(aseador5.getId()));
    }

    @Test
    void buscarCita() {
        Veterinaria veterinaria=new Veterinaria("Ve10","Di10",Sede.SEDE1);
        Propietario propetario = new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota = new Mascota("Wilbur", "pitbull", 3, "123", Especie.PERRO, propetario);
        Veterinario veterinario = new Veterinario("nombre", "234", "cualquiera", Especialidad.PEQUENIOS);
        Cita cita5= new Cita("345", LocalDate.of(2025, 07, 04), Hora.PRIMERCITA8A10AM, Sede.SEDE1, "La que fuese", mascota, veterinario);
        assertNull(veterinaria.buscarCita(cita5.getId()));
    }

    @Test
    void buscarConsulta() {
        Veterinaria veterinaria=new Veterinaria("Vet1","Dir1",Sede.SEDE3);
        Propietario propetario=new Propietario("sebastian","101","312","QUEEN");
        Mascota mascota=new Mascota("Wilbur","pitbull",3,"123",Especie.PERRO,propetario);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta5=new Consulta("456",mascota,LocalDate.of(2025,8,16),Hora.PRIMERCITA8A10AM,"Le duele la barriga","Comer algo en mal estado",veterinario);
        veterinaria.agregarConsulta(consulta5);
        assertNotNull(veterinaria.buscarConsulta(consulta5.getId()));
    }

    @Test
    void buscarTramiento() {
        Veterinaria veterinaria=new Veterinaria("Vet2","Dir2",Sede.SEDE2);
        Tratamiento tratamiento5=new Tratamiento("Medicina","777","Buena cantidad","Cada noche");
        assertNull(veterinaria.buscarTramiento(tratamiento5.getId()));
    }

    @Test
    void cantidadPerros() {
        Veterinaria veterinaria=new Veterinaria("Vet3","Dir3",Sede.SEDE2);
        Propietario propietario=new Propietario("Ferris","584","123","Abenida Lincon");
        Mascota perro1=new Mascota("Booster","pitbull",3,"123",Especie.PERRO,propietario);
        Mascota perro2=new Mascota("Brutus","American Bulin",1,"321",Especie.PERRO,propietario);
        veterinaria.agregarMascota(perro1);
        veterinaria.agregarMascota(perro2);
        assertEquals(2,veterinaria.cantidadPerros());
    }

    @Test
    void cantidadGatos() {
        Veterinaria veterinaria=new Veterinaria("Vet4","Dir4",Sede.SEDE1);
        Propietario propietario=new Propietario("Ferris","584","123","Abenida Lincon");
        Mascota gato1=new Mascota("Lucky","Misma que la de Garlfiel",3,"123",Especie.GATO,propietario);
        Mascota gato2=new Mascota("Misty","Alguna otra",1,"321",Especie.GATO,propietario);
        Mascota gato3=new Mascota("Barry","Alen",2,"456",Especie.GATO,propietario);
        veterinaria.agregarMascota(gato1);
        veterinaria.agregarMascota(gato2);
        veterinaria.agregarMascota(gato3);
        assertNotEquals(2,veterinaria.cantidadGatos());
    }

    @Test
    void cantidadAves() {
        Veterinaria veterinaria=new Veterinaria("Vet5","Dir5",Sede.SEDE1);
        Propietario propietario=new Propietario("Vivi","584","123","Alabasta");
        Mascota ave1=new Mascota("Karou","PatoGigante",4,"717",Especie.AVE,propietario);
        veterinaria.agregarMascota(ave1);
        assertEquals(1,veterinaria.cantidadAves());
    }

    @Test
    void cantidadOtrasMascotas() {
        Veterinaria veterinaria=new Veterinaria("vet6","Dir6",Sede.SEDE2);
        Propietario propietario=new Propietario("Luffy","584","1232","Mar del Este");
        Mascota otro1=new Mascota("Ku","Dugongs",7,"717",Especie.OTRO,propietario);
        Mascota otro2=new Mascota("Tako","Pulpo",5,"222",Especie.OTRO,propietario);
        veterinaria.agregarMascota(otro1);
        veterinaria.agregarMascota(otro2);
        assertEquals(2,veterinaria.cantidadOtrasMascotas());
    }

    @Test
    void hallarListaCitasVeterinario() {
        Veterinaria veterinaria=new Veterinaria("Vet7","Dir7",Sede.SEDE3);
        Propietario propetario1= new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota1= new Mascota("Wilbur", "pitbull", 3, "123", Especie.PERRO, propetario1);
        Propietario propetario2= new Propietario("sebas", "010", "312", "QUEEN");
        Mascota mascota2= new Mascota("Wilson", "pitbull", 3, "321", Especie.PERRO, propetario2);
        Veterinario veterinario6= new Veterinario("Simon", "234", "cualquiera", Especialidad.PEQUENIOS);
        Cita cita1= new Cita("345", LocalDate.of(2025, 8, 16), Hora.PRIMERCITA8A10AM, Sede.SEDE1, "La que fuese", mascota1, veterinario6);
        Cita cita2=new Cita("456",LocalDate.of(2025,8,16),Hora.TERCERACITA2A4PM,Sede.SEDE1,"la asignada",mascota2,veterinario6);
        veterinaria.agregarCita(cita1);
        veterinaria.agregarCita(cita2);
        List<Cita> citasEsperadas= Arrays.asList(cita1,cita2);
        List<Cita> resultados=veterinaria.hallarListaCitasVeterinario(veterinario6.getId(),LocalDate.of(2025,8,16));
        assertIterableEquals(citasEsperadas,resultados);
    }

    @Test
    void hallarlistaConsultasMascota() {
        Veterinaria veterinaria=new Veterinaria("Vet8","Dir8",Sede.SEDE3);
        Propietario propetario1= new Propietario("sebastian", "101", "312", "QUEEN");
        Mascota mascota1= new Mascota("Wilbur", "pitbull", 3, "123", Especie.PERRO, propetario1);
        Veterinario veterinario=new Veterinario("nombre","234","cualquiera",Especialidad.PEQUENIOS);
        Consulta consulta1=new Consulta("456",mascota1,LocalDate.of(2025,8,16),Hora.SEGUNDCITA10A12PM,"Le duele la barriga","Comer algo en mal estado",veterinario);
        Consulta consulta2=new Consulta("456",mascota1,LocalDate.of(2025,8,16),Hora.SEGUNDCITA10A12PM,"Le duele la barriga","Comer algo en mal estado",veterinario);
        veterinaria.agregarConsulta(consulta1);
        veterinaria.agregarConsulta(consulta2);
        List<Consulta> consultasEsperadas= Arrays.asList(consulta1,consulta2);
        List<Consulta> resultados=veterinaria.hallarlistaConsultasMascota(mascota1.getId());
        assertIterableEquals(consultasEsperadas,resultados);
    }
}