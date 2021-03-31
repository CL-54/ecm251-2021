//17.00648-0 Marcel Marques Caceres
package Caceres.Marques.Marcel;
public class Contas {
    //Atributos da classe Contas
    public String idConta;
    private double saldo;

    //Métodos da classe Contas

    cria o id da conta
    private int idConta(int id){
        id = ncontas + 1
    }


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



}

