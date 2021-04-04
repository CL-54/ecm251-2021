//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;

public class Contas {
    //Atributos da classe Contas
    public String idConta;
    public double saldo;
    public Usuarios usuario;

    // cria construtor
    public Contas(String idConta, double saldoInicial, String nome, String senha, String email) {
        this.idConta = idConta;
        this.saldo = saldoInicial;
        this.usuario = new Usuarios(nome, senha, email);

    }

    //Métodos da classe Contas



    //adiciona um valor ao saldo
    public void depositar(double valor){
        this.saldo = this.saldo + valor;

    }

    //retira um valor do saldo
    public boolean pagar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }

    //realiza uma adiçao ou subtraçao do saldo de uma conta
    public boolean transferirDinheiro(Contas destino, double valor){
        if(this.pagar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    //funçao para realizar pagamento
    public boolean pagamento(Contas paga, Contas recebe, String Qrcode){
        String[] qr = Qrcode.split(";");
        int valor = Integer.parseInt(qr[2]);
        if(paga.pagar(valor)){
            recebe.depositar(valor);
            return true;
        }
        return false;

    }




}

