package Reto_02;

public class CajaRegistradora {
    public static void main(String[] args) {
        // Arreglo de diferentes métodos de pago, cada uno con sus propios datos
        MetodoPago[] pagos = {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0, 500.0),
            new PagoTransferencia(250.0, false)
        };

        // Ciclo for-each que recorre cada método de pago en el arreglo
        for (MetodoPago pago : pagos) {
            // Verifica si el método de pago se autentica correctamente
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}