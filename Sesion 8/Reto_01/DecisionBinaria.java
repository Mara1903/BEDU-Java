package Reto_01;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¿Qué deseas hacer? (1. Avanzar, o 2. Retroceder)");
            int eleccion = scanner.nextInt();
            return eleccion == 1;
        }
    }
}