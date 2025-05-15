package Reto_02;
import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor que convierte el RFC en opcional
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        
        // Devolver resumen
        return resumen;
    }
}