package Caceres.Marques.Marcel.Models;
import Caceres.Marques.Marcel.Enums.HorarioSistema;
import Caceres.Marques.Marcel.Enums.TipoMembro;
import Caceres.Marques.Marcel.Interfaces.Apresentacao;
import Caceres.Marques.Marcel.Interfaces.PostarMensagem;


import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Sistema extends Membros implements PostarMensagem, Apresentacao {


    public Sistema(String nome, String email, TipoMembro funcao) {
        super(nome, email, funcao);
    }

    /**
     * cria o menu para interação com usuário
     *
     * @throws IOException
     */
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
                    cadastro();
                    break;
                case 2:
                    //troca o horario
                    System.out.println("Trocar horário");
                    TrocaHora();
                    break;
                case 3:
                    System.out.println("Postar mensagens");
                    System.out.println("Digite a mensagem :");
                    Scanner entrada0 = new Scanner(System.in);
                    String msg = entrada0.nextLine();
                    System.out.println("Qual a hora ? :");
                    System.out.println("0 : Horário Normal");
                    System.out.println("1 : Horário Extra");
                    Scanner sca = new Scanner(System.in);
                    HorarioSistema hor = null;
                    int se = sca.nextInt();
                    if (se == 0)
                        hor = HorarioSistema.NORMAL;
                    if (se == 1)
                        hor = HorarioSistema.EXTRA;


                    System.out.println("Escolha a função deste Membro:");
                    System.out.println("0 : BigBrother");
                    System.out.println("1 : MobileMemer");
                    System.out.println("2 : HeavyLifter");
                    System.out.println("3 : ScriptGuy");
                    Scanner func = new Scanner(System.in);
                    TipoMembro fun = null;
                    int sen = func.nextInt();
                    if (sen == 0)
                        fun = TipoMembro.BIG_BROTHERS;
                    if (sen == 1)
                        fun = TipoMembro.MOBILE_MEMBERS;
                    if (sen == 2)
                        fun = TipoMembro.HEAVY_LIFTERS;
                    if (sen == 3)
                        fun = TipoMembro.SCRIPT_GUYS;
                    System.out.println(Post(fun, hor, msg));

                    break;
                case 4:
                    System.out.println("Excluir membro");
                    Apresentar();
                    break;
                case 5:
                    System.out.println("Sair");
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Mostra hora");
                    MostraHora();
                    break;

            }

        }
    }

    /**
     * cria fução para realizar os cadastros
     *
     * @throws IOException
     */
    public void cadastro() throws IOException {
        FileWriter fileWriter;
        {
            File arquivo = new File("arquivo_super_Secreto_nao_abrir.csv");
        }
        System.out.println("Digite o nome:");
        Scanner nom = new Scanner(System.in);
        String nome = nom.nextLine();

        System.out.println("Digite o email:");
        Scanner e = new Scanner(System.in);
        String email = e.nextLine();

        System.out.println("Escolha a função deste Membro:");
        System.out.println("0 : BigBrother");
        System.out.println("1 : MobileMember");
        System.out.println("2 : HeavyLifter");
        System.out.println("3 : ScriptGuy");
        Scanner scan = new Scanner(System.in);
        TipoMembro funcao = null;
        int se = scan.nextInt();
        if (se == 0)
            funcao = TipoMembro.BIG_BROTHERS;
        if (se == 1)
            funcao = TipoMembro.MOBILE_MEMBERS;
        if (se == 2)
            funcao = TipoMembro.HEAVY_LIFTERS;
        if (se == 3)
            funcao = TipoMembro.SCRIPT_GUYS;

        FileWriter excel = null;
        try {
            excel = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
            excel.append(nome + ";" + email + ";" + funcao + "\n");
            excel.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    /**
     * cria a variavel do tipo enum para estabelecer uma hora padrão(normal)
     */
    HorarioSistema hora = HorarioSistema.NORMAL;

    /**
     * função para trocar a hora
     */
    public void TrocaHora() {
        if (hora == HorarioSistema.NORMAL) {
            hora = HorarioSistema.EXTRA;
        } else {
            hora = HorarioSistema.NORMAL;
        }

    }

    /**
     * função para mostrar a hora
     *
     * @return retorna a hora
     */
    public HorarioSistema MostraHora() {
        if (hora == HorarioSistema.NORMAL) {
            System.out.println("No momento esta em hora normal.");
        } else {
            System.out.println("No momento esta em hora extra.");
        }
        return hora;
    }

    /**
     * função para postar mensagens
     *
     * @param mem variável do tipo TipoMembro (Enum)
     * @param hor variável do tipo HorarioSistema (Enum)
     * @param msg mensagem digitada pelo usuário (String)
     * @return retorna msg com a assinatura de um TipoMembro (MOBILE_MEMBERS, HEAVY_LIFTERS, SCRIPT_GUYS, BIG_BROTHERS)
     */
    @Override
    public String Post(TipoMembro mem, HorarioSistema hor, String msg) {
        String qualquercoisa = null;
        if (mem.equals(TipoMembro.MOBILE_MEMBERS)) {
            if (hor.equals(HorarioSistema.NORMAL)) {
                qualquercoisa = msg + " " + "Happy Coding!";
            } else qualquercoisa = msg + " " + "Happy_C0d1ng. Maskers";
        }
        if (mem.equals(TipoMembro.HEAVY_LIFTERS)) {
            if (hor.equals(HorarioSistema.NORMAL)) {
                qualquercoisa = msg + " " + "Podem contar conosco!";
            } else qualquercoisa = msg + " " + "N00b_qu3_n_Se_r3pita.bat";
        }
        if (mem.equals(TipoMembro.SCRIPT_GUYS)) {
            if (hor.equals(HorarioSistema.NORMAL)) {
                qualquercoisa = msg + " " + "Prazer em ajudar novos amigos de código!";
            } else qualquercoisa = msg + " " + "QU3Ro_S3us_r3curs0s.py";
        }
        if (mem.equals(TipoMembro.BIG_BROTHERS)) {
            if (hor.equals(HorarioSistema.NORMAL)) {
                qualquercoisa = msg + " " + "Sempre ajudando as pessoas membros ou não S2!!";
            } else qualquercoisa = msg + " " + "...";
        }
        return qualquercoisa;
    }

    /**
     * Cria a função para remover um membro cadastrado
     *
     * @throws IOException
     */
    public void Remover() throws IOException {

        System.out.println("Forneça o nome :");
        Scanner fog = new Scanner(System.in);
        String po = fog.nextLine();
        System.out.println("Forneça o email:");
        Scanner fog2 = new Scanner(System.in);
        String po2 = fog2.nextLine();
        System.out.println("Forneça a função:");
        Scanner fog3 = new Scanner(System.in);
        String po3 = fog3.nextLine();

        File inputFile = new File("arquivo_super_Secreto_nao_abrir.csv");
        File tempFile = new File("arquivoTemporario.csv");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = po + ";" + po2 + ";" + po3;
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();

        inputFile.delete();
        File file = new File("arquivoTemporario.csv");
        File file2 = new File("arquivo_super_Secreto_nao_abrir.csv");
        file.renameTo(file2);

    }

    /**
     * para apresentar a lista com todos usuários e excluir
     */
    @Override
    public void Apresentar() {
        try {
            BufferedReader ler = new BufferedReader(new FileReader("arquivo_super_Secreto_nao_abrir.csv"));
            String row;
            System.out.println("Lista de todos usuários :");
            System.out.println("\n===========================================");
            while ((row = ler.readLine()) != null) {
                String[] ui = row.split(";");
                System.out.println("Nome :"+ui[0]);
                System.out.println("Email :"+ui[1]);
                System.out.println("Funcão :"+ui[2]);
                System.out.println("\n=======================================");
            }
            ler.close();
            System.out.println("Escolha um Usuario para excluir");
            Remover();
        } catch (Exception g) {
            Apresentar();
        }
    }
}
