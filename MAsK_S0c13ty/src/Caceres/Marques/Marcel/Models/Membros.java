package Caceres.Marques.Marcel.Models;

import Caceres.Marques.Marcel.Enums.HorarioSistema;
import Caceres.Marques.Marcel.Enums.TipoMembro;

import java.util.Random;

public abstract class Membros {
    public String nome;
    public String email;
    public TipoMembro funcao;

    public Membros(String nome, String email, TipoMembro funcao ) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;

    }


}
