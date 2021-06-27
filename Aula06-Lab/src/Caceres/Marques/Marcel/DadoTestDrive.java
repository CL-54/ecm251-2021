package Caceres.Marques.Marcel;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        System.out.println("Informaçoes do Dado:");
        System.out.println("Lançamento :" +
                d1.lancarDado());
        System.out.println("Lançamento Atual :" +
                d1.lerLancamentoAtual());

    }
}
