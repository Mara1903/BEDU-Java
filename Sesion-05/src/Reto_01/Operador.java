package Reto_01;

// Clase Operador que representa al operador de una unidad de emergencia
public class Operador {
    String nombre;

    // Constructor de la clase Operador
    public Operador(String nombre) {
        this.nombre = nombre;
    }

    // Método reportarse que imprime un mensaje indicando que el operador se está reportando
    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }
}