package Reto_01;

public class UnidadBomberos extends UnidadEmergencia {
    // Atributos privados que representan los componentes de la unidad
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    // Constructor que recibe el nombre de la unidad y el nombre del operador
    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    // Método para iniciar la operación de emergencia
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    // Método sobreescrito para responder a emergencias específicas de bomberos
    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
}