//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;

import java.util.Random;


public class Transacoes {
    //Métodos da Classe Transacoes


    //funçao para gerar um numero inteiro aleatório
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //cria um codigo para uma transaçao
    public static String Qrcode(){
        int code = getRandomNumberInRange(1000, 9999);
        String s= String.valueOf(code); // transforma o codigo em uma string
        return s;
    }


    public String transacao(String idConta, String nome, String valor, String code){


    }

}
