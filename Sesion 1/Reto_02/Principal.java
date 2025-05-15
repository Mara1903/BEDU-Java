package Reto_02;

// Clase principal
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de Morat", 1700.00);
        Entrada entrada2 = new Entrada("Meet and Greet de Dylan O'brien", 3200.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Desafío adicional
        Entrada_Record entrada3= new Entrada_Record("Obra de Teatro Lalaland", 599.99);
        entrada3.mostrarInformacion();
    }
}