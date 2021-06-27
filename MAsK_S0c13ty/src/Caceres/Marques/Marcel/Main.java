package Caceres.Marques.Marcel;

import Caceres.Marques.Marcel.Enums.TipoMembro;
import Caceres.Marques.Marcel.Sistema;

import java.io.IOException;

// Marcel Marques Caceres 17.00648-0
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
    Sistema sis = new Sistema("jao","jao",TipoMembro.BIG_BROTHERS);
       // Membros mem = new Membros("joao","joao@gmail.com", TipoMembro.BIG_BROTHERS);
       // System.out.println(mem.cadastro(mem));
       // mem.DefineHorario();
        //System.out.println("Digite o nome : ");
        //Sistema sis = new Sistema();
       sis.Menu();
        //Scanner entrada = new Scanner(System.in);
        //entrada.useDelimiter("\n");
        //String texto = scanner.next();
       // int inteiro = scanner.nextInt();


    }
}
