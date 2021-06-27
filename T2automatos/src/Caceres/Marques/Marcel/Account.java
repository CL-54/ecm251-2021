package Caceres.Marques.Marcel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Account {
    //Atributos da classe Contas
    private double balance;

    // cria construtor
    public Account(double saldoInicial) {
        this.balance = saldoInicial;

    }


    //função para depósito
    public void deposit(int i) {
        this.balance = this.balance + i;

    }

    //função para retirada
    public boolean withdraw(int j) {
        if (j <= this.balance) {
            this.balance = this.balance - j;
            return true;
        }
        return false;
    }


    public int givenList_shouldReturnARandomElement() {
        List<Integer> givenList = Arrays.asList(10, 20, 50, 100);
        Random rand = new Random();
        int randomElement = givenList.get(rand.nextInt(givenList.size()));
        return randomElement;
    }

    public double mostrasaldo(){
        return balance;
    }

}
