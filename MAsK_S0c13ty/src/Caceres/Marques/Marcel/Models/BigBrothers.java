package Caceres.Marques.Marcel.Models;

import Caceres.Marques.Marcel.Interfaces.Apresentacao;
import Caceres.Marques.Marcel.Interfaces.PostarMensagem;

public abstract class BigBrothers implements PostarMensagem, Apresentacao {

    public int ass;
    public int assextra;

    public void assi(int i) {
        if (i == ass) {
            System.out.println("Sempre ajudando as pessoas membros ou não S2!!");
        } if(i == assextra) {
            System.out.println("...");
        }else{
            System.out.println("Erro");
        }

    }
}
