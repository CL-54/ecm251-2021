//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;

import java.util.Random;


public class Transacoes {
    private int valor;

    //Métodos da Classe Transacoes


    public Transacoes(int valor) {
        this.valor = valor;
    }

    //funçao para gerar um numero inteiro aleatório
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //cria o Qrcode
    public String Qrcode(Contas con1){
        int code = getRandomNumberInRange(1000, 9999);
        return ((con1.idConta) + ";" + (con1.usuario.nome) + ";" + valor + ";" + code);
    }


}
