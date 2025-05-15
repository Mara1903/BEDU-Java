package Reto_02;

public abstract class MetodoPago implements Autenticable {
    protected double monto;

     // Constructor que inicializa el monto del pago
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void procesarPago();

    // Mostrar resumen del pago
    public void mostrarResumen() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}