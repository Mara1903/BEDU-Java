package Reto_01;

public class Ambulancia extends UnidadEmergencia {
     // Atributos privados de la clase Ambulancia
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    // Constructor de la clase Ambulancia
    public Ambulancia(String nombre, String nombreOperador) {
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
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }
}