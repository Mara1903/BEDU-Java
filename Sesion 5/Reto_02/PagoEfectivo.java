package Reto_02;

public class PagoEfectivo extends MetodoPago {
    // Constructor que inicializa el monto del pago en efectivo
    public PagoEfectivo(double monto) {
        super(monto);
    }

    // Método de autenticación para pago en efectivo que devuelve true
    @Override
    public boolean autenticar() {
        return true;
    }

    // Método que procesa el pago en efectivo.
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}