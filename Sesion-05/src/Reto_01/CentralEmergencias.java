package Reto_01;

public class CentralEmergencias {
    public static void main(String[] args) {
        // Creación de objetos de diferentes unidades de emergencia
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Mia");
        Patrulla patrulla = new Patrulla("Patrulla", "Paola");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "José Luis");

         // Inicia la operación de la ambulancia
        ambulancia.iniciarOperacion();
        System.out.println();

        // Inicia la operación de la patrulla
        patrulla.iniciarOperacion();
        System.out.println();

        // Inicia la operación de la unidad de bomberos
        bomberos.iniciarOperacion();
    }
}