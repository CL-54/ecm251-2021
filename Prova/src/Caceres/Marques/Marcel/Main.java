package Caceres.Marques.Marcel;

public class Main {

    public static void main(String[] args) {
        Pintor i = new Pintor("Jose Francisco", 1500, "7288-3182");
        System.out.println("Nome: " + i.nome);
        System.out.println("salario: " + i.salario);
        System.out.println("telefone: " + i.telefone);
        i.descricaop();
        i.executarTrabalho(1);

        Zelador y = new Zelador("Jarbas", 1700, "8872-3182");
        System.out.println("Nome: " + i.nome);
        System.out.println("salario: " + i.salario);
        System.out.println("telefone: " + i.telefone);
        y.descricaoz();
        y.executarTrabalho(-1);

        Eletricista u = new Eletricista("Omar", 2200, "6543-0295");
        System.out.println("Nome: " + i.nome);
        System.out.println("salario: " + i.salario);
        System.out.println("telefone: " + i.telefone);
        u.descricaoel();
        u.executarTrabalho(2);

        Encanador e = new Encanador("Tobias", 1900, "4352-9986");
        System.out.println("Nome: " + i.nome);
        System.out.println("salario: " + i.salario);
        System.out.println("telefone: " + i.telefone);
        e.descricaoen();
        e.executarTrabalho(3);
    }
}


public class Pessoa {
    public String nome;
    public double salario;
    public String telefone;


    public Pessoa(String nome, double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }
    public boolean executarTrabalho(int i){
        if(i > 0){
            return true;
        }else{
            return false;
        }

    }
}

public class Pintor extends Pessoa {
    public Pintor(String nome, double salario, String telefone) {
        super(nome, salario, telefone);
    }
    public double salario;
    public void descricaop(){
        System.out.println("Pinta paredes e móveis");
    }

}
public class Encanador extends Pessoa {
    public Encanador(String nome, double salario, String telefone) {
        super(nome, salario, telefone);
    }
    public double salario;
    public void descricaoen(){
        System.out.println("Cuida do encanamento");
    }

}
public class Eletricista extends Pessoa {
    public Eletricista(String nome, double salario, String telefone) {
        super(nome, salario, telefone);
    }

    public double salario;

    public void descricaoel() {
        System.out.println("Cuida da fiação e do sistema elétrico");
    }
}
public class Zelador extends Pessoa {
    public Zelador(String nome, double salario, String telefone) {
        super(nome, salario, telefone);
    }

    public double salario;

    public void descricaoz() {
        System.out.println("Realiza a limpeza");
    }
}
