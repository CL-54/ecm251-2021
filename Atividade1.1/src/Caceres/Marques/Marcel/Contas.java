package Caceres.Marques.Marcel;
public class Contas {
    public String idConta = "jarbas";
    public double saldo;

    //Métodos da classe
    void depositar(double valor){
        this.saldo = this.saldo + valor;

    }
    boolean sacar (double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
  /*  boolean transferirDinheiro(idConta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }
*/
}

