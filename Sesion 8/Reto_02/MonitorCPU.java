package Reto_02;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Set<Double> consumosCPU = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Monitoreo de CPU - Ingresa los consumos (porcentaje).");
            System.out.println("Ingresa un valor negativo para finalizar.");

            while (true) {
                System.out.print("Ingrese el consumo de CPU del servidor (%): ");
                
                // Validando que sea numérico
                double consumo = scanner.nextDouble();

                // Verificando si desea finalizar
                if (consumo < 0) {
                    break;
                }

                // Validando el rango permitido
                if (consumo > 100) {
                    System.out.println("El consumo no puede ser mayor a 100%.");
                    continue;
                }

                // Verificando duplicados
                if (!consumosCPU.add(consumo)) {
                    System.out.println("El consumo ingresado ya existe. Intenta otro.");
                    continue;
                }

                // Verificando consumo crítico
                if (consumo > 95) {
                    throw new ConsumoCriticoException("¡Consumo crítico detectado: " + consumo + "%!");
                }

                System.out.println("Consumo registrado: " + consumo + "%");
            }

            System.out.println("\nMonitoreo completado.");
            System.out.println("Consumos registrados: " + consumosCPU);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un valor numérico.");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos cerrados correctamente.");
        }
    }
}