package Caceres.Marques.Marcel;
import Caceres.Marques.Marcel.Enums.HorarioSistema;
import Caceres.Marques.Marcel.Enums.TipoMembro;
import Caceres.Marques.Marcel.Models.Membros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class Sistema extends Membros {



    public Sistema(String nome, String email, TipoMembro funcao) {
        super(nome, email, funcao);
    }


    public void Menu() throws IOException {
    while (true) {
        TipoMembro funcao = null;
        funcao = TipoMembro.BIG_BROTHERS;
        System.out.println("Bem Vindo, selecione uma opção.");
        System.out.println("1 : Fazer cadastro");
        System.out.println("2 : Trocar horário");
        System.out.println("3 : Postar mensagens");
        System.out.println("4 : Excluir membro");
        System.out.println("5 : Sair");
        System.out.println("6 : Mostrar a hora");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Fazer cadastro");
                //Sistema novomem = new Sistema(nome = entrada.next(), email = entrada.next(),);
                cadastro();
                break;
            case 2:
                System.out.println("Trocar horário");
                TrocaHora();
                break;
            case 3:
                System.out.println("Postar mensagens");

                break;
            case 4:
                System.out.println("Excluir membro");
                break;
            case 5:
                System.out.println("Sair");
                System.exit(0);
                break;
            case 6:
                System.out.println("Mostra hora");
                MostraHora();

            }

        }
    }
    /*
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }*/

    public void cadastro() throws IOException {
        FileWriter fileWriter;{
            File arquivo = new File("arquivo_super_Secreto_nao_abrir.csv");
        }
        System.out.println("Digite o nome:");
        Scanner n = new Scanner(System.in);
        String nome = n.nextLine();

        System.out.println("Digite o email:");
        Scanner em = new Scanner(System.in);
        String email = em.nextLine();

        System.out.println("Escolha a função deste Membro:");
        System.out.println("1 : BigBrother");
        System.out.println("2 : MobileMemer");
        System.out.println("3 : HeavyLifter");
        System.out.println("4 : ScriptGuy");
        Scanner scan = new Scanner(System.in);
        TipoMembro funcao = null;
        int se = scan.nextInt();
        if (se == 0)
            funcao = TipoMembro.BIG_BROTHERS;
        if(se == 1)
            funcao = TipoMembro.MOBILE_MEMEBERS;
        if(se == 2)
            funcao = TipoMembro.HEAVY_LIFTERS;
        if(se == 3)
            funcao = TipoMembro.SCRIPT_GUYS;

        FileWriter excel = null;
        try {
            excel = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
            excel.append( nome + ";" + email + ";" + funcao );
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //cria a variavel do tipo enum hora
    HorarioSistema hora = HorarioSistema.NORMAL;

    //função para trocar a hora
    public void TrocaHora(){
           if(hora == HorarioSistema.NORMAL){
                hora = HorarioSistema.EXTRA;
           }else{
               hora = HorarioSistema.NORMAL;
           }

        }

       //função para mostrar a hora
       public HorarioSistema MostraHora(){
        if(hora == HorarioSistema.NORMAL) {
            System.out.println("No momento esta em hora normal.");
        }
        else{
            System.out.println("No momento esta em hora extra.");
        }
        return hora;
      }

}


