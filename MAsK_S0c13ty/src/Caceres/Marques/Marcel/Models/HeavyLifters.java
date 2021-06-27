package Caceres.Marques.Marcel.Models;

import Caceres.Marques.Marcel.Interfaces.Apresentacao;
import Caceres.Marques.Marcel.Interfaces.PostarMensagem;

public abstract class HeavyLifters implements PostarMensagem, Apresentacao {

    public int push;
    public int hextra;


    public void push(int i) {
        if (i == push) {
            System.out.println("Podem contar conosco!");
        } if(i == hextra) {
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
        }else{
            System.out.println("Erro");
        }

    }
}
