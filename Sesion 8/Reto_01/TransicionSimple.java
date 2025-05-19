package Reto_01;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar() {
        System.out.println("Transición a una nueva escena...");
    }
}