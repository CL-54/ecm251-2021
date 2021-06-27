// Marcel Marques Caceres 17.00648-0
// João Vitor Sarti 18.01224-8
// Matheus Rossini de Souza 18.01060-0
package Caceres.Marques.Marcel;

import sun.misc.Signal;
import sun.misc.SignalHandler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account account = new Account(1000);
        System.out.println("Saldo inicial : " + account.mostrasaldo());
        Client client1 = new Client("Augustus", account);
        Client client2 = new Client("Lucius", account);
        Client client3 = new Client("Claudius", account);
        Client client4 = new Client("Tiberius", account);
        while(account.mostrasaldo() > 0) {
            List<Integer> givenList = Arrays.asList(1, 2, 3, 4);
            Random rand = new Random();
            int randomElement = givenList.get(rand.nextInt(givenList.size()));
            if (randomElement == 1){
            client1.execute();
            }
            if (randomElement == 2){
                client2.execute();
            }
            if (randomElement == 3){
                client3.execute();
            }
            if (randomElement == 4){
                client4.execute();
            }
            System.out.println("Saldo atualizado: " + account.mostrasaldo());
        }
        }
}