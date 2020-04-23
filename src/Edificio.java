/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Edificio {
    public int numPisos;
    public double tamTerreno;
    public int totalTrabajadores;
    public int numAscensores;
    public int numPuertas;
    public String ubucacion;
    public String nombreEdificio;

    public Edificio() {
    }

    public Edificio(int numPisos, double tamTerreno, int totalTrabajadores, int numAscensores, int numPuertas, String ubucacion, String nombreEdificio) {
        this.numPisos = numPisos;
        this.tamTerreno = tamTerreno;
        this.totalTrabajadores = totalTrabajadores;
        this.numAscensores = numAscensores;
        this.numPuertas = numPuertas;
        this.ubucacion = ubucacion;
        this.nombreEdificio = nombreEdificio;
    }
    
    
    public String datosEdificio(){
        String dt="Nombre del edificio: " + this.nombreEdificio + "\n" + 
                "Ubicacion: " + this.ubucacion + "\n" + 
                "Numero de trabajadores: " + this.totalTrabajadores + "\n" +
                "Numero de pisos: " + this.numPisos + "\n" + 
                "Numero de puertas: " + this.numPuertas + "\n" + 
                "Numero de ascensores: " + this.numAscensores + "\n" + 
                "Tamaño del terreno: " + this.tamTerreno + "m2\n";
        return dt;
    }
    
}
