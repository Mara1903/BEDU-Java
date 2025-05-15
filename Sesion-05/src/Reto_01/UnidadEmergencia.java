package Reto_01;

// Clase abstracta que sirve como base para diferentes tipos de unidades de emergencia
public abstract class UnidadEmergencia {
    String nombre;

     // Constructor que inicializa el nombre de la unidad
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Método concreto que activa la unidad, mostrando un mensaje con su nombre
    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }

    // Método abstracto que obliga a las subclases a implementar su forma específica de responder a emergencias
    public abstract void responder();
}