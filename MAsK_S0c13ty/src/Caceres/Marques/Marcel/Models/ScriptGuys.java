package Caceres.Marques.Marcel.Models;

import Caceres.Marques.Marcel.Interfaces.Apresentacao;
import Caceres.Marques.Marcel.Interfaces.PostarMensagem;

public abstract class ScriptGuys implements PostarMensagem, Apresentacao {

    public int rsociais;
    public int caverna;

    public void situa(int i) {
        if (i == rsociais) {
            System.out.println("Prazer em ajudar novos amigos de código!");
        } if(i == caverna) {
            System.out.println("QU3Ro_S3us_r3curs0s.py");
        }else{
            System.out.println("Erro");
        }

    }
}
