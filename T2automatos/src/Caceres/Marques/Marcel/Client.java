package Caceres.Marques.Marcel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {
    public String name;
    public Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public int execute() {
        List<Integer> givenList = Arrays.asList(1, 2);
        Random rand = new Random();
        int randomElement = givenList.get(rand.nextInt(givenList.size()));
        List<Integer> givenlist = Arrays.asList(10, 20, 50, 100);
        Random randi = new Random();
        int valor = givenlist.get(randi.nextInt(givenlist.size()));
        if (randomElement == 1){
            System.out.println("Cliente : " + this.name + " depositou " + valor );
            account.deposit(valor);
        }else{
            System.out.println("Cliente : " + this.name + " sacou " + valor );
            account.withdraw(valor);
        }
        return randomElement;
    }



}
