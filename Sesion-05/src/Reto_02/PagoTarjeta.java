package Reto_02;

public class PagoTarjeta extends MetodoPago {
    // Atributo privado que almacena el saldo disponible en la tarjeta
    private double saldoDisponible;

    // Constructor que inicializa el monto del pago y el saldo disponible
    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    // Verificar si el saldo disponible es suficiente
    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
    }

    // Método que procesa el pago con tarjeta
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}