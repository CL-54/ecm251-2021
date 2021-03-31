//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;

public class Main {

    public static void main(String[] args) {
        //Cria objetos tipo Contas, Usuarios e Transacoes

        Contas c1 = new Contas("1", 1000, "jarbas", "42069", "jarbas@yahoo.com");
        Transacoes t1 = new Transacoes(10);

        System.out.println(t1.Qrcode(c1));













    }
}
