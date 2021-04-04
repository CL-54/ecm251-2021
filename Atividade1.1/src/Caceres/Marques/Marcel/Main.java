//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;

public class Main {

    public static void main(String[] args) {
        //Cria as contas

        Contas c1 = new Contas("1", 1000, "Jarbas", "042069", "jarbas@yahoo.com");
        Contas c2 = new Contas("2", 250, "Milton", "694200", "milton@gmail.com");
        Contas c3 = new Contas("3", 3000, "Nelson", "246924", "nelson@gmail.com");

        // cria as transacoes
        Transacoes t1 = new Transacoes(250);
        Transacoes t2 = new Transacoes(1000);

        //exibe o saldo inicial das contas
        System.out.println("Estado Inicial: ");
        System.out.println("Saldo de Jarbas :" + c1.saldo);
        System.out.println("Saldo de Milton :" + c2.saldo);
        System.out.println("Saldo de Nelson :" + c3.saldo);


        // cria as transacoes
        t1.Qrcode(c1);
        t2.Qrcode(c2);

        //realiza os pagamentos
        c2.pagamento(c2, c1, t1.Qrcode(c1));
        c3.pagamento(c3, c1, t1.Qrcode(c1));
        c2.pagamento(c2, c1, t1.Qrcode(c1));
        c3.pagamento(c3, c2, t2.Qrcode(c2));



        System.out.println("Estado Final: ");
        System.out.println("Saldo de Jarbas :" + c1.saldo);
        System.out.println("Saldo de Milton :" + c2.saldo);
        System.out.println("Saldo de Nelson :" + c3.saldo);


    }
}
