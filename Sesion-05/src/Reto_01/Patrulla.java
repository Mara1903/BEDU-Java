package Reto_01;

public class Patrulla extends UnidadEmergencia {
    // Atributos privados de la clase Patrulla
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

     // Constructor de la clase Patrulla
    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    // Método iniciarOperacion que simula el inicio de una operación de emergencia
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    // Método sobreescrito responder de la clase padre (UnidadEmergencia)
    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
    }
}