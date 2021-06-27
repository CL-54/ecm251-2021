package Caceres.Marques.Marcel.Models;

import Caceres.Marques.Marcel.Interfaces.Apresentacao;
import Caceres.Marques.Marcel.Interfaces.PostarMensagem;

public abstract class MobileMembers implements PostarMensagem, Apresentacao {

    public int post;
    public int postextra;


    public void assinatura(int i) {
        if (i == post) {
           System.out.println("Happy Coding!");
        } if(i == postextra) {
            System.out.println("Happy_C0d1ng. Maskers");
        }else{
            System.out.println("Erro");
        }

    }
}