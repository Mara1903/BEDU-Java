package Reto_02;

public class PagoTransferencia extends MetodoPago {
    // Atributo privado que indica si la transferencia ha sido validada
    private boolean validadoExternamente;

    // Constructor que inicializa el monto del pago y el estado de validación externa
    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    // Verifica si la transferencia ha sido validada externamente
    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    // Método que procesa el pago por transferencia
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}