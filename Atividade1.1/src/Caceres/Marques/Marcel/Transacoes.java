package Caceres.Marques.Marcel;

import java.util.Random;


public class Transacoes {
    private int valor;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public Transacoes(int valor) {
        this.valor = valor;

    }

}
