/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Main {
    public static void main(String[] args) {
        TipoEdificio eEducativo=new TipoEdificio("Manuel", "Educativo", 3, 453.5, 112, 0, 77, "Centro", "Matias B");
        TipoEdificio ePolideportivo=new TipoEdificio("Josep", "Deportes", 2, 788.5, 89, 0, 55, "Santo Tomas", "El Trapiche");
        TipoEdificio eHospitalario=new TipoEdificio("Pedro Leonel", "Hospital", 7, 855.5, 199, 2, 166, "Centro", "ISSS");
        
        
        System.out.println("\nEdificio Educativo*****************************************************");
        System.out.println(eEducativo.datosEdificio());
        System.out.println(eEducativo.ensesarMatematicas());
        System.out.println(eEducativo.ensesarSociales());
        
        System.out.println("\nEdificio Polideportivo*****************************************************");
        System.out.println(ePolideportivo.datosEdificio());
        System.out.println(ePolideportivo.practicarFutbol());
        System.out.println(ePolideportivo.practicarNatacion());
        
        System.out.println("\nEdificio Hospitalario*****************************************************");
        System.out.println(eHospitalario.datosEdificio());
        System.out.println(eHospitalario.hospitalizarEnfermos());
        System.out.println(eHospitalario.atenderPacientes());
        
    }
}
