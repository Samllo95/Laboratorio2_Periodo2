/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class TipoEdificio extends Edificio implements EdificioEducativo, EdificioHospitalario, EdificioPolideportivo{
    public String AdminEdificio;
    public String TipoEdificio;

    public TipoEdificio(String AdminEdificio, String TipoEdificio, int numPisos, double tamTerreno, int totalTrabajadores, int numAscensores, int numPuertas, String ubucacion, String nombreEdificio) {
        super(numPisos, tamTerreno, totalTrabajadores, numAscensores, numPuertas, ubucacion, nombreEdificio);
        this.AdminEdificio = AdminEdificio;
        this.TipoEdificio = TipoEdificio;
    }

    
    
    public String limpiesa(){
        return "Se esta haciendo limpiesa";
    }

    @Override
    public String ensesarMatematicas() {
        return "Se estan enseñando Matematicas en las aulas";
    }

    @Override
    public String ensesarSociales() {
        return "Se estan enseñando Sociales en las aulas";
    }

    @Override
    public String hospitalizarEnfermos() {
        return "Se a Hospitalizado a un paciente en estado de critico";
    }

    @Override
    public String atenderPacientes() {
        return "Los pacientes se atienden en el pacillo H";
    }

    @Override
    public String practicarNatacion() {
        return "Pudes practicar Natacion en el Polideportivo";
    }

    @Override
    public String practicarFutbol() {
        return "Pudes practicar Futbol en el Polideportivo";
    }

    @Override
    public String datosEdificio() {
        String dt="Administrador del Edificio: " + this.AdminEdificio + "\n" + 
                "Tipo de Edificio: " + this.TipoEdificio + "\n";
        return dt + super.datosEdificio();
    }
    
    
    
}
