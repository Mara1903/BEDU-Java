package Reto_01;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    // Método para mostrar los datos del paciente
    void mostrarInformacion() {
        System.out.println("\nPaciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}