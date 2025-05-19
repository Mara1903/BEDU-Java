package Reto_01;

public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo gestorDialogo;
    private final LogicaDecision logicaDecision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicion = transicion;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void iniciar() {
        gestorDialogo.mostrarDialogo("Bienvenido al juego narrativo.");
        gestorDialogo.mostrarDialogo("Te encuentras en una encrucijada...");
        boolean decision = logicaDecision.tomarDecision();
        
        if (decision) {
            gestorDialogo.mostrarDialogo("Decidiste avanzar hacia el bosque oscuro.");
        } else {
            gestorDialogo.mostrarDialogo("Decidiste regresar a la aldea segura.");
        }

        transicion.transicionar();
        gestorDialogo.mostrarDialogo("Gracias por jugar.");
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo gestorDialogo = new DialogoTexto();
        LogicaDecision logicaDecision = new DecisionBinaria();
        
        MainNarrativa juego = new MainNarrativa(transicion, gestorDialogo, logicaDecision);
        juego.iniciar();
    }
}