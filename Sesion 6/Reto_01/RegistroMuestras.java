package Reto_01;
import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // ArrayList para registrar el orden de llegada de las muestras genéticas
        ArrayList<String> muestras = new ArrayList<>();

        // Nombres de las especies en orden
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // HashSet para obtener las especies únicas procesadas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // HashMap para asociar el ID de muestra con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // Asociaciones ID → Investigador
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\nAsignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Búsqueda de investigador por ID de muestra
        String idBuscar = "M-002";
        System.out.println("\nInvestigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}